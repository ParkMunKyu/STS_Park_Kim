package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest{
   
   
      @Inject 
      private MemberDAO dao;
      
      @Test
      public void testTime() throws Exception{
         System.out.println(dao.getTime());
      }
      
      @Test
      public void testInsertMember() throws Exception{
         
         MemberVO vo= new MemberVO();
         vo.setUserid("USER23");
         vo.setUserpw("USER00");
         vo.setUsername("USER00");
         vo.setEmail("USER00@aaa.com");
         
         dao.insertMember(vo);
      }
      
      @Test
      public void testSelectMember() throws Exception{
    	  MemberVO vo= dao.readMember("USER01");
    	  System.out.println("아이디" + vo.getUserid());
    	  System.out.println("비밀번호" + vo.getUserpw());
    	  System.out.println("이름" + vo.getUsername());
    	  System.out.println("이메일"+ vo.getEmail());
        	 
      }
      @Test
      public void testReadWithPW() throws Exception{
    	  MemberVO vo = dao.readWithPW("USER02", "USER00");
    	  System.out.println("아이디" + vo.getUserid());
    	  System.out.println("비밀번호" + vo.getUserpw());
    	  System.out.println("이름" + vo.getUsername());
    	  System.out.println("이메일"+ vo.getEmail());
      }
      
      @Test
      public void testUpdate() throws Exception{
         dao.updateMember("USER01", "USER00");
      }
      
      @Test
      public void testDelete() throws Exception{
    	  dao.deleteMember("USER2");
      }
   }