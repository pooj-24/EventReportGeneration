package com.eventreport;

import java.util.concurrent.Callable;

public class ReportGeneratorTask implements Callable<Void> {
    private EventReport eventReport;

    
    public ReportGeneratorTask(EventReport eventReport) {
        this.eventReport = eventReport;
    }

    @Override
    public Void call() throws Exception {
        // Generate the report
        eventReport.generateReport();  // This will call the generateReport() method
        return null;
    }
}
