package game;

import java.util.Scanner;


public class Reiko {
	
	public static boolean finish = false;
	
	public Reiko() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void showReiko() {
		
		do {
			System.out.println("<ù����>");
			System.out.println("�� �ȳ�, �� �� �п��� �л�ȸ�� �����ڶ����. �װ� ���� �� ���л��̶��?");
			System.out.println("1. ��, �ȳ� ������ �ݰ���");
			System.out.println("2. �׷��� ��...�л�ȸ���̶��?");
			System.out.println("3. �ϰ� ���� �Ű沨");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� �׷�, ���� ������ �� ��Ź��");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� �� �¾� �б��� �� �Ұ����ٱ�?");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� ��..���� ������ ���ڱ���?");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� ����.. ���� ���� �Ϸ��°ž�? �ٽ� ���غ���?");
				System.out.println("===========================");
			}
			Reiko.finish = check==1 || check==2 ||check==3 ?true:false;
		}while (!finish);
			
		
	}
	
	public void showReiko02() {
		
		do {
			System.out.println("<����Ʈ>");
			System.out.println("�� ���� �ʹ� �ٺ��� �̾�. �л�ȸ��������..�̷����� ����Ʈ�ϴ°͵� ������ ����?");
			System.out.println("1. �ʶ� �Բ���� ���� ����.");
			System.out.println("2. �� �̷��� �ٻ۰ž�. �������״� ������ ������ ����");
			System.out.println("3. �л�ȸ���̶�� ��¥ �����ϴ�.");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� ���� �ϳ� �������ΰ�~");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� ����ϳ�, �׷� �� ��������?");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� �̾������� ���� �л�ȸ���̶� ���̾�. �̷����� �̾��ϰ� �Ƴ�.");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� �� ���� ���ϰ� �־�?");
				System.out.println("===========================");
			}
			Reiko.finish = check==1 || check==2 ||check==3 ?true:false;
		}while (!finish);
		
	}
	
	public void showReiko03() {
		do {
			System.out.println("<����>");
			System.out.println("�� �������� ����°� ���� �������̳�.");
			System.out.println("1. ���� ���� ���� ��԰� ���ٰ�.");
			System.out.println("2. �׷�? �װ� �л�ȸ ���� ���Ҿ���.");
			System.out.println("3. �� � �ٴ��� �׷���.");
			
			int check = Integer.parseInt(sc.nextLine());
			
			switch (check) {
			case 1:
				System.out.println("�� �ϰ� ������.���� �������� �Ϸ簡 �� �� ����.");
				System.out.println("===========================");
				break;
			case 2:
				System.out.println("�� �Ƹ� �׷��� ������? �׷����� �ʿ� ���ͼ� �⻵.");
				System.out.println("===========================");
				break;
			case 3:
				System.out.println("�� �л�ȸ���� ó���ϴ��� ��¿�� �����°�. �����ε� ��� �׷��� ������.");
				System.out.println("===========================");
				break;
			default :
				System.out.println("�� ������� ���Ƽ� �� �ȵ��. ����� �߾�?");
				System.out.println("===========================");
			}
			Reiko.finish = check==1 || check==2 ||check==3 ?true:false;
		}while (!finish);
		
		
	}
	


}
