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
	         vo.setMe_no("사과");
	         vo.setMe_price (12400);
	         vo.setMe_do("치즈가 잔뜩 올라간 피자");
	         vo.setMe_cal(1234);
	         vo.setMe_info("양파 치즈 빵 토마토소스");
	         
         dao.insertMenu(vo);
      }
      
      @Test
      public void testSelection()throws Exception{
    	  MenuVO vo = dao.selectMenu("치킨");
    	  System.out.println("메뉴:" + vo.getMe_no());
    	  System.out.println("가격:" + vo.getMe_price());
    	  System.out.println("메뉴특징:" + vo.getMe_do());
    	  System.out.println("칼로리:" + vo.getMe_cal());
    	  System.out.println("재료정보:" + vo.getMe_info());
    	  
      }
}
   