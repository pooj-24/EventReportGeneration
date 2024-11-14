package com.eventreport;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventName;
    private String eventDate;
    private List<Volunteer> volunteers = new ArrayList<>();
    private List<Feedback> feedbacks = new ArrayList<>();
    private List<Attendance> attendances = new ArrayList<>();

    
    public Event(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    // Getter and Setter methods
    public void addVolunteer(Volunteer volunteer) {
        volunteers.add(volunteer);
    }

    public void addFeedback(Feedback feedback) {
        feedbacks.add(feedback);
    }

    public void addAttendance(Attendance attendance) {
        attendances.add(attendance);
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public List<Volunteer> getVolunteers() {
        return volunteers;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public List<Attendance> getAttendances() {
        return attendances;
    }
}
