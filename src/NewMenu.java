
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * failed the class design cause i called the class MenuItems but it's only a MenuItem
 * so this is the emergency menu
 * 
 * 
 *
 */

public class NewMenu {
	private int counter;
	private int lastCounter;
	private int nextCounter;
	private double price;
	private int platform;
	private boolean[] equip;
	
	public NewMenu()
	{
		counter=0;
		lastCounter = 0;
		nextCounter = 0;
		price = 0;
		platform = -1;
		equip = new boolean[3];
		equip[0] =false;
		equip[1] =false;
		equip[2] =false;
	}
	
	/*
	 * method for processing the menu
	 * this.counter decides the option that is getting executed
	 */
	public void processMenu()
	{

		do
		{
			switch(this.counter)
			{
				case 0: showMenu();
						this.lastCounter=this.counter;
				break;
				
				case 3: buy();
				
				case 10: leaveMenu();
				break;
				
				case 8: //System.out.println("Im Hauptmenu kann nicht zurück gegangen werden");
				break;
				
				case 9: this.counter = this.nextCounter;
						processMenu();
				break;
				
				case 1: chooseSeries();
						do {
							if(this.counter != 8 & this.counter != 9 & this.counter != 10)
							{
								this.nextCounter = this.counter;

							}
							System.out.println(""+this.nextCounter);
							switch(this.counter)
							{
								case 1: aModels();
								break;
								case 2: qModels();
								break;
								case 8:
										
										this.counter = this.lastCounter;
										processMenu();
								break;
								case 9: this.counter = this.nextCounter;
										//System.out.println(""+this.counter);
										processMenu();	
								break;
								case 10: leaveMenu();
								break;
								default: System.out.println("Bitte einen von den angegebenen Punkt waehlen!");
										this.counter = 1;
										processMenu();
								break;
							}
						}while(this.counter != 10 || this.counter != 0);
				break;
				case 2: chooseEquip();
						do
						{
							System.out.println(""+this.nextCounter);
							switch(this.counter)
							{
								case 1: climate();
								break;
								case 2: sport();
								break;
								case 3: heating();
								break;
								case 8: this.counter = this.lastCounter;
										processMenu();
										break;
								case 9: this.counter = this.lastCounter;
										processMenu();
								break;
								case 10: leaveMenu();
										 break;
								default: System.out.println("Bitte einen von den angegebenen Punkt waehlen!");
										this.counter = 2;
										processMenu();
								break;		
							}
						}while(this.counter != 10);
				break;
				
				default: System.out.println("Bitte einen von den angegebenen Punkt waehlen!");
				this.counter = 0;
				processMenu();
				break;		
				
			}
		}while(this.counter != 10);
	}
	
