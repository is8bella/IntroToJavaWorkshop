import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Dontforgetthelyrics 
{
	/*
	 * For this game, we'll play the start of a song, and the player has to guess the rest of the lyrics.
	 * 
	 * 1. To record a sound clip, open Audacity and record your song.
	 * 
	 * 2. Click File -> Export Audio, and save your file on the Desktop.
	 * 
	 * 3. Drag your file from the Desktop into the "default package" under "src".
	 */
	
	public static void main(String[] args) 
	{
		JOptionPane.showMessageDialog(null, "Don't Forget the Lyrics");
		JOptionPane.showMessageDialog(null, "Listen to the audio clips and try to guess the next lyrics!");
		playSound("1.wav");
		String Wego1 = JOptionPane.showInputDialog("What are the next lyrics?");
		String answer1 = "we go fast till they can't replay";
		int point = 0;
		if(Wego1.equalsIgnoreCase(answer1))
		{
			JOptionPane.showMessageDialog(null, "yea you're right!");
			//JOptionPane.showMessageDialog(null, point + "1 point!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "yea you're wrong... GO AWAY. The answer was 'We go fast till they can't replay.'");
		}
		// 10. [optional] Add a points variable that will calculate their final score.
		JOptionPane.showMessageDialog(null, "Next song!");
		playSound("2.wav");
		String answer2 = "Sorry";
		String sorry = JOptionPane.showInputDialog("What are the next lyrics?");
		if(sorry.equalsIgnoreCase(answer2))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		JOptionPane.showMessageDialog(null, "Next song!");
		playSound("3.wav");
		String answer3 = "when you're ready come and get it";
		String when = JOptionPane.showInputDialog("What are the next lyrics?");
		if(when.equalsIgnoreCase(answer3))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
		JOptionPane.showMessageDialog(null, "Next song!");
		playSound("4.wav");
		String answer4 = "My Youth";
		String youth = JOptionPane.showInputDialog("What are the next lyrics?");
		if(youth.equalsIgnoreCase(answer4))
		{
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect");
		}
	}

	public static void playSound(String fileName) 
	{
		AudioClip audioClip = JApplet.newAudioClip(new Dontforgetthelyrics().getClass().getResource(fileName));
		audioClip.play();
	}
}
