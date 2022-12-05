package pro;

import java.util.InputMismatchException;
import java.util.Scanner;

interface Payment {
	public void getDetails();
}

class Vehicle implements Payment {
	String Veh_Brand;
	String Veh_Name;
	String Veh_Colour;
	double Veh_Price;
	private String Veh_Owner_Name;
	private long Owner_Mobile_Number;
	private String Owner_EmailAdd;
	private String Owner_AadharNo;
	private String Owner_PanNo;

	public void setVeh_Owner_Name(String Veh_Owner_Name) {
		this.Veh_Owner_Name = Veh_Owner_Name;
	}

	public String getVeh_Owner_Name() {
		return Veh_Owner_Name;
	}

	public void setOwner_Mobile_Number(long Owner_Mobile_Number) {
		this.Owner_Mobile_Number = Owner_Mobile_Number;
	}

	public long getOwner_Mobile_Number() {
		return Owner_Mobile_Number;
	}

	public void setOwner_EmailAdd(String Owner_EmailAdd) {
		this.Owner_EmailAdd = Owner_EmailAdd;
	}

	public String getOwner_EmailAdd() {
		return Owner_EmailAdd;
	}

	public void setOwner_AadharNo(String Owner_AadharNo) {
		this.Owner_AadharNo = Owner_AadharNo;
	}

	public String getOwner_AadharNo() {
		return Owner_AadharNo;
	}

	public void setOwner_PanNo(String Owner_PanNo) {
		this.Owner_PanNo = Owner_PanNo;
	}

	public String getOwner_PanNo() {
		return Owner_PanNo;
	}

	public void Pass(String Veh_Brand, String Veh_Name, String Veh_Colour, double Veh_Price) {
		this.Veh_Brand = Veh_Brand;
		this.Veh_Name = Veh_Name;
		this.Veh_Colour = Veh_Colour;
		this.Veh_Price = Veh_Price;
	}

	@Override
	public void getDetails() {
		System.out.println("Vehicle Brand          :" + Veh_Brand);
		System.out.println("Vehicle Name           :" + Veh_Name);
		System.out.println("Vehicle Colour         :" + Veh_Colour);
		System.out.println("Vehicle Price          :" + Veh_Price);
		System.out.println("Vehicle Owner Name     :" + Veh_Owner_Name);
		System.out.println("Owner Mobile Number    :" + Owner_Mobile_Number);
		System.out.println("Owner Email Address    :" + Owner_EmailAdd);
		System.out.println("Owner Aadhar Number    :" + Owner_AadharNo);
		System.out.println("Owner Pan Number       :" + Owner_PanNo);
	}

	public void Start() {
		System.out.println("Start The Vehicle");
	}

	public void Stop() {
		System.out.println("Stop! The Vehicle");
	}

	public void Drive() {
		System.out.println("Drive<3 The Vehicle");
	}

}

class Two_Wheeler extends Vehicle {
	public void TW() {
// Upcasting-Downcasting for Bike
		Vehicle veh1 = new Bike();
		Bike Bi = (Bike) veh1;

// Upcasting-Downcasting for Cycle
		Vehicle veh2 = new Cycle();
		Cycle Cyc = (Cycle) veh2;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Bike");
		System.out.println("Enter 2 for Cycle");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Bike");
			Bi.TWBikes();
			break;
		case 2:
			System.out.println("You Have Choosen Cycle");
			Cyc.Cycle_Tw();
			break;
		default:
			System.out.println("Invaild Input ");
			this.TW();
		}
	}
}

class Bike extends Two_Wheeler {
	public void TWBikes() {
// Upcasting-Downcasting for Bajaj Bikes
		Vehicle Veh3 = new Bajaj();
		Bajaj Bj = (Bajaj) Veh3;

// Upcasting-Downcasting for Honda Bikes
		Vehicle Veh4 = new Honda();
		Honda Hn = (Honda) Veh4;

// Upcasting-Downcasting for Royal Enfield Bikes
		Vehicle Veh5 = new Royal_Enfield();
		Royal_Enfield Re = (Royal_Enfield) Veh5;

// Upcasting-Downcasting for Electrical Bikes
		Vehicle Veh6 = new Electrical_Bikes();
		Electrical_Bikes Ev = (Electrical_Bikes) Veh6;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Bajaj Bikes");
		System.out.println("Enter 2 for Honda Bikes");
		System.out.println("Enter 3 for Royal Enfield Bikes");
		System.out.println("Enter 4 for Electrical Bikes");

		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Bajaj Bikes");
			Bj.Bajaj_bike();
			break;
		case 2:
			System.out.println("You Have Choosen Honda Bikes");
			Hn.Honda_bike();
			break;
		case 3:
			System.out.println("You Have Choosen Royal Enfield Bikes");
			Re.Royal_Enfield_Bike();
			break;
		case 4:
			System.out.println("You Have Choosen Electrical Bikes");
			Ev.Electrical();
			break;
		default:
			System.out.println("Invaild Input ");
			this.TWBikes();
		}
	}
}

class Bajaj extends Bike {
	public void Bajaj_bike() {
// Upcasting-Downcasting for Pulsar Bike
		Vehicle Veh1 = new Pulsar();
		Pulsar Pl = (Pulsar) Veh1;

// Upcasting-Downcasting for Avenger Bike
		Vehicle Veh2 = new Avenger();
		Avenger Av = (Avenger) Veh2;

// Upcasting-Downcasting for Platina Bike
		Vehicle Veh3 = new Platina();
		Platina Pa = (Platina) Veh3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Pulsar");
		System.out.println("Enter 2 for Avenger");
		System.out.println("Enter 3 for Platina");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Pular Bike");
			Pl.Pulsar_Bike();
			break;
		case 2:
			System.out.println("You Have Choosen Avanger Bike");
			Av.Avenger_Bike();
			break;
		case 3:
			System.out.println("You Have Choosen Platina Bike");
			Pa.Platina_Bike();
			break;
		default:
			System.out.println("Invaild Input ");
			Bajaj_bike();
		}

	}
}

