import java.util.*;
public class Menu {
	
	private int counter;
	private int lastCounter;
	
	public Menu()
	{
		counter = 0;
		lastCounter = 0;
	}
	
	public void showMenu()
	{
		do
		{
			switch(counter)
			{
				case 0: outputInputForMenu();
					break;
				case 1: chooseCarSeries();
					break;
				case 11: chooseAModels();
					break;
				case 8: this.counter = this.lastCounter;
				break;
				case 9: String counterAsString = Integer.toString(this.counter);
						if(counterAsString.length() > 1)
						{
							counterAsString.substring(1, (counterAsString.length()-1));
							this.counter = Integer.parseInt(counterAsString);
						}
						else
						{
							this.counter = Integer.parseInt(counterAsString);
						}
				break;
				case 10:
					break;
				default: outputInputForMenu();
				break;
			}
		}while(this.counter != 12);
	}
	public void outputInputForMenu()
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
		try
		{
			int newCounter = scan.nextInt();
			this.lastCounter = this.counter;
			this.counter = newCounter;
		}
		catch(Exception e)
		{
			System.out.println("Nur Zahlen in der Eingabe erlaubt!");
			this.counter = this.lastCounter;
		}
		finally
		{
			showMenu();
		}
	}
	
	public void chooseCarSeries()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte waehlen Sie eine Option");
		System.out.println("--------- CAR CONFIGURATOR 1.0 ---------");
		System.out.println("(1) - Audi A Modelle");
		System.out.println("(2) - Audi Q Modelle");
		System.out.println("----------------------------------------");
		System.out.println("(8) - Zureuck");
		System.out.println("(9) - Vor");
		System.out.println("(10) - Verlassen");
		System.out.println("----------------------------------------");
		try
		{
			int newCounter = scan.nextInt();
			this.lastCounter = this.counter;
			if(newCounter > 8 && newCounter <11)
			{
				this.counter = newCounter;
			}
			else
			{
				String StringCounter = Integer.toString(this.counter)+Integer.toString(newCounter);
				this.counter = Integer.parseInt(StringCounter);
			}
		}
		catch(Exception e)
		{
			System.out.println("Nur Zahlen in der Eingabe erlaubt!");
			this.counter = this.lastCounter;
		}
		finally
		{
			showMenu();
		}
	}
	public void chooseAModels()
	{
		
	}
	public int getCounter()
	{
		return this.counter;
	}
	public void setCounter(int counterSet)
	{
		this.counter = counterSet;
	}
}
