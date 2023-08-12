package model;

import java.util.List;

public class School {
	private int id;
	private String name;
	private List<Student> listOfStudent;
	
	public School(int id, String name, List<Student> listOfStudent) {
		super();
		this.id = id;
		this.name = name;
		this.listOfStudent = listOfStudent;
	}
	public List<Student> getListOfStudent() {
		return listOfStudent;
	}
	public void setListOfStudent(List<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
