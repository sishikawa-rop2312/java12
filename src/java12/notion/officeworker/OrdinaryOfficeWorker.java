package java12.notion.officeworker;

public class OrdinaryOfficeWorker extends OfficeWorker {
	public OrdinaryOfficeWorker(String name) {
		super(name);
	}
	
	public void work() {
		System.out.println("普通のオフィスワーカーの働きぶりを書く");
	}
}
