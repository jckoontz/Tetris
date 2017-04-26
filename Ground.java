import java.util.*; 
import java.awt.*;

public class Ground extends ArrayList<Shape> {
  public void draw(Graphics g) {
    for (Shape s : this)
      s.draw(g); 
  }
}