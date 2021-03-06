package com.company;

/**
 * This class contains class (static) methods
 * that will help you test the com.company.Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("imgres.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("imgres.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("imgres.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("IMG_7275.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testKeepOnlyBlue(){
    Picture swan = new Picture("imgres.jpg");
    swan.explore();
    swan.keepOnlyBlue();
    swan.explore();
  }
  public static void testNegate(){
    Picture swan = new Picture("imgres.jpg");
    swan.explore();
    swan.negate();
    swan.explore();
  }
  public static void testGrey(){
    Picture swan = new Picture("imgres.jpg");
    swan.explore();
    swan.grey();
    swan.explore();
  }
  public static void testwater(){
    Picture swan = new Picture("water.jpg");
    swan.explore();
    swan.fixUnderwater();
    swan.explore();

  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
   // testCollage();
   //testKeepOnlyBlue();
   // testNegate();
   // testGrey();
    testwater();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
  //testClearBlueOverValue(200);
  //testGetAverageForColumn(0);
}

}
