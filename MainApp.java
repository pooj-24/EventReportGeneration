package com.eventreport;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MainApp {
    private static final ExecutorService executorService = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        try {
            
            Event event = new Event("Annual Day", "2024-11-11");
            Volunteer volunteer1 = new Volunteer("Shana", "shana@example.com");
            Volunteer volunteer2 = new Volunteer("Benny", "benny@example.com");
            event.addVolunteer(volunteer1);
            event.addVolunteer(volunteer2);
            
            Feedback feedback1 = new Feedback("Great event!");
            Feedback feedback2 = new Feedback("Could have been better.");
            event.addFeedback(feedback1);
            event.addFeedback(feedback2);
            
            Attendance attendance1 = new Attendance(volunteer1, true);
            Attendance attendance2 = new Attendance(volunteer2, false);
            event.addAttendance(attendance1);
            event.addAttendance(attendance2);

           
            AttendanceReport attendanceReport = new AttendanceReport(event);
            FeedbackReport feedbackReport = new FeedbackReport(event);
            VolunteerReport volunteerReport = new VolunteerReport(event);

            
            List<Callable<Void>> tasks = Arrays.asList(
                new ReportGeneratorTask(attendanceReport),
                new ReportGeneratorTask(feedbackReport),
                new ReportGeneratorTask(volunteerReport)
            );

            List<Future<Void>> results = executorService.invokeAll(tasks);

           
            for (Future<Void> result : results) {
                result.get();  // This will block until the task is completed
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
