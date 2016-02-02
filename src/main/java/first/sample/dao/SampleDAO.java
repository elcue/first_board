package first.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO{

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception{
		return (List<Map<String, Object>>)selectList("sample.selectBoardList", map);
	}

	//글 쓰기
	public void insertBoard(Map<String, Object> map) throws Exception{
	    insert("sample.insertBoard", map);
	} 
	
	//글 읽기 & 조회수증가
	public void updateHitCnt(Map<String, Object> map) throws Exception{
	    update("sample.updateHitCnt", map);
	}
	 
	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) throws Exception{
	    return (Map<String, Object>) selectOne("sample.selectBoardDetail", map);
	}
	
	//글 수정
	public void updateBoard(Map<String, Object> map) throws Exception{
	    update("sample.updateBoard", map);
	}
	
	//글 삭제
	public void deleteBoard(Map<String, Object> map) throws Exception{
	    update("sample.deleteBoard", map);
	}
	
	// selectFileList 쿼리 호출
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception{
	    return (List<Map<String, Object>>)selectList("sample.selectFileList", map);
	}
	
	//파일추가
	public void insertFile(Map<String, Object> map) throws Exception{
	    insert("sample.insertFile", map);
	}
	
	public void deleteFileList(Map<String, Object> map) throws Exception{
	    update("sample.deleteFileList", map);
	}
	 
	public void updateFile(Map<String, Object> map) throws Exception{
	    update("sample.updateFile", map);
	}
	
	
}
