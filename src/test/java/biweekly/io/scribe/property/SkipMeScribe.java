package biweekly.io.scribe.property;

import java.util.List;

import biweekly.ICalDataType;
import biweekly.ICalVersion;
import biweekly.Warning;
import biweekly.io.SkipMeException;
import biweekly.io.json.JCalValue;
import biweekly.io.xml.XCalElement;
import biweekly.parameter.ICalParameters;
import biweekly.property.SkipMeProperty;

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

 The views and conclusions contained in the software and documentation are those
 of the authors and should not be interpreted as representing official policies, 
 either expressed or implied, of the FreeBSD Project.
 */

/**
 * A scribe that always throws a {@link SkipMeException}.
 * @author Michael Angstadt
 */
public class SkipMeScribe extends ICalPropertyScribe<SkipMeProperty> {
	public SkipMeScribe() {
		super(SkipMeProperty.class, "SKIPME", null);
	}

	@Override
	protected String _writeText(SkipMeProperty property, ICalVersion version) {
		throw new SkipMeException("");
	}

	@Override
	protected SkipMeProperty _parseText(String value, ICalDataType dataType, ICalParameters parameters, ICalVersion version, List<Warning> warnings) {
		throw new SkipMeException("");
	}

	@Override
	protected void _writeXml(SkipMeProperty property, XCalElement parent) {
		throw new SkipMeException("");
	}

	@Override
	protected SkipMeProperty _parseXml(XCalElement element, ICalParameters parameters, List<Warning> warnings) {
		throw new SkipMeException("");
	}

	@Override
	protected JCalValue _writeJson(SkipMeProperty property) {
		throw new SkipMeException("");
	}

	@Override
	protected SkipMeProperty _parseJson(JCalValue value, ICalDataType dataType, ICalParameters parameters, List<Warning> warnings) {
		throw new SkipMeException("");
	}
}
