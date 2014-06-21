package biweekly.io.scribe.property;

import java.util.List;

import biweekly.ICalDataType;
import biweekly.Warning;
import biweekly.io.CannotParseException;
import biweekly.io.json.JCalValue;
import biweekly.io.xml.XCalElement;
import biweekly.parameter.ICalParameters;
import biweekly.property.IntegerProperty;
import biweekly.property.Version;

/*
 Copyright (c) 2013, Michael Angstadt
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met: 

 1. Redistributions of source code must retain the above copyright notice, this
 list of conditions and the following disclaimer. 
 2. Redistributions in binary form must reproduce the above copyright notice,
 this list of conditions and the following disclaimer in the documentation
 and/or other materials provided with the distribution. 

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * Marshals properties that have integer values.
 * @param <T> the property class
 * @author Michael Angstadt
 */
public abstract class IntegerPropertyScribe<T extends IntegerProperty> extends ICalPropertyScribe<T> {
	public IntegerPropertyScribe(Class<T> clazz, String propertyName) {
		super(clazz, propertyName, ICalDataType.INTEGER);
	}

	@Override
	protected String _writeText(T property, Version version) {
		Integer value = property.getValue();
		if (value != null) {
			return value.toString();
		}

		return "";
	}

	@Override
	protected T _parseText(String value, ICalDataType dataType, ICalParameters parameters, Version version, List<Warning> warnings) {
		value = unescape(value);
		return parse(value);
	}

	@Override
	protected void _writeXml(T property, XCalElement element) {
		String valueStr = null;

		Integer value = property.getValue();
		if (value != null) {
			valueStr = value.toString();
		}

		element.append(dataType(property, null), valueStr);
	}

	@Override
	protected T _parseXml(XCalElement element, ICalParameters parameters, List<Warning> warnings) {
		String value = element.first(defaultDataType);
		if (value != null) {
			return parse(value);
		}

		throw missingXmlElements(defaultDataType);
	}

	@Override
	protected JCalValue _writeJson(T property) {
		return JCalValue.single(property.getValue());
	}

	@Override
	protected T _parseJson(JCalValue value, ICalDataType dataType, ICalParameters parameters, List<Warning> warnings) {
		return parse(value.asSingle());
	}

	private T parse(String value) {
		if (value == null || value.length() == 0) {
			return newInstance(null);
		}

		try {
			Integer intValue = Integer.valueOf(value);
			return newInstance(intValue);
		} catch (NumberFormatException e) {
			throw new CannotParseException(24);
		}
	}

	protected abstract T newInstance(Integer value);
}
