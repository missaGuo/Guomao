import java.text.DecimalFormat;
import java.util.Scanner;
     /**
   *A program to define dodecachedron objects.
   *
   *Project 4
   *@author Tao Guo
   *@version 2/8/2017
   */

public class Dodecahedron {
      // instance variables
   private String label = "";
   private String color = "";
   private double edge = 0;

      // constructor
      /**
       * @param labelIn to label.
       * @param colorIn to color.
       * @param edgeIn to edge.
       */
   public Dodecahedron(String labelIn, String colorIn, double edgeIn) {
      label = labelIn;
      color = colorIn;
      edge = edgeIn;
   }
      // methods
      /**
       * @return labelIn to label.
       */
   public String getLabel() 
   {
      return label;  
   }     
      /**
       * @return colorIn to color.
       */
   public String getColor()
   {
      return color;
   }
      /**
       * @return edgeIn to edge.
       */
   public double getEdge()
   {
      return edge;
   }
      /**
       * @param labelIn to replace old label.
       * @return true if applied, otherwise false.
       */
   public boolean setLabel(String labelIn) 
   {
      if (labelIn != null) {
         label = labelIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
      /**
       * @param colorIn to replace old color.
       * @return true if applied, otherwise false.
       */
   public boolean setColor(String colorIn)
   { 
      if (colorIn != null) {
         color = colorIn.trim();
         return true;
      }
      else {
         return false;
      }
   }
      /**
       * @param edgeIn to replace old edge.
       * @return true if applied, otherwise false.
       */
   public boolean setEdge(double edgeIn)
   {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      }  
      else {
         return false;
      }
   }
      /**
       * @return serfaceArea.
       */
   public double surfaceArea() 
   {
      double a = edge;
      double x = 10 * Math.sqrt(5);
      double y = Math.sqrt(25 + x);
      double z = Math.pow(a, 2);
      double sa = 3 * y * z;
   
      return sa;
   }
      /**
       * @return volume.
       */
   public double volume()
   {
      double a = edge;
      double b = 7 * Math.sqrt(5);
      double c = Math.pow(a, 3);
      double d = (15 + b) / 4;
      double v = d * c;
   
      return v;
   }  
      /**
       * @return surfaceToVolumeRatio.
       */
   public double surfaceToVolumeRatio()
   {
      double a = edge;
      double x = 10 * Math.sqrt(5);
      double y = Math.sqrt(25 + x);
      double z = Math.pow(a, 2);
      double sa = 3 * y * z;
      double b = 7 * Math.sqrt(5);
      double c = Math.pow(a, 3);
      double d = (15 + b) / 4;
      double v = d * c;
   
   
      double r = sa / v;
       
      return r;
   }
       /**
        * @return ouput
        */
   public String toString()
   {
      Scanner scan = new Scanner(System.in);
      DecimalFormat dFmt = new DecimalFormat("#,##0.0##");
      String output = "Dodecahedron " + "\"" + label + "\""
         + " is " + "\"" + color + "\"" + " with 30 edges of length " 
         + edge + " units.\n\t" + "surface area = " + dFmt.format(surfaceArea())
         + " square units\n\t" + "volume = " + dFmt.format(volume())
         + " cubic units\n\t" + "surface/volume ratio = "
         + dFmt.format(surfaceToVolumeRatio());
      return output;
   }
}    
         
   
   
  
      

  
       
     