class Pulsar extends Bajaj {
	public void Pulsar_Bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Pulsar 180 Bike");
		System.out.println("Enter 2 for Pulsar 200 Bike");
		System.out.println("Enter 3 for Pulsar 220 Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Pulsar 180 Bike");
			System.out.println("Pulsar 180 Info");
			System.out.println("Fuel economy: 45 km/l");
			System.out.println("Fuel tank capacity: 15 L");
			System.out.println("Engine Power: 180 cc");
			System.out.println("Battery: 12 V 8 Ah");
			System.out.println("Max speed: 112 km/h");
			System.out.println("On Road Price: ₹96,539 - ₹1,44,638 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Pulsar 180", 144638);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Pulsar 200 Bike");
			System.out.println("Pulsar 200 Info");
			System.out.println("Fuel economy: 35 km/l");
			System.out.println("Fuel tank capacity: 12 L");
			System.out.println("Engine Power: 200 cc");
			System.out.println("Battery: 15 V 8 Ah");
			System.out.println("Max speed: 125 to 136 km/h");
			System.out.println("On Road Price: ₹1,11,890 - ₹1,75,500 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Pulsar 200", 175500);
			break;
		case 3:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Pulsar 220 Bike");
			System.out.println("Pulsar 220 Info");
			System.out.println("Fuel economy: 40 km/l");
			System.out.println("Fuel tank capacity: 14 L");
			System.out.println("Engine Power: 220 cc");
			System.out.println("Max speed: 134 km/h");
			System.out.println("On Road Price: ₹1,31,841 - ₹1,71,912 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Pulsar 220", 171912);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Avenger extends Bajaj {
	public void Avenger_Bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Bajaj Avenger 160 Bike");
		System.out.println("Enter 2 for Bajaj Avenger 220 Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Avenger 160 Bike");
			System.out.println("Bajaj Avenger 160 Info");
			System.out.println("Fuel economy: 45 km/l");
			System.out.println("Fuel tank capacity: 13 L");
			System.out.println("Engine Power: 160 cc");
			System.out.println("Max speed: 105 km/h");
			System.out.println("On Road Price: ₹1,06,690 - ₹1,41,401 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Avenger 160", 141401);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Avenger 220 Bike");
			System.out.println("Bajaj Avenger 220 Info");
			System.out.println("Fuel economy: 40 km/l");
			System.out.println("Fuel tank capacity: 13 L");
			System.out.println("Engine Power: 220 cc");
			System.out.println("Max speed: 120 km/h");
			System.out.println("On Road Price: ₹1,15,850 - ₹1,34,191 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Avenger 220", 134191);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Platina extends Bajaj {
	public void Platina_Bike() {
		Details d = new Details();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Bajaj Platina 100 Bike");
		System.out.println("Enter 2 for Bajaj Platina 110 Bike");
		System.out.println("Enter 3 for Bajaj Platina 125 Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Platina 100 Bike");
			System.out.println("Bajaj Platina 100 Info");
			System.out.println("Fuel economy: 45 km/l");
			System.out.println("Fuel tank capacity: 11 L");
			System.out.println("Engine Power: 102 cc");
			System.out.println("Max speed: 110 km/h");
			System.out.println("On Road Price: ₹52,912 - ₹58,435 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Platina 100", 58435);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Platina 110 Bike");
			System.out.println("Bajaj Platina 110 Info");
			System.out.println("Fuel economy: 40 km/l");
			System.out.println("Fuel tank capacity: 11 L");
			System.out.println("Engine Power: 115.45 cc");
			System.out.println("Max speed: 120 km/h");
			System.out.println("On Road Price: ₹64,678 - ₹71,653 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Platina 110", 71653);
			break;
		case 3:
			System.out.println();
			System.out.println("Thank You For Choosing Bajaj Platina 125 Bike");
			System.out.println("Bajaj Platina 125 Info");
			System.out.println("Fuel economy: 40 km/l");
			System.out.println("Fuel tank capacity: 12 L");
			System.out.println("Engine Power: 124.6 cc");
			System.out.println("Max speed: 120 km/h");
			System.out.println("On Road Price: ₹63,541 - ₹70,650 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Platina 125", 70650);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Honda extends Bike {
	public void Honda_bike() {
// Upcasting-Downcasting for Pulsar Bike
		Vehicle Veh1 = new Shine();
		Shine Sh = (Shine) Veh1;

// Upcasting-Downcasting for Unicorn Bike
		Vehicle Veh2 = new Unicorn();
		Unicorn Un = (Unicorn) Veh2;

// Upcasting-Downcasting for Hornet 2.0 Bike
		Vehicle Veh3 = new Hornet();
		Hornet Hr = (Hornet) Veh3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Shine");
		System.out.println("Enter 2 for Unicorn");
		System.out.println("Enter 3 for Hornet 2.0");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Shine Bike");
			Sh.Shine_Bike();
			break;
		case 2:
			System.out.println("You Have Choosen Unicorn Bike");
			Un.Unicorn_Bike();
			break;
		case 3:
			System.out.println("You Have Choosen Hornet 2.0 Bike");
			Hr.Hornet_Bike();
			break;
		default:
			System.out.println("Invaild Input ");
			TWBikes();
		}
	}
}

class Shine extends Honda {
	public void Shine_Bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Honda Shine Bike");
		System.out.println("Enter 2 for Honda Shine BS6 Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Honda Shine Bike");
			System.out.println("Honda Shine Info");
			System.out.println("Fuel economy: 55 km/l");
			System.out.println("Fuel tank capacity: 11 L");
			System.out.println("Engine Power: 124 cc");
			System.out.println("Max speed: 102 km/h");
			System.out.println("On Road Price: ₹75,186 - ₹79,613 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Honda", "Shine", 75000);

			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Honda Shine BS6 Bike");
			System.out.println("Honda Shine BS6 Info");
			System.out.println("Fuel economy: 55 km/l");
			System.out.println("Fuel tank capacity: 11 L");
			System.out.println("Engine Power: 132.24 cc");
			System.out.println("Max speed: 110 km/h");
			System.out.println("On Road Price: ₹80,186 - ₹83,376 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Honda Shine", "BS6", 80000);

			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Unicorn extends Honda {
	public void Unicorn_Bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for CB Unicorn 150 Bike");
		System.out.println("Enter 2 for CB Unicorn 160 Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing CB Unicorn 150 Bike");
			System.out.println("CB Unicorn 150 Info");
			System.out.println("Fuel economy: 43 km/l");
			System.out.println("Fuel tank capacity: 13 L");
			System.out.println("Engine Power: 149.2 cc");
			System.out.println("Max speed: 102 km/h");
			System.out.println("On Road Price: ₹72,186 - ₹79,613 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Honda", "CB Unicorn 150", 79613);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing CB Unicorn 160 Bike");
			System.out.println("CB Unicorn 160 Info");
			System.out.println("Fuel economy: 50 km/l");
			System.out.println("Fuel tank capacity: 12 L");
			System.out.println("Engine Power: 162.7 cc");
			System.out.println("Max speed: 106 km/h");
			System.out.println("On Road Price: ₹98,936 - ₹1,08,376 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Honda", "CB Unicorn 160", 108376);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Hornet extends Honda {
	public void Hornet_Bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for CB Hornet 160R CBS Bike");
		System.out.println("Enter 2 for CB Hornet 2.0 Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing CB Hornet 160R CBS Bike");
			System.out.println("CB Hornet 160R CBS Info");
			System.out.println("Fuel economy: 52 km/l");
			System.out.println("Fuel tank capacity: 12 L");
			System.out.println("Engine Power: 162.71 cc");
			System.out.println("Max speed: 110 km/h");
			System.out.println("On Road Price: ₹82,537 - ₹90,452 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Hornet", "CB Hornet 160R CBS", 90452);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing CB Hornet 2.0 Bike");
			System.out.println("CB Hornet 2.0 Info");
			System.out.println("Fuel economy: 53.35 km/l");
			System.out.println("Fuel tank capacity: 12 L");
			System.out.println("Engine Power: 184.4 cc");
			System.out.println("Max speed: 130 km/h");
			System.out.println("On Road Price: ₹1.34L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Hornet", "CB Hornet 2.0", 134000);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Royal_Enfield extends Bike {
	public void Royal_Enfield_Bike() {
// Upcasting-Downcasting for Thunderbird Bike
		Vehicle Veh1 = new Thunderbird();
		Thunderbird Th = (Thunderbird) Veh1;

// Upcasting-Downcasting for Himalayan Bike
		Vehicle Veh2 = new Himalayan();
		Himalayan Hi = (Himalayan) Veh2;

// Upcasting-Downcasting for Classic 350 Bike
		Vehicle Veh3 = new Classic();
		Classic Cs = (Classic) Veh3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Thunderbird");
		System.out.println("Enter 2 for Himalayan");
		System.out.println("Enter 3 for Classic 350");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Thunderbird Bike");
			Th.Thunderbird_bike();
			break;
		case 2:
			System.out.println("You Have Choosen Himalayan Bike");
			Hi.Himalayan_Bike();
			break;
		case 3:
			System.out.println("You Have Choosen Classic 350 Bike");
			Cs.Classic_350_Bike();
			break;
		default:
			System.out.println("Invaild Input ");
			TWBikes();
		}
	}
}

class Thunderbird extends Royal_Enfield {
	public void Thunderbird_bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Thunderbird 350 Bike");
		System.out.println("Enter 2 for Thunderbird 350X Bike");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Thunderbird 350 Bike");
			System.out.println("Thunderbird Info");
			System.out.println("Fuel economy: 35 km/l");
			System.out.println("Fuel tank capacity: 20 L");
			System.out.println("Battery: 12 V 8 Ah");
			System.out.println("Max speed: 107 km/h");
			System.out.println("On Road Price: ₹1,67,530 - ₹1,96,706 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Royal Enfield", "Thunderbird 350", 196706);

			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Thunderbird 350X Bike");
			System.out.println("Thunderbird 350X Info");
			System.out.println("Fuel economy: 35 km/l");
			System.out.println("Fuel tank capacity: 20 L");
			System.out.println("Battery: 15 V 8 Ah");
			System.out.println("Max speed: 110 km/h");
			System.out.println("On Road Price: ₹1,75,000 - ₹2,05,573 (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Royal Enfield", "Thunderbird 350X", 205573);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Himalayan extends Royal_Enfield {
	public void Himalayan_Bike() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Himalayan Standard - BS VI Bike");
		System.out.println("Enter 2 for Himalayan Dual Tone - BS VI Bike");

		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For Choosing Himalayan Standard - BS VI Bike");
			System.out.println("Himalayan Standard - BS VI Info");
			System.out.println("Fuel economy: 45 km/l");
			System.out.println("Fuel tank capacity: 15 L");
			System.out.println("Engine Capacity: 404.0 cc");
			System.out.println("Max speed: 135 km/h");
			System.out.println("On Road Price: From ₹ 2.11 Lakh Onward (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Royal Enfield", "Himalayan Standard - BS VI", 211000);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For Choosing Himalayan Dual Tone - BS VI Bike");
			System.out.println("Himalayan Dual Tone - BS VI Info");
			System.out.println("Fuel economy: 45 km/l");
			System.out.println("Fuel tank capacity: 15 L");
			System.out.println("Engine Capacity: 411.0 cc");
			System.out.println("Max speed: 145 km/h");
			System.out.println("On Road Price: From ₹ 2.20 Lakh Onward (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Royal Enfield", "Himalayan Dual Tone - BS VI", 220000);
			break;
		default:
			System.out.println("Invalid Input :)");
		}
	}
}

class Classic extends Royal_Enfield {
	public void Classic_350_Bike() {
		System.out.println("Classic 350 Info");
		System.out.println("Fuel economy: 37 km/l");
		System.out.println("Fuel tank capacity: 13.5 L");
		System.out.println("Engine Power: 349 cc");
		System.out.println("Max speed: 131 km/h");
		System.out.println("On Road Price: ₹1,64,729- ₹2,77,066 (includes RTO & insurance costs)");
		System.out.println();

	}
}

class Electrical_Bikes extends Bike {
	public void Electrical() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Ola Bike");
		System.out.println("Enter 2 for Ather");
		System.out.println("Enter 3 for Bajaj Chetak");
		int opt = sc.nextInt();

// For Ola EV
		switch (opt) {
		case 1:
			System.out.println("Enter 1 for Ola S1 EV");
			System.out.println("Enter 2 for Ola S1 Pro EV");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println();

				System.out.println("Ola S1 EV Info");
				System.out.println("Thank You For Choosing Ola S1 EV");
				System.out.println("Riding Range: 121 km");
				System.out.println("Battery Charging Time: 5 Hrs");
				System.out.println("Max speed: 90 km/h");
				System.out.println("On Road Price: ₹97,706- ₹1,04,530 (includes RTO & insurance costs)");
				System.out.println();
				d.Final_Details("Ola", "Ola S1 EV", 104530);
				break;
			case 2:
				System.out.println();
				System.out.println("Thank You For Choosing Ola S1 PRO EV");
				System.out.println("Ola S1 PRO EV Info");
				System.out.println("Riding Range: 135 km");
				System.out.println("Battery Charging Time: 6:30 Hrs");
				System.out.println("Max speed: 115 km/h");
				System.out.println("On Road Price: ₹1,37,163- ₹1,40,346 (includes RTO & insurance costs)");
				System.out.println();
				d.Final_Details("Ola", "Ola S1 PRO EV", 140346);
				break;
			default:
				System.out.println("Invaild Input ");
				this.Electrical();
			}
			break;

// For Ather EV
		case 2:
			System.out.println("Enter 1 for Ather 450X Plus EV");
			System.out.println("Enter 2 for Ather 450X Standard EV");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println();
				System.out.println("Thank You For Choosing Ather 450X Plus EV");
				System.out.println("Ather 450X Plus EV Info");
				System.out.println("Riding Range: 85 km/Charge");
				System.out.println("Battery Charging Time: 5 Hrs");
				System.out.println("Max speed: 80 km/h");
				System.out.println("On Road Price: ₹1,19L Onwards (includes RTO & insurance costs)");
				System.out.println();
				d.Final_Details("Ather", "450X Plus", 119000);
				break;
			case 2:
				System.out.println();
				System.out.println("Thank You For Choosing Ather 450X Standard EV");
				System.out.println("Ather 450X Standard EV Info");
				System.out.println("Riding Range: 100 km/Charge");
				System.out.println("Battery Charging Time: 3 Hrs 35 Min");
				System.out.println("Max speed: 80 km/h");
				System.out.println("On Road Price: ₹1,59L Onwards (includes RTO & insurance costs)");
				System.out.println();
				d.Final_Details("Ather", "450X Standard", 159000);
				break;
			default:
				System.out.println("Invaild Input ");
				this.Electrical();
			}
			break;

// Bajaj Chetak
		case 3:
			System.out.println("Enter 1 for Bajaj Chetak Urbane EV");
			System.out.println("Enter 2 for Bajaj Chetak Premium EV");
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println();
				System.out.println("Thank You For Choosing Bajaj Chetak Urbane EV");
				System.out.println("Bajaj Chetak Urbane EV Info");
				System.out.println("Riding Range: 85-95 km/Charge");
				System.out.println("Battery Charging Time: 5 Hrs");
				System.out.println("Max speed: 70 km/h");
				System.out.println("On Road Price: ₹1,42,297L Onwards (includes RTO & insurance costs)");
				System.out.println();
				d.Final_Details("Bajaj", "Chetak Urbane", 142297);
				break;
			case 2:
				System.out.println();
				System.out.println();
				System.out.println("Thank You For Choosing Bajaj Chetak Urbane EV");
				System.out.println("Bajaj Chetak Premium Info");
				System.out.println("Riding Range: 85-95 km/Charge");
				System.out.println("Battery Charging Time: 5 Min");
				System.out.println("Max speed: 70 km/h");
				System.out.println("On Road Price: ₹1,43,708L Onwards (includes RTO & insurance costs)");
				System.out.println();
				d.Final_Details("Bajaj", "Chetak Premium EV", 143708);
				break;
			default:
				System.out.println("Invaild Input ");
				this.Electrical();
			}
			break;
		default:
			System.out.println("Invaild Input ");
			this.Electrical();
			break;
		}
	}
}

