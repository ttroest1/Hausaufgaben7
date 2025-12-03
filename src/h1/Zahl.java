package h1;

public class Zahl {
	public boolean even = true;
	public boolean small = true;
	public boolean positive = true;
	public int num = 20;
	
	public void setEven() {
		if (Math.abs(num)%2==0) {
			even = true;
		}else {
			even = false;
		}
	}
	public void setSmall() {
			small = (num<100);
	}
	public void setPositive() {
		positive=(num>0);
		}
}
	

