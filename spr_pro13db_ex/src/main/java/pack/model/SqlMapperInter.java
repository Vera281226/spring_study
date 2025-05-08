package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface SqlMapperInter {
	@Select("SELECT jikwonno, jikwonname, nvl(busername,'무소속') AS jikwonbusername, SUBSTR(jikwonibsail,1,4) AS jikwonibsail FROM jikwon LEFT JOIN buser ON buserno=busernum")
	public List<JikwonDto> selectAll();
	@Select("SELECT nvl(busername,'무소속') AS jikwonbusername, COUNT(*) AS jikwoncount FROM jikwon LEFT JOIN buser ON buserno=busernum GROUP BY jikwonbusername")
	public List<JikwonDto> selectCount();
	@Select("SELECT nvl(busername,'무소속') AS jikwonbusername, jikwonname, jikwonpay AS jikwonmaxpay FROM jikwon j LEFT JOIN buser ON buserno=busernum WHERE jikwonpay=(SELECT MAX(j2.jikwonpay) FROM jikwon j2 WHERE j.busernum = j2.busernum) ORDER BY jikwonbusername DESC")
	public List<JikwonDto> selectMaxPay();
}