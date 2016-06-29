import javax.swing.JOptionPane;

public class Names 
{
	public static void main(String[] args) 
	{
		String name1 = "Ella";
		String name2 = JOptionPane.showInputDialog("Please enter your name");
		if (name1.equals(name2))
		{
			JOptionPane.showMessageDialog(null, "You have an amazing choice in names!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "I guess that's a cool name...");
		}
		
	}
}
