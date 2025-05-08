package pack.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public class DataDao {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultSet;
	
	@Autowired
	private MyDataSource dataSource;
	
	public DataDao() {}
	
	public ArrayList<JikwonDto> getDataAll(String jik) {
		ArrayList<JikwonDto> list = new ArrayList<JikwonDto>();
		
		try {
			String sql = "SELECT*FROM jikwon WHERE jikwonjik LIKE ?";
			connection = dataSource.getConnection();
			statement = connection.prepareStatement(sql);
			statement.setString(1, jik);
			resultSet = statement.executeQuery();
			while(resultSet.next()) {
				JikwonDto dto = new JikwonDto();
				dto.setNo(resultSet.getString("jikwonno"));
				dto.setName(resultSet.getString("jikwonname"));
				dto.setGen(resultSet.getString("jikwongen"));
				dto.setPay(resultSet.getString("jikwonpay"));
				list.add(dto);
			}
		} catch (Exception e) {
			System.out.println("getDataAll"+e.getMessage());
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(statement != null) statement.close();
				if(connection != null) connection.close();
			} catch (Exception e) {
				System.out.println("getDataAll"+e.getMessage());
			}
		}
		return list;
	}
}
