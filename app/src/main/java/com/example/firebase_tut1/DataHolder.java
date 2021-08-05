package com.example.firebase_tut1;

public class DataHolder {
    String name , roll,course,course_duration;

    public DataHolder(String name, String course, String course_duration) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.course_duration = course_duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }
}
