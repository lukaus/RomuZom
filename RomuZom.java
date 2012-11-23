// RomuZom
// a Zombie Romulan survival game
// by Luke Stanley

import java.util.*;

public class RomuZom
{
	static boolean day = true;
	static Scanner in = new Scanner(System.in);
	static String cmd = "";
	static Player player;
	
	public static void main(String args[])
	{
		System.out.println();
		System.out.println(ANSI.BLINK+ANSI.RED+ANSI.HIGH_INTENSITY +ANSI.SKULL+ " WELCOME TO ROMUZOM " + ANSI.SKULL);
		System.out.println(ANSI.NORMAL+ANSI.MAGENTA +"A text-based zombie survival game");
		System.out.println(ANSI.CYAN + "By Luke Stanley");
		System.out.println();
		mainMenu();
	}
	public static void mainMenu()
	{
		String choice = "";
		System.out.print(ANSI.HIGH_INTENSITY);
		System.out.println(ANSI.GREEN + "1 - Play Game");
		System.out.println(ANSI.GREEN + "2 - Credits");
		System.out.println(ANSI.GREEN + "3 - Quit");
		System.out.print("Enter Choice -=>");
		System.out.print(ANSI.NORMAL);
		try
		{
			choice = in.nextLine();
		}
		catch(Exception ex)
		{
			choice = "";
			System.out.println(ANSI.HIGH_INTENSITY+ANSI.RED+"\nInvalid input, please enter 1, 2, or 3.\n");
			mainMenu();
		}
		
		if(choice.equals("1") || choice.equals("2") || choice.equals("3"))
		{
			if(choice.equals("1"))
				newGame();
			if(choice.equals("2"))
				credits(1);
			if(choice.equals("3"))
				System.exit(0);
		}
		else
		{
			System.out.println(ANSI.HIGH_INTENSITY+ANSI.RED+"\nInvalid input, please enter 1, 2, or 3.\n");
			mainMenu();
		}
	}
	
	public static void credits(int type)
	{
		if(type == 1)
		{
			System.out.println();
			System.out.println(ANSI.MAGENTA +ANSI.HIGH_INTENSITY+"-= Credits =-");
			System.out.println();
			System.out.println(ANSI.CYAN + "Programmed by Luke Stanley");
			System.out.println(ANSI.CYAN + "Copyright 2011, Terminus Software");
			System.out.println(ANSI.NORMAL);
			mainMenu();
		}
	}
	
	public static void newGame()
	{
		player = new Player();
		System.out.println();
		System.out.println(ANSI.ITALIC+ANSI.GREEN+"Welcome, "+player.name+"."+ANSI.NORMAL);
		
		Rooms.loc11(true);
	}
	
