package first.sample.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface SampleService {

	Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception;

	//글 쓰기
	void insertBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	//글 읽기 & 조회수증가
	Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception;

	//글 수정
	void updateBoard(Map<String, Object> map, HttpServletRequest request) throws Exception;
 

	//글 삭제
	void deleteBoard(Map<String, Object> map) throws Exception;
	
}
