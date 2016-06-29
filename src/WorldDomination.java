import javax.swing.JOptionPane;

public class WorldDomination 
{
	public static void main(String[] args) 
	{
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know how to write code?");
		String yes = "yes";

		// 2. If they say "yes", tell them they will rule the world.
		if (code.equals(yes))
		{
			JOptionPane.showMessageDialog(null, "You will rule the world");
		}
		else
		{
			JOptionPane.showConfirmDialog(null, "Good luck washing dishes");
		}

		// 3. Otherwise, wish them good luck washing dishes.

	}
}

