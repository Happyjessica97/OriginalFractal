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

public class OriginalFractal extends PApplet {

public int smallCircle =100;
private int someNumber = 20; 
//private double newW = 300; 
//private double newH = 300;
//Box someBox; 
public void setup(){
  size(700,700);
background(0);
//someBox = new Box();
}
public void draw(){
    background(0);
int randNumX =(int)(Math.random()*700);
int randNumY = (int)(Math.random()*700);
    drawCircle(randNumX,randNumY, 10,.30f);

 }
	

public void mousePressed(){
//someBox.show();
 

}
public void drawCircle(int myX, int myY, int something, double somefraction){

   something =  something + 25;
   int newX = myX + something;
   int newY = myY + something;
 double newW = 300;
 double newH = 300;
   newW = newW * somefraction; 
   newH = newH *somefraction; 
  noStroke();
   //fill(178, 102, 255);
     //fill(255, 230, 149);
     fill(255,255,255);
 ellipse(myX, newY, (float)newW, (float)newH);
 ellipse(myX+60, newY, (float)newW, (float)newH);
  fill(255, 0, 0); 
  ellipse(myX+30,newY-30,(float)newW+30,(float)newH+30);

   /*ellipse(myX+60, newY, (float)newW, (float)newH);
   ellipse(myX, newY, (float)newW, (float)newH);
   ellipse(myX+30, newY+10, (float)newW, (float)newH);
   ellipse(myX+30, newY-30, (float)newW+30, (float)newH+30); */
//when is the stop point? something = 90 is smaller than the small circle 
	if(something < smallCircle){
		drawCircle(myX,newY,something+30,somefraction);
	}


}
/*class Box{
  public Box(){

  }public void show(){
    rect(30,30,30,30);
  }
}*/
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
