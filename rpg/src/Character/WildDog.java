package Character;

public class WildDog extends Monster{
	public float attack() { //������ ����
		System.out.println("�������� " + power + "�Դϴ�.");
		return power;
	}
	
	public void attacked(float sum) { //������ ���
		if(defense >= sum)
			hp-=0;
		else
			hp -= (defense - sum);
	}
}