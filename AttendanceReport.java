package com.eventreport;

public class AttendanceReport extends EventReport {
    private Event event;

    public AttendanceReport(Event event) {
        super(event.getEventName(), event.getEventDate());
        this.event = event;
    }

    @Override
    public void generateReport() throws ReportGenerationException {
        generateAttendanceReport();
    }

    public void generateAttendanceReport() throws ReportGenerationException {
        try {
            System.out.println("Generating Attendance Report for: " + event.getEventName());
            for (Attendance attendance : event.getAttendances()) {
                System.out.println(attendance.getVolunteer().getName() + " - Attended: " + attendance.isAttended());
            }
        } catch (Exception e) {
            throw new ReportGenerationException("Error generating attendance report: " + e.getMessage());
        }
    }

	@Override
	public void generateVolunteerReport() throws ReportGenerationException {
		
		
	}
}

