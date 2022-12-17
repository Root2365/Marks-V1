package com.marks.dto;

public class MarkDTO {

    private Integer markID;

    private String department;

    private String studentID;

    private Integer mark;

    private String pass;

    private String studentName;

    public MarkDTO() {
    }

    public MarkDTO(Integer markID, String department, String studentID, Integer mark, String pass, String studentName) {
        this.markID = markID;
        this.department = department;
        this.studentID = studentID;
        this.mark = mark;
        this.pass = pass;
        this.studentName = studentName;
    }

    public Integer getMarkID() {
        return markID;
    }

    public void setMarkID(Integer markID) {
        this.markID = markID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