	/**
	 * 
	 * output for the root menu
	 * after recording the input it calls the method processMenu();
	 */
	public void showMenu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte waehlen Sie eine Option");
		System.out.println("--------- CAR CONFIGURATOR 1.0 ---------");
		System.out.println("(1) - Serienwahl");
		System.out.println("(2) - Ausstattungswahl");
		System.out.println("(3) - !Jetzt Kaufen! inkl. Bestaetigung");
		System.out.println("----------------------------------------");
		System.out.println("(8) - Zureuck");
		System.out.println("(9) - Vor");
		System.out.println("(10) - Verlassen");
		System.out.println("----------------------------------------");
		System.out.println("Derzeitiger Preis: "+getPrice()+"€");
		System.out.println("----------------------------------------");
		this.counter = scan.nextInt();
		processMenu();
	}
	
	/*
	 * 
	 * if the user decides to buy it leaves the menu and give an report
	 */
	public void buy()
	{
		leaveMenu();
	}
	
	/*
	 * 
	 * output if the user chooses the platform option
	 */
	public void chooseSeries()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte waehlen Sie eine Option");
		System.out.println("--------- CAR CONFIGURATOR 1.0 ---------");
		System.out.println("(1) - A Modelle");
		System.out.println("(2) - Q Modelle");
		System.out.println("----------------------------------------");
		System.out.println("(8) - Zureuck");
		System.out.println("(9) - Vor");
		System.out.println("(10) - Verlassen");
		System.out.println("----------------------------------------");
		System.out.println("Derzeitiger Preis: "+getPrice()+"€");
		System.out.println("----------------------------------------");
		
		if(this.counter != 8 & this.counter != 9 & this.counter != 10)
		{
			this.nextCounter = this.counter;

		}
		this.counter = scan.nextInt();
	}
	
	/*
	 * 
	 * if he choose the a models
	 * platform is set to 1 and the price to the referenced platform
	 */
	public void aModels()
	{

		if(getPlatform() == -1)
		{
			setPrice(this.price + 26000.99);
			setPlatform(1);
			System.out.println("Sie haben sich fuer das A Modell entschieden : (26000.99€ Basispreis) ");
			
		}
		else
		{
			System.out.println("Sie haben das "+getPlatformAsString()+ " bereits gewaehlt!");
		}
		this.counter = 1;
		processMenu();
	}
	/*
	 * 
	 * if he choose the q models
	 * platform is set to 2 and the price to the referenced platform
	 */
	public void qModels()
	{

		
		if(getPlatform() == -1)
		{
			setPrice(this.price + 35000.99);
			setPlatform(2);
			System.out.println("Sie haben sich fuer das Q Modell entschieden : (35000.99€ Basispreis) ");
		}
		else
		{
			System.out.println("Sie haben das "+getPlatformAsString()+ " bereits gewaehlt!");
		}
		this.counter = 1;
		processMenu();
	}
	
	/*
	 * 
	 * output for the equip menu
	 */
	public void chooseEquip()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte waehlen Sie eine Option");
		System.out.println("--------- CAR CONFIGURATOR 1.0 ---------");
		System.out.println("(1) - Klimaanlage");
		System.out.println("(2) - Sport Packet");
		System.out.println("(3) - Standheizung");
		System.out.println("----------------------------------------");
		System.out.println("(8) - Zureuck");
		System.out.println("(9) - Vor");
		System.out.println("(10) - Verlassen");
		System.out.println("----------------------------------------");
		System.out.println("Derzeitiger Preis: "+getPrice()+"€");
		System.out.println("----------------------------------------");
		if(this.counter != 8 & this.counter != 9 & this.counter != 10)
		{
			this.nextCounter = this.counter;

		}
		this.counter = scan.nextInt();
	}
	
	/*
	 * 
	 * if he chooses climate the equip array at the pos 0 is set to true
	 * price to referenced equip
	 */
	public void climate()
	{
		if(equip[0] == false)
		{
			System.out.println("Sie haben das Klimaanlagen Paket hinzugefuegt.");
			System.out.println("Preis: 1200€");
			setPrice(this.price + 1200.0);
			equip[0] = true;
		}
		else
		{
			System.out.println("Das Klimaanlagen Paket wurde bereits hinzugefuegt.");
		}
		this.counter =2;
		processMenu();
	}
	/*
	 * if he chooses sport the equip array at the pos 1 is set to true
	 * price referenced to sport is set
	 */
	public void sport()
	{
		if(equip[1] == false)
		{
			System.out.println("Sie haben das Sport Paket hinzugefuegt.");
			System.out.println("Preis: 21000€");
			setPrice(this.price + 21000.0);
			equip[1] = true;
		}
		else
		{
			System.out.println("Das Sport Paket wurde bereits hinzugefuegt.");
		}
		this.counter =2;
		processMenu();
	}
	/*
	 * if he chooses heating the equip array at the pos 2 is set to true
	 * price referenced to heating is set
	 */
	public void heating()
	{
		if(equip[2] == false)
		{
			System.out.println("Sie haben das Standheizungs Paket hinzugefuegt.");
			System.out.println("Preis: 5000€");
			setPrice(this.price + 5000.0);
			equip[2] = true;
		}
		else
		{
			System.out.println("Das Standheizungs Paket wurde bereits hinzugefuegt.");
		}
		this.counter =2;
		processMenu();
	}
	
	/*
	 * leave menu (exit's the programm)
	 * report of the choosen elements is given
	 */
	public void leaveMenu()
	{
		System.out.println("Schade dass Sie den Konfigurator schon beenden :(");
		System.out.println("-------- IHRE KONFIGURATION --------");
		System.out.println("Platform: "+getPlatformAsString());
		System.out.println("Ausstattung: "+getEquip());
		System.out.println("------------------------------------");
		System.out.println("Endgültiger Preis: "+getPrice()+"€");
		System.out.println("Liefertermin: 22.10.18");
		System.exit(0);
	}
	
	public double getPrice() {
		return round(price,2);
	}
	
	/*
	 * 
	 * rounding method
	 */
	private static double round(double value, int places) {
	    if (places < 0) throw new IllegalArgumentException();
	 
	    BigDecimal bd = new BigDecimal(Double.toString(value));
	    bd = bd.setScale(places, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPlatform() {
		return platform;
	}
	public void setPlatform(int platform) {
		this.platform = platform;
	}
	
	public void setLastCounter()
	{
		this.lastCounter = this.counter;
	}
	public void setNextCounter()
	{
		this.nextCounter = this.counter;
	}
	
	public String getPlatformAsString()
	{
		if(this.platform == -1)
		{
			return "Keine";
		}
		else if(this.platform == 1)
		{
			return "A-Modell";
		}
		else
		{
			return "Q-Modell";
		}
	}
	
	public String getEquip()
	{
		String returnString = "";
		if(equip[0] == true)
		{
			returnString = returnString + "Klimaanlage" + ",";
		}
		else if(equip[1] == true)
		{
			returnString = returnString + "Sport Paket" +",";
		}
		else if(equip[2] == true)
		{
			returnString = returnString +"Standheizung"+",";
		}
		else
		{
			return "Keine";
		}
	return returnString;
	}
	
}
