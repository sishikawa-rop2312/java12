package java12.notion.officeworker;

public class LazyOfficeWorker extends OfficeWorker {
	public LazyOfficeWorker(String name) {
		super(name);
	}
	
	public void work() {
		System.out.println("怠惰なオフィスワーカーの働きぶりを書く");
	}
}
