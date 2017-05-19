package rooms;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class AudioClips {

	public static void playSound()
	{
		// 
		try{
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(this.getClass().getResource("C:\\Users\\bm122190\\Desktop\\JavaFinal\\JavaFinal\\Chad'sQuest\\src"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start( );
			}
		catch(Exception ex) 
		{
			System.out.println("Error with playing sound.");
			ex.printStackTrace();
		}
	}

}