class Cycle extends Two_Wheeler {
	public void Cycle_Tw() {
// Upcasting-Downcasting for Honda Urban 25T
		Vehicle Veh1 = new Honda_Urban();
		Honda_Urban Hu = (Honda_Urban) Veh1;

// Upcasting-Downcasting for Btwin MyBike
		Vehicle Veh2 = new Btwin_MyBike();
		Btwin_MyBike Bm = (Btwin_MyBike) Veh2;

// Upcasting-Downcasting for Hero Octane Parkour 26T
		Vehicle Veh3 = new Hero_Octane();
		Hero_Octane Ho = (Hero_Octane) Veh3;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Honda Urban 25T Cycle");
		System.out.println("Enter 2 for Btwin MyBike Cycle");
		System.out.println("Enter 3 for Octane Parkour 26T Cycle");

		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Honda Urban 25T Cycle");
			Hu.Honda_Urban_Cyc();
			break;
		case 2:
			System.out.println("You Have Choosen Btwin MyBike Cycle");
			Bm.Btwin_MyBike_Cyc();
			break;
		case 3:
			System.out.println("You Have Choosen Octane Parkour 26T Cycle");
			Ho.Hero_Octane_Cyc();
			break;
		default:
			System.out.println("Invaild Input ");
			Cycle_Tw();
			break;
		}
	}
}

