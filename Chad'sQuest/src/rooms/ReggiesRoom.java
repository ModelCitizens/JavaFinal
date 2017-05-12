//MAAS
//Tech Manager
//5-9-17
package rooms;

import java.util.Scanner;

public class ReggiesRoom {

	public void Reroom()
	{
		String doorChoice;
		String moralChoice;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Once outside Reggie's office Chad notices that the lights are still on.");
		System.out.print("\nReggie, or Regginald as he prefers, is Blue Ring's tech manager. Although well liked no one really listens to him.");
		System.out.print("\nIn fact unless something brakes around the office Reggie is often forgotten.");
		System.out.print("\nWhat was I talking about again? Oh yeah, Reggie.");
		System.out.print("\nIf we want a key card we either get it from him or the boss's office.");
		System.out.print("OPEN DOOR or KEEP GOING? >>>");
		doorChoice = input.nextLine();
		 if(doorChoice.equals("OPEN DOOR")||doorChoice.equals("open door"))
		 {
			 System.out.print("Chad opens the door to find Reggie tinkering away at some mechanical doodad.");
			 System.out.print("\nReggie: Hello Chad, working late I see.");
			 System.out.print("\nYou know it wouldn't hurt to say something to the man.");
			 System.out.print("\nRight you're one of those silent protagonists. That would explain why you're just staring at him.");
			 System.out.print("\nI guess I'll just do the talking then, Reggie?");
			 System.out.print("\nReggie: Who's there?");
			 System.out.print("\nThe Tooth Fairy.");
			 System.out.print("\nReggie: Really?");
			 System.out.print("\nNo I'm the narrator and because Chad doesn't talk much I'm going to have to be his voice.");
			 System.out.print("\nReggie: Fair enough, what do ya need?");
			 System.out.print("\nWe need a key card because Chad's is busted. Got any spare?");
			 System.out.print("\nReggie: I might have one in the back somewhere.");
			 System.out.print("\nGreat, mind grabbing it for us?");
			 System.out.print("\nReggie: I suppose I can. Wait here, and don't touch anything while I'm away.");
			 System.out.print("\nReggie leaves going through a door in the corner of the office.");
			 System.out.print("\nI heard he has some cool stuff in that box over there if you want a peek, or we could just sit here I suppose.");
			 System.out.print("LOOK IN BOX or WAIT? >>>");
			 moralChoice = input.nextLine();
			 	if(moralChoice.equals("LOOK IN BOX")||moralChoice.equals("look in box"))
			 	{
			 		System.out.print("Chad begins looking through the box and finds what looks to be a VR helmet.");
			 		System.out.print("\nI read a book about someone being stuck in one of those, better leave it alone.");
			 		System.out.print("\nAlso in the box is a tiki mask with four brightly colored feathers.");
			 		System.out.print("\nHey I remember him, didn't he hangout with a wombat with fingerless gloves?");
			 		System.out.print("\nAt the very bottom of the box is a can of yellow paint along with a nametag that says Stanley.");
			 		System.out.print("\nWho's Stanley?");
			 		System.out.print("\nThe doorknob begins to shift and Chad hurriedly puts everything back in the box.");
			 		
			 	}
			 	if(moralChoice.equals("WAIT")||moralChoice.equals("wait"))
			 	{
			 		System.out.print("The clock in Reggie's office clicks loudly.");
			 		System.out.print("\n....");
			 		System.out.print("\nDid you say something?");
			 		System.out.print("\nNo, right you don't talk.");
			 		System.out.print("\nWhere is Reggie?");
			 		
			 	}
			 	System.out.print("Reggie enters the room with a key card in hand and gives it to Chad.");
			 	System.out.print("\nReggie: Here you are one key card.");
			 	System.out.print("\nThanks Reggie.");
			 	System.out.print("\n");
			 	

		 }
		 if(doorChoice.equals("KEEP GOING")||doorChoice.equals("keep going"))
		 {
			 
		 }

	}

}
