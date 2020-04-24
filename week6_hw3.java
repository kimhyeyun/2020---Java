package week6;
import week6.Computer;
import week6.Controllable;
import week6.TV;

public class week6_hw3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controllable[] controllable = {new TV(),new Computer()};
		
		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
		}
		Controllable.reset();
	}

}
