package csci490.cofc.edu.lab3mainar;

/**
 * Created by smainar on 2/15/2018.
 */

public class Course {
    String professor;
    String courseNumber;
    String courseName;

    public void setProfessor(String professor){
        this.professor = professor;
    }
    public void setCourseNumber(String courseNumber){
        this.courseNumber = courseNumber;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getProfessor(){
        return this.professor;
    }
    public String getCourseNumber(){
        return this.courseNumber;
    }
    public String getCourseName(){
        return this.courseName;
    }
}
