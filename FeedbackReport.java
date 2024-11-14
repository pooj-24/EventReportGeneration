package com.eventreport;

public class FeedbackReport extends EventReport {
    private Event event;

    public FeedbackReport(Event event) {
        super(event.getEventName(), event.getEventDate());
        this.event = event;
    }

    @Override
    public void generateReport() throws ReportGenerationException {
        generateFeedbackReport();
    }

    public void generateFeedbackReport() throws ReportGenerationException {
        try {
            System.out.println("Generating Feedback Report for: " + event.getEventName());
            for (Feedback feedback : event.getFeedbacks()) {
                System.out.println("Feedback: " + feedback.getFeedbackText());
            }
        } catch (Exception e) {
            throw new ReportGenerationException("Error generating feedback report: " + e.getMessage());
        }
    }

	public void generateAttendanceReport() throws ReportGenerationException {

		
	}

	@Override
	public void generateVolunteerReport() throws ReportGenerationException {
		
		
	}
}
