package com.brownpoodle.chabun.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.brownpoodle.board.vo.BoardVO;
import com.brownpoodle.chabun.dao.ChabunDAO;
import com.brownpoodle.rboard.vo.RboardVO;

public class ChabunServiceImpl implements ChabunService {

	private Logger logger = Logger.getLogger(ChabunServiceImpl.class);
	
	private ChabunDAO chabunDAO;
	
	@Autowired(required=false)
	public ChabunServiceImpl(ChabunDAO chabunDAO) {
		this.chabunDAO = chabunDAO;
	}
	
	@Override
	public BoardVO getBoardChabun() {
		return chabunDAO.getBoardChabun();
	}

	@Override
	public RboardVO getRboardChabun() {
		// TODO Auto-generated method stub
		return chabunDAO.getRboardChabun();
	}

}
