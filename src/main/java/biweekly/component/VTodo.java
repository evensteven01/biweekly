package biweekly.component;

import java.util.Date;
import java.util.List;

import biweekly.property.Attachment;
import biweekly.property.Attendee;
import biweekly.property.Categories;
import biweekly.property.Classification;
import biweekly.property.Comment;
import biweekly.property.Completed;
import biweekly.property.Contact;
import biweekly.property.Created;
import biweekly.property.DateDue;
import biweekly.property.DateStart;
import biweekly.property.DateTimeStamp;
import biweekly.property.Description;
import biweekly.property.DurationProperty;
import biweekly.property.ExceptionDates;
import biweekly.property.Geo;
import biweekly.property.LastModified;
import biweekly.property.Location;
import biweekly.property.Method;
import biweekly.property.Organizer;
import biweekly.property.PercentComplete;
import biweekly.property.Priority;
import biweekly.property.RecurrenceDates;
import biweekly.property.RecurrenceId;
import biweekly.property.RecurrenceRule;
import biweekly.property.RelatedTo;
import biweekly.property.RequestStatus;
import biweekly.property.Resources;
import biweekly.property.Sequence;
import biweekly.property.Status;
import biweekly.property.Summary;
import biweekly.property.Uid;
import biweekly.property.Url;

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
 * Defines an action item or assignment.
 * @author Michael Angstadt
 * @see "RFC 5545 p.55-7"
 */
//TODO use "to-do" in Javadocs, not "todo"
public class VTodo extends ICalComponent {
	/**
	 * <p>
	 * Creates a new todo entry.
	 * </p>
	 * <p>
	 * The following properties are auto-generated on object creation. These
	 * properties <b>must</b> be present in order for the todo to be valid:
	 * <ul>
	 * <li>{@link Uid} - Set to a UUID.</li>
	 * <li>{@link DateTimeStamp} - Set to the current date/time.</li>
	 * </ul>
	 * </p>
	 */
	public VTodo() {
		setUid(Uid.random());
		setDateTimeStamp(new Date());
	}

	/**
	 * Gets the unique identifier for this todo. This component object comes
	 * populated with a UID on creation. This is a <b>required</b> property.
	 * @return the UID or null if not set
	 * @see "RFC 5545 p.117-8"
	 */
	public Uid getUid() {
		return getProperty(Uid.class);
	}

	/**
	 * Sets the unique identifier for this todo. This component object comes
	 * populated with a UID on creation. This is a <b>required</b> property.
	 * @param uid the UID or null to remove
	 * @see "RFC 5545 p.117-8"
	 */
	public void setUid(Uid uid) {
		setProperty(Uid.class, uid);
	}

	/**
	 * Sets the unique identifier for this todo. This component object comes
	 * populated with a UID on creation. This is a <b>required</b> property.
	 * @param uid the UID or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.117-8"
	 */
	public Uid setUid(String uid) {
		Uid prop = (uid == null) ? null : new Uid(uid);
		setUid(prop);
		return prop;
	}

	/**
	 * Gets either (a) the creation date of the iCalendar object (if the
	 * {@link Method} property is defined) or (b) the date that the todo was
	 * last modified (the {@link LastModified} property also holds this
	 * information). This todo object comes populated with a
	 * {@link DateTimeStamp} property that is set to the current time. This is a
	 * <b>required</b> property.
	 * @return the date time stamp or null if not set
	 * @see "RFC 5545 p.137-8"
	 */
	public DateTimeStamp getDateTimeStamp() {
		return getProperty(DateTimeStamp.class);
	}

	/**
	 * Sets either (a) the creation date of the iCalendar object (if the
	 * {@link Method} property is defined) or (b) the date that the todo was
	 * last modified (the {@link LastModified} property also holds this
	 * information). This todo object comes populated with a
	 * {@link DateTimeStamp} property that is set to the current time. This is a
	 * <b>required</b> property.
	 * @param dateTimeStamp the date time stamp or null to remove
	 * @see "RFC 5545 p.137-8"
	 */
	public void setDateTimeStamp(DateTimeStamp dateTimeStamp) {
		setProperty(DateTimeStamp.class, dateTimeStamp);
	}

