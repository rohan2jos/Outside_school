public class Kata {
    // that takes in a string and replaces all the vowels [a,e,i,o,u] with their respective positions within that string. 
    public static String vowel2Index(String s) {
      // we shall put each character into a StringBuilder, and if the
      // character is a vowel, we shall replace it with the index + 1
      StringBuilder s1 = new StringBuilder();
    for(int i = 0; i<s.length(); i++){
      if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
        s1.append(i + 1);
      }else{
        s1.append(s.charAt(i));
      }
    }
    return s1.toString();
    }
}