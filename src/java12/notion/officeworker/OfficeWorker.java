package java12.notion.officeworker;

public abstract class OfficeWorker {
	String name;
	
	public OfficeWorker(String name) {
		this.name = name;
	}
	
	public void introduce(){
		System.out.println("名前は" + this.name + "です");
	}
	public abstract void work();
}
