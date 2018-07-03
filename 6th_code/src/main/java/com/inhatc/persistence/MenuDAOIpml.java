package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.inhatc.domain.MenuVO;

@Repository
public class MenuDAOIpml implements MenuDAO {
	
	
	@Inject
	private SqlSession sqlSession;
	
	private static final String namespace = "com.inhatc.mapper.menuMapper";
	
	   @Override
	   public void insertMenu(MenuVO vo) {
	      sqlSession.insert(namespace +".insertMenu",vo);
	   }
	   
	   @Override 
	   public MenuVO selectMenu(String me_no)throws Exception {
		   return (MenuVO)
		   sqlSession.selectOne(namespace + ".selectMenu", me_no);
	   }
}