	/**
	 * Sets either (a) the creation date of the iCalendar object (if the
	 * {@link Method} property is defined) or (b) the date that the todo was
	 * last modified (the {@link LastModified} property also holds this
	 * information). This todo object comes populated with a
	 * {@link DateTimeStamp} property that is set to the current time. This is a
	 * <b>required</b> property.
	 * @param dateTimeStamp the date time stamp or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.137-8"
	 */
	public DateTimeStamp setDateTimeStamp(Date dateTimeStamp) {
		DateTimeStamp prop = (dateTimeStamp == null) ? null : new DateTimeStamp(dateTimeStamp);
		setDateTimeStamp(prop);
		return prop;
	}

	/**
	 * Gets the level of sensitivity of the todo data. If not specified, the
	 * data within the todo should be considered "public".
	 * @return the classification level or null if not set
	 * @see "RFC 5545 p.82-3"
	 */
	public Classification getClassification() {
		return getProperty(Classification.class);
	}

	/**
	 * Sets the level of sensitivity of the todo data. If not specified, the
	 * data within the todo should be considered "public".
	 * @param classification the classification level or null to remove
	 * @see "RFC 5545 p.82-3"
	 */
	public void setClassification(Classification classification) {
		setProperty(Classification.class, classification);
	}

	/**
	 * Sets the level of sensitivity of the todo data. If not specified, the
	 * data within the todo should be considered "public".
	 * @param classification the classification level (e.g. "CONFIDENTIAL") or
	 * null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.82-3"
	 */
	public Classification setClassification(String classification) {
		Classification prop = (classification == null) ? null : new Classification(classification);
		setClassification(prop);
		return prop;
	}

	/**
	 * Gets the date and time that the todo was completed.
	 * @return the completion date or null if not set
	 * @see "RFC 5545 p.94-5"
	 */
	public Completed getCompleted() {
		return getProperty(Completed.class);
	}

	/**
	 * Sets the date and time that the todo was completed.
	 * @param completed the completion date or null to remove
	 * @see "RFC 5545 p.94-5"
	 */
	public void setCompleted(Completed completed) {
		setProperty(Completed.class, completed);
	}

	/**
	 * Sets the date and time that the todo was completed.
	 * @param completed the completion date or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.94-5"
	 */
	public Completed setCompleted(Date completed) {
		Completed prop = (completed == null) ? null : new Completed(completed);
		setCompleted(prop);
		return prop;
	}

	/**
	 * Gets the date/time that the todo was initially created.
	 * @return the creation date/time or null if not set
	 * @see "RFC 5545 p.136"
	 */
	public Created getCreated() {
		return getProperty(Created.class);
	}

	/**
	 * Sets the date/time that the todo was initially created.
	 * @param created the creation date/time or null to remove
	 * @see "RFC 5545 p.136"
	 */
	public void setCreated(Created created) {
		setProperty(Created.class, created);
	}

	/**
	 * Sets the date/time that the todo was initially created.
	 * @param created the creation date/time or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.136"
	 */
	public Created setCreated(Date created) {
		Created prop = (created == null) ? null : new Created(created);
		setCreated(prop);
		return prop;
	}

	/**
	 * Gets a detailed description of the todo. The description should be more
	 * detailed than the one provided by the {@link Summary} property.
	 * @return the description or null if not set
	 * @see "RFC 5545 p.84-5"
	 */
	public Description getDescription() {
		return getProperty(Description.class);
	}

	/**
	 * Sets a detailed description of the todo. The description should be more
	 * detailed than the one provided by the {@link Summary} property.
	 * @param description the description or null to remove
	 * @see "RFC 5545 p.84-5"
	 */
	public void setDescription(Description description) {
		setProperty(Description.class, description);
	}

