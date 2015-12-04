//The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
public class Block{
  private int width;
  private int length;
  private int height;
  
  Block(int[] dimensions){
    width = dimensions[0];
    length = dimensions[1];
    height = dimensions[2];
  }
  
  public int getWidth(){
    return width;
  }
  
  public int getLength(){
    return length;
  }
  
  public int getHeight(){
    return height;
  }
  
  public int getVolume(){
    int vol =  (length * width * height);
    return vol;
  }
  
  public int getSurfaceArea(){
    int sa = 2 * length * width + 2 * width * height + 2 * height * length;
    return sa;
  }
}