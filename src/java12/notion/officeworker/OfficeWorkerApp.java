package java12.notion.officeworker;

import java.util.Random;
import java.util.Scanner;

public class OfficeWorkerApp {

	public static void main(String[] args) {
		final int WORKER_NUM = 3;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("あなたの部下に" + WORKER_NUM + "人配属されました");
		OfficeWorker[] workers = new OfficeWorker[WORKER_NUM];

		for (int i = 0; i < WORKER_NUM; i++) {
			System.out.print((i + 1) + "人目の名前を入力してください >");
			String name = scanner.nextLine();
			
			int workerType = random.nextInt(WORKER_NUM);
			switch (workerType) {
			case 0:
				workers[i] = new EliteOfficeWorker(name);
				break;
			case 1:
				workers[i] = new OrdinaryOfficeWorker(name);
				break;
			case 2:
				workers[i] = new LazyOfficeWorker(name);
				break;
			}
			workers[i].introduce();
		}

		System.out.println("誰の働きぶりを見にいきますか?");
		while (true) {
			for (int i = 0; i <= workers.length; i++) {
				System.out.printf("%d・・・%s\n", i, i < workers.length ? workers[i].name : "終了");
			}
			int select = scanner.nextInt();
			
			if(select < WORKER_NUM) {
				workers[select].work();
			} else if(select == WORKER_NUM) {
				System.out.println("アプリケーションを終了します。");
				scanner.close();
				break;
			}
		}
	}

}
