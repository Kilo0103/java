package Character;

public class Goblin extends Monster{
	public float attack() { //몬스터의 공격
		System.out.println("데미지는 " + power + "입니다.");
		return power;
	}
	
	public void attacked(float sum) { //데미지 계산
		if(defense >= sum)
			hp-=0;
		else
			hp -= (defense - sum);
	}
}