package com.jsp.Student;

import java.util.Set;

public class Branch {
	private int Branch_id;
	private String Branch_name;
	private Set<Student_2bean_class> Set_of_Student;
	public int getBranch_id() {
		return Branch_id;
	}
	public void setBranch_id(int branch_id) {
		Branch_id = branch_id;
	}
	public String getBranch_name() {
		return Branch_name;
	}
	public void setBranch_name(String branch_name) {
		Branch_name = branch_name;
	}
	public Set<Student_2bean_class> getSet_of_Student() {
		return Set_of_Student;
	}
	public void setSet_of_Student(Set<Student_2bean_class> set_of_Student) {
		Set_of_Student = set_of_Student;
	}
	@Override
	public String toString() {
		return "Branch [Branch_id=" + Branch_id + ", Branch_name=" + Branch_name + ", Set_of_Student=" + Set_of_Student
				+ "]";
	}
	
	
	

}
