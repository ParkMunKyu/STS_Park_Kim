package com.inhatc.cs;

import java.util.List;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.persistence.BoardDAO;

   @RunWith(SpringJUnit4ClassRunner.class)
   @ContextConfiguration (locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
   
   public class BoardDAOTest{
	   private Logger logger = LoggerFactory.getLogger(getClass());
	   
      @Inject
      private BoardDAO dao;
      
      @Test
         public void testCreate() throws Exception{
         
            BoardVO board= new BoardVO();
            board.setTitle("���ο� ���� �ֽ��ϴ�.");
            board.setContent("���ο� ���� �ֽ��ϴ�.");
            board.setWriter("user00");
            dao.create(board);
      }
      
      @Test
      public void testRead() throws Exception{
         dao.read(1).toString();
      }
      
      @Test
      public void testUpdate() throws Exception{
            BoardVO board = new BoardVO();
            board.setBno(1);
            board.setTitle("������ ���Դϴ�");
            board.setContent("���� �׽�Ʈ");
            dao.update(board);
      }
      @Test
      public void testDelete() throws Exception{
         
         dao.delete(1);
      }
      
      
      @Test
      public void testListPage()throws Exception{
    	  
    	  int page = 3;
    	  
    	  List<BoardVO> list = dao.listPage(page);
    	  
    	  for (BoardVO boardVO : list) {
    		  logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
    	  }
      }
      
      @Test
      public void testListCriteria() throws Exception{
    	  
    	  Criteria cri  = new Criteria();
    	  cri.setPage(2);
    	  cri.setPerPageNum(20);
    	  
    	  List<BoardVO> list = dao.listCriteria(cri);
    		  for (BoardVO boardVO : list) {
        		  logger.info(boardVO.getBno() + ":" + boardVO.getTitle());
        	  }
    	  }
      }
   
   
   