class Honda_Urban extends Cycle {
	public void Honda_Urban_Cyc() {
		Details d = new Details();
		System.out.println();
		System.out.println("Thank You For  Choosing Honda Urban 25T Cycle");
		System.out.println("Name  : Honda");
		System.out.println("Brand : Honda Urban 25T");
		System.out.println("Color : Black");
		System.out.println("Weight : 7 kg");
		System.out.println("Frame Size : 22.5 inch");
		System.out.println("Frame Material :Polychrome Steel");
		System.out.println("Tyre Size : 26 inch");
		System.out.println("On Road Price : ₹4530");
		System.out.println();
		d.Final_Details("Honda", "Urban", 4530);
	}
}

class Btwin_MyBike extends Cycle {
	public void Btwin_MyBike_Cyc() {
		Details d = new Details();
		System.out.println();
		System.out.println("Thank You For  Choosing Btwin Mybike Cycle");
		System.out.println("Name  : Btwin");
		System.out.println("Brand : Btwin Mybike");
		System.out.println("Color : Black");
		System.out.println("Weight : 6.68 kg");
		System.out.println("Frame Size : 22.5 inch");
		System.out.println("Frame Material :Polychrome Steel");
		System.out.println("Tyre Size : 24 inch");
		System.out.println("On Road Price : ₹5410");
		System.out.println();
		d.Final_Details("Btwin", "Btwin Mybike", 4510);
	}
}

