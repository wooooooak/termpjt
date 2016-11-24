package com.datastr.service;

import java.util.List;

import com.datastr.VO.StaffVO;

public interface StaffService {

	public void regist(StaffVO staffVO) throws Exception;
	public List<StaffVO> listAll() throws Exception;
	public List<StaffVO> listAllOrderBy(String order) throws Exception;
	public void release(Integer pno) throws Exception;
	public StaffVO getone(Integer idno) throws Exception;
}