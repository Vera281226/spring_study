package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.mybatis.SqlMapConfig;

@Repository
public class JikwonImpl implements JikwonInter {
	private SqlSessionFactory sqlSessionFactory = SqlMapConfig.getSqlSession();
	
	public JikwonImpl() {
		
	}
	
	@Override
	public List<JikwonDto> selectAllList() {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<JikwonDto> list = null;
		SqlMapperInter mapperInter = (SqlMapperInter)sqlsession.getMapper(SqlMapperInter.class);
		try {
			list = mapperInter.selectAll();
		} catch (Exception e) {
			System.out.println("selectList 오류 : "+e.getMessage());
		}finally {
			if(sqlsession != null) sqlsession.close();
		}
		return list;
	}
	@Override
	public List<JikwonDto> selectCountList() {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<JikwonDto> list = null;
		SqlMapperInter mapperInter = (SqlMapperInter)sqlsession.getMapper(SqlMapperInter.class);
		try {
			list = mapperInter.selectCount();
		} catch (Exception e) {
			System.out.println("selectList 오류 : "+e.getMessage());
		}finally {
			if(sqlsession != null) sqlsession.close();
		}
		return list;
	}
	@Override
	public List<JikwonDto> selectMaxPayList() {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<JikwonDto> list = null;
		SqlMapperInter mapperInter = (SqlMapperInter)sqlsession.getMapper(SqlMapperInter.class);
		try {
			list = mapperInter.selectMaxPay();
		} catch (Exception e) {
			System.out.println("selectList 오류 : "+e.getMessage());
		}finally {
			if(sqlsession != null) sqlsession.close();
		}
		return list;
	}
}