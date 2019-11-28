package com.ustglobal.jpawithhibernateapp1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_info")
public class EmployeeInfo {
@Id
@Column
private int id;
@Column
private String name;
@Column
private int sal;
@Column
private char gender;


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
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public char getGender() {
	return gender;
}
public void setGender(char gender) {
	this.gender = gender;
}

}
