package game;

import java.util.Scanner;

public class Haruka {
	
	public static boolean finish = false;
	
	public Haruka() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void showHaruka() {
		do {
			System.out.println("<ù����>");
			System.out.println("�� ���, �װ� �� ���л�?? ���� �Ϳ����?");
			System.out.println("1. �ƾ�...���� �ʵ� ����");
			System.out.println("2. �ʴ�...��..��ī?");
			System.out.println("3. ���Ͻô� ���̼���?");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� ���� ���� �ƴϾ����� ���ڴ°�");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� ��� �� ��⸦ ������?");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� ��...���� �𸦼��� �ֱ���?");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� �� ���� ���ϰ� �ִ°ɱ~");
				System.out.println("===========================");
			}
			Haruka.finish = check==1 || check==2 ||check==3 ?true:false;
		}while (!finish);
		
	}
		
	public void showHaruka02() {
		do {
			System.out.println("<����Ʈ>");
			System.out.println("�� ���� �ĸ��� ���� ������ �ʾ�? ��ĵ� �ʹ� �Ϳ���");
			System.out.println("1. ���� ���ִ°͵� �԰� �ʹ� ����.");
			System.out.println("2. �̷��� ���� �ٴϴ°ž�?");
			System.out.println("3. �� �ܰ� ���� �������ϴµ�...");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� �׷��� ���� ���ϱ� �ʹ� ����.");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� ���� �ܰų� �Ϳ���͵� �����ؼ�, ���� ã�ƴٳ�.");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� �̸� ���� �� �������� �����ݴ�.");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� �Դµ� �����ϴ���� ������� �̾�. �ٽ� ������ �� ������?");
				System.out.println("===========================");
			}
			Haruka.finish = check==1 || check==2 ||check==3 ?true:false;
		}while(!finish);
		
	}
		
		public void showHaruka03() {
			do {
				System.out.println("<����>");
				System.out.println("�� �ʹ� ����~! �� �����ϴ� ����̶� ����;��µ�!");
				System.out.println("1. ���� ����. ���� �����ϴ� ����̶� ����;���.");
				System.out.println("2. �װ� ������ �������ž�..?");
				System.out.println("3. �� �׷��� ���� �����Ծ�?");
				
				int check = Integer.parseInt(sc.nextLine());
				
				switch (check) {
				case 1:
					System.out.println("�� ���� �ҿ� �����ϴ� ���ΰ� ����.");
					System.out.println("===========================");
					break;
				case 2:
					System.out.println("�� �׷�~���� ������ �� �ƴѰɱ�?");
					System.out.println("===========================");
					break;
				case 3:
					System.out.println("�� �ƴ� �����ų� �緯 �����ڱ�");
					System.out.println("===========================");
					break;
				default :
					System.out.println("�� ����� ���Ƽ� ������µ� ����� �߾�?");
					System.out.println(" ");
				}
				Haruka.finish = check==1 || check==2 ||check==3 ?true:false;
			}while(!finish);
			
		}
	
}//class

