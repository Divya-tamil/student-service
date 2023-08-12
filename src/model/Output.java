package model;

public class Output{
	private String School;
	private String studentName;
	private String grade;
	private int marks;
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getSchool() {
		return School;
	}
	public void setSchool(String school) {
		School = school;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Output(String school, String studentName, String grade, int marks) {
		super();
		School = school;
		this.studentName = studentName;
		this.grade = grade;
		this.marks = marks;
	}
	

}
