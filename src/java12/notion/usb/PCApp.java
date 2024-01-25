package java12.notion.usb;

import java.util.Scanner;

public class PCApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		PC pc = new PC();

		while (true) {
			System.out.print("0.アプリ実行,1.USBデバイス接続,2.終わり>");
			int select = scanner.nextInt();

			switch (select) {
			case 0:
				pc.execApp();
				break;
			case 1:
				System.out.print("どのデバイスを接続しますか 0.マウス、1.メモリー、2.カードリーダー＞");
				int selectUsb = scanner.nextInt();

				switch (selectUsb) {
				case 0:
					pc.setDevice(new Mouse());
					pc.usb();
					break;
				case 1:
					pc.setDevice(new Memory());
					pc.usb();
					break;
				case 2:
					pc.setDevice(new CardReader());
					pc.usb();
					break;
				}
				break;
			case 2:
				System.out.println("アプリケーションを終了します。");
				scanner.close();
				return;
			}
		}
	}
}
