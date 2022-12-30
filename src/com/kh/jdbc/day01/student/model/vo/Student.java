package com.kh.jdbc.day01.student.model.vo;

import java.sql.Date;

public class Student {
	private String studentId; //STUDENT_ID -> studentId
	private String studentName; // STUDENT_NAME -> studentName
	private String studentPwd;
	private int age;
	private String Gender;
	private String email;
	private String phone;
	private String address;
	private String hobby;
	private Date enrollDate; // ENROLL_DATE -> enrollDate;
	
	
	// 생성자
	public Student() {}
	
	public Student(String studentId) {
		this.studentId = studentId;
	}
	
	
	

	// getter/setter
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentPwd() {
		return studentPwd;
	}
	public void setStudentPwd(String studentPwd) {
		this.studentPwd = studentPwd;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	
	// to string
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", sudentPwd=" + studentPwd
				+ ", age=" + age + ", email=" + email + ", phone=" + phone + ", address=" + address + ", hobby=" + hobby
				+ ", enrollDate=" + enrollDate + "]";
	}
	
}