class Hero_Octane extends Cycle {
	public void Hero_Octane_Cyc() {
		Details d = new Details();
		System.out.println();
		System.out.println("Thank You For  Choosing Hero Octane Parkour 26T Cycle");
		System.out.println("Name  : Hero");
		System.out.println("Brand : Octane Parkour 26T1" + "2");
		System.out.println("Color : Black");
		System.out.println("Weight : 7.20 kg");
		System.out.println("Frame Size : 22.5 inch");
		System.out.println("Frame Material :Polychrome Alloy");
		System.out.println("Tyre Size : 24 inch");
		System.out.println("On Road Price : ₹6300");
		System.out.println();
		d.Final_Details("Hero", "Hero Octane", 6300);
	}
}

class Three_Wheeler extends Vehicle {
	public void ThW() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Maxima");
		System.out.println("Enter 2 for Bajaj Auto");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Maxima 3 Wheeler");
			System.out.println("Details of Bajaj Maxima Auto");
			System.out.println("Max Power : 9 hp");
			System.out.println("Displacement  : 236.2 cc");
			System.out.println("Fuel Tank : 40 (5.6kg) Ltr");
			System.out.println("Engine : 4 Stroke oil cooled");
			System.out.println("Fuel Type : CNG");
			System.out.println("Max Torque : 16.2 Nm");
			System.out.println("On Road Price: ₹2.84L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Maxima 3", 284000);
			break;
		case 2:
			System.out.println("You Have Choosen Bajaj Auto 3 Wheeler");
			System.out.println("Details of Bajaj Maxima Auto");
			System.out.println("Max Power : 10 hp");
			System.out.println("Displacement  : 246.2 cc");
			System.out.println("Fuel Tank : 40 (5.6kg) Ltr");
			System.out.println("Engine : 4 Stroke oil cooled");
			System.out.println("Fuel Type : CNG");
			System.out.println("Max Torque : 17.5 Nm");
			System.out.println("On Road Price: ₹2.95L (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Bajaj", "Auto", 295000);
			break;
		default:
			System.out.println("Invaild Input ");
			System.out.println();
			this.ThW();
			break;

		}
	}
}

class Four_Wheeler extends Vehicle {
	public void FW() {
// Upcasting-Downcasting for Pertol
		Vehicle Veh1 = new Petrol();
		Petrol Pt = (Petrol) Veh1;

// Upcasting-Downcasting for Diesel
		Vehicle Veh2 = new Diesel();
		Diesel Dl = (Diesel) Veh2;

// Upcasting-Downcasting for Electrical
		Vehicle Veh3 = new Electric();
		Electric Ev = (Electric) Veh3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Petrol Car");
		System.out.println("Enter 2 for Diesel Car");
		System.out.println("Enter 3 for Electrical Car");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Petrol Car");
			Pt.Petrol_Car();
			break;
		case 2:
			System.out.println("You Have Choosen Diesel Car");
			Dl.Diesel_Car();
			break;
		case 3:
			System.out.println("You Have Choosen Electric Car");
			Ev.Electric_Car();
			break;
		default:
			System.out.println("Invaild Input ");
			this.FW();
		}
	}
}