	/**
	 * Sets a detailed description of the todo. The description should be more
	 * detailed than the one provided by the {@link Summary} property.
	 * @param description the description or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.84-5"
	 */
	public Description setDescription(String description) {
		Description prop = (description == null) ? null : new Description(description);
		setDescription(prop);
		return prop;
	}

	/**
	 * Gets the date that the todo starts.
	 * @return the start date or null if not set
	 * @see "RFC 5545 p.97-8"
	 */
	public DateStart getDateStart() {
		return getProperty(DateStart.class);
	}

	/**
	 * Sets the date that the todo starts.
	 * @param dateStart the start date or null to remove
	 * @see "RFC 5545 p.97-8"
	 */
	public void setDateStart(DateStart dateStart) {
		setProperty(DateStart.class, dateStart);
	}

	/**
	 * Sets the date that the todo starts.
	 * @param dateStart the start date or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.97-8"
	 */
	public DateStart setDateStart(Date dateStart) {
		DateStart prop = (dateStart == null) ? null : new DateStart(dateStart);
		setDateStart(prop);
		return prop;
	}

	/**
	 * Gets a set of geographical coordinates.
	 * @return the geographical coordinates or null if not set
	 * @see "RFC 5545 p.85-7"
	 */
	public Geo getGeo() {
		return getProperty(Geo.class);
	}

	/**
	 * Sets a set of geographical coordinates.
	 * @param geo the geographical coordinates or null to remove
	 * @see "RFC 5545 p.85-7"
	 */
	public void setGeo(Geo geo) {
		setProperty(Geo.class, geo);
	}

	/**
	 * Gets the date/time that the todo was last changed.
	 * @return the last modified date or null if not set
	 * @see "RFC 5545 p.138"
	 */
	public LastModified getLastModified() {
		return getProperty(LastModified.class);
	}

	/**
	 * Sets the date/time that the todo was last changed.
	 * @param lastModified the last modified date or null to remove
	 * @see "RFC 5545 p.138"
	 */
	public void setLastModified(LastModified lastModified) {
		setProperty(LastModified.class, lastModified);
	}

	/**
	 * Sets the date/time that the todo was last changed.
	 * @param lastModified the last modified date or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.138"
	 */
	public LastModified setLastModified(Date lastModified) {
		LastModified prop = (lastModified == null) ? null : new LastModified(lastModified);
		setLastModified(prop);
		return prop;
	}

	/**
	 * Gets the physical location of the todo.
	 * @return the location or null if not set
	 * @see "RFC 5545 p.87-8"
	 */
	public Location getLocation() {
		return getProperty(Location.class);
	}

	/**
	 * Sets the physical location of the todo.
	 * @param location the location or null to remove
	 * @see "RFC 5545 p.87-8"
	 */
	public void setLocation(Location location) {
		setProperty(Location.class, location);
	}

	/**
	 * Sets the physical location of the todo.
	 * @param location the location (e.g. "Room 101") or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.87-8"
	 */
	public Location setLocation(String location) {
		Location prop = (location == null) ? null : new Location(location);
		setLocation(prop);
		return prop;
	}

	/**
	 * Gets the organizer of the todo.
	 * @return the organizer or null if not set
	 * @see "RFC 5545 p.111-2"
	 */
	public Organizer getOrganizer() {
		return getProperty(Organizer.class);
	}

	/**
	 * Sets the organizer of the todo.
	 * @param organizer the organizer or null to remove
	 * @see "RFC 5545 p.111-2"
	 */
	public void setOrganizer(Organizer organizer) {
		setProperty(Organizer.class, organizer);
	}

	/**
	 * Sets the organizer of the todo.
	 * @param email the organizer's email address (e.g. "johndoe@example.com")
	 * or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.111-2"
	 */
	public Organizer setOrganizer(String email) {
		Organizer prop = (email == null) ? null : Organizer.email(email);
		setOrganizer(prop);
		return prop;
	}

