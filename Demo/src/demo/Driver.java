package demo;

public class Driver {
	public static void main(String[] args) {
		Father f = new Son();
		Son s=(Son)f;
		f.buildHouse();
		s.buildHouse();
		s.Buycar();
	}
	
}