class Petrol extends Four_Wheeler {
	public void Petrol_Car() {
// Upcasting-Downcasting for Swift
		Vehicle Veh1 = new Swift();
		Swift St = (Swift) Veh1;

// Upcasting-Downcasting for Ertiga
		Vehicle Veh2 = new Ertiga();
		Ertiga Er = (Ertiga) Veh2;

// Upcasting-Downcasting for Kia Seltos
		Vehicle Veh3 = new Kia();
		Kia Ki = (Kia) Veh3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Swift Dzire");
		System.out.println("Enter 2 for Ertiga");
		System.out.println("Enter 3 for Kia Seltos");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Swift Dzire Car");
			St.Swift_Dzire();
			break;
		case 2:
			System.out.println("You Have Choosen Ertiga Car");
			Er.Ertiga_Ssv();
			break;
		case 3:
			System.out.println("You Have Choosen Kia Seltos Car");
			Ki.Kia_Seltos();
			break;
		default:
			System.out.println("Invaild Input ");
			FW();
		}
	}
}

class Swift extends Petrol {
	public void Swift_Dzire() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Swift Dzire VXI ");
		System.out.println("Enter 2 for Swift Dzire ZXI ");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("Swift Dzire VXI Info");
			System.out.println("Fuel economy: 24.12 km/l");
			System.out.println("Fuel tank capacity: 37 L");
			System.out.println("Engine Power: 1197 cc");
			System.out.println("Max speed: 145 km/h");
			System.out.println("On Road Price: ₹7.28L - ₹9.28L (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Maruki Suzuki", "Swift Dzire VXI", 9280000);
			break;
		case 2:
			System.out.println("Swift Dzire ZXI Info");
			System.out.println("Fuel economy: 23.26 km/l");
			System.out.println("Fuel tank capacity: 12 L");
			System.out.println("Engine Power: 1197 cc");
			System.out.println("Max speed: 140 km/h");
			System.out.println("On Road Price: ₹7.96L - ₹9.70L (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Maruti Suzuki", "Swift Dzire ZXI", 970000);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Ertiga extends Petrol {
	public void Ertiga_Ssv() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Ertiga LXI ");
		System.out.println("Enter 2 for Ertiga ZXI Plus ");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("Ertiga LXI Info");
			System.out.println("Fuel economy: 20.51 km/l");
			System.out.println("Fuel tank capacity: 45 L");
			System.out.println("Engine Power: 1462 cc");
			System.out.println("Max speed: 164 km/h");
			System.out.println("On Road Price: ₹8.35L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Maruti Suzuki", "Ertiga LXI", 835000);
			break;
		case 2:
			System.out.println("Ertiga ZXI Plus Info");
			System.out.println("Fuel economy: 21.16 km/l");
			System.out.println("Fuel tank capacity: 45 L");
			System.out.println("Engine Power: 1473 cc");
			System.out.println("Max speed: 164 km/h");
			System.out.println("On Road Price: ₹11.29L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Maruti Suzuki", "Ertiga ZXI Plus", 1129000);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Kia extends Petrol {
	public void Kia_Seltos() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Kia Seltos HTE  ");
		System.out.println("Enter 2 for Kia Seltos GTX Plus");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("Kia Seltos HTE Info");
			System.out.println("Fuel economy: 16.80 km/l");
			System.out.println("Fuel tank capacity: 50 L");
			System.out.println("Engine Power: 1497 cc");
			System.out.println("Max speed: 164 km/h");
			System.out.println("On Road Price: ₹10.19L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Kia Motors", "Seltos HTE", 10190000);
			break;
		case 2:
			System.out.println("Kia Seltos GTX Plus Info");
			System.out.println("Fuel economy: 16.53 km/l");
			System.out.println("Fuel tank capacity: 50 L");
			System.out.println("Engine Power: 1353 cc");
			System.out.println("Max speed: 170 km/h");
			System.out.println("On Road Price: ₹16.95L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Kia Motors", "Seltos GTX Plus", 16950000);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Diesel extends Four_Wheeler {
	public void Diesel_Car() {
// Upcasting-Downcasting for Creta
		Vehicle Veh1 = new Creta();
		Creta Cr = (Creta) Veh1;

// Upcasting-Downcasting for Fortuner
		Vehicle Veh2 = new Fortuner();
		Fortuner Fr = (Fortuner) Veh2;

// Upcasting-Downcasting for Range Rover
		Vehicle Veh3 = new Range_Rover();
		Range_Rover Rr = (Range_Rover) Veh3;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Creta");
		System.out.println("Enter 2 for Fortuner");
		System.out.println("Enter 3 for Range Rover");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Creta Car");
			Cr.Creta_Car();
			break;
		case 2:
			System.out.println("You Have Choosen Fortuner Car");
			Fr.Fortuner_Car();
			break;
		case 3:
			System.out.println("You Have Choosen Range Rover Car");
			Rr.Range_Rover_Car();
			break;
		default:
			System.out.println("Invaild Input ");
			Diesel_Car();
		}
	}
}

class Creta extends Diesel {
	public void Creta_Car() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Hyundai Creta EX ");
		System.out.println("Enter 2 for Hyundai Creta SX Knight DT");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("Hyundai Creta EX Info");
			System.out.println("Fuel economy: 21.40 km/l");
			System.out.println("Fuel tank capacity: 50 L");
			System.out.println("Engine Power: 1493 cc");
			System.out.println("Max speed: 180 km/h");
			System.out.println("On Road Price: ₹12.29L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Hyundai", "Creta EX", 1229000);
			break;
		case 2:
			System.out.println("Hyundai Creta SX Knight DT Info");
			System.out.println("Fuel economy: 18.50 km/l");
			System.out.println("Fuel tank capacity: 50 L");
			System.out.println("Engine Power: 1498 cc");
			System.out.println("Max speed: 181 km/h");
			System.out.println("On Road Price: ₹18.18L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Hyumdai", "Creta SX Knight DT", 18180000);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Fortuner extends Diesel {
	public void Fortuner_Car() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Fortuner Legender ");
		System.out.println("Enter 2 for Fortuner GR S 4X4 AT");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("Fortuner Legender Info");
			System.out.println("Fuel economy: 10.52 km/l");
			System.out.println("Fuel tank capacity: 80 L");
			System.out.println("Engine Power: 2755 cc");
			System.out.println("Max speed: 176 km/h");
			System.out.println("On Road Price: ₹40.91L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Fortuner", "Legender", 4091000);
			break;
		case 2:
			System.out.println("Fortuner GR S 4X4 Info");
			System.out.println("Fuel economy: 18.50 km/l");
			System.out.println("Fuel tank capacity: 80 L");
			System.out.println("Engine Power: 2780 cc");
			System.out.println("Max speed: 181 km/h");
			System.out.println("On Road Price: ₹48.43L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Fortuner", "GR S 4X4", 4843000);
			break;
		default:
			System.out.println("Invalid Input :");
		}
	}
}

class Range_Rover extends Diesel {
	public void Range_Rover_Car() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Range Rover 3.0 ");
		System.out.println("Enter 2 for Range Rover LWB");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("Range Rover 3.0 Info");
			System.out.println("Fuel economy: 14.01 km/l");
			System.out.println("Fuel tank capacity: 90 L");
			System.out.println("Engine Power: 2997 cc");
			System.out.println("Max speed: 263 km/h");
			System.out.println("On Road Price: ₹3.23 Cr Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Range Rover", "Range Rover 3.0", 32300000);
			break;
		case 2:
			System.out.println("Range Rover LWB Info");
			System.out.println("Fuel economy: 14.01 km/l");
			System.out.println("Fuel tank capacity: 9S0 L");
			System.out.println("Engine Power: 2998 cc");
			System.out.println("Max speed: 265 km/h");
			System.out.println("On Road Price: ₹3.29 Cr Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Range Rover", "Range Rover LBW", 32900000);
			break;
		default:
			System.out.println("Invalid Input :");
		}

	}
}

