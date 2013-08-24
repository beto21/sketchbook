import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class splater extends PApplet {

public void setup() {
  size(500, 500);
  noStroke();
  background(255);
  ellipseMode(CENTER);
}
public void draw() {
  fill(0, 0, random(50, 255), random(100));
  float size = random(30);
  float sIx = randomGaussian()*15;
  float sIy = randomGaussian()*15;
  if (mousePressed) {
    ellipse(mouseX+sIx, mouseY+sIy, size, size);
  }
}


  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "splater" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
