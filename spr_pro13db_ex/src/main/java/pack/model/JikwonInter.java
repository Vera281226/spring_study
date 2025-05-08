package pack.model;

import java.util.List;

public interface JikwonInter {
	List<JikwonDto> selectAllList();
	List<JikwonDto> selectCountList();
	List<JikwonDto> selectMaxPayList();
}