class Electric extends Four_Wheeler {
	public void Electric_Car() {
// Upcasting-Downcasting for Tata Nexon
		Vehicle Veh1 = new Tata_Nexon();
		Tata_Nexon Tx = (Tata_Nexon) Veh1;

// Upcasting-Downcasting for Porsche Taycan
		Vehicle Veh2 = new Porsche_Taycan();
		Porsche_Taycan Pr = (Porsche_Taycan) Veh2;

// Upcasting-Downcasting for BMW
		Vehicle Veh3 = new BMW();
		BMW Bw = (BMW) Veh3;

// Upcasting-Downcasting for Tesla
		Vehicle Veh4 = new Tesla();
		Tesla Tl = (Tesla) Veh4;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Tata Nexon");
		System.out.println("Enter 2 for Porsche Taycan");
		System.out.println("Enter 3 for BMW iX");
		System.out.println("Enter 4 for Tesla Car");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Tata Nexon Car");
			Tx.Tata_Nexon_Ev();
			break;
		case 2:
			System.out.println("You Have Choosen Porsche Taycan Car");
			Pr.Porsche_Taycan_Ev();
			break;
		case 3:
			System.out.println("You Have Choosen BMW Car");
			Bw.BMW_Ev();
			break;
		case 4:
			System.out.println("You Have Choosen Tesla Car");
			Tl.Tesla_Ev();
			break;
		default:
			System.out.println("Invaild Input ");
			Electric_Car();
		}
	}
}

class Tata_Nexon extends Electric {
	public void Tata_Nexon_Ev() {
		Details d = new Details();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for TATA Nexon EV XM");
		System.out.println("Enter 2 For TATA Nexon EV XZ+");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen TATA Nexon EV XM");
			System.out.println("Horsepower: 95 kW");
			System.out.println("Range: 312 km battery-only");
			System.out.println("Battery: 30.2 kWh 320 V lithium polymer");
			System.out.println("On Road Price: ₹14.3L Onwards (includes RTO & insurance costs)");
			d.Final_Details("Tata Nexon", "Nexon EV XM", 1430000);
			break;
		case 2:
			System.out.println("You Have Choosen TATA Nexon EV XZ+");
			System.out.println("Horsepower: 95 to 105 kW");
			System.out.println("Range: 312 to 437 km battery-only");
			System.out.println("Battery: 30.2-40.5 kWh 320 V lithium polymer");
			System.out.println("Transmission: 1-speed automatic");
			System.out.println("On Road Price: ₹15.7L Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Tata Nexon", "Nexon EV XZ+", 1570000);

			break;
		default:
			System.out.println("Invaild Input ");
			System.out.println();

		}
	}
}

class Porsche_Taycan extends Electric {
	public void Porsche_Taycan_Ev() {
		Details d = new Details();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Porsche Taycan Standard EV");
		System.out.println("Enter 2 For Porsche Taycan Turbo S EV");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Porsche Taycan Standard EV");
			System.out.println("Motor Type : Permanent Magnet Synchronous Motor");
			System.out.println("Max Torque (nm@rpm) : 345Nm");
			System.out.println("Transmission Type : 321.84bhp");
			System.out.println("Gear Box : 2-speed transmission");
			System.out.println("On Road Price: ₹1,51,78,280 Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Porsche", "Taycan Standard", 1430000);
			break;
		case 2:
			System.out.println("You Have Choosen Porsche Taycan Turbo S EV");
			System.out.println("Motor Type : Permanent Magnet Synchronous Motor");
			System.out.println("Max Torque (nm@rpm) : 650Nm");
			System.out.println("Transmission Type : 482.76bhp");
			System.out.println("Gear Box : 2-speed transmission");
			System.out.println("On Road Price: ₹2,31,96,670 Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Porsche", "Taycan Turbo S", 23196670);

			break;
		default:
			System.out.println("Invaild Input ");
			System.out.println();

		}
	}
}

