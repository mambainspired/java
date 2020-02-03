package com.kalsden;

public class Student {
    private String FirstName;
    private String LastName;
    private String StudentID;
    private String Program;

    // Getters
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getStudentID() {
        return StudentID;
    }

    public String getProgram() {
        return Program;
    }

    public Student (String fName, String lName, String sID, String program) {
        FirstName = fName;
        LastName = lName;
        StudentID = sID;
        Program = program;
    }
}
