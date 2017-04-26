import java.awt.Color;
import java.awt.Graphics; 

public class Square {
  int x, y, s;
  Color color; 
  public Square(int x, int y, Color color) {
    this.x = x; 
    this.y = y;
    this.s = 40;
    this.color = color;
  }
  public void fall() {
    this.y += 5; 
  }
  public String toString() {
    return "(" + this.x + ", " + this.y + ")";  
  }
  public void draw(Graphics g) {
    g.setColor( this.color ); 
    g.fillRect( this.x, this.y, this.s, this.s); 
    g.setColor( Color.BLACK ); 
    g.drawRect( this.x, this.y, this.s, this.s); 
  }
  public void left() { this.x -= this.s; } 
  public void right() { this.x += this.s; } 
  /*public boolean touches(Ground g) {
    for (Shape shape : g) {
      if (this.overlaps(shape)) 
        return true;
    }
    return false; 
  }*/
  
  public boolean overlaps(Square other) {
    int dx = Math.abs(this.x - other.x);
    int dy = Math.abs(this.y - other.y); 
    
    return (dy == this.s && dx == 0); 
    //Horizontal movement might be problem to resolve in Stage 02
  }
  
  public boolean hitsbottom() {
	  if (this.y + this.s >= 400) {
		  return true;
	  }
	  else return false;
  }
}