	/**
	 * Gets the amount that the todo task has been completed.
	 * @return the percent complete or null if not set
	 * @see "RFC 5545 p.88-9"
	 */
	public PercentComplete getPercentComplete() {
		return getProperty(PercentComplete.class);
	}

	/**
	 * Sets the amount that the todo task has been completed.
	 * @param percentComplete the percent complete or null to remove
	 * @see "RFC 5545 p.88-9"
	 */
	public void setPercentComplete(PercentComplete percentComplete) {
		setProperty(PercentComplete.class, percentComplete);
	}

	/**
	 * Sets the amount that the todo task has been completed.
	 * @param percent the percent complete (e.g. "50" for 50%) or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.88-9"
	 */
	public PercentComplete setPercentComplete(Integer percent) {
		PercentComplete prop = (percent == null) ? null : new PercentComplete(percent);
		setPercentComplete(prop);
		return prop;
	}

	/**
	 * Gets the priority of the todo.
	 * @return the priority or null if not set
	 * @see "RFC 5545 p.89-90"
	 */
	public Priority getPriority() {
		return getProperty(Priority.class);
	}

	/**
	 * Sets the priority of the todo.
	 * @param priority the priority or null to remove
	 * @see "RFC 5545 p.89-90"
	 */
	public void setPriority(Priority priority) {
		setProperty(Priority.class, priority);
	}

	/**
	 * Sets the priority of the todo.
	 * @param priority the priority ("0" is undefined, "1" is the highest, "9"
	 * is the lowest) or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.89-90"
	 */
	public Priority setPriority(Integer priority) {
		Priority prop = (priority == null) ? null : new Priority(priority);
		setPriority(prop);
		return prop;
	}

	/**
	 * Gets the original value of the {@link DateStart} property if the todo is
	 * recurring and has been modified. Used in conjunction with the {@link Uid}
	 * and {@link Sequence} properties to uniquely identify a recurrence
	 * instance.
	 * @return the recurrence ID or null if not set
	 * @see "RFC 5545 p.112-4"
	 */
	public RecurrenceId getRecurrenceId() {
		return getProperty(RecurrenceId.class);
	}

	/**
	 * Sets the original value of the {@link DateStart} property if the todo is
	 * recurring and has been modified. Used in conjunction with the {@link Uid}
	 * and {@link Sequence} properties to uniquely identify a recurrence
	 * instance.
	 * @param recurrenceId the recurrence ID or null to remove
	 * @see "RFC 5545 p.112-4"
	 */
	public void setRecurrenceId(RecurrenceId recurrenceId) {
		setProperty(RecurrenceId.class, recurrenceId);
	}

	/**
	 * Sets the original value of the {@link DateStart} property if the todo is
	 * recurring and has been modified. Used in conjunction with the {@link Uid}
	 * and {@link Sequence} properties to uniquely identify a recurrence
	 * instance.
	 * @param originalStartDate the original start date or null to remove
	 * @see "RFC 5545 p.112-4"
	 */
	public RecurrenceId setRecurrenceId(Date originalStartDate) {
		RecurrenceId prop = (originalStartDate == null) ? null : new RecurrenceId(originalStartDate);
		setRecurrenceId(prop);
		return prop;
	}

	/**
	 * Gets the revision number of the todo. The organizer can increment this
	 * number every time he or she makes a significant change.
	 * @return the sequence number
	 * @see "RFC 5545 p.138-9"
	 */
	public Sequence getSequence() {
		return getProperty(Sequence.class);
	}

	/**
	 * Sets the revision number of the todo. The organizer can increment this
	 * number every time he or she makes a significant change.
	 * @param sequence the sequence number
	 * @see "RFC 5545 p.138-9"
	 */
	public void setSequence(Sequence sequence) {
		setProperty(Sequence.class, sequence);
	}

