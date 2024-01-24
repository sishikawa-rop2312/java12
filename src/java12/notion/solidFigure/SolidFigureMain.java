package java12.notion.solidFigure;

import java.util.Scanner;

public class SolidFigureMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("1. 立方体 / 2. 球 / 3.終了 >>");
			int select = scanner.nextInt();

			switch (select) {
			case 1:
				System.out.print("１辺の長さを入力して下さい >");
				double width = scanner.nextDouble();
				Cube cube = new Cube(width);
				cube.displayAreaInfo();
				break;
			case 2:
				System.out.print("半径を入力して下さい >");
				double r = scanner.nextDouble();
				Sphere sphere = new Sphere(r);
				sphere.displayAreaInfo();
				break;
			case 3:
				System.out.println("アプリケーションを終了します。");
				scanner.close();
				return;
			default:
				System.out.println("整数1～3で入力してください");
				break;
			}
		}
	}
}
