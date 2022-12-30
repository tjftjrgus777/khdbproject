package com.kh.jdbc.day02.member.model.vo;

import java.sql.Timestamp;

public class Member {
	// DB에 필요한 데이터 필드변수로 선언
	private String memberId;
	private String memberPwd;
	private String memberName;
	private String Gender;
	private int Age;
	private String Email;
	private String Phone;
	private String Address;
	private String Hobby;
	private Timestamp Date;
	// 생성자 만들긴 했는데 값을 안 넣어도 될 것 같네
	public Member() {}
	// 생성자는 void 사용 금지 반환타입이 없다
	public Member(String memberId, String memberPwd, String memberName, String gender, int age, String email,
			String phone, String address, String hobby) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		Gender = gender;
		Age = age;
		Email = email;
		Phone = phone;
		Address = address;
		Hobby = hobby;
	}

	// DAO 클래스에서 값을 가여오고 get set 매소드 생성 자동완성 안하고 쓸려고 하니까 못하겠더라 반성하자
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getHobby() {
		return Hobby;
	}

	public void setHobby(String hobby) {
		Hobby = hobby;
	}

	
	public Timestamp getDate() {
		return Date;
	}
	public void setDate(Timestamp date) {
		Date = date;
	}
	// 만들다 보니까 전체 조회하는데 출력하는게 없다 값을 넣어준 인스턴스를 출력할수 있는 메소드를 만들어야 겠다
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberName=" + memberName + ", Gender="
				+ Gender + ", Age=" + Age + ", Email=" + Email + ", Phone=" + Phone + ", Address=" + Address
				+ ", Hobby=" + Hobby + ", Date=" + Date + "]";
	}
	
	
	

}
