package Character;

public class Hero extends Character{
	public float power;
	public float defense;
	public int money = 0;
	public float experience = 0;
	
	public float attack() {
		return power;
	}
	
	public void attacked(float sum) { //������ ���
		if(defense >= sum)
			hp -= 0;
		else
			hp -= (defense - sum);
	}
}
