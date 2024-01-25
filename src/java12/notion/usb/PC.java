package java12.notion.usb;

public class PC {
	UsbConnectable device;

	public void execApp() {
		System.out.println("アプリケーションを実行する");
	}

	public void usb() {
		this.device.usbConnect();
	}

	public void setDevice(UsbConnectable device) {
		this.device = device;
	}
}
