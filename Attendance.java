package com.eventreport;

public class Attendance {
    private Volunteer volunteer;
    private boolean attended;

    public Attendance(Volunteer volunteer, boolean attended) {
        this.volunteer = volunteer;
        this.attended = attended;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public boolean isAttended() {
        return attended;
    }
}
