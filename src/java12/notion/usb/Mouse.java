package java12.notion.usb;

public class Mouse implements UsbConnectable {
	public void usbConnect() {
		System.out.println("USB接続にてマウス操作ができます。");
	}
}
