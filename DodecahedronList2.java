import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * A program to creat dodecahedron object and store them.
 * 
 * Project 7
 * @author Tao Guo
 * @version 3/27/2017
 */
public class DodecahedronList2 {
   private String listName;   
   private Dodecahedron[] dList;
   private int numberOfDodecahedrons;
   /**
    * @param listNameIn to listName.
    * @param dListIn to dList.
    * @param numberOfDodecahedronsIn to numberOfDodecahedrons.
    */
   public DodecahedronList2(String listNameIn, Dodecahedron[] dListIn, 
                            int numberOfDodecahedronsIn) {
      listName = listNameIn;
      dList = dListIn;
      numberOfDodecahedrons = numberOfDodecahedronsIn;
      
   }         
      /**
       * @return listName.
       */
   public String getName() {
      return listName;
   }
      
     
     
     
      /**
       * @return numberOfDodecahedrons.
       */
   public int numberOfDodecahedrons() {
      
      return numberOfDodecahedrons;
   }
      /**
       * @return dList;
       */
   public Dodecahedron[] getList() {
      return dList;
   }
    
    
    /**  
     * @param fileNameIn for fileName to read
     * @return DodecahedronList
     * @throws IOException for file reading
     */   


   public DodecahedronList2 readFile(String fileNameIn) throws IOException {
            
      Scanner scanFile = new Scanner(new File(fileNameIn));
      Dodecahedron[] myList = new Dodecahedron[20];
      
      String label = ""; 
      String color = "";
      double edge = 0;
      
      listName = scanFile.nextLine();      
      while (scanFile.hasNext()) {
         label = scanFile.nextLine();
         color = scanFile.nextLine();
         edge =  Double.parseDouble(scanFile.nextLine());
         
         Dodecahedron d = new Dodecahedron(label, color, edge);
         myList[numberOfDodecahedrons] = d;  
         numberOfDodecahedrons++;       
      }
      
      DodecahedronList2 dL = new DodecahedronList2(listName, myList,
                                 numberOfDodecahedrons);
      
      return dL;
   }
       
