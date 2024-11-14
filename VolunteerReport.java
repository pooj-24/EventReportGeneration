package com.eventreport;

public class VolunteerReport extends EventReport {
    private Event event;

   
    public VolunteerReport(Event event) {
        super(event.getEventName(), event.getEventDate());
        this.event = event;
    }

    public void generateVolunteerReport() throws ReportGenerationException {
        try {
            System.out.println("Generating Volunteer Report for: " + event.getEventName());
            for (Volunteer volunteer : event.getVolunteers()) {
                System.out.println("Volunteer: " + volunteer.getName() + ", Contact: " + volunteer.getContactInfo());
            }
        } catch (Exception e) {
            throw new ReportGenerationException("Error generating volunteer report: " + e.getMessage());
        }
    }

    @Override
    public void generateReport() throws ReportGenerationException {
        generateVolunteerReport();
    }

	public void generateAttendanceReport() throws ReportGenerationException {
		
		
	}

	public void generateFeedbackReport() throws ReportGenerationException {

		
	}
}
