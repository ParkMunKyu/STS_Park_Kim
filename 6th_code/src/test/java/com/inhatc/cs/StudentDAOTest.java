package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class StudentDAOTest{
   
   
      @Inject 
      private StudentDAO dao;
      
 
      
      @Test
      public void testInsertMenu() throws Exception{
         
    	     StudentVO vo= new StudentVO();
	         vo.setStu_no("201444011");
	         vo.setStu_name("박문규");
	         vo.setStu_adds("경기도 안양시 만안구");
	         vo.setStu_phone("010-3362-9563");
	         vo.setStu_email("USER00@aaa.com");
	         
         dao.insertStudent(vo);
      }
      
      @Test
      public void testSelection()throws Exception{
    	  StudentVO vo = dao.selectStudent("201444012");
    	  System.out.println("학번:" + vo.getStu_no());
    	  System.out.println("이름:" + vo.getStu_name());
    	  System.out.println("주소:" + vo.getStu_adds());
    	  System.out.println("HP:" + vo.getStu_phone());
    	  System.out.println("Email:" + vo.getStu_email());
    	  
      }
}
   