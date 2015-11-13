// Lab07Bst.java
// The OOP Graphics Program
// This is the student, starting file for Lab 07B.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;


public class Lab07Bst extends Applet
{
    public void paint(Graphics g)
    {
        Towers.tower1(g);
        Supports.leftsupports(g);
        Towers.tower2(g);
        Supports.midsupports(g);
        Supports.rightsupports(g);
        Bridge.bridge(g);
    }
}

   class Towers
{
    public static void tower1(Graphics g)
    {
        Expo.setRandomColor(g);
        Expo.fillRectangle(g,200,660,225,400);
    }
  
    public static void tower2(Graphics g)
    {
        Expo.setRandomColor(g);
        Expo.fillRectangle(g,805,660,830,400);
    }
}

class Supports
{  
    public static void leftsupports(Graphics g)
    {
        for (int count = 105; count <= 175; count+=10)
        {    
            
            Expo.setRandomColor(g);
            Expo.drawLine(g,200,400,count,600);
        }
    }
    
    public static void midsupports(Graphics g)
    {
        //to the left side
        for (int counts = 275; counts <= 515; counts+=10)
        {    
            Expo.setRandomColor(g);
            Expo.drawLine(g,225,400,counts,600);
        }
        //to the right side
        for (int counter = 515; counter <= 755; counter+=10)
        {  
            Expo.setRandomColor(g);
            Expo.drawLine(g,805,400,counter,600);
        }
    }
  
    public static void rightsupports(Graphics g)
    {
        for (int finall = 855; finall <= 925; finall+=10)
        {
            Expo.setRandomColor(g);
            Expo.drawLine(g,830,400,finall,600);
            
            
        }
    }
}    
   
class Bridge
{
 public static void bridge(Graphics g)
    {
        Expo.setRandomColor(g);
        Expo.fillRectangle(g,105,600,925,620); 
    }
}


