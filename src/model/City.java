package model;

import java.util.List;

public class City {
	private int id;
	private String name;
	private List<School> schoolList;
	
	public City(int id, String name, List<School> schoolList) {
		super();
		this.id = id;
		this.name = name;
		this.schoolList = schoolList;
	}
	public List<School> getSchoolList() {
		return schoolList;
	}
	public void setSchoolList(List<School> schoolList) {
		this.schoolList = schoolList;
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
