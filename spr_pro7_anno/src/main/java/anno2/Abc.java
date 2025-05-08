package anno2;

import org.springframework.stereotype.Component;

@Component
public class Abc {
	private String irum;
	
	public void setIrum(String irum) {
		this.irum = irum;
	}
	
	public String getIrum() {
		return irum;
	}
}