package com.inhatc.persistence;

import com.inhatc.domain.StudentVO;

public interface StudentDAO {
	
	public void insertStudent(StudentVO vo);
	
	public StudentVO selectStudent(String stu_no) throws Exception;
	
}