package com.kh.jdbc.day01.student.view;

import java.util.List;
import java.util.Scanner;

import com.kh.jdbc.day01.student.model.vo.Student;

public class StudentView {
	
	public void showAll(List<Student> students) {
		System.out.println("=== === 학생 전체 목록 조회 === ===");
		for(Student sOne: students) {
			System.out.print("아이디 : " +sOne.getStudentId());
			System.out.print(", 비밀번호 : " +sOne.getStudentPwd());
			System.out.print(", 이름 : " +sOne.getStudentName());
			System.out.print(", 성별 : " +sOne.getGender());
			System.out.print(", 나이 : " +sOne.getAge());
			System.out.print(", 이메일 : " +sOne.getEmail());
			System.out.print(", 전화번호 : " +sOne.getAddress());
			System.out.print(", 주소 : " +sOne.getHobby());
			System.out.print(", 취미 : " +sOne.getHobby());
			System.out.println(", 가입날짜 : " +sOne.getEnrollDate());
			
		}
	}
	public void showOne(Student student) {
		System.out.print("아이디 : " +student.getStudentId());
		System.out.print(", 비밀번호 : " +student.getStudentPwd());
		System.out.print(", 이름 : " +student.getStudentName());
		System.out.print(", 성별 : " +student.getGender());
		System.out.print(", 나이 : " +student.getAge());
		System.out.print(", 이메일 : " +student.getEmail());
		System.out.print(", 전화번호 : " +student.getAddress());
		System.out.print(", 주소 : " +student.getHobby());
		System.out.print(", 취미 : " +student.getHobby());
		System.out.println(", 가입날짜 : " +student.getEnrollDate());
		
	}

	public String inputStudentId(String message) {
		Scanner sc =  new Scanner(System.in);
		System.out.print(message + "할 아이디 입력 : ");
		String studentId = sc.next();
		return studentId;
	}
	
	public String inputStudentName(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.print(message + "할 이름 입력 : ");
		String studentName = sc.next();
		return studentName;
	}
	
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 :");
		String studentId = sc.next();
		System.out.println("이름 :");
		String studentName = sc.next();
		System.out.println("비밀번호 :");
		String studentPwd = sc.next();
		System.out.println("성별 :");
		String gender = sc.next();
		System.out.println("나이 :");
		int age = sc.nextInt();
		System.out.println("이메일 :");
		String email = sc.next();
		System.out.println("전화번호 :");
		String phone = sc.next();
		System.out.println("주소 :");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("취미(, 로구분) :");
		String hobby = sc.next();
		Student student = new Student();
		student.setStudentId(studentId);
		student.setStudentPwd(studentPwd);
		student.setStudentName(studentName);
		student.setGender(gender);
		student.setAge(age);
		student.setEmail(email);
		student.setPhone(phone);
		student.setAddress(address);
		student.setHobby(hobby);
		
		return student;
	}

	public Student modifyStudent(Student student) {
		Scanner sc = new Scanner(System.in);
//		Student student = new Student();
	
		System.out.println("수정할 비밀번호 입력 : ");
		String studentPwd = sc.next();
		System.out.println("수정할 이메일 입력 : ");
		String email = sc.next();
		System.out.println("수정할 전화번호 입력 : ");
		String phone = sc.next();
		System.out.println("수정할 주소 입력");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println("수정할 취미 입력 : ");
		String hobby = sc.next();
		student.setStudentPwd(studentPwd);
		student.setEmail(email);
		student.setPhone(phone);
		student.setAddress(address);
		student.setHobby(hobby);
		return student;
	}
	
	public int mainMenu() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("메뉴 선택 : ");
		int select = sc.nextInt();
		return select;
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
	public void displaySyccess(String message) {
		System.out.println("[서비스 성공] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[서비스 실패] :" + message);
	}
	
	
	
}
