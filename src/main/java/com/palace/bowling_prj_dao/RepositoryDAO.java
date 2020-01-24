package com.palace.bowling_prj_dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.palace.bowling_prj_dto.RepositoryDto;

public interface RepositoryDAO {
	public ArrayList<RepositoryDto> indexView() throws Exception;
	public void sizeWrite(@Param("sVal1") int tNo,@Param("sVal2") String tName,@Param("sVal3") String tPhone,@Param("sVal4") String tRsize,@Param("sVal5") String tMsize) throws Exception;
	public void deleteMemberSize(int userNo) throws Exception;
	public RepositoryDto sizeView(int userNo) throws Exception;
	public RepositoryDto modifyMemberSize(int userNo) throws Exception;
	public void modifyMemberSizeSave(@Param("M_Val1") int tNo,@Param("M_Val2") String tName,@Param("M_Val3") String tPhone,@Param("M_Val4") String tRsize,@Param("M_Val5") String tMsize,@Param("M_Val6") int userNo)  throws Exception;
	
	
	//준비중인 코드
	//검색 -> public ArrayList<RepositoryDto> userSearch(@Param("S_Val1") String searchKeyWord) throws Exception;
	//페이징처리 -> public int selectCount();

}