class BMW extends Electric {
	public void BMW_Ev() {
		Details d = new Details();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for BMW iX EV");
		System.out.println("Enter 2 for BMW iX3 EV");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen BMW iX EV");
			System.out.println("Battery Capacity : 71kWh");
			System.out.println("Max Torque (nm@rpm) : 630Nm");
			System.out.println("Transmission Type : 321.84bhp");
			System.out.println("Range : 372-425km");
			System.out.println("Charging time : 7.25h(AC 0-100%)");
			System.out.println("On Road Price: ₹1.16 Cr Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("BMW", "iX", 11600000);
			break;
		case 2:
			System.out.println("You Have Choosen BMW iX3 EV");
			System.out.println("Battery Capacity : 85kWh");
			System.out.println("Max Torque (nm@rpm) : 700Nm");
			System.out.println("Transmission Type : 387.76bhp");
			System.out.println("Range : 390-425km");
			System.out.println("Charging time : 7.10h(AC 0-100%");
			System.out.println("On Road Price: ₹1.23 Cr Onwards (includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("BMW", "iX3", 12300000);

			break;
		default:
			System.out.println("Invaild Input ");
			System.out.println();

		}
	}
}

class Tesla extends Electric {
	public void Tesla_Ev() {
		Details d = new Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Tesla Model Y ");
		System.out.println("Enter 2 for Tesla Model X ");
		System.out.println("Enter 2 for Tesla Model S ");
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println();
			System.out.println("Thank You For  Choosing Tesla Model Y");
			System.out.println("Tesla Model Y Info");
			System.out.println("Motor Type: 2 asynchronous AC");
			System.out.println("C/D Test Results: Zero to 60 mph: 3.3 sec");
			System.out.println("Motor Power : 532 HP");
			System.out.println("Range: 220 km battery-only");
			System.out.println("On Road Price: ₹70,00000L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Tesla", "Model Y", 7000000);
			break;
		case 2:
			System.out.println();
			System.out.println("Thank You For  Choosing Tesla Model X");
			System.out.println("Tesla Model X Info");
			System.out.println("Motor Type: 2 asynchronous AC");
			System.out.println("C/D Test Results: Zero to 60 mph: 3.6 sec");
			System.out.println("Motor Power : 565 HP");
			System.out.println("Range: 220 km battery-only");
			System.out.println("On Road Price: ₹2,10,00000L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Tesla", "Model X", 21000000);
			break;
		case 3:
			System.out.println();
			System.out.println("Thank You For  Choosing Tesla Model S");
			System.out.println("Tesla Model X Info");
			System.out.println("Motor Type: 2 asynchronous AC");
			System.out.println("C/D Test Results: Zero to 60 mph: 3.6 sec");
			System.out.println("Motor Power : 576 HP");
			System.out.println("Range: 268 km battery-only");
			System.out.println("On Road Price: ₹3,16,00000L Onwards(includes RTO & insurance costs)");
			System.out.println();
			d.Final_Details("Tesla", "Model S", 31600000);
			break;
		default:
			System.out.println("Invalid Input :");

		}

	}
}

class Details {
	private static final String Veh = null;

	public void Final_Details(String V_Brand, String V_Name, double V_Price) {
		Vehicle Ve = new Vehicle();

		System.out.println("Choose Payment Option\n");
		System.out.println("To Pay With Cheque Press 1");
		System.out.println("To Pay With NEFT Press 1");
		System.out.println("To Pay With EMI Press 3");

		Scanner sc = new Scanner(System.in);
		int opt = sc.nextInt();

		switch (opt) {
		case 1:
			System.out.println("You Have Choosen Payment Through Cheque");
			break;

		case 2:
			System.out.println("You Have Choosen Payment option NEFT");
			break;

		case 3:
			System.out.println("You Have Choosen Payment option EMI");
			break;
		default:
			System.out.println("Invaild Input ");
			break;
		}

		System.out.println("Which Colour Do You Want??\n");
		sc.nextLine();
		String colour = sc.nextLine();
		System.out.println();

		System.out.println("Enter Your Name\n");
		String oname = sc.nextLine();
		Ve.setVeh_Owner_Name(oname);
		System.out.println();

		System.out.println("Enter Your Mobile Number\n");
		Long omobno = sc.nextLong();
		Ve.setOwner_Mobile_Number(omobno);
		System.out.println();

		System.out.println("Enter Your Email Id Number\n");
		sc.nextLine();
		String oemail = sc.nextLine();

		Ve.setOwner_EmailAdd(oemail);
		System.out.println();

		System.out.println("Enter Your Aadhar Card Number\n");
		String oaadharno = sc.nextLine();
		Ve.setOwner_AadharNo(oaadharno);
		System.out.println();

		System.out.println("Enter Your Pan Card Number\n");
		String opanno = sc.nextLine();
		Ve.setOwner_PanNo(opanno);
		System.out.println();

		Ve.Pass(V_Brand, V_Name, colour, V_Price);
		Ve.getDetails();

		System.out.println("");
		System.out.println("Thank You For Purchasing a Vehicle From Our Showroom...!!!");
		System.out.println("Have a great Day Sir :)");
		System.out.println("");

		Ve.Start();
		Ve.Stop();
		Ve.Drive();

	}
}
