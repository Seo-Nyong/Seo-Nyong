package game;

import java.util.Scanner;

import game.Game;


public class Start {
	
	public static boolean finish = false;
	
	Scanner sc  = new Scanner(System.in);
	
	String name;
	
	//����� �̸� Ȯ���ϱ�
	public String showName() {
		System.out.println("������� �̸��� �����Դϱ�?");
		name  = sc.nextLine();
		return name;
	}
	
	//ĳ���� �Ұ��ϱ�
	public int showStart() {
		
			System.out.println("��ĳ���� �Ұ���");
			System.out.println("1. ������ : �б��� �л�ȸ��. ����ϰ�, �ֺ��ε鿡�� ������ ����.");
			System.out.println("2. �Ϸ�ī : ���غ��� ���� �ο�. ��������, �αⰡ ����.");
			System.out.println("3. �� : ����������� �Ҳ�ģ��. ���� �Ⱓ �˾Ұ�, ���ο� ���� ���ص��� ����.");
			
			int start = Integer.parseInt(sc.nextLine());
			
			switch(start) {
			case 1: return 1; //���� �����ߴ� �� showStart�� ���ư�
			case 2: return 2;
			case 3: return 3;
			default : System.out.println("!�����ϴ� �л��� �������ּ���!");
			}return -1;
			
	}
	
	public void showEnd() {
		
			System.out.println("������ �������ϴ�.");
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? (Y/N)");
			String answer = sc.nextLine();
			Game.finish = answer.equals("Y") || answer.equals("y")?false:true;
			
		}

	
		
	
		
		

	

}//class
