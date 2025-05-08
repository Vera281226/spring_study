package pack;

public class MessageImpl implements MessageInter {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHi() {
		System.out.println(name+"님의 핵심 비즈니스 로직 수행 중");
		int t = 0;
		while(t < 5) {
			try {
				Thread.sleep(1000);
				System.out.println(".");
				t++;
			} catch (Exception e) {
				System.out.println("sayHi err " + e.getMessage());
				return;
			}
		}
		System.out.println(name+"님의 핵심 비즈니스 로직 수행 끝");
	}
}