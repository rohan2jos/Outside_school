/*Description:

Your task is to make a function that can take any non-negative integer as a argument and return it with it's digits in descending order. Descending order means that you take the highest digit and place the next highest digit immediately after it.*/

public class DescendingOrder {
  public static int sortDesc(final int num) {
    
    // declaring the variables that will be needed
    // creating an array with size of the digits in the int
    int count = Integer.toString(num).length();
    int[] result = new int[count];
    int num2 = num;
    int i = 0;
    
    // putting each digit into the int array
    while(num2!=0)
    {
      result[i] = num2 % 10;
      num2 = num2 / 10;
      i++;
    }
    
    // we will now start arranging all the digits in descending order
    // using the bubble sort method
    boolean flag = true;
    while(flag)
    {
      flag = false;
      for(int m = 0; m<result.length - 1; m++)
      {
        if(result[m] < result[m+1])
        {
          int temp = result[m];
          result[m] = result[m+1];
          result[m+1] = temp;
          flag = true;
        }
      }
    }
    StringBuilder strs = new StringBuilder();
    for(int j : result)
    {
      strs.append(j);
    }
    int fin = Integer.parseInt(strs.toString());
    return fin;
  }
}