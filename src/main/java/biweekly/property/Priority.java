package biweekly.property;

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
 * Defines the priority of an event or todo.
 * @author Michael Angstadt
 * @see "RFC 5545 p.89-90"
 */
public class Priority extends IntegerProperty {
	/**
	 * Creates a priority property.
	 * @param priority the priority ("0" is undefined, "1" is the highest, "9"
	 * is the lowest)
	 */
	public Priority(Integer priority) {
		super(priority);
	}

	/**
	 * Determines if this priority is considered "high" priority.
	 * @return true if the priority is between 1 and 4, false if not
	 */
	public boolean isHigh() {
		return value != null && value >= 1 && value <= 4;
	}

	/**
	 * Determines if this priority is considered "medium" priority.
	 * @return true if the priority is "5", false if not
	 */
	public boolean isMedium() {
		return value != null && value == 5;
	}

	/**
	 * Determines if this priority is considered "low" priority.
	 * @return true if the priority is between 6 and 9, false if not
	 */
	public boolean isLow() {
		return value != null && value >= 6 && value <= 9;
	}

	/**
	 * Determines if this priority has an "undefined" value.
	 * @return true if the priority is "0", false if not
	 */
	public boolean isUndefined() {
		return value != null && value == 0;
	}

	/**
	 * Converts this priority to its two-character CUA code.
	 * @return the CUA code (e.g. "B1" for "4") or null if the priority cannot
	 * be converted to a CUA code
	 */
	public String toCuaPriority() {
		if (value == null || value < 1 || value > 9) {
			return null;
		}
		int letter = ((value - 1) / 3) + 'A';
		int number = ((value - 1) % 3) + 1;
		return (char) letter + "" + number;
	}
}