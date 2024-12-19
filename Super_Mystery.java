import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Super_Mystery_MAIN 
{
	
	static Scanner myReader = new Scanner(System.in);
	
	/** 
	 * Main method where I call all my strings to run my game.
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.print("Welcome to the world of Alfea, where magic and mayhem is rampid, can you help this world? (Yes or No): ");
		
		chooseGame();
		// this is where im doing my characters class 
		welcomeGame();
		System.out.println("You go to explore the world of Alfea, screams heard in the distance, you run towards it...");
		pathChoose();
		pathCollide();
		System.out.println("These next two choices will choos ethe course of the end of your path... Choose wisely!!");
		
		pathEnd();
		
		myReader.close();
	}
	
	/**
	 * This is how you can choose if you want to help the world or not (The only option is yes) because if you say no then there will be 
	 * no point of the game
	 * @return
	 */
	public static String chooseGame()
	{
		String pathWay = new String (myReader.next());
		
		if (pathWay.equals("yes") || pathWay.equals("Yes"))
		{
			System.out.println("");
			System.out.println("Yay!! Thank you for choosing to help us :) ");
			System.out.println("");
		}
		
		else if (pathWay.equals("No") || pathWay.equals("no"))
		{
			System.out.println("");
			System.out.println("Sorry but you can't say that :(... ");
			System.out.println("");
		}
		
		else 
		{
			return "Try again please!";
		}
		
		return "";
	}
	
	public static String welcomeGame()
	{
		
		System.out.println("");
		System.out.println("You have been accepted into the world of Alfea! ");
		System.out.println("Suddenly a book appears infront of you and flips to a page with 4 symbols, these symbols representing the 4 elements.");
		System.out.print("Water, Earth, Fire, Air.... What would you choose?: ");
		
		String choosePower = new String (myReader.next());
		//If they pick water
		if (choosePower.equals("Water") || choosePower.equals("water"))
		{
			System.out.println("");
			System.out.println("The book starts to tremble before bursting into water, surronding you all around before evaporating.");
			System.out.println("You have been granted the gift of water. ");
			System.out.println("");
			
		}
		
		//If they pick earth
		if (choosePower.equals("Earth") || choosePower.equals("earth"))
		{
			System.out.println("");
			System.out.println("The book starts to tremble before turning to stone, the book falls to the ground shattering.");
			System.out.println("You have been granted the gift of Earth. ");
			System.out.println(" ");
		}
		
		//If they pick Fire
		if (choosePower.equals("Fire") || choosePower.equals("fire"))
		{
			System.out.println("");
			System.out.println("The book bursts into fire, as trails of fire twirl around you before dissapearing. ");
			System.out.println("You have been granted the gift of Fire. ");
			System.out.println(" ");
		}
		
		//If they pick Air
		if (choosePower.equals("Air") || choosePower.equals("air"))
		{
			System.out.println("");
			System.out.println("The books pages flip rapidly as you feel wind swirling around you until there is a sudden still in the air. ");
			System.out.println("You have been granted the gift of Air. ");
			System.out.println(" ");
		}
		
		//If they choose anything else
		return "Try again that wasn't a valid answer....";
	}
	
	/**
	 * Whether the are choosing to help the other magic users or not, if they choose to help, they become "friends" kinda,
	 *  if they choose not to, then they will have to face a quick end to their journey in Alfea
	 * @return
	 */
	public static String pathChoose() 
	{
	
		System.out.print("A group of other magic users are fighting a huge troll, the users seem to be losing... What do you want to do? (Help or Ignore): ");
		
		String goodEvil = new String (myReader.next());
		
		/**
		 * If they choose to help and then the skill sets they can choose to help them 
		 */
		if (goodEvil.equals("Help") || goodEvil.equals("help"))
		{
			System.out.println(" ");
			System.out.println("You have chosen to help the users, what stype of approach would you take to defeat the troll");
			System.out.print("Agressive, Defensive, Stun, Support: ");
			
			String powerMove = new String (myReader.next());
			
			if (powerMove.equals("Agressive") || powerMove.equals("agressive"))
			{
				System.out.println("");
				System.out.print("What skill would you want to use (Whip, Ball, Blast): ");
				String powerChoice = new String (myReader.next());
				
				if (powerChoice.equals("Whip") || powerChoice.equals("whip"))
				{
					System.out.println("");
					System.out.print("Power courses out from hand summoning (your element) into a whip form, using the whip you start attacking the troll, the magic users who were once on the ground join in to help");
				}
				
				if (powerChoice.equals("Ball") || powerChoice.equals("ball"))
				{
					System.out.println("");
					System.out.print("A ball formed with (your element) is formed as you force it towards the trolls head knocking it out. ");
				}
				
				if (powerChoice.equals("Blast") || powerChoice.equals("blast"))
				{
					System.out.println("");
					System.out.print("A continuous stream of (your element) is blasted towards the troll as it falls over landing on a rock knocking it out.  ");
				}
			}
			if (powerMove.equals("Defensive") || powerMove.equals("defensive"))
			{
				System.out.println("");
				System.out.print("What skill would you want to use (Wall, Deflect, Armour): ");
				String powerChoice = new String (myReader.next());
				
				if (powerChoice.equals("Wall") || powerChoice.equals("wall"))
				{
					System.out.println("");
					System.out.print("The troll is about to hit the magic users. A wall of (your element) is formed blocking the hit as the users get up to finish off the troll. ");
				}
				
				if (powerChoice.equals("Deflect") || powerChoice.equals("deflect"))
				{
					System.out.println("");
					System.out.print("The troll is about to hit the magic users. You shoot a curved projectile deflecting the strike as the troll falls backwards onto a rock knocking out. ");
				}
				
				if (powerChoice.equals("Armour") || powerChoice.equals("armour"))
				{
					System.out.println("");
					System.out.print("The troll goes in for the hit on the users. A sheet of (your element) covers their bodies giving them a bit more defense as they tank the hit, then taking down the troll. ");
				}
			}
			if (powerMove.equals("Stun") || powerMove.equals("stun"))
			{
				System.out.println("");
				System.out.print("What skill would you want to use (Grab, Push, Bind): ");
				String powerChoice = new String (myReader.next());
				
				if (powerChoice.equals("Grab") || powerChoice.equals("grab"))
				{
					System.out.println("");
					System.out.print("A stream of grips onto the trolls arms, chaining it to the ground, the users take this chance to take the roll down. ");
				}
				
				if (powerChoice.equals("Push") || powerChoice.equals("push"))
				{
					System.out.println("");
					System.out.print("A wall like object of (your element) forces its way toawrds the troll pushing it back, as the users see this they rush the troll taking it down. ");
				}
				
				if (powerChoice.equals("Bind") || powerChoice.equals("bind"))
				{
					System.out.println("");
					System.out.print("A stream of (your element) wraps around the trolls legs making it unable to move, the users take this chance to take it down. ");
				}
			}
			if (powerMove.equals("Support") || powerMove.equals("support"))
			{
				System.out.println("");
				System.out.print("What skill would you want to use (Projectiles, Enhance): ");
				String powerChoice = new String (myReader.next());
				
				if (powerChoice.equals("Projectiles") || powerChoice.equals("projectiles"))
				{
					System.out.println("");
					System.out.print("Small projecticles of (your element) start to form in the air as they fire at the troll in intervals, distrcating it while the users finish the troll off. ");
				}
				
				if (powerChoice.equals("Enhance") || powerChoice.equals("enhance"))
				{
					System.out.println("");
					System.out.print("An aura of (your element) flows around the magic users as they suddenly feel energized, getting up to take down the troll. ");
				}
			}
			/**
			 * 
			 * Defeating the monster, revealing the new character in the story
			 */
			System.out.println("");
			System.out.println("");
			System.out.println("The troll finally defeated...The users walk over to you, however they all merge into one");
			System.out.println("");
			String text1 = "???: \"That was pretty good what you did back there, I'm Natlan.\" ";

	        for (int i = 0; i < text1.length(); i++) 
	        {
	            System.out.print(text1.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("Still stunned at how he went from many people to just him, you look around confused.");
	        System.out.println("");
	        String text2 = "Natlan: \"My magic is illusion..along with other things!\" ";

	        for (int i = 0; i < text2.length(); i++) 
	        {
	            System.out.print(text2.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println(" He laughed seathing his sword back into its pouch.");
	        System.out.println("");
	        
	        String text3 = "Natlan: \"You must be the human that was able to gain an elemental magic... There has been quite a prophecy on you\" ";

	        for (int i = 0; i < text3.length(); i++) 
	        {
	            System.out.print(text3.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println(" He said this while examining you from head to toe, \n circling you. ");
	        System.out.println("");
	        System.out.println("Curious you ask him.. ");
	        String text4 = "\"What prophecy?\" ";

	        for (int i = 0; i < text4.length(); i++) 
	        {
	            System.out.print(text4.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("He paused for a moment before replying. ");
	        String text5 = "Natlan: \"Nothing important, just that you get those super cool powers!\" ";

	        for (int i = 0; i < text5.length(); i++) 
	        {
	            System.out.print(text5.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        
	        System.out.println("");
	        System.out.println("");
	        System.out.println("You shrug it off as your stomach growls loudly. ");
	        String text6 = "Natlan: \"Perfect timing, I'm hungry too!! \" ";

	        for (int i = 0; i < text6.length(); i++) 
	        {
	            System.out.print(text6.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("He takes your hand dragging you along the path until reaching a hut, a delicous smell of chicken alfredo.");
	        System.out.println("You both enter the hut, it full with people eating and drinking as you both find a table to order.");
	        System.out.println("");
	        String text7 = "Natlan: \"I'm a regular here so they should already be making our food... But tell me how does it feel to have that elemntal power coursing through you...\" ";

	        for (int i = 0; i < text7.length(); i++) 
	        {
	            System.out.print(text7.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(120);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("You think for a moment...");
	        System.out.println("");
	        String text8 = "You: \"Normal I guess...but I could barely control it when I was helping you...\" ";

	        for (int i = 0; i < text8.length(); i++) 
	        {
	            System.out.print(text8.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("He smirked.");
	        String text9 = "Natlan: \"That I can help with...But after we eat!!\" ";

	        for (int i = 0; i < text9.length(); i++) 
	        {
	            System.out.print(text9.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(200);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("The food arrived and it looked and smelled as appatizing as ever, both of you stuffing your faces. ");
	        System.out.println("");
	        System.out.println("A little while later you both finish, however your food didn't seem to fill you...");
	        System.out.println("You both walk out of the hut stretching for a bit, the loud conversations of the other costumers still heard from the outside");
	        System.out.println("");
	        String text10 = "Natlan: \"Wasn't that good!! They make the best food around here!\" ";

	        for (int i = 0; i < text10.length(); i++) 
	        {
	            System.out.print(text10.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(250);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("You nodded, but right then it went silent. The conversations not heard anymore");
	        System.out.println("Turning around... the hut was...gone...");
	        System.out.println("");
	        System.out.println("Before you could turn back to say you, the handle of a sword hits you on your head, you knocking out.");
	        String text11 = "Natlan: \" Stupid human...\" ";

	        for (int i = 0; i < text11.length(); i++) 
	        {
	            System.out.print(text11.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(270);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("After a while you regain conscious, as you were sitting...Natlan standing infront of you");
	        String text12 = "Natlan: \"Look who's awake!! Welcome back human. Wasn't what you expected was it?\" ";

	        for (int i = 0; i < text12.length(); i++) 
	        {
	            System.out.print(text12.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(250);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        System.out.println("");
	        System.out.println("");
	        System.out.println("The ropes that were binding you on the chair vanished as you stood up going to say something.");
	        System.out.println("But as you were about to say something...");
	   
	        
	        
	      
			
			
		}
		
		/**
		 * This would be the shorter option, but it would lead the character to not liking you
		 */
		if (goodEvil.equals("Ignore") || goodEvil.equals("ignore"))
		{
			System.out.println("");
			System.out.println("You have chosen to ignore the users, they see you walking away...but that could mean nothing :) ");
			System.out.println("You are now walking down a long a twisting road where screeches are heard all around you.");
			System.out.println("");
			System.out.print("It seemed to be as if someone is following you... do you want to turn around and look or keep walking? (Turn or Walk): ");
			
			String turnEvents = new String (myReader.next());
			
			if (turnEvents.equals("Walk") || turnEvents.equals("walk"))
			{
				System.out.println("");
				System.out.print("You choose to keep walking but stop at a dead end... Forced to turn around");
				System.out.println("");
				
				String texty = "???: \"About time you turned around...\" ";

		        for (int i = 0; i < texty.length(); i++) 
		        {
		            System.out.print(texty.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println("");
		        System.out.println("");
		        System.out.println("He smirked, just before knocking you out with the handle of his sword.");
		        
		        String texty1 = "???: \"Next time don't leave someone for dead...human.\" ";

		        for (int i = 0; i < texty1.length(); i++) 
		        {
		            System.out.print(texty1.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println("");
		        System.out.println("");
		        System.out.println("After a while you regain conscious, as you were sitting...the user standing infront of you");
		        String texty12 = "???: \"Look who's awake!! Welcome back human. Wasn't what you expected was it?\" ";

		        for (int i = 0; i < texty12.length(); i++) 
		        {
		            System.out.print(texty12.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(250);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println("");
		        System.out.println("");
		        System.out.println("The ropes that were binding you on the chair vanished as you stood up going to say something.");
		        System.out.println("But as you were about to say something...");		
		        String texty13 = "It was the user...You left to die...";

		        for (int i = 0; i < texty13.length(); i++) 
		        {
		            System.out.print(texty13.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(250);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		    
			}

			//turning
			if (turnEvents.equals("Turn") || turnEvents.equals("turn"))
			{
				System.out.println("");
				   
				//this is for the type write effect
				String text = "???: \"About time you turned around...\" ";

			        for (int i = 0; i < text.length(); i++) 
			        {
			            System.out.print(text.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			    System.out.println("");
				System.out.println("You see one of the magic users from earlier, the one you chose to ignore...");
				System.out.println("");
				System.out.println("What's your reply?");
				System.out.println("[1] What do you want? ");
				System.out.println("[2] Do I know you? ");
				System.out.println("[3] You look like you need help... ");
				
				String talkDial = new String (myReader.next());

				
				if (talkDial.equals("1"))
				{
					String dial1 = "You: \" What do you want?\" ";

			        for (int i = 0; i < dial1.length(); i++) 
			        {
			            System.out.print(dial1.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        System.out.println("");
			        System.out.println("");
			        
			        String dial2 = "???: \"Nothing special, just wanted to see what this SELFISH being was doing here in Alfea...\" ";

			        for (int i = 0; i < dial2.length(); i++) 
			        {
			            System.out.print(dial2.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        System.out.println("The magic user steps closer to you, going to grip his sword.");
			        System.out.println("");
			        System.out.println("You step back a bit uncertain of what they might do.");
			        System.out.println("");
			        
			        String dial3 = "???: \"Don't leave me again.. that would be rude.\" ";

			        for (int i = 0; i < dial3.length(); i++) 
			        {
			            System.out.print(dial3.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        System.out.println("");
			        System.out.println("");
			        System.out.print("Do you want to say something...or run away? (Talk or Run): ");
			        String talkDial2 = new String (myReader.next());
			        
			        if (talkDial2.equals("Talk") || talkDial2.equals("talk"))
			        {
			        	System.out.println("");
			        	System.out.println("What should you say?:");
			        	System.out.println("[1] Get away from me!!");
			        	System.out.println("[2] Why are you doing this...");
			        	System.out.println("[3] Don't make me hurt you...");
			        	
			        	String whatDo = new String (myReader.next());
			        	if (whatDo.equals("1"))
			        	{
			        		 String dial4 = "You: \"Get away from me!!\" ";

						        for (int i = 0; i < dial4.length(); i++) 
						        {
						            System.out.print(dial4.charAt(i));
						            try {
										TimeUnit.MILLISECONDS.sleep(150);
									} catch (InterruptedException e) {
										
										e.printStackTrace();
									}
						        }
						        System.out.println("");
						        System.out.println("");
						        System.out.println("He laughed.");
						        
						        String dial9 = "???: \"And leave you like you left me?... I think not.\" ";

						        for (int i = 0; i < dial9.length(); i++) 
						        {
						            System.out.print(dial9.charAt(i));
						            try {
										TimeUnit.MILLISECONDS.sleep(150);
									} catch (InterruptedException e) {
										
										e.printStackTrace();
									}
						        }
						        System.out.println("");
						        System.out.println("");
			        	}
			        	if (whatDo.equals("2"))
			        	{
			        		String dial5 = "You: \"Why are you doing this...\" ";

					        for (int i = 0; i < dial5.length(); i++) 
					        {
					            System.out.print(dial5.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					       
					        String dial8 = "???: \"Because you left me...TO DIE.\" ";

					        for (int i = 0; i < dial8.length(); i++) 
					        {
					            System.out.print(dial8.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					        System.out.println("");
					        System.out.println("");
					        
					        
					        
					        System.out.println("");
			        	}
			        	if (whatDo.equals("3"))
			        	{
			        		String dial6 = "You: \"Don't make me hurt you...\" ";

					        for (int i = 0; i < dial6.length(); i++) 
					        {
					            System.out.print(dial6.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					        System.out.println("You were bluffing...you didn't have that knowledgable of a skillset to take him down.");
					        System.out.println("");
					        System.out.println("He laughed.");
					        
					        String dial7 = "???: \"Do you take me for a novice?\" ";

					        for (int i = 0; i < dial7.length(); i++) 
					        {
					            System.out.print(dial7.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					        System.out.println("");
					        System.out.println("");
					        
					        
			        	}
			        	
			        }
			        
			        if (talkDial2.equals("Run") || talkDial2.equals("run"))
			        {
			        	System.out.print("You have chosen to run from the magic user, however there was a dead end and you had no choice but to face him.");
			        	 System.out.println("");
			        	 
			        	String dial7 = "???: \"Now now.... You were going to leave me for a second time?\" ";

				        for (int i = 0; i < dial7.length(); i++) 
				        {
				            System.out.print(dial7.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				        System.out.println("");
				        
			        }
			        
			      
			        
				}
				
			}
			
		}
		
		return "";
	}
	
	/**
	 * The point of the story that shows all the paths coming together whether you chose to walk away or help them, you will 
	 * end up here. 
	 * @return
	 */
	public static String pathCollide()
	{
		System.out.println("");
		System.out.println("He fully gripped his sword pointing it towards you, it emitting in a dark aura.");
		System.out.println("");
		String end1 = "You: \"Who are you...\" ";

        for (int i = 0; i < end1.length(); i++) 
        {
            System.out.print(end1.charAt(i));
            try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("");
        System.out.println("");
        String end2 = "Natlan: \"I'm Natlan! The absorber... And I have been looking for you FOREVER...\" ";

        for (int i = 0; i < end2.length(); i++) 
        {
            System.out.print(end2.charAt(i));
            try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("");
        String end3 = "Natlan: \"Who would have thought that I would run into you, and on a day where I need some new and FRESH power...\" ";

        for (int i = 0; i < end3.length(); i++) 
        {
            System.out.print(end3.charAt(i));
            try {
				TimeUnit.MILLISECONDS.sleep(150);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
        }
        System.out.println("");
        System.out.println("");
        System.out.println("You were terrified...What did he mean...");
        
        System.out.println("You choose to speak up...the entipation couldn't hold anylonger..What should you say?: ");
        System.out.println("[1] Why are you doing this? ");
		System.out.println("[2] You have enough power do you not? ");
		System.out.println("[3] Just try absorbing my power. ");
		
		String theEnd = new String (myReader.next());
		
		//These are the different endings that you can go through
		
		if (theEnd.equals("1"))
		{
			 String end4 = "You: \"Why are you doing this?\" ";

		        for (int i = 0; i < end4.length(); i++) 
		        {
		            System.out.print(end4.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        
		        System.out.print("Natlan laughs, pushing his sword closer to your throat. ");
		        String end8 = " \"Because I want to.\" ";

		        for (int i = 0; i < end8.length(); i++) 
		        {
		            System.out.println(end8.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        
		        System.out.println("");
		        System.out.print("In that moment you are faced with the choice, talk it out or fight back (Talk or Fight?): ");
		        
		    	String ending1 = new String (myReader.next());
		    	
		    	if(ending1.equals("Talk") || ending1.equals("talk"))
		    	{
		    		System.out.println("");
		    		System.out.println("What do you want to say?:");
		    		System.out.println("[1] Please rethink this.");
		        	System.out.println("[2] I'll give you the power.");
		        	
		        	String endingAlt = new String (myReader.next());
		        	
		        	if(endingAlt.equals("1"))
		        	{
		        		 String alt1 = "You: \"Please rethink this.\" ";

		 		        for (int i = 0; i < alt1.length(); i++) 
		 		        {
		 		            System.out.println(alt1.charAt(i));
		 		            try {
		 						TimeUnit.MILLISECONDS.sleep(150);
		 					} catch (InterruptedException e) {
		 						
		 						e.printStackTrace();
		 					}
		 		        }
		        	}
		        	
		        	if(endingAlt.equals("2"))
		        	{
		        		String alt1 = "You: \"I'll give you my power.\" ";

		 		        for (int i = 0; i < alt1.length(); i++) 
		 		        {
		 		            System.out.println(alt1.charAt(i));
		 		            try {
		 						TimeUnit.MILLISECONDS.sleep(150);
		 					} catch (InterruptedException e) {
		 						
		 						e.printStackTrace();
		 					}
		 		        }
		 		        
		 		        System.out.println("");
		 		        System.out.println("Shocked, Natlan lowers his weapon, laughing.");
		 		        
		 		       String alt2 = "Natlan: \"Wow!... Didn't think it would be this easy...\" ";

		 		        for (int i = 0; i < alt2.length(); i++) 
		 		        {
		 		            System.out.println(alt2.charAt(i));
		 		            try {
		 						TimeUnit.MILLISECONDS.sleep(150);
		 					} catch (InterruptedException e) {
		 						
		 						e.printStackTrace();
		 					}
		 		        }
		 		        
		 		        System.out.println("You follow his sword as he turns around to put it down...");
		 		        System.out.println("Concetrating for a second, you form a (your element) ball, blasting a stream of it straight into Natlan's back. ");
		 		        System.out.println("");
		 		        System.out.println("He was hit... that blast being more powerful then before");
		 		        
		 		       
		 		        
		 		        
		 		        
		        	}
		    	}
		    	
		    	if(ending1.equals("Fight") || ending1.equals("Fight"))
		    	{
		    		
		    	}
		    
		}
		
		if (theEnd.equals("2"))
		{
			 String end5 = "You: \"You have enough power don't you?\" ";

		        for (int i = 0; i < end5.length(); i++) 
		        {
		            System.out.print(end5.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println(" Saying this, he laughs, a maniac laugh. ");
		        System.out.println("");
		        String end7 = "Natlan: \"You are right... but whats the shame in having more, yours is special, new, powerful, and being gifted to a human like you would be a waste of \rthat precious prophecy...\" ";

		        for (int i = 0; i < end7.length(); i++) 
		        {
		            System.out.println(end7.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        
		        String end9 = "You: \"What prophecy are you even talking about?!\" ";

		        for (int i = 0; i < end9.length(); i++) 
		        {
		            System.out.println(end9.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        String end10 = "Natlan: \"That power inside you, the one that can only be gifted to a human.. is the power to save this place and \r I can't let that happen. \" ";

		        for (int i = 0; i < end10.length(); i++) 
		        {
		            System.out.println(end10.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println("");
		        System.out.println("You were shocked, how did that random book grant you such great responsibilty? Why you?");
		        System.out.println("Now with this information you knew that you couldn't let him take it. You stand your ground.");
		        System.out.println("");
		        System.out.print("Natlan laughs. ");
		        String end11 = "Natlan: \"Oh so you want to fight this out...what fun.\" ";

		        for (int i = 0; i < end11.length(); i++) 
		        {
		            System.out.println(end11.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println("");
		        System.out.println("You follow his sword as he turns around to put it down...");
 		        System.out.println("Concetrating for a second, you form a (your element) ball, blasting a stream of it straight into Natlan's back. ");
 		        System.out.println("");
 		        System.out.println("He was hit... that blast being more powerful then before");
		       
		        
		}
		
		 if (theEnd.equals("3"))
		{
			 String end6 = "You: \"Just try absorbing my power.\" ";

		        for (int i = 0; i < end6.length(); i++) 
		        {
		            System.out.print(end6.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(150);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		}
		 
		 System.out.println("Saying this, your voice had a tremble, but you stood firm in your stance. ");
		 System.out.println("");
		 System.out.print("Natlan laughed once again.");
		 String end6 = "\"Well if you say so...\" ";

	        for (int i = 0; i < end6.length(); i++) 
	        {
	            System.out.println(end6.charAt(i));
	            try {
					TimeUnit.MILLISECONDS.sleep(150);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	        }
	        
	        System.out.println("");
	        System.out.println("He lowers his sword as he turns around to put it down...");
		    System.out.println("Concetrating for a second, you form a (your element) ball, blasting a stream of it straight into Natlan's back. ");
		    System.out.println("");
		    System.out.println("He was hit... that blast being more powerful then before");
	        
	        
	        return "";
		
	}
	
	/**
	 * The endings you can have, if you choose 1 then you will loose because aggressive vs aggressive never works well, however if 
	 * you chose 2 then you can counter Natlan and then you will survive!
	 * @return
	 */
	public static String pathEnd()
	{
		System.out.println("You are going to begin a fight, what path would you choose?: ");
		System.out.println("Skillset pick:");
		System.out.println("[1] Agressive");
    	System.out.println("[2] Defensive.");
		
		String powerSet = new String (myReader.next());
		
		if (powerSet.equals("1"))
		{
			System.out.println("");
			System.out.print("What skill would you want to use (Whip, Blast): ");
		//These are where it starts my endings (Ending 1 is you die)
			String powerChoices = new String (myReader.next());
			
			if (powerChoices.equals("Whip") || powerChoices.equals("whip"))
			{
				System.out.println("");
				System.out.print("Power courses out from hand summoning (your element) into a whip form, using the whip you thrust it towards Natlan, grabbing his feet, pulling the whip you make him loose his balance.");
				 String ending1 = "\"Natlan: AH!!\" ";

			        for (int i = 0; i < ending1.length(); i++) 
			        {
			            System.out.print(ending1.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        
			        System.out.println("His head hits the ground causing some bleeding, Holding it, his body phases into multiple people.");
			        System.out.println("");
			        System.out.println("You're confused, which one is him, You hold the whip firmly.");
			        
			        String ending2 = "\"Natlan: Let's play a game... guess which one is real and which is fake.\" ";

			        for (int i = 0; i < ending2.length(); i++) 
			        {
			            System.out.print(ending2.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        System.out.println("He steps foward once, you ready to strike one of them, you have 5 choices and two tries.");
			        System.out.println("What do you choose?");
			        System.out.println("[1] Front");
			        System.out.println("[2] Back");
			        
			        String deathEnding = new String (myReader.next());
			        
			        if (deathEnding.equals("Front") || deathEnding.equals("front"))
			        {
			        	System.out.println("You hold the elemental whip striking the front clone.");
			        	String ending3 = "It was fake. One more try. ";

				        for (int i = 0; i < ending3.length(); i++) 
				        {
				            System.out.println(ending3.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				    
			        }
			        
			        
			        
			        if (deathEnding.equals("Back") || deathEnding.equals("back"))
			        {
			        	System.out.print("You hold the elemental whip striking the back clone.");
			        	String ending4 = "It was fake. One more try. ";

				        for (int i = 0; i < ending4.length(); i++) 
				        {
				            System.out.println(ending4.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				        
				        System.out.println("");
				        System.out.println("You panick, not knowing which to pick, one more choice.");
				        System.out.println("What do you chose?");
				        System.out.println("[1] Left");
				        System.out.println("[2] Right");
				        
				        String deathEnding1 = new String (myReader.next());
				        
				        if (deathEnding1.equals("Left") || deathEnding1.equals("left"))
				        {
				        	System.out.println("You hold the elemental whip striking the left clone.");
				        	String ending5 = "It was fake... ";

					        for (int i = 0; i < ending5.length(); i++) 
					        {
					            System.out.println(ending5.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					    
				        }
				        
				        
				        
				        if (deathEnding1.equals("Right") || deathEnding1.equals("right"))
				        {
				        	System.out.print("You hold the elemental whip striking the right clone.");
				        	String ending6 = "It was fake... ";

					        for (int i = 0; i < ending6.length(); i++) 
					        {
					            System.out.println(ending6.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					        
					     
			        }
				        
				        System.out.println("Natlan and the clones laugh, stepping closer and closer.");
					    System.out.println("In a panick you swing the whip around in a cirle, hoping to atleast hit him once.");
					    System.out.println("");
					    System.out.println("Suddenly the whip stops abrubtly, it was being hold by the real Natlan");
					    System.out.println("He quickly tugged the whip sending yoruself flying towards him.");
					    
					    String ending6 = "Natlan:\"Finally all mine...\"";

				        for (int i = 0; i < ending6.length(); i++) 
				        {
				            System.out.print(ending6.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				        System.out.println(" As you fly towards him he sticks his hands out, the force meeting his hand sends your heart out of ur chest into his hands.");
				        System.out.println("");
				        String ending7 = "You died... Sorry maybe next time don't be so agressive! :( ";

				        for (int i = 0; i < ending7.length(); i++) 
				        {
				            System.out.print(ending7.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(170);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
					    
			        
			        
			}
			
			if (powerChoices.equals("Blast") || powerChoices.equals("blast"))
			{
				System.out.println("");
				System.out.print("As you focus your energy to your hands you face it towards Natlan, a stream of (your element) rush towards Natlan/");
				 String ending8 = "\"Natlan: AH!!\" ";

			        for (int i = 0; i < ending8.length(); i++) 
			        {
			            System.out.print(ending8.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        
			        System.out.println("His head hits a wall causing some bleeding, Holding it, his body phases into multiple people surronding you.");
			        System.out.println("");
			        System.out.println("You're confused, which one is him, You keep your hands charged with (your element)");
			        
			        String ending9 = "\"Natlan: Let's play a game... guess which one is real and which is fake.\" ";

			        for (int i = 0; i < ending9.length(); i++) 
			        {
			            System.out.print(ending9.charAt(i));
			            try {
							TimeUnit.MILLISECONDS.sleep(150);
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
			        }
			        System.out.println("He steps foward once, you ready to strike one of them, you have 5 choices and two tries.");
			        System.out.println("What do you choose?");
			        System.out.println("[1] Front");
			        System.out.println("[2] Back");
			        
			        String deathAltEnding = new String (myReader.next());
			        
			        if (deathAltEnding.equals("Front") || deathAltEnding.equals("front"))
			        {
			        	System.out.println("You blast the front clone.");
			        	String ending10 = "It was fake. One more try. ";

				        for (int i = 0; i < ending10.length(); i++) 
				        {
				            System.out.println(ending10.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				    
			        }
			        
			        
			        
			        if (deathAltEnding.equals("Back") || deathAltEnding.equals("back"))
			        {
			        	System.out.print("You blast the back clone.");
			        	String ending11 = "It was fake. One more try. ";

				        for (int i = 0; i < ending11.length(); i++) 
				        {
				            System.out.println(ending11.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				        
				        System.out.println("");
				        System.out.println("You panick, not knowing which to pick, one more choice.");
				        System.out.println("What do you chose?");
				        System.out.println("[1] Left");
				        System.out.println("[2] Right");
				        
				        String deathAltEnding1 = new String (myReader.next());
				        
				        if (deathAltEnding1.equals("Left") || deathAltEnding1.equals("left"))
				        {
				        	System.out.println("You blast the left clone.");
				        	String ending12 = "It was fake... ";

					        for (int i = 0; i < ending12.length(); i++) 
					        {
					            System.out.println(ending12.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        }
					    
				        }
				        
				        
				        
				        if (deathAltEnding1.equals("Right") || deathAltEnding1.equals("right"))
				        {
				        	System.out.print("You blast the right clone.");
				        	String ending13 = "It was fake... ";

					        for (int i = 0; i < ending13.length(); i++) 
					        {
					            System.out.println(ending13.charAt(i));
					            try {
									TimeUnit.MILLISECONDS.sleep(150);
								} catch (InterruptedException e) {
									
									e.printStackTrace();
								}
					        
					        }
					        
				        }
				        
				        System.out.println("Natlan and the clones laugh, stepping closer and closer.");
					    System.out.println("In a panick you begin to blast the remaining clones.");
					    System.out.println("");
					    System.out.println("Suddenly, one of the blasts get absorbed, then he phases, appearing infront of you");
					   
					    
					    String ending14 = "Natlan:\"Finally all mine...\"";

				        for (int i = 0; i < ending14.length(); i++) 
				        {
				            System.out.println(ending14.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(150);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
				        System.out.println("He sticks his hand straight through your chest, ur heart in his hand... ");
				        System.out.println("");
				        String ending15 = "You died... Sorry maybe next time don't be so agressive! :( ";

				        for (int i = 0; i < ending15.length(); i++) 
				        {
				            System.out.print(ending15.charAt(i));
				            try {
								TimeUnit.MILLISECONDS.sleep(170);
							} catch (InterruptedException e) {
								
								e.printStackTrace();
							}
				        }
					    
			        
			        }
			        
		}
		
		
		//Ending two you survive (So be defensive)
		if (powerSet.equals("2"))
		{
			System.out.println("");
			System.out.print("What skill would you want to use (Wall, Armour): ");
			
			String powerChoices2 = new String (myReader.next());
			
			if (powerChoices2.equals("Wall") || powerChoices2.equals("wall"))
			{
				System.out.println("");
				System.out.println("Natlan rushes towards you, you summon a wall of (your element) him running right into it.");
				String ending16 = "Natlan: \"Very clever...\" ";

		        for (int i = 0; i < ending16.length(); i++) 
		        {
		            System.out.println(ending16.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(170);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        System.out.println("");
		        System.out.println("You smirk pushing the wall back all the way into the wall. Natlan tries to push it back, but he couldn't stable his stance.");
		        System.out.println("Unfortunaly he was crushed, blood splattering against the two walls.");
		        System.out.println("");
		        String ending18 = "You have won the game and your power is safe!! Congrats :) ";

		        for (int i = 0; i < ending18.length(); i++) 
		        {
		            System.out.println(ending18.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(170);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        
				
			}
			
			if (powerChoices2.equals("Armour") || powerChoices2.equals("armour"))
			{
				System.out.println("");
				System.out.println("Natlan rushes towards you, quickly you start to form your elemental armour. He strikes it his body sent into a slight shock, quickly \r snapping out of it.");
				String ending17 = "Natlan: \"Very clever...\" ";

		        for (int i = 0; i < ending17.length(); i++) 
		        {
		            System.out.println(ending17.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(170);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        
		        /**
		         * THE ENDING !!!!
		         */
		        System.out.println("");
		        System.out.println("With that moment of shock his body was weak, you punch his gut sending him backwards a bit.");
		        System.out.println("He was phased, as you send pieces of the armour like darts over to him, sending him flying against the wall, pinning him");
		        System.out.println("");
		        System.out.println("With the remainign pieces on your armour you form a elemental ball, blasting it towards his head");
		        System.out.println("Wobbly, he was hit, his head splattering across the wall... he died sadly.");
		        String ending19 = "You have won the game and your power is safe!! Congrats :) ";

		        for (int i = 0; i < ending19.length(); i++) 
		        {
		            System.out.println(ending19.charAt(i));
		            try {
						TimeUnit.MILLISECONDS.sleep(170);
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
		        }
		        int number = 1;

		        while (number <= 8) {
		            System.out.println(number);
		            number++;
		        }
		        
		        System.out.print("You ate that up!");
			}
			
			return "";
		}
		
		
		
		
		return "";
		
	}

	}
		return "";
}
}

