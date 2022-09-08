package com.jsp.Student;

import java.util.Set;

public class College {
	private int College_id;
	private String Colleg_name;
	private Set<Branch> Set_of_branch;
	public int getCollege_id() {
		return College_id;
	}
	public void setCollege_id(int college_id) {
		College_id = college_id;
	}
	public String getColleg_name() {
		return Colleg_name;
	}
	public void setColleg_name(String colleg_name) {
		Colleg_name = colleg_name;
	}
	public Set<Branch> getSet_of_branch() {
		return Set_of_branch;
	}
	public void setSet_of_branch(Set<Branch> set_of_branch) {
		Set_of_branch = set_of_branch;
	}
	@Override
	public String toString() {
		return "College [College_id=" + College_id + ", Colleg_name=" + Colleg_name + ", Set_of_branch=" + Set_of_branch
				+ "]";
	}
	
}