     /**   
      * @param colorIn Length of color.
      * @param labelIn Length of label.
      * @param edgeIn Length of edge.
      */   
   public void addDodecahedron(String colorIn, String labelIn, double edgeIn) {
       
      Dodecahedron d = new Dodecahedron(colorIn, labelIn, edgeIn);
      
      dList[numberOfDodecahedrons] = d;
      numberOfDodecahedrons++;
   }
      /**
       * @param labelIn to get label.
       * @return label;
       */
   public Dodecahedron findDodecahedron(String labelIn) { 
      Dodecahedron result = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = dList[i];
            break;
         }
      }
      return result;
   }
 
      
      /** 
       * @return dList if it greater than 0, otherwise null.
       * @param labelIn to get index.
       */
   public Dodecahedron deleteDodecahedron(String labelIn) {
      Dodecahedron result = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = dList[i];
            for (int j = i; j < numberOfDodecahedrons - 1; j++) {
            
               dList[j] = dList[j + 1];
            }
            dList[numberOfDodecahedrons - 1] = null;
            numberOfDodecahedrons--;
            break;
         }
          
      }
      return result;
       
       
   }
          
     /**
      * @param labelIn to get label.
      * @param colorIn to set color.
      * @param edgeIn to set edge.
      * @return true if correct, otherwise false.
      */
   public boolean editDodecahedron(String labelIn, String colorIn, 
      double edgeIn) {
      Dodecahedron result = null;
      for (int i = 0; i < numberOfDodecahedrons; i++) {
         if (dList[i].getLabel().equalsIgnoreCase(labelIn)) {
            result = dList[i];
            dList[i].setColor(colorIn);
            dList[i].setEdge(edgeIn);
            return true;
         }
      }
      return false;
   }
      
      /** 
       * @return area.
       */
   public double totalSurfaceArea()
   {
      double area = 0;
      int index = 0;
      while (index < numberOfDodecahedrons)
      {
         area += dList[index].surfaceArea();
         index++;
      }
      return area;
   }
      /**
       * @return total.
       */  
   public double totalVolume()
   {
      double total = 0;
      int index = 0;
      while (index < numberOfDodecahedrons)
      {
         total += dList[index].volume();
         index++;
      }
      return total;        
      
   }
     /**
      * @return avgArea.
      */ 
   public double averageSurfaceArea()
   {
      double avgArea = 0;
      if (numberOfDodecahedrons > 0)
      {
         avgArea = totalSurfaceArea() / numberOfDodecahedrons;
      }
      
      return avgArea;
      
   }
      
     /**
      * @return avgVolume.
      */ 
   public double averageVolume()
   {
      double avgVolume = 0;
      if (numberOfDodecahedrons > 0)
      {
         avgVolume = totalVolume() / numberOfDodecahedrons;
      }
      
      return avgVolume;
      
      
   }
    
   
     /**
      * @return totalR.
      */
   public double totalRatio()
   {
      double totalR = 0;
      int index = 0;
      while (index < numberOfDodecahedrons)
      {
         totalR += dList[index].surfaceToVolumeRatio();
         index++;
      }
      return totalR;        
      
   }
   
      /**
       * @return avgSurfaceToVolumeRatio.
       */
   public double averageSurfaceToVolumeRatio()
   {
      double avgSurfaceToVolumeRatio = 0;
      if (numberOfDodecahedrons > 0)
      {
         avgSurfaceToVolumeRatio = totalRatio() / numberOfDodecahedrons;
      }
         
      return avgSurfaceToVolumeRatio;
       
   }
   /**
    * @return dList[i].
    */
   public Dodecahedron findDodecahedronWithShortestEdge() {
      if (numberOfDodecahedrons <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfDodecahedrons; j++) {
         if (dList[j].getEdge() <= dList[i].getEdge()) {
            i = j;
         }
      }
      return dList[i];
   }
    /**
     * @return dList[i].
     */
   public Dodecahedron findDodecahedronWithLongestEdge() {
      if (numberOfDodecahedrons <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfDodecahedrons; j++) {
         if (dList[j].volume() > dList[i].volume()) {
            i = j;
         }
      }
      return dList[i];
   }     
     /**
      * @return dList[i].
      */   
   public Dodecahedron findDodecahedronWithSmallestVolume() {
      if (numberOfDodecahedrons <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfDodecahedrons; j++) {
         if (dList[j].volume() <= dList[i].volume()) {
            i = j;
         }
      }
      return dList[i];
   }     
    /**
     * @return dList[i].
     */   
   public Dodecahedron findDodecahedronWithLargestVolume() {
      if (numberOfDodecahedrons <= 0) {
         return null;
      }
      int i = 0;
      for (int j = 0; j < numberOfDodecahedrons; j++) {
         if (dList[j].volume() > dList[i].volume()) {
            i = j;
         }
      }
      return dList[i];
   }     

             
      /**
       * @return result.
       */
   public String toString()
   {  
      String result = listName + "\n";
      int index = 0;
      while (index < numberOfDodecahedrons) {
         result += "\n" + dList[index] + "\n"; 
         index++;  
      }   
      return result;
   }
   
   
      /**
       * @return result.
       */
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String result = "";
      result += "----- Summary for " + getName() + " -----"; 
      result += "\nNumber of Dodecahedrons: " + numberOfDodecahedrons();
      result += "\nTotal surface area: " + df.format(totalSurfaceArea()); 
      result += "\nTotal volume: "  + df.format(totalVolume());
      result += "\nAverage surface area: "  + df.format(averageSurfaceArea());
      result += "\nAverage volume: " + df.format(averageVolume());
      result += "\nAverage surface to volume ratio: " 
         + df.format(averageSurfaceToVolumeRatio());
         
      return result;
   }
}


