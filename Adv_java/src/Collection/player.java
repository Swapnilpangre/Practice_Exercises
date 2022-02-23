package Collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//Exercise 4 : Create the Player class having fields:  name (String) and score (integer).Given an 
//array of n Player objects, write a comparator that sorts them in order of decreasing score. If one or 
//more players have the same score, sort those players alphabetically by name. To do this, you must create a 
//Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method  
//implementing the Comparator.compare(T o1, T o2) method.
//
//Input format :The first line contains an integer,n , denoting the number of players. Each of the n subsequent 
//lines contains a player's name and score respectively.

//Input eg:
//
//	 5
//
//	amy 100
//
//	david 100
//
//	heraldo 50
//
//	aakansha 75
//
//	aleksa 150
//
//	output:
//
//	aleksa 150
//
//	amy 100
//
//	david 100
//
//	aakansha 75
//
//	heraldo 50
class Checker implements Comparator<Player> {

	  @Override
	  public int compare(Player a1, Player a2) {
	    if (a1.score < a2.score) {
	      return 1;
	    } else if (a1.score > a2.score) {
	      return -1;
	    } else {
	      return a1.name.compareTo(a2.name);
	    }
	  }
	}

	class Player {
	  String name;
	  int score;

	  Player(String name, int score){
	    this.name = name;
	    this.score = score;
	  }
	}

	class player {

	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("enter no of player");
	    int n = scan.nextInt();

	    Player[] player = new Player[n];
	    Checker checker = new Checker();

	    System.out.println("enter name and after score ");
	    for(int i = 0; i < n; i++){
	      player[i] = new Player(scan.next(), scan.nextInt());
	    }
	    scan.close();

	    Arrays.sort(player, checker);
	    for(int i = 0; i < player.length; i++){
	      System.out.printf("%s %s\n", player[i].name, player[i].score);
	    }
	  }
	}