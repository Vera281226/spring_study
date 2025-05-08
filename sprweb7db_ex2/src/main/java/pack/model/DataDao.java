package pack.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataDao {
	
	@Autowired
	private DataMaperInterface maperInterface;
	
	public ArrayList<JikwonDto> getDataSearch(JikwonDto jikwonDto) {
		ArrayList<JikwonDto> list = (ArrayList<JikwonDto>)maperInterface.selectSearch(jikwonDto.getJikwonjik());
		return list;
	}
}