	public static void map(int loc)
	{
		if(loc==11)
		{
			String time;
			if(day)
				time = ANSI.HIGH_INTENSITY;
			else
				time = ANSI.LOW_INTENSITY;
			System.out.println(time);
			System.out.println(ANSI.WHITE+"  X    X");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "|"+ANSI.KHANDA+"|"+ANSI.WHITE + ANSI.BACKGROUND_GREEN + "AA"+ANSI.NORMAL + time +ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_RED + "GZ" + ANSI.NORMAL + time+ANSI.WHITE);
			System.out.println(ANSI.WHITE +" |  __  |");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ ANSI.RED + "++"+ ANSI.WHITE + "| |"+ANSI.MAGENTA + "SUB");
			System.out.println(ANSI.WHITE +" | |"+ANSI.RED  + "++"+ ANSI.WHITE + "| |"+ ANSI.CYAN + "SGS");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "|  __  |");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_BLUE + "AP" +ANSI.NORMAL + time+ ANSI.WHITE + "| |"+ANSI.GREEN + "FF");
			System.out.println(ANSI.WHITE + "  X    X");
			System.out.println(ANSI.NORMAL);
		}
		if(loc==12)
		{
			String time;
			if(day)
				time = ANSI.HIGH_INTENSITY;
			else
				time = ANSI.LOW_INTENSITY;
			System.out.println(time);
			System.out.println(ANSI.WHITE+"  X    X");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE+"| |"+ANSI.WHITE + ANSI.BACKGROUND_GREEN + "AA"+ANSI.NORMAL + time +ANSI.WHITE + "|"+ANSI.KHANDA+ "|"+ANSI.WHITE + ANSI.BACKGROUND_RED + "GZ" + ANSI.NORMAL + time+ANSI.WHITE);
			System.out.println(ANSI.WHITE +" |  __  |");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ ANSI.RED + "++"+ ANSI.WHITE + "| |"+ANSI.MAGENTA + "SUB");
			System.out.println(ANSI.WHITE +" | |"+ANSI.RED  + "++"+ ANSI.WHITE + "| |"+ ANSI.CYAN + "SGS");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "|  __  |");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_BLUE + "AP" +ANSI.NORMAL + time+ ANSI.WHITE + "| |"+ANSI.GREEN + "FF");
			System.out.println(ANSI.WHITE + "  X    X");
			System.out.println(ANSI.NORMAL);
		}
		
		if(loc==13)
		{
			String time;
			if(day)
				time = ANSI.HIGH_INTENSITY;
			else
				time = ANSI.LOW_INTENSITY;
			System.out.println(time);
			System.out.println(ANSI.WHITE+"  X    X");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_GREEN + "AA"+ANSI.NORMAL + time +ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_RED + "GZ" + ANSI.NORMAL + time+ANSI.WHITE);
			System.out.println(ANSI.WHITE +" |"+ANSI.KHANDA+" __  |");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ ANSI.RED + "++"+ ANSI.WHITE + "| |"+ANSI.MAGENTA + "SUB");
			System.out.println(ANSI.WHITE +" | |"+ANSI.RED  + "++"+ ANSI.WHITE + "| |"+ ANSI.CYAN + "SGS");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "|  __  |");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_BLUE + "AP" +ANSI.NORMAL + time+ ANSI.WHITE + "| |"+ANSI.GREEN + "FF");
			System.out.println(ANSI.WHITE + "  X    X");
			System.out.println(ANSI.NORMAL);
		}
		if(loc==14)
		{
			String time;
			if(day)
				time = ANSI.HIGH_INTENSITY;
			else
				time = ANSI.LOW_INTENSITY;
			System.out.println(time);
			System.out.println(ANSI.WHITE+"  X    X");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_GREEN + "AA"+ANSI.NORMAL + time +ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_RED + "GZ" + ANSI.NORMAL + time+ANSI.WHITE);
			System.out.println(ANSI.WHITE +" |  "+ANSI.KHANDA+"_  |");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ ANSI.RED + "++"+ ANSI.WHITE + "| |"+ANSI.MAGENTA + "SUB");
			System.out.println(ANSI.WHITE +" | |"+ANSI.RED  + "++"+ ANSI.WHITE + "| |"+ ANSI.CYAN + "SGS");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "|  __  |");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_BLUE + "AP" +ANSI.NORMAL + time+ ANSI.WHITE + "| |"+ANSI.GREEN + "FF");
			System.out.println(ANSI.WHITE + "  X    X");
			System.out.println(ANSI.NORMAL);
		}
		if(loc==15)
		{
			String time;
			if(day)
				time = ANSI.HIGH_INTENSITY;
			else
				time = ANSI.LOW_INTENSITY;
			System.out.println(time);
			System.out.println(ANSI.WHITE+"  X    X");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_GREEN + "AA"+ANSI.NORMAL + time +ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_RED + "GZ" + ANSI.NORMAL + time+ANSI.WHITE);
			System.out.println(ANSI.WHITE +" |  _"+ANSI.KHANDA+"  |");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ ANSI.RED + "++"+ ANSI.WHITE + "| |"+ANSI.MAGENTA + "SUB");
			System.out.println(ANSI.WHITE +" | |"+ANSI.RED  + "++"+ ANSI.WHITE + "| |"+ ANSI.CYAN + "SGS");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "|  __  |");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_BLUE + "AP" +ANSI.NORMAL + time+ ANSI.WHITE + "| |"+ANSI.GREEN + "FF");
			System.out.println(ANSI.WHITE + "  X    X");
			System.out.println(ANSI.NORMAL);
		}
		if(loc==16)
		{
			String time;
			if(day)
				time = ANSI.HIGH_INTENSITY;
			else
				time = ANSI.LOW_INTENSITY;
			System.out.println(time);
			System.out.println(ANSI.WHITE+"  X    X");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_GREEN + "AA"+ANSI.NORMAL + time +ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_RED + "GZ" + ANSI.NORMAL + time+ANSI.WHITE);
			System.out.println(ANSI.WHITE +" |  __ "+ANSI.KHANDA+"|");
			System.out.println(ANSI.BLUE +"H"+ANSI.WHITE + "| |"+ ANSI.RED + "++"+ ANSI.WHITE + "| |"+ANSI.MAGENTA + "SUB");
			System.out.println(ANSI.WHITE +" | |"+ANSI.RED  + "++"+ ANSI.WHITE + "| |"+ ANSI.CYAN + "SGS");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "|  __  |");
			System.out.println(ANSI.YELLOW +"G"+ANSI.WHITE + "| |"+ANSI.WHITE + ANSI.BACKGROUND_BLUE + "AP" +ANSI.NORMAL + time+ ANSI.WHITE + "| |"+ANSI.GREEN + "FF");
			System.out.println(ANSI.WHITE + "  X    X");
			System.out.println(ANSI.NORMAL);
		}
	}
	
	public static class Rooms
	{
		
		public static void loc11(boolean firstTime)
		{
			player.stat[0] = 11;
			System.out.println();
			if(firstTime)
			{
				map(player.stat[0]);
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.BLUE+"You are standing in the Street.");
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"To your west is front door of the Manour Lukia, your place of residence. Through \na hedge to your east, you can make out a wall of the Outpost Armoury. The road \ncontinues south of you. The street is blocked by rubble to the north; you can see \nno way to pass that way.");
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the WEST and SOUTH."+ANSI.NORMAL);
				zombiesHere(player.stat[0]);
			}
			
			System.out.print(ANSI.RED+player.name +"> " + player.stat[1]+"hp--"+player.stat[7]+"armour--"+player.stat[2]+"thirst--"+player.stat[3]+"hunger"+"-> "+ANSI.NORMAL);
			cmd = in.nextLine();
			cmd = cmd.toLowerCase();
			if(cmd.equals("look")||cmd.equals("ql")||cmd.equals("l")||cmd.equals("w")||cmd.equals("west")||cmd.equals("s")||cmd.equals("south")||cmd.equals("x")||cmd.equals("exits")||cmd.equals("map"))
			{
				if(cmd.equals("w")||cmd.equals("west"))
					loc24(true);
				if(cmd.equals("s")||cmd.equals("south"))
					loc13(true);
				if(cmd.equals("l")||cmd.equals("look"))
				{
					loc11(true);
				}
				if(cmd.equals("ql"))
				{
					System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"To your west is front door of the Manour Lukia, your place of residence. Through \na hedge to your east, you can make out a wall of the Outpost Armoury. The road \ncontinues south of you. The street is blocked by rubble to the north; you can see \nno way to pass that way.");
					zombiesHere(player.stat[0]);
					loc11(false);
				}
				if(cmd.equals("x")||cmd.equals("exits"))
				{
					System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the WEST and SOUTH."+ANSI.NORMAL);
					loc11(false);
				}
				if(cmd.equals("map"))
				{
					map(player.stat[0]);
					loc11(false);			
				}
			}
			else
			{
				System.out.println("Do what?");
				loc11(false);
			}
			
			
			
		}
		public static void loc12(boolean firstTime)
		{
			player.stat[0] = 12;
			System.out.println();
			if(firstTime)
			{
				map(player.stat[0]);
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.BLUE+"You are standing in the Street.");
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"To your east is the entrance to GameZone, an abandoned video game store. Through \na hedge to your west, you can make out a wall of the Outpost Armoury. The road \ncontinues south of you. The street is blocked by rubble to the north; you can see \nno way to pass that way.");
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the EAST and SOUTH."+ANSI.NORMAL);
				zombiesHere(player.stat[0]);
			}
			
			System.out.print(ANSI.RED+player.name +"> " + player.stat[1]+"hp--"+player.stat[7]+"armour--"+player.stat[2]+"thirst--"+player.stat[3]+"hunger"+"-> "+ANSI.NORMAL);
			cmd = in.nextLine();
			cmd = cmd.toLowerCase();
			if(cmd.equals("look")||cmd.equals("ql")||cmd.equals("l")||cmd.equals("e")||cmd.equals("east")||cmd.equals("s")||cmd.equals("south")||cmd.equals("x")||cmd.equals("exits")||cmd.equals("map"))
			{
				if(cmd.equals("e")||cmd.equals("east"))
					loc86(true);
				if(cmd.equals("s")||cmd.equals("south"))
					loc16(true);
				if(cmd.equals("l")||cmd.equals("look"))
				{
					loc12(true);
				}
				if(cmd.equals("ql"))
				{
					System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"To your east is the entrance to GameZone, an abandoned video game store. Through \na hedge to your west, you can make out a wall of the Outpost Armoury. The road \ncontinues south of you. The street is blocked by rubble to the north; you can see \nno way to pass that way.");
					zombiesHere(player.stat[0]);
					loc12(false);
				}
				if(cmd.equals("x")||cmd.equals("exits"))
				{
					System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the EAST and SOUTH."+ANSI.NORMAL);
					loc12(false);
				}
				if(cmd.equals("map"))
				{
					map(player.stat[0]);
					loc12(false);			
				}
			}
			else
			{
				System.out.println("Do what?");
				loc12(false);
			}
		}
		public static void loc13(boolean firstTime)
		{
			player.stat[0] = 13;
			System.out.println();
			if(firstTime)
			{
				map(player.stat[0]);
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.BLUE+"You are standing in the Street.");
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"To your north, east, and south, the road continues.");
				zombiesHere(player.stat[0]);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the NORTH, EAST, and SOUTH."+ANSI.NORMAL);
			}
			
			System.out.print(ANSI.RED+player.name +"> " + player.stat[1]+"hp--"+player.stat[7]+"armour--"+player.stat[2]+"thirst--"+player.stat[3]+"hunger"+"-> "+ANSI.NORMAL);
			cmd = in.nextLine();
			cmd = cmd.toLowerCase();
			if(cmd.equals("look")||cmd.equals("ql")||cmd.equals("l")||cmd.equals("e")||cmd.equals("east")||cmd.equals("n")||cmd.equals("north")||cmd.equals("s")||cmd.equals("south")||cmd.equals("x")||cmd.equals("exits")||cmd.equals("map"))
			{
				if(cmd.equals("n")||cmd.equals("north"))
					loc11(true);
				if(cmd.equals("e")||cmd.equals("east"))
					loc14(true);
				if(cmd.equals("s")||cmd.equals("south"))
					loc17(true);
				if(cmd.equals("l")||cmd.equals("look"))
				{
					loc13(true);
				}
				if(cmd.equals("ql"))
				{
					System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"To your north, east, and south, the road continues.");
					zombiesHere(player.stat[0]);
					loc13(false);
				}
				if(cmd.equals("x")||cmd.equals("exits"))
				{
					System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the NORTH, EAST, and SOUTH."+ANSI.NORMAL);
					loc13(false);
				}
				if(cmd.equals("map"))
				{
					map(player.stat[0]);
					loc13(false);			
				}
			}
			else
			{
				System.out.println("Do what?");
				loc13(false);
			}
			
		}
		
		public static void loc14(boolean firstTime)
		{
			player.stat[0] = 14;
			System.out.println();
			if(firstTime)
			{
				map(player.stat[0]);
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.BLUE+"You are standing in the Street.");
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"The road continues to your east and west. The entrance of The Outpost, \nan abandoned armoury, is you your north. To your south \nis a high wall, separating you from the hospital's yard.");
				zombiesHere(player.stat[0]);
				System.out.println();
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the NORTH, EAST, and WEST."+ANSI.NORMAL);
			}
			
			System.out.print(ANSI.RED+player.name +"> " + player.stat[1]+"hp--"+player.stat[7]+"armour--"+player.stat[2]+"thirst--"+player.stat[3]+"hunger"+"-> "+ANSI.NORMAL);
			cmd = in.nextLine();
			cmd = cmd.toLowerCase();
			if(cmd.equals("look")||cmd.equals("ql")||cmd.equals("l")||cmd.equals("e")||cmd.equals("east")||cmd.equals("n")||cmd.equals("north")||cmd.equals("w")||cmd.equals("west")||cmd.equals("x")||cmd.equals("exits")||cmd.equals("map"))
			{
				if(cmd.equals("n")||cmd.equals("north"))
					loc57(true);
				if(cmd.equals("e")||cmd.equals("east"))
					loc15(true);
				if(cmd.equals("w")||cmd.equals("west"))
					loc13(true);
				if(cmd.equals("l")||cmd.equals("look"))
				{
					loc14(true);
				}
				if(cmd.equals("ql"))
				{
					System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"The road continues to your east and west. The entrance of The Outpost, \nan abandoned armoury, is you your north. To your south \nis a high wall, separating you from the hospital's yard.");
					zombiesHere(player.stat[0]);
					loc14(false);
				}
				if(cmd.equals("x")||cmd.equals("exits"))
				{
					System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the NORTH, EAST, and WEST."+ANSI.NORMAL);
					loc14(false);
				}
				if(cmd.equals("map"))
				{
					map(player.stat[0]);
					loc14(false);			
				}
			}
			else
			{
				System.out.println("Do what?");
				loc14(false);
			}
			
		}
		public static void loc15(boolean firstTime)
		{
			player.stat[0] = 15;
			System.out.println();
			if(firstTime)
			{
				map(player.stat[0]);
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.BLUE+"You are standing in the Street.");
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"The road continues to your east and west. To the north, through a hedge, you can \nsee a wall of The Outpost armoury. To your south \nis a high wall, separating you from the hospital's yard.");
				zombiesHere(player.stat[0]);
				System.out.println();
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the EAST, and WEST."+ANSI.NORMAL);
			}
			
			System.out.print(ANSI.RED+player.name +"> " + player.stat[1]+"hp--"+player.stat[7]+"armour--"+player.stat[2]+"thirst--"+player.stat[3]+"hunger"+"-> "+ANSI.NORMAL);
			cmd = in.nextLine();
			cmd = cmd.toLowerCase();
			if(cmd.equals("look")||cmd.equals("ql")||cmd.equals("l")||cmd.equals("e")||cmd.equals("east")||cmd.equals("w")||cmd.equals("west")||cmd.equals("x")||cmd.equals("exits")||cmd.equals("map"))
			{
				if(cmd.equals("e")||cmd.equals("east"))
					loc16(true);
				if(cmd.equals("w")||cmd.equals("west"))
					loc14(true);
				if(cmd.equals("l")||cmd.equals("look"))
				{
					loc15(true);
				}
				if(cmd.equals("ql"))
				{
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"The road continues to your east and west. To the north, through a hedge, you can \nsee a wall of The Outpost armoury. To your south \nis a high wall, separating you from the hospital's yard.");
					zombiesHere(player.stat[0]);
					loc15(false);
				}
				if(cmd.equals("x")||cmd.equals("exits"))
				{
					System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the EAST and WEST."+ANSI.NORMAL);
					loc15(false);
				}
				if(cmd.equals("map"))
				{
					map(player.stat[0]);
					loc15(false);			
				}
			}
			else
			{
				System.out.println("Do what?");
				loc15(false);
			}
		}
	
		public static void loc16(boolean firstTime)
		{
			player.stat[0] = 16;
			System.out.println();
			if(firstTime)
			{
				map(player.stat[0]);
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.BLUE+"You are standing in the Street.");
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"The road continues to your east, north, and west.");
				System.out.println();
				System.out.println();
				zombiesHere(player.stat[0]);
				System.out.println();
				System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the NORTH, SOUTH, and WEST."+ANSI.NORMAL);
			}
			
			System.out.print(ANSI.RED+player.name +"> " + player.stat[1]+"hp--"+player.stat[7]+"armour--"+player.stat[2]+"thirst--"+player.stat[3]+"hunger"+"-> "+ANSI.NORMAL);
			cmd = in.nextLine();
			cmd = cmd.toLowerCase();
			if(cmd.equals("look")||cmd.equals("ql")||cmd.equals("l")||cmd.equals("w")||cmd.equals("west")||cmd.equals("n")||cmd.equals("north")||cmd.equals("s")||cmd.equals("south")||cmd.equals("x")||cmd.equals("exits")||cmd.equals("map"))
			{
				if(cmd.equals("w")||cmd.equals("west"))
					loc15(true);
				if(cmd.equals("s")||cmd.equals("south"))
					loc18(true);
				if(cmd.equals("n")||cmd.equals("north"))
					loc12(true);
				if(cmd.equals("l")||cmd.equals("look"))
				{
					loc16(true);
				}
				if(cmd.equals("ql"))
				{
				System.out.println(ANSI.NORMAL+ANSI.MAGENTA+"The road continues to your east, west, and north.");
					zombiesHere(player.stat[0]);
					loc16(false);
				}
				if(cmd.equals("x")||cmd.equals("exits"))
				{
					System.out.println(ANSI.HIGH_INTENSITY+ANSI.GREEN+"You see exits to the NORTH, SOUTH, and WEST."+ANSI.NORMAL);
					loc16(false);
				}
				if(cmd.equals("map"))
				{
					map(player.stat[0]);
					loc16(false);			
				}
			}
			else
			{
				System.out.println("Do what?");
				loc16(false);
			}
		}
		
		public static void loc17(boolean firstTime)
		{
			
		}
		public static void loc18(boolean firstTime)
		{
			
		}
		public static void loc19(boolean firstTime)
		{
			
		}
		public static void loc110(boolean firstTime)
		{
			
		}
		public static void loc111(boolean firstTime)
		{
			
		}
		public static void loc112(boolean firstTime)
		{
			
		}
		public static void loc113(boolean firstTime)
		{
			
		}
		public static void loc114(boolean firstTime)
		{
			
		}
		public static void loc115(boolean firstTime)
		{
			
		}
		public static void loc116(boolean firstTime)
		{
			
		}
		
		
		
		public static void loc24(boolean firstTime)
		{
			
		}
		
		public static void loc57(boolean firstTime)
		{
			
		}
		public static void loc86(boolean firstTime)
		{
			
		}
		
		
		
		
		
		public static void zombiesHere(int loc)
		{
			
		}
		
	}
	
	public static class Player
	{
		static String name;
		static Scanner input = new Scanner(System.in);
		//location,health,thirst,hunger,strength,speed,intelligence,armour,rescue points
		static int stat[] = new int[9];
	
		//pistol, p ammo, p clips, shotgunn, s ammo, machine gun, mg ammo, mg clips, axe, knife, sword, mace, club, stick, pan, cades, zip lines, food cans, watter bottles, gennys, fuel cans, radios, lamps, FAKs, flares 
		static int inv[] = new int[25];
	
		public Player()
		{
			stat[0] = 11; stat[1] = 100; stat[2] = 100; stat[3] = 100; stat[4] = 10; stat[5] = 10; stat[6] = 10; stat[7] = 0; stat[8] = 0; 
			inv[1] = 0; inv[2] = 0;	inv[3] = 0;inv[4] = 0; inv[5] = 0; inv[6] = 0; inv[7] = 0; inv[8] = 0; inv[9] = 0; inv[10] = 0; inv[11] = 0; inv[12] = 0; inv[13] = 0; inv[14] = 0; inv[15] = 0; inv[16] = 0; inv[17] = 0; inv[18] = 0; inv[19] = 0; inv[20] = 0; inv[21] = 0; inv[22] = 0; inv[23] = 0; inv[24] = 0; 
			System.out.println();
			System.out.print(ANSI.WHITE + "What is your name? ");
			System.out.print(ANSI.NORMAL);
			name = input.nextLine();
		}
	}
}