package pack.model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;

@Repository
public class SangpumImpl implements SangpumInter {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	public SangpumImpl() {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (Exception e) {
			System.out.println("드라이버 로딩 오류 : "+e.getMessage());
		}
	}
	
	@Override
	public ArrayList<SangpumDto> selectList() {
		ArrayList<SangpumDto> list = new ArrayList<SangpumDto>();
		
		try {
			connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/test","root","123");
			preparedStatement = connection.prepareStatement("SELECT*FROM sangdata");
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				SangpumDto dto = new SangpumDto();
				dto.setCode(resultSet.getString(1));
				dto.setSang(resultSet.getString(2));
				dto.setSu(resultSet.getString(3));
				dto.setDan(resultSet.getString(4));
				list.add(dto);			
			}
		} catch (Exception e) {
			System.out.println("selectList 에러"+e.getMessage());
		}finally {
			try {
				resultSet.close();
				preparedStatement.close();
				connection.close();
			} catch (Exception e) {
				System.out.println("selectList 종료 에러"+e.getMessage());
			}
		}
		return list;
	}
}