package game;

import game.Start;

public class Game {
	
	public static boolean finish;

	public static void main(String[] args) {
		
		
		
		System.out.println("���αٵα�!! KH �п�!!��");
		
		Start start = new Start();
		
		
		//ĳ���� ��ü ����
		Reiko rei  = new Reiko();
		Haruka haru = new Haruka();
		Lyn lyn = new Lyn();
		
		String startName = start.showName();
		
		do {
		System.out.println("�������! "+ startName +"! �л����� �������ðھ��?");
		System.out.println(" ");

		int startNum = start.showStart();
		
			if (startNum == 1) {
				System.out.println("�����ڸ� �����ϼ̽��ϴ�. ������ ���۵˴ϴ�.");
				System.out.println(" ");
				rei.showReiko();
				rei.showReiko02();
				rei.showReiko03();
				//������ 1�� �����ֱ�
			}else if (startNum == 2) {
				System.out.println("�Ϸ�ī�� �����ϼ̽��ϴ�. ������ ���۵˴ϴ�.");
				System.out.println(" ");
				haru.showHaruka();
				haru.showHaruka02();
				haru.showHaruka03();
				//�Ϸ�ī 1��
			}else if (startNum == 3) {
				System.out.println("���� �����ϼ̽��ϴ�. ������ ���۵˴ϴ�.");
				System.out.println(" ");
				lyn.showLyn();
				lyn.showLyn02();
				lyn.showLyn03();
				//�� 1��
			}else {
				System.out.println("ĳ���� ���� �������� ���ư��ϴ�.");
				//����ڰ� �߸���
			}
			
			start.showEnd();
			
		}while(!finish);
			
			
		
		
			
		
	
		
	}

}//class
