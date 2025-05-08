package pack.other;

import java.io.FileWriter;

public class OutFileInterImpl implements OutFileInter {
	private String filePath;
	
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	@Override
	public void outFileString(String msg) {
		try {
			FileWriter writer = new FileWriter(filePath);
			writer.write(msg);
			writer.close();
			System.out.println("저장 완료");
		} catch (Exception e) {
			System.out.println("outFileString ERR "+e.getMessage());
		}
	}
}