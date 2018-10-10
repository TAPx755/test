import java.util.*;

public class MenuItems {

	private String line;
	private String spacer;
	private boolean isExecuteable; 
	
	
	public MenuItems(String line, boolean isExe)
	{
		this.spacer = ("|*******************************************|");
		this.isExecuteable = isExe;
		this.line = line;
	}
	
	public MenuItems()
	{
		this.spacer = ("|*******************************************|");
	}
	public String getSpacer()
	{
		return this.spacer;
	}
	

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	
	public String toString()
	{
		return this.line;
	}
	public boolean isExecuteable() {
		return isExecuteable;
	}

	public void setExecuteable(boolean isExecuteable) {
		this.isExecuteable = isExecuteable;
	}
}
