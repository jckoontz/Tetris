import java.awt.*; 
import java.util.*;

public class Shape extends ArrayList<Square> {
  //int x, y, r; 
  Color color; 
  public Shape() {
   // this.r = (int) (30 + (Math.random() * 60));
    //this.x = x; 
   // this.y = y; 
    this.color = new Color( (float) (0.5 + Math.random() / 2), 
                            (float) (0.5 + Math.random() / 2), 
                            (float) (0.5 + Math.random() / 2) ); 
  }
  
  
  public void fall() {
	  for (Square square : this) {
		  square.fall(); }
  }
 
  public String toString() {
	  String result = "";
	  for (Square square : this) {
		  result += (square.toString() + " ");  
  }
	  return result; 
  }

  
  public void draw(Graphics g) {
	  for (Square square : this) {
		  square.draw(g);
	  }
  }
  
  public void left() { 
	  for (Square square : this) {
		  square.left();
	  }
  } 
  public void right() { 
	  for (Square square : this) {
		  square.right();
	  }
  } 
  
  public boolean touches(Ground g) {
    for (Shape shape : g) {
      if (shape.overlaps(this)) 
        return true;
      }
    for (Square square : this) {
  	  System.out.print(square.y);
  	  if (square.hitsbottom()) {
  		  return true;
  	  }
    }
    return false; 
  }
  
  public boolean overlaps(Shape other) {
    for (Square square : this) {
    	for (Square square2 : other) {
    		if (square.overlaps(square2)) {
    			return true;
    		}
    	}
    }
    return false;
  }
}