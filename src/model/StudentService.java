package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
 
public class StudentService {
	public static void main(String ...args) {
		//Adding Sample datas
		Student s1 = new Student(1,"john","10",400);
		Student s2 = new Student(2,"jad","10",678);
		Student s3 = new Student(3,"jyu","10",324);
		Student s4 = new Student(4,"bft","8",800);
		Student s5 = new Student(5,"ui","7",500);
		Student s6 = new Student(6,"ree","6",300);
		Student s7 = new Student(7,"jyu","10",788);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		studentList.add(s6);
		studentList.add(s7);
		School school1 = new School(1,"school1",studentList);
		List<School> listOfSchools = new ArrayList<School>();
		listOfSchools.add(school1);
		City city1 =  new City(1,"chennai",listOfSchools);
		List<City> cityList = new ArrayList<City>();
		cityList.add(city1);
		List<Output> output = new ArrayList<Output>();
		
		//Putting all schoolname, studentname, grade and totalmarks to  a separate list
		for(City c1 : cityList) {
			for( School sc1 :c1.getSchoolList()) {
				for(Student st1 : sc1.getListOfStudent()) {
					Output  op  = new Output(sc1.getName(), st1.getName(), st1.getGrade(), st1.getTotalMarks());
					output.add(op);
				}
			}
		}
		
		//Filtering the students who are in 10th  grade, sorting in reversed order and getting top 3 students
		List<Output> finalop =  output.stream().filter(o -> o.getGrade().equals("10"))
				.sorted(Comparator.comparingInt(Output::getMarks).reversed()).limit(3).collect(Collectors.toList());

		System.out.println("Top 3 Students on 10th grade");
		 for(Output ds: finalop) {
			 System.out.println("School Name::"+ds.getSchool()+" Student:::"+ds.getStudentName()+" Marks :::"+ds.getMarks());
		 }
		
	}
}
