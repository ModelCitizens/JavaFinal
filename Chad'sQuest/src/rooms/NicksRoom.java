package rooms;
import java.util.Random;
import java.util.Scanner;
public class NicksRoom 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 int choice;
		 String input;
         Scanner input1 = new Scanner(System.in);
         System.out.println("Welcome to Chad's Quest! A text adventrue game where you type out what you want to do."); 
         System.out.println("To know what to enter into the console, the narator will emphasize the word you need to enter,"); 
         System.out.println("example would be -ENTER, notice how enter is in all caps, this means it's an interative word.");
         System.out.println("Would you like to play? YES or NO");
         input = input1.nextLine();
         if(input.equals("YES"))
         {
           	 
        	 System.out.println("What is you name?");
           	 System.out.println("Nice to meet you Chad");
               
        	 System.out.println("Chad is currently in your office and it's almost time to leave");
        	 System.out.println("but Chad remembers that his key card doesn't work. Chad has to go get a new one or Chad can"); 
        	 System.out.println(" just go to the RIGHT. Or Chad can make the adventure and go LEFT. Or STAY PUT");
        	 input = input1.nextLine();
        	 if(input.equals("STAY PUT"))//GameWithInAGame
        	 {
        		 System.out.println("...");
        		 StayPut.StayPutGame();  	 
        	 }
         }
        	 
        	 	
        	
        	 if(input.equals("LEFT"))
        	 {
        		 System.out.println("Common Chad it's quicker just to go right, Just go RIGHT or keep going LEFT");
        		input = input1.nextLine();
        		if(input.equals("RIGHT"))
        		{
        			System.out.println("You know Chad, you make it very easy being a narator.");
        			System.out.println("Im glad you listened too me.");
        			System.out.println("Now just go through that door and leave.");
        			System.out.println("Chad opens up the door and sees an unfinshed hallway.");
        			System.out.println("The walls are half painted and there is only one door on the left side of the hallway.");
        			System.out.println("A little further down the hall there is a door that leads to the outside.");
        			System.out.println("Does Chad go to the DOOR, or Walks down the hall.");
        			input = input1.nextLine();
        			if(input.equals("DOOR"))
        			{
        				System.out.println("Chad cracks open the door to get a peak inside.");
        				System.out.println("The room is filled with monitors and one microphone, with soundproofing everywhere.");
        				System.out.println("Chad looked closer and there was a man in there.");
        				System.out.println("This man was hunched over the microphone, then slowly sits up and turns to look at Chad.");
        				System.out.println("The man had a long beard, and looks dirty.");
        				System.out.println("The old man stood up and the sound of bottles clinking together was heard.");
        				System.out.println("The man walked over to the door Chad was at, then slowly closed it.");
        				System.out.println("Don't mind the man in the room he's not important.");
        				System.out.println("Chad then walks down the hallway, and opens up the door and leaves.");
        				System.out.println("Game Over ending 8");
        				System.out.println("We highly recomend you replay our game. Y");
        			}
        		}
        		if(input.equals("LEFT"))
        		{
        			System.out.println("Chad starts to go to the left hallway and notices that Doug's door is open.");
        			System.out.println("Chad has always hated Doug as does everone else in the office does.");
        			System.out.println("Doug is that one guy that always wants you to know how tough he is.");
        			System.out.println("Always trying to get you to go to the gym with the guy.");
        			System.out.println("Doug has left his office door unlocked. Due to the fact that Chad hates Doug, ");
        			System.out.println("it's time to mess with his stuff.");
        			System.out.println("Doug is the office acountant, so he has paper crumbled up every where.");
        			System.out.println("But chad notices one peice of paper on top of the pile with the word Turky written on it.");
        			System.out.println("Chad goes to Doug's computer and turnes it on. The computer asks for a password");
        			System.out.println("Please enter the password");
        			input = input1.nextLine();
        			if(input.equals("Turky"))//DougsPassword
        			{
        				System.out.println("The computer welcomes you and boots up.");
        				System.out.println("After waiting for the computer to boot up, Chad is ready to mess with it.");
        				System.out.println("Chad goes to delete some files when he notices the file he is dragging.");
        				System.out.println("The files reads: My Little Poney Season 2.");
        				System.out.println("Chad is a little disturbed but knows that he has kids so ignores it.");
        				System.out.println("But then the file opens up, Chad sees disturbing things. There are pictures along with videos of");
        				System.out.println("Doug in a My Little Poney shirt, and Doug watching My little Poney without his daughter");
        				System.out.println("Chad is grossed out. Then the computer gets an email, that just states: Yea if you going to pay me I can do that");
        				System.out.println("Chad then closes out the computer and goes out Dougs door.");
        				System.out.println("Game Over ending 2");	
        			}
        			else//passwordFail
        			{
        				System.out.println("A loud buzz starts to come from the computer. Meaning the password is incorrect.");
        				System.out.println("Then a man in the closet near by whips open the closet door.");
        				System.out.println("The man is wearing nothing but pants, a latex mask with zippers on the mouth and eye holes.");
        				System.out.println("The strange man is also holding a whip.");
        				System.out.println("Chad screems and runs out of the office and back into the hallway.");
        				System.out.println("Chad turnes and shuts the door behind him.");
        				System.out.println("Chad's heart is racing. Chad can see that Eric door is open. Chad stops out side of Erics office to think for a moment");
        				System.out.println("Eric is in charge of the HR department for the office. Chad doesn't know if he should tell about it.");
        				System.out.println("Chad says aloud: Do I TELL, or IGNORE it?");
        				input = input1.nextLine();
        				if(input.equals("TELL"))//EricOfficeTellChoice
        				{
        					System.out.println("Chad decides to tell Eric. Eric is the guy at the office that nobody likes being around him. ");
        					System.out.println("Eric tries to make everbody like him, and he tries too hard.");
        					System.out.println("Eric is sitting at his desk with a big grin on his face and says:");
        					System.out.println("Well hi Chad, what brings you into my office today?");
        					System.out.println("Man this Eric guy is so creepy, with that smile, like he is always happy.");
        					System.out.println("Chad sits down in one of Eric's chairs and begins to take a breath getting ready to spill what just happend.");
        					System.out.println("But before Chad could get a word out Eric interupts Chad and says:");
        					System.out.println("I know why you're here.");
        					System.out.println("Chad is a little relaxed now, that he is not the only one that has seen what he has seen.");
        					System.out.println("Chad says: You do huh?");
        					System.out.println("Yes of cource I do, it my job. You are unmotivated.");
        					System.out.println("Chad says: um no that's not......");
        					System.out.println("It's ok. I wont tell the boss. Eric interupted again.");
        					System.out.println("All you have to do is believe you can, and you will. Just look at this poster.");
        					System.out.println("Really, he has that poster. Everbody has seen the cat ona stick that says Hang in there.");
        					System.out.println("Eric smiles and says: All you got to do is hang in there. I think you can do anything you want.");
        					System.out.println("You just have to believe in your self.");
        					System.out.println("Chad feels great about himself. Eric actually helped with something.");
        					System.out.println("Chad closed his eyes and believed real hard. Chad then says: I can do it.");
        					System.out.println("Chad then nods at Eric, and then uses his door toe leave.");
        					System.out.println("Game Over Ending 3");
        				}
        				if(input.equals("IGNORE"))//EricOfficeIgnoreChoice
        				{
        					System.out.println("Chad chooses to ignore what he just saw, and just takes a minute to himself outside Eric's office.");
        					System.out.println("Eric then walkes out his office, and nods at Chad, then he goes to lunch. ");
        					System.out.println("Chad goes into the office, and looks around. The only thing in his office is a couple of pictures and a desk.");
        					System.out.println("You would think the guy wouldn't have so many cat posters.");
        					System.out.println("It's honestly creepy to sit in his desk, there are just so many cats staring at you.");
        					System.out.println("Chad sees that 2 drawers unlocked.");
        					System.out.println("Are you really about to go snooping again? My god I think Eric is coming back, You only have time to look in one drawer");
        					System.out.println("TOP or BOTTOM Drawer, ");
        					input = input1.nextLine();
        			
     
        					if(input.equals("BOTTOM"))//FindWhip
        					{
        						System.out.println("Chad opens up the bottom drawer and finds a latex mask, and a whip.");
        						System.out.println("The mask seems to have a little bit of sweat on it, like it has been used recently.");
        						System.out.println("Chad slams the drawer shut and runs out of the room before Eric gets there.");
        						System.out.println("The next room is Sarah's room");
        						SarahsRoom.SaRoom();
        					}
        					if(input.equals("TOP"))//ChadGetsCaughtSnooping
        					{
        						System.out.println("There's nothing in here but dust.");
        						System.out.println("Did you really just open that for nothing?");
        						System.out.println("Eric walks in the room and says: Hey what are you doing???");
        						System.out.println("Don't just stare at me say something!!");
        						System.out.println("I think it's time to leave. Just go out his door.");
        						System.out.println("Game Over ending 4");
        					}
        				}
        			}
        		}
        	 } 
             if(input.equals("Turn Around"))//NicksOffice
        	 {
        		 System.out.println("Please enter password");
        		 input = input1.nextLine();
        		 if(input.equals("BadNick"))//PasswordForNicksOffice
                        
        		 {
        			 System.out.println("Chad turns around and goes towards the mail room where Nick works. Nick " +
        		        	 "hates his job here at the office. Nick has been working here for 5 years and is still an intern" +
        		        	 " at the office. Nick sees that Chad has entered the room. Chad started out as an intern at the office" +
        		        	 "along side of Nick, but Chad isn't an intern. This causes tension between Chad and Nick");
        		        		 System.out.println("Just the sight of Chad sends Nick into a fumming rant.");
        		        		 System.out.println("Nick screems: What the hell brings you into my office!");
        		        		 System.out.println("You know how much it pisses me off just to think about you,");
        		        		 System.out.println("or are you here to actually give me the money you owe me.");
        		        		 System.out.println("You know how much it meant to me to get this job....");
        		        		 System.out.println("Then you just come in and steal it from me! Nick says softly with tears running down his face");
        		        		 System.out.println("Nick puts his face in his hands and then proceeds to start sobbing");
        		        		 System.out.println("Man This guy is messed up, just walk out his door, I think it's open.");
        		        		 System.out.println("Nick lifts his head up and yells: Just leave you prick");
        		        		 System.out.println("I guess you should LEAVE");
        		        		 input = input1.nextLine();
        		        		 if(input.equals("LEAVE"))
        		        		 {
        		        			 System.out.println("Game Over secret ending");
        		        		 }
         		 }
        	
        	
        	 }
       	 }
         
	}


