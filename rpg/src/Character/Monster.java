package Character;

public class Monster extends Character{
	public float power;
	public float defense;
	public int money;
	public float experience;
	public float attack() {
		return power;
	}
	
	public void attacked(float sum) {//������ ���
		if(defense >= sum)
			hp -= 0;
		else
			hp -= (defense - sum);
	}
}
