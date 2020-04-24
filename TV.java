package week6;

public class TV implements Controllable{
	@Override
	public void turnOn() {
		System.out.println("TV¸¦ ÄÒ´Ù.");
	}
	public void turnOff() {
		System.out.println("TV¸¦ ²ö´Ù.");
	}
}
