package com.inhatc.persistence;

import com.inhatc.domain.MenuVO;

public interface MenuDAO {
	
	public void insertMenu(MenuVO vo);
	
	public MenuVO selectMenu (String me_no) throws Exception;
	
}