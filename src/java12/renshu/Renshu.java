package java12.renshu;

public class Renshu {
	public static void main(String[] args) {

//			X obj = new A();
//			obj.a();

//		Y y1 = new A();
//		Y y2 = new B();
//		y1.a();
//		y2.a();
		
		Y[] list = {new A(), new B()};
		for (Y item : list) {
			item.b();
		}
	}
}