	/**
	 * Sets the revision number of the todo. The organizer can increment this
	 * number every time he or she makes a significant change.
	 * @param sequence the sequence number
	 * @return the property that was created
	 * @see "RFC 5545 p.138-9"
	 */
	public Sequence setSequence(Integer sequence) {
		Sequence prop = (sequence == null) ? null : new Sequence(sequence);
		setSequence(prop);
		return prop;
	}

	/**
	 * Increments the revision number of the todo. The organizer can increment
	 * this number every time he or she makes a significant change.
	 * @see "RFC 5545 p.138-9"
	 */
	public void incrementSequence() {
		Sequence sequence = getSequence();
		if (sequence == null) {
			setSequence(1);
		} else {
			sequence.increment();
		}
	}

	/**
	 * Gets the status of the todo.
	 * @return the status or null if not set
	 * @see "RFC 5545 p.92-3"
	 */
	public Status getStatus() {
		return getProperty(Status.class);
	}

	/**
	 * Sets the status of the todo.
	 * <p>
	 * Valid todo status codes are:
	 * <ul>
	 * <li>NEEDS-ACTION</li>
	 * <li>COMPLETED</li>
	 * <li>IN-PROGRESS</li>
	 * <li>CANCELLED</li>
	 * </ul>
	 * </p>
	 * @param status the status or null to remove
	 * @see "RFC 5545 p.92-3"
	 */
	public void setStatus(Status status) {
		setProperty(Status.class, status);
	}

	/**
	 * Gets the summary of the todo.
	 * @return the summary or null if not set
	 * @see "RFC 5545 p.93-4"
	 */
	public Summary getSummary() {
		return getProperty(Summary.class);
	}

	/**
	 * Sets the summary of the todo.
	 * @param summary the summary or null to remove
	 * @see "RFC 5545 p.93-4"
	 */
	public void setSummary(Summary summary) {
		setProperty(Summary.class, summary);
	}

	/**
	 * Sets the summary of the todo.
	 * @param summary the summary or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 p.93-4"
	 */
	public Summary setSummary(String summary) {
		Summary prop = (summary == null) ? null : new Summary(summary);
		setSummary(prop);
		return prop;
	}

	/**
	 * Gets a URL to a resource that contains additional information about the
	 * todo.
	 * @return the URL or null if not set
	 * @see "RFC 5545 p.116-7"
	 */
	public Url getUrl() {
		return getProperty(Url.class);
	}

	/**
	 * Sets a URL to a resource that contains additional information about the
	 * todo.
	 * @param url the URL or null to remove
	 * @see "RFC 5545 p.116-7"
	 */
	public void setUrl(Url url) {
		setProperty(Url.class, url);
	}

	/**
	 * Sets a URL to a resource that contains additional information about the
	 * todo.
	 * @param url the URL (e.g. "http://example.com/resource.ics") or null to
	 * remove
	 * @return the property that was created
	 * @see "RFC 5545 p.116-7"
	 */
	public Url setUrl(String url) {
		Url prop = (url == null) ? null : new Url(url);
		setUrl(prop);
		return prop;
	}

	/**
	 * Gets how often the todo repeats.
	 * @return the recurrence rule or null if not set
	 * @see "RFC 5545 p.122-32"
	 */
	public RecurrenceRule getRecurrenceRule() {
		return getProperty(RecurrenceRule.class);
	}

	/**
	 * Sets how often the todo repeats.
	 * @param recurrenceRule the recurrence rule or null to remove
	 * @see "RFC 5545 p.122-32"
	 */
	public void setRecurrenceRule(RecurrenceRule recurrenceRule) {
		setProperty(RecurrenceRule.class, recurrenceRule);
	}

	/**
	 * Gets the date that a todo is due by.
	 * @return the due date or null if not set
	 * @see "RFC 5545 96-7"
	 */
	public DateDue getDateDue() {
		return getProperty(DateDue.class);
	}

