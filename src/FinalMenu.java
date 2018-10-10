import java.util.*;

public class FinalMenu {

	
	private final int EXIT_VALUE = 0;
	private ArrayList<MenuItems> ItemsToShow;
	private MenuItems menuItem;
	
	public FinalMenu()
	{
		ItemsToShow = new ArrayList<MenuItems>();
		menuItem = new MenuItems();
	}
	
	public void showMenu(int choice)
	{
		menuItem = ItemsToShow.get(choice); //0 is always the root menu!
		
		if(menuItem.isExecuteable() == false)
		{
			System.out.println(""+menuItem.getSpacer());
			for(int i = 0; i< ItemsToShow.size(); i++)
			{
				System.out.println(menuItem.getLine());
			}
			System.out.println(""+menuItem.getSpacer());
			processMenu();
		}
		else
		{
			
		}

	}
	public void processMenu()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Bitte Option wahelen!");
		int choice = input.nextInt();
		showMenu(choice);
	}
	
	public void addMenuItem(MenuItems menuItemToAdd)
	{
		ItemsToShow.add(menuItemToAdd);
	}
	public void deleteMenuItem(int line)
	{
		ItemsToShow.remove(line);
	}
	public void toSystemOut()
	{
		MenuItems read = new MenuItems();
		for(int i = 0; i< ItemsToShow.size(); i++)
		{
			read = ItemsToShow.get(i);
			System.out.println("");
			System.out.println("Das "+i+" Menu");
			System.out.println(""+read.getSpacer());
			//System.out.println("Headline: "+read.getHeadline());
			//System.out.println("Menu Content: "+read.toBrString());
			System.out.println(read.getSpacer());
			System.out.println("");
		}
	}
}
