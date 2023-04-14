package game.dori.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import game.dori.util.PROD_Q_LIST_VO;
import game.dori.vo.PRODUCT_Q_VO;

@Repository
public class ProductQDAO {

	@Autowired
	private SqlSession sqlSession;
	private static String namespace = "game.dori.mapper.productQMapper.";
	
	//마이페이지 상품문의 리스트 출력
	public List<PRODUCT_Q_VO> selectList(int member_idx) {
		return sqlSession.selectList("game.dori.mapper.productQMapper.selectList", member_idx);
	}
	
	//관리자 페이지 상품문의 리스트 출력
	public List<PROD_Q_LIST_VO> list(){
		return sqlSession.selectList(namespace + "pqlist");
	}
	
	
}
