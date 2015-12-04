/*Description:

Definition-

back·ro·nym

noun

a fanciful expansion of an existing acronym or word, such as “port out, starboard home” for posh.

You will create a function called makeBackronym . There will be a preloaded dictionary to use. The dictionary is an object where the the keys are letters A-Z and the values are a predetermined word.

Use the variable name (its name is written in the code template) to reference the uppercase letters of the dictionary.*/

import java.util.*;
import java.util.stream.*;

public class Backronym {
  private static Map<String, String> dictionary = Preload.dictionary;
  public static String makeBackronym(String acronym) {
    char[] result = acronym.toCharArray();
    String s2 = "";
    for(int i = 0; i<result.length; i++)
    {
      String temp = Character.toString(result[i]);
      String temp2 = temp.toUpperCase();
      if(s2 == "")
        s2 = s2 + dictionary.get(temp2);
      else
        s2 = s2 + " " + dictionary.get(temp2);
    }
    return s2;
  }
}