import org.junit.Assert;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;

/** Test DodecahedronList2 Program. **/
public class DodecahedronList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** A test that always fails. **/
   @Test public void gettersTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("getName Test", "Test List", dList.getName());
      Assert.assertArrayEquals("getList test", dArray, dList.getList());
      
   }
   /** test number of dodecahedron. **/
   @Test public void numberOfDodecahedronsTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("numberOfDodecahedrons Test", 
                           3, dList.numberOfDodecahedrons());
               
   }
   /** test total surface area. **/
   @Test public void totalSurfaceAreaTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("averageSurfaceArea Test", 
                           832070.821, dList.totalSurfaceArea(), .001);
              
   }

   /** test total volume. **/ 
   @Test public void totalVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("totalVolume Test", 
                           61773784.687, dList.totalVolume(), .001);
               
   }
   /** test average surface area. **/
   @Test public void averageSurfaceAreaTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("averageSurfaceArea Test", 
                           277356.94, dList.averageSurfaceArea(), .001);
              
   }
   /** test average volume. **/
   @Test public void averageVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("averageVolume Test", 
                           20591261.562, dList.averageVolume(), .001);
              
   }
    /** test average surface to volume ratio. **/
   @Test public void averageSurfaceToVolumeRatioTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("averageSurfaceToVolumeRatio Test", 
                           3.686, dList.averageSurfaceToVolumeRatio(), .001);
              
   }
     /** test to string. **/  
   @Test public void toStringTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("toString Test", 
                           true, 
                           dList.toString().
                              contains("Dodecahedron \"Small Example\""));
              
   }
    /** test summary info. **/
   @Test public void summaryInfoTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("summaryInfo Test", 
                           true, dList.summaryInfo().
                              contains("Number of Dodecahedrons: 3"));
              
   }
   /** test read file. **/
   /** @throws IOException for reading a file. **/
   @Test public void readFileTest() throws IOException {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
   
      Assert.assertEquals("averageSurfaceArea Test", 
                           277356.94, dList.averageSurfaceArea(), .001);
              
   }
   /** test add dodecahedron. **/
   @Test public void addDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Dodecahedron d = new Dodecahedron("Humongous", "black", 1000);
      dList.addDodecahedron("Humongous", "black", 1000);
      Dodecahedron[] dA = dList.getList();
      Assert.assertEquals("addDodecahedron Test", d, dA[3]);
                          
              
   }
   /** test find dodecahedron. **/
   @Test public void findDodecaehedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("findDodecahedron Test", 
                           dArray[0], dList.findDodecahedron("small example"));
              
   }
   /** test find dodecahedron. **/
   @Test public void findDodecahedronFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      
      Assert.assertEquals("findDodecahedron Test", 
                           null, dList.findDodecahedron("nope"));
                           
              
   }
    /** test delete dodecahedron. **/
   @Test public void deleteDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.deleteDodecahedron("small example");
      Assert.assertEquals("deleteDodecahedron Test", 
                          null, dArray[2]);                           
              
   }
   /** test delete dodecahedron false. **/
   @Test public void deleteDodecahedronFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.deleteDodecahedron("nope");
      Assert.assertEquals("deleteDodecahedron Test", 
                          dArray[2], dArray[2]);                           
              
   }

    /** test edit dodecahedron. **/ 
   @Test public void editDodecahedronTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      dList.editDodecahedron("small example", "gold", 0.21);
      Assert.assertEquals("editDodecahedron Test", 
                           "gold", dArray[0].getColor());
              
   }
    
    /** test edit dodecahedron false. **/ 
   @Test public void editDodecahedronFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      dList.editDodecahedron("nope", "gold", 0.21);
      Assert.assertEquals("editDodecahedron Test", 
                           "blue", dArray[0].getColor());
              
   }
    
    /** test find dodecahedron with shortest edge. **/
   @Test public void findDodecahedronWithShortestEdgeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithShortestEdge Test", 
                           dArray[0], 
                           dList.findDodecahedronWithShortestEdge());
              
   }
   /** test find dodecahedron with shortest edge false. **/
   @Test public void findDodecahedronWithShortestEdgeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithShortestEdge Test", 
                           null, 
                           dList.findDodecahedronWithShortestEdge());
              
   }

   
    /** test find dodecahedron with longest edge. **/
   @Test public void findDodecahedronWithLongestEdgeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithLongestEdge Test", 
                           dArray[2], 
                           dList.findDodecahedronWithLongestEdge());
              
   }
    /** test find dodecahedron with longest edge false. **/
   @Test public void findDodecahedronWithLongestEdgeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithLongestEdge Test", 
                           null, 
                           dList.findDodecahedronWithLongestEdge());
              
   }
   /** test find dodecahedron with smallest volume. **/
   @Test public void findDodecahedronWithSmallestVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithSmallestVolume Test", 
                           dArray[0], 
                           dList.findDodecahedronWithSmallestVolume());
              
   }
   /** test find dodecahedron with smallest volume false. **/
   @Test public void findDodecahedronWithSmallestVolumeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithSmallestVolume Test", 
                           null, 
                           dList.findDodecahedronWithSmallestVolume());
              
   }
   /** find dodecahedron with largest volume. **/
   @Test public void findDodecahedronWithLargestVolumeTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 3);
      Assert.assertEquals("findDodecahedronWithlargestVolume Test", 
                           dArray[2], 
                           dList.findDodecahedronWithLargestVolume());
              
   }
   /** find dodecahedron with largest volume false. **/
   @Test public void findDodecahedronWithLargestVolumeFalseTest() {
      Dodecahedron[] dArray = new Dodecahedron[20];
      dArray[0] = new Dodecahedron("Small Example", "blue", 0.25);
      dArray[1] = new Dodecahedron("Medium Example", "orange", 10.1);
      dArray[2] = new Dodecahedron("Large Example", "silver", 200.5);
      DodecahedronList2 dList = new DodecahedronList2("Test List", dArray, 0);
      Assert.assertEquals("findDodecahedronWithlargestVolume Test", 
                           null, 
                           dList.findDodecahedronWithLargestVolume());
              
   }


   



   
   






}
