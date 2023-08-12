package model;

public class Student {
	private int id;
	private String name;
	private String grade;
	private int totalMarks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Student(int id, String name, String grade, int totalMarks) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.totalMarks = totalMarks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

}
