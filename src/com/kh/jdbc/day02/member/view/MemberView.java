package com.kh.jdbc.day02.member.view;

import java.util.List;
import java.util.Scanner;

import com.kh.jdbc.day02.member.model.vo.Member;

public class MemberView {
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 회원관리 프로그램 === === ===");
		System.out.println("1. 회원 전체 조회");
		System.out.println("2. 회원 아이디로 조회");
		System.out.println("3. 회원 이름으로 조회");
		System.out.println("4. 회원 가입");
		System.out.println("5. 회원 정보 수정");
		System.out.println("6. 회원 탈퇴");
		System.out.println("0. 프로그램 종료");
		System.out.println("메뉴 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public void showAll(List<Member> mList) {
		System.out.println("=== === === 전체 회원 조회 결과 === === ===");
		for(Member mOne : mList) {
//			System.out.println(mOne.toString());
			
			System.out.println("아이디 :" + mOne.getMemberId());
			System.out.println("이름 :" + mOne.getMemberName());
			System.out.println("성별 :" + mOne.getGender());
			System.out.println("이메일 :" + mOne.getEmail());
			System.out.println("전화번호 :" + mOne.getPhone());
			System.out.println("취미 :" + mOne.getHobby());
			System.out.println("가입날짜 :" + mOne.getDate());
		}
		
	}
	
	public void searchId(List<Member> mList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 아이디 검색");
		String memberId =sc.next();
		for(Member mOne : mList) {
			if(mOne.getMemberId().equals(memberId)) {
				System.out.println(mOne.toString());
			}
		}
		
	}
	
	public String inputMemberId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.println(category + "할 아이디 입력");
		String mId = sc.next();
		return mId;
	}
	
	public Member inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 회원 정보 입력 === ===");
		System.out.println("아이디 :");
		String memberId = sc.next(); 
		System.out.println("비밀번호 :");
		String memberPwd = sc.next();
		System.out.println("이름 :");
		String memberName = sc.next();
		System.out.println("성별 :");
		String gender = sc.next();
		System.out.println("나이 :");
		int age = sc.nextInt();
		System.out.println("이메일 :");
		String email = sc.next();
		System.out.println("전화번호 :");
		String phone = sc.next();
		System.out.println(" 주소 :");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.println(" 취미 :");
		String hobby = sc.next();
		Member member = new Member(memberId, memberPwd, memberName, gender, age, email, phone, address, hobby);
//		Member member = new Member();
//		member.setMemberId(memberId);
//		member.setMemberPwd(memberPwd);
//		member.setMemberName(memberName);
//		member.setGender(gender);
//		member.setAge(age);
//		member.setEmail(email);
//		member.setPhone(phone);
//		member.setAddress(address);
//		member.setHobby(hobby);
		
		return member;
	}
	
	public void displaySyccess(String message) {
		System.out.println("[서비스 성공] : " + message);
	}
	
	public void displayError(String message) {
		System.out.println("[서비스 실패] :" + message);
	}

}
