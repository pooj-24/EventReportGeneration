package com.eventreport;

public class ReportGenerationException extends Exception {
    public ReportGenerationException(String message) {
        super(message);  
    }

	public ReportGenerationException(AttendanceReport attendanceReport) {
		
	}
}