	/**
	 * Sets the date that a todo is due by. This must NOT be set if a
	 * {@link DurationProperty} is defined.
	 * @param dateDue the due date or null to remove
	 * @see "RFC 5545 96-7"
	 */
	public void setDateDue(DateDue dateDue) {
		setProperty(DateDue.class, dateDue);
	}

	/**
	 * Sets the date that a todo is due by. This must NOT be set if a
	 * {@link DurationProperty} is defined.
	 * @param dateDue the due date or null to remove
	 * @return the property that was created
	 * @see "RFC 5545 96-7"
	 */
	public DateDue setDateDue(Date dateDue) {
		DateDue prop = (dateDue == null) ? null : new DateDue(dateDue);
		setDateDue(prop);
		return prop;
	}

	/**
	 * Gets the duration of the todo.
	 * @return the duration or null if not set
	 * @see "RFC 5545 p.99"
	 */
	public DurationProperty getDuration() {
		return getProperty(DurationProperty.class);
	}

	/**
	 * Sets the duration of the todo. This must NOT be set if a {@link DateDue}
	 * is defined.
	 * @param duration the duration or null to remove
	 * @see "RFC 5545 p.99"
	 */
	public void setDuration(DurationProperty duration) {
		setProperty(DurationProperty.class, duration);
	}

	/**
	 * Gets any attachments that are associated with the todo.
	 * @return the attachments
	 * @see "RFC 5545 p.80-1"
	 */
	public List<Attachment> getAttachments() {
		return getProperties(Attachment.class);
	}

	/**
	 * Adds an attachment to the todo.
	 * @param attachment the attachment to add
	 * @see "RFC 5545 p.80-1"
	 */
	public void addAttachment(Attachment attachment) {
		addProperty(attachment);
	}

	/**
	 * Gets the people who are involved in the todo.
	 * @return the attendees
	 * @see "RFC 5545 p.107-9"
	 */
	public List<Attendee> getAttendees() {
		return getProperties(Attendee.class);
	}

	/**
	 * Adds a person who is involved in the todo.
	 * @param attendee the attendee
	 * @see "RFC 5545 p.107-9"
	 */
	public void addAttendee(Attendee attendee) {
		addProperty(attendee);
	}

	/**
	 * Adds a person who is involved in the todo.
	 * @param email the attendee's email address
	 * @return the property that was created
	 * @see "RFC 5545 p.107-9"
	 */
	public Attendee addAttendee(String email) {
		Attendee prop = Attendee.email(email);
		addAttendee(prop);
		return prop;
	}

	/**
	 * Gets a list of "tags" or "keywords" that describe the todo.
	 * @return the categories
	 * @see "RFC 5545 p.81-2"
	 */
	public List<Categories> getCategories() {
		return getProperties(Categories.class);
	}

	/**
	 * Adds a list of "tags" or "keywords" that describe the todo. Note that a
	 * single property can hold multiple keywords.
	 * @param categories the categories to add
	 * @see "RFC 5545 p.81-2"
	 */
	public void addCategories(Categories categories) {
		addProperty(categories);
	}

	/**
	 * Adds a list of "tags" or "keywords" that describe the todo.
	 * @param categories the categories to add
	 * @return the property that was created
	 * @see "RFC 5545 p.81-2"
	 */
	public Categories addCategories(String... categories) {
		Categories prop = new Categories(categories);
		addCategories(prop);
		return prop;
	}

	/**
	 * Adds a list of "tags" or "keywords" that describe the todo.
	 * @param categories the categories to add
	 * @return the property that was created
	 * @see "RFC 5545 p.81-2"
	 */
	public Categories addCategories(List<String> categories) {
		Categories prop = new Categories(categories);
		addCategories(prop);
		return prop;
	}

	/**
	 * Gets the comments attached to the todo.
	 * @return the comments
	 * @see "RFC 5545 p.83-4"
	 */
	public List<Comment> getComments() {
		return getProperties(Comment.class);
	}

