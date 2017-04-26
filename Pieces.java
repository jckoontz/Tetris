// Pieces.java 

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays; 

class Pieces {
 Square possibilities[][] = new Square[2][4];
 
 public Pieces() {
	 //piece 1
	//this.possibilities[0] = {
	this.possibilities[0][0] = (new Square(200,0, Color.RED));
	this.possibilities[0][1] = (new Square(240,0, Color.RED));
	this.possibilities[0][2] = (new Square(200,40, Color.RED));
	this.possibilities[0][3] = (new Square(240,40, Color.RED));
	
	//piece 2
	//this.possibilities[1] = new Shape();
	this.possibilities[1][0] = (new Square(100,0, Color.BLUE));
	this.possibilities[1][1] = (new Square(140,0, Color.BLUE));
	this.possibilities[1][2] = (new Square(180,0, Color.BLUE));
	this.possibilities[1][3] = (new Square(220,0, Color.BLUE));
	
 }
 

 
 	public Shape getRandom() {
 		int random = (int) Math.floor(Math.random() * 2); //flor = round down
 		Square a[] = this.possibilities[random];
 		Shape s = new Shape();
 		for (Square i : a) {
 			Square sq = new Square(i.x, i.y, i.color);
 			s.add(sq); 
 		}
 		return s;
 	}

}
