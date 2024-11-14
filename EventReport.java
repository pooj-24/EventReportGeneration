package com.eventreport;

public abstract class EventReport implements Reportable {
    protected String eventName;
    protected String eventDate;

   
    public EventReport(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public abstract void generateReport() throws ReportGenerationException;
}
