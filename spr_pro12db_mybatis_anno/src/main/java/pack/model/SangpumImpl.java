package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import pack.mybatis.SqlMapConfig;

@Repository
public class SangpumImpl implements SangpumInter {
	private SqlSessionFactory sqlSessionFactory = SqlMapConfig.getSqlSession();
	
	public SangpumImpl() {
		
	}
	
	@Override
	public List<SangpumDto> selectList() {
		SqlSession sqlsession = sqlSessionFactory.openSession();
		List<SangpumDto> list = null;
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
}