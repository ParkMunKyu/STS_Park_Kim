package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.MenuVO;
import com.inhatc.persistence.MenuDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
      locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})

public class MenuDAOTest{
   
   
      @Inject 
      private MenuDAO dao;
      
 
      
      @Test
      public void testInsertMenu() throws Exception{
         
    	  MenuVO vo= new MenuVO();
	         vo.setMe_no("���");
	         vo.setMe_price (12400);
	         vo.setMe_do("ġ� �ܶ� �ö� ����");
	         vo.setMe_cal(1234);
	         vo.setMe_info("���� ġ�� �� �丶��ҽ�");
	         
         dao.insertMenu(vo);
      }
      
      @Test
      public void testSelection()throws Exception{
    	  MenuVO vo = dao.selectMenu("ġŲ");
    	  System.out.println("�޴�:" + vo.getMe_no());
    	  System.out.println("����:" + vo.getMe_price());
    	  System.out.println("�޴�Ư¡:" + vo.getMe_do());
    	  System.out.println("Į�θ�:" + vo.getMe_cal());
    	  System.out.println("�������:" + vo.getMe_info());
    	  
      }
}
   