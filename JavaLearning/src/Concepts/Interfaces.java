package Concepts;

interface CellPhone {
	
	//* Interfaces are the standards for further concrete classes.
	//* Using Interfaces we can achieve abstraction. */
	
	int price = 1000;
	int battery_mah = 800;
	int ram_mb = 64;
	int rom_mp = 128;

	//* The above four variable are only accesible by the implemented classes */
	//* The variable declared in the interface are 'public static final' by default */

	void call();
	void ring();
	void vibrate();
	void torch();
	void fm();
	void calender();
	void games();
	void music();

	//* The methods declared in the interface are 'public' by default */
}

class SmartPhone implements CellPhone {

	@Override
	public void call() {
		
		System.out.println("Calling...");
	}

	@Override
	public void ring() {

		System.out.println("Ringing...");
	}

	@Override
	public void vibrate() {

		System.out.println("Vibrating...");
	}

	@Override
	public void torch() {

		System.out.println("Torch on...");
	}

	@Override
	public void fm() {

		System.out.println("FM on...");
	}

	@Override
	public void calender() {

		System.out.println("Calender opening...");
	}

	@Override
	public void games() {

		System.out.println("Playing games...");
	}

	@Override
	public void music() {

		System.out.println("Playing music...");
	}
}

public class Interfaces {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		// CellPhone.price = 3000; //* This gives an error as we are trying to change the final variable 
		
		System.out.println(CellPhone.price); //* This can be accessed only if you known the interface name.
		//* Here we achieved abstraction. */
		sp.call();
		sp.ring();
		sp.vibrate();
		sp.torch();
		sp.fm();
		sp.calender();
		sp.games();
		sp.music();
	}
}
