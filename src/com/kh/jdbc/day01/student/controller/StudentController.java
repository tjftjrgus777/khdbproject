package com.kh.jdbc.day01.student.controller;

import java.util.List;

import com.kh.jdbc.day01.student.model.dao.StudentDAO;
import com.kh.jdbc.day01.student.model.vo.Student;

public class StudentController {
		/**
		 * 학생 전체 목록 조회
		 * @return
		 */
		public List<Student> printAll() {
			StudentDAO sDao = new StudentDAO();
			List<Student> sList = sDao.selectAll();
			return sList;
		}
		/**
		 * 학생 이름으로 조회
		 * @param student
		 * @return sList
		 */
		public List<Student> printAllByName(String studentName) {
			StudentDAO sDao = new StudentDAO();
			List<Student> sList = sDao.selectAllByName(studentName);
			return sList;
		}
		/**
		 * 학생 아이디로 조회
		 * @param studentId
		 * @return student
		 */
		public Student printOneByid(String studentId) {
			StudentDAO sDao = new StudentDAO();
			Student student = sDao.selectOneById(studentId);
			
			return student;
		}
		public int registerStudent(Student student) {
			StudentDAO sDao = new StudentDAO();
			int result = sDao.insertMember(student);
			return result;
		}
		
		public int removeStudent(String studentId) {
			StudentDAO sDao = new StudentDAO();
			int result = sDao.deleteMember(studentId);
			return result;
		}
		/**
		 * 
		 * @param student
		 * @return
		 */
		public int modifyStudnet(Student student) {
			StudentDAO sDao = new StudentDAO();
			int result =sDao.updateStudent(student);
			return result;
		}
		
		
		
		
		
		
}