	/**
	 * Adds a comment to the todo.
	 * @param comment the comment to add
	 * @see "RFC 5545 p.83-4"
	 */
	public void addComment(Comment comment) {
		addProperty(comment);
	}

	/**
	 * Adds a comment to the todo.
	 * @param comment the comment to add
	 * @return the property that was created
	 * @see "RFC 5545 p.83-4"
	 */
	public Comment addComment(String comment) {
		Comment prop = new Comment(comment);
		addComment(prop);
		return prop;
	}

	/**
	 * Gets the contacts associated with the todo.
	 * @return the contacts
	 * @see "RFC 5545 p.109-11"
	 */
	public List<Contact> getContacts() {
		return getProperties(Contact.class);
	}

	/**
	 * Adds a contact to the todo.
	 * @param contact the contact
	 * @see "RFC 5545 p.109-11"
	 */
	public void addContact(Contact contact) {
		addProperty(contact);
	}

	/**
	 * Adds a contact to the todo.
	 * @param contact the contact (e.g. "ACME Co - (123) 555-1234")
	 * @return the property that was created
	 * @see "RFC 5545 p.109-11"
	 */
	public Contact addContact(String contact) {
		Contact prop = new Contact(contact);
		addContact(prop);
		return prop;
	}

	/**
	 * Gets the list of exceptions to the recurrence rule defined in the todo
	 * (if one is defined).
	 * @return the list of exceptions
	 * @see "RFC 5545 p.118-20"
	 */
	public List<ExceptionDates> getExceptionDates() {
		return getProperties(ExceptionDates.class);
	}

	/**
	 * Adds a list of exceptions to the recurrence rule defined in the todo (if
	 * one is defined). Note that this property can contain multiple dates.
	 * @param exceptionDates the list of exceptions
	 * @see "RFC 5545 p.118-20"
	 */
	public void addExceptionDates(ExceptionDates exceptionDates) {
		addProperty(exceptionDates);
	}

	/**
	 * Gets the response to a scheduling request.
	 * @return the response
	 * @see "RFC 5545 p.141-3"
	 */
	public RequestStatus getRequestStatus() {
		return getProperty(RequestStatus.class);
	}

	/**
	 * Sets the response to a scheduling request.
	 * @param requestStatus the response
	 * @see "RFC 5545 p.141-3"
	 */
	public void setRequestStatus(RequestStatus requestStatus) {
		setProperty(RequestStatus.class, requestStatus);
	}

	/**
	 * Gets the components that the todo is related to.
	 * @return the relationships
	 * @see "RFC 5545 p.115-6"
	 */
	public List<RelatedTo> getRelatedTo() {
		return getProperties(RelatedTo.class);
	}

	/**
	 * Adds a component that the todo is related to.
	 * @param relatedTo the relationship
	 * @see "RFC 5545 p.115-6"
	 */
	public void addRelatedTo(RelatedTo relatedTo) {
		//TODO create a method that accepts a component and make the RelatedTo property invisible to the user
		//@formatter:off
		/*
		 * addRelation(RelationshipType relType, ICalComponent component){
		 *   RelatedTo prop = new RelatedTo(component.getUid().getValue());
		 *   prop.setRelationshipType(relType);
		 *   addProperty(prop);
		 * }
		 */
		//@formatter:on
		addProperty(relatedTo);
	}

	/**
	 * Adds a component that the todo is related to.
	 * @param uid the UID of the other component
	 * @return the property that was created
	 * @see "RFC 5545 p.115-6"
	 */
	public RelatedTo addRelatedTo(String uid) {
		RelatedTo prop = new RelatedTo(uid);
		addRelatedTo(prop);
		return prop;
	}

	/**
	 * Gets the resources that are needed for the todo.
	 * @return the resources
	 * @see "RFC 5545 p.91"
	 */
	public List<Resources> getResources() {
		return getProperties(Resources.class);
	}

