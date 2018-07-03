package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.StudentVO;

@Repository
public class StudentDAOImp implements StudentDAO {
	
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.studentMapper";
	
	   @Override
	   public void insertStudent(StudentVO vo) {
	      sqlSession.insert(namespace +".insertStudent",vo);
	   }
	   
	   @Override 
	   public StudentVO selectStudent(String stu_no)throws Exception {
		   return (StudentVO)
		   sqlSession.selectOne(namespace + ".selectStudent", stu_no);
	   }
}