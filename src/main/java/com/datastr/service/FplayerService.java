package com.datastr.service;


import java.util.List;

import com.datastr.VO.FplayerVO;
import com.datastr.VO.UpdatePlayerVO;

public interface FplayerService {

	
	public void regist(FplayerVO fplayerVO) throws Exception;
	public void release(Integer idno) throws Exception;
	public void updatePlayer(UpdatePlayerVO updatePlayerVO) throws Exception;
	public FplayerVO getone(Integer idno) throws Exception;
	public List<FplayerVO> listAll() throws Exception;
	public List<FplayerVO> listAllBirth() throws Exception;
	public List<FplayerVO> listAllOrderBy(String order) throws Exception;
	
	
}
