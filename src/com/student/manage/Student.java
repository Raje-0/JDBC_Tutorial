package com.student.manage;

public class Student {
private int studentId;
private String StudentName;
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getStudentPhone() {
	return StudentPhone;
}
public void setStudentPhone(String studentPhone) {
	StudentPhone = studentPhone;
}
public String getStudentCity() {
	return studentCity;
}
public void setStudentCity(String studentCity) {
	this.studentCity = studentCity;
}
private String StudentPhone;
private String studentCity;
public Student(int studentId, String studentName, String studentPhone, String studentCity) {
	super();
	this.studentId = studentId;
	this.StudentName = studentName;
	this.StudentPhone = studentPhone;
	this.studentCity = studentCity;
}
public Student(String studentName, String studentPhone, String studentCity) {
	super();
	StudentName = studentName;
	StudentPhone = studentPhone;
	this.studentCity = studentCity;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
			+ ", studentCity=" + studentCity + "]";
}




}
