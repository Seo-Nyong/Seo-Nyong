package game;

import java.util.Scanner;

public class Lyn {
	
	public static boolean finish = false;
	
	public Lyn() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void showLyn() {
		do {
			System.out.println("<ù����>");
			System.out.println("�� ���� �ʵ� ���� �ٴϴ°ž�?");
			System.out.println("1. �� �װ� �ٴѴٰ� �ؼ� ����;���.");
			System.out.println("2. ��, �ʵ� ���� �ٳ�?");
			System.out.println("3. �� �ʳ�?");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� ��..���� ���ڱ� �׷� �����ϰ� �ư� ���� ����");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� ������ ���� �ٴϴ� �б��� �������ž�..?");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� ���� ���ڸ��� �ú� ����?");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� ����ôµ�, �����..?");
				System.out.println("===========================");
			}
			Lyn.finish = check==1 || check==2 ||check==3 ?true:false;
		}while(!finish);
		
	}
	
	public void showLyn02() {
		do {
			System.out.println("<����Ʈ>");
			System.out.println("�� ���İŸ� �� ��Ծ�.�׷��� �ʳ� ������ �� �θ��ǵ�?");
			System.out.println("1. �׾� ����Ʈ �Ϸ��� �ҷ���. ���� ��ȭ�� ����?");
			System.out.println("2. ���� �ѵι� �ͺ�? ���ｺ���� �� �׷�");
			System.out.println("3. ���� �θ��µ� ������ �־�� �ǳ�?");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� ��ȭ..������ ������..���� �� ���ǵ�..?");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� �ƴ�..�׷� �ǹ̰� �ƴ��ݾ�.");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� ����� ���� ����� ���� ���� �� ���̳�?");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� ��..�������� �̷��� ���־�ߵ�..? ���̶� ���ٷ�..?");
				System.out.println("===========================");
			}
			Lyn.finish = check==1 || check==2 ||check==3 ?true:false;
		}while(!finish);
		
		
	}
	
	public void showLyn03() {
		do {
			System.out.println("<����>");
			System.out.println("�� �̾� �̷����� �ʶ� ���� �����̾�.");
			System.out.println("1. ��? ���� ���ΰ���?");
			System.out.println("2. ���� ������ �Բ� �;� ����ݾ�.");
			System.out.println("3. ���� ���� �ȵ� ���̶� �Գ�?");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� ����..����..���ΰ��ٰ�..���� �߾�..");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� �׷� �ʶ� �־ �����̴�.");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� ��¥ �־��̴�.");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� �� ������ ���־�! ����� ���� �غ�.");
				System.out.println("===========================");
			}
			Lyn.finish = check==1 || check==2 ||check==3 ?true:false;
		}while(!finish);
		
		
	}

}//class
