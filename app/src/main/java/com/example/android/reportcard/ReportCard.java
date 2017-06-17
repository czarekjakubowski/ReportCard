package com.example.android.reportcard;

public class ReportCard {

    //constants
    private static final int MAX_GRADE = 6;
    private static final int MIN_GRADE = 1;

    //variables
    private int studentId;
    private String studentFirstName;
    private String studentLastName;
    private int mathGrade;
    private int scienceGrade;
    private int biologyGrade;
    private String wrongGradeStatement;

    //creating ReportCard object
    public ReportCard(int studentId, String studentFirstName, String studentLastName, int mathGrade, int scienceGrade, int biologyGrade) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.biologyGrade = biologyGrade;
    }

    //group of getters and setters for all private variables
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        if (mathGrade >= MIN_GRADE && mathGrade <= MAX_GRADE) {
            this.mathGrade = mathGrade;
        } else this.mathGrade = 0;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(int scienceGrade) {
        if (scienceGrade >= MIN_GRADE && scienceGrade <= MAX_GRADE) {
            this.scienceGrade = scienceGrade;
        } else this.scienceGrade = 0;
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        if (biologyGrade >= MIN_GRADE && biologyGrade <= MAX_GRADE) {
            this.biologyGrade = biologyGrade;
        } else this.biologyGrade = 0;
    }

    //override of the toString method with something that returns a summary of students grades
    @Override
    public String toString() {

        if (mathGrade < 1 || scienceGrade < 1 || biologyGrade < 1){
            wrongGradeStatement = "\nSubjects with grade equal 0 need to be checked and reentered to the system";
        } else wrongGradeStatement = "";

        return "Student summary" +
                "\nID: " + studentId +
                "\nFirst name: " + studentFirstName +
                "\nLast name: " + studentLastName +
                "\nGrade in Mathematics: " + mathGrade +
                "\nGrade in Science: " + scienceGrade +
                "\nGrade in Biology: " + biologyGrade + wrongGradeStatement;

    }

}