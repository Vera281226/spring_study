package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DataMaperInterface {
	@Select("SELECT*FROM jikwon WHERE jikwonjik LIKE concat('%',#{searchValue},'%')")
	List<JikwonDto> selectSearch(String searchValue);
}