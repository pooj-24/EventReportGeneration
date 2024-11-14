package com.eventreport;

public class Volunteer {
    private String name;
    private String contactInfo;

 
    public Volunteer(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }


    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }
}
