package java12.notion.usb;

public class CardReader implements UsbConnectable {
	public void usbConnect() {
		System.out.println("USB接続にてSDカードの読み書きができます。");
	}
}