	/**
	 * Adds a list of resources that are needed for the todo. Note that a single
	 * property can hold multiple resources.
	 * @param resources the resources to add
	 * @see "RFC 5545 p.91"
	 */
	public void addResources(Resources resources) {
		addProperty(resources);
	}

	/**
	 * Adds a list of resources that are needed for the todo.
	 * @param resources the resources to add (e.g. "easel", "projector")
	 * @return the property that was created
	 * @see "RFC 5545 p.91"
	 */
	public Resources addResources(String... resources) {
		Resources prop = new Resources(resources);
		addResources(prop);
		return prop;
	}

	/**
	 * Adds a list of resources that are needed for the todo.
	 * @param resources the resources to add (e.g. "easel", "projector")
	 * @return the property that was created
	 * @see "RFC 5545 p.91"
	 */
	public Resources addResources(List<String> resources) {
		Resources prop = new Resources(resources);
		addResources(prop);
		return prop;
	}

	/**
	 * Gets the list of dates/periods that help define the recurrence rule of
	 * this todo (if one is defined).
	 * @return the recurrence dates
	 * @see "RFC 5545 p.120-2"
	 */
	public List<RecurrenceDates> getRecurrenceDates() {
		return getProperties(RecurrenceDates.class);
	}

	/**
	 * Adds a list of dates/periods that help define the recurrence rule of this
	 * todo (if one is defined).
	 * @param recurrenceDates the recurrence dates
	 * @see "RFC 5545 p.120-2"
	 */
	public void addRecurrenceDates(RecurrenceDates recurrenceDates) {
		addProperty(recurrenceDates);
	}

	@Override
	protected void validate(List<ICalComponent> components, List<String> warnings) {
		if (getUid() == null) {
			warnings.add(Uid.class.getSimpleName() + " is not set (it is a required property).");
		}
		if (getDateTimeStamp() == null) {
			warnings.add(DateTimeStamp.class.getSimpleName() + " is not set (it is a required property).");
		}

		Status status = getStatus();
		if (status != null && (status.isTentative() || status.isConfirmed() || status.isDraft() || status.isFinal())) {
			warnings.add("Invalid status value of \"" + status.getValue() + "\".  Valid status values for todo tasks are \"needs-action\", \"completed\", \"in-progress\", and \"cancelled\".");
		}

		DateStart dateStart = getDateStart();
		DateDue dateDue = getDateDue();

		if (dateStart != null && dateDue != null) {
			Date start = dateStart.getValue();
			Date due = dateDue.getValue();
			if (start != null && due != null && start.compareTo(due) > 0) {
				warnings.add("" + DateStart.class.getSimpleName() + " must come before " + DateDue.class.getSimpleName() + ".");
			}

			if (dateStart.hasTime() != dateDue.hasTime()) {
				warnings.add("Both " + DateStart.class.getSimpleName() + " and " + DateDue.class.getSimpleName() + " must have the same data type (they must either both be dates or both be date/times).");
			}
		}

		if (dateDue != null && getDuration() != null) {
			warnings.add("A " + DateDue.class.getSimpleName() + " and a " + DurationProperty.class.getSimpleName() + " cannot both be defined in the same todo.");
		}
		if (dateStart == null && (dateDue != null || getDuration() != null)) {
			warnings.add("A" + DateStart.class.getSimpleName() + " must be defined if a " + DateDue.class.getSimpleName() + " or " + DurationProperty.class.getSimpleName() + " is defined.");
		}

		RecurrenceId recurrenceId = getRecurrenceId();
		if (recurrenceId != null && dateStart != null && dateStart.hasTime() != recurrenceId.hasTime()) {
			warnings.add("Both " + DateStart.class.getSimpleName() + " and " + RecurrenceId.class.getSimpleName() + " must have the same data type (they must either both be dates or both be date/times).");
		}
	}
}