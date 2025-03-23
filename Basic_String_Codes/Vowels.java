public class Vowels {
  public static void main(String[] args) {
    String str = "The quick brown fox jumps over the lazy dog";

    char[] ch = str.toCharArray();

    int count = 0;
    int space = 0;
    int consonant = 0;

    /* 
    for (int i = 0; i < ch.length; i++) {
      if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
          || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
        count++;
      } else if (ch[i] == ' ') {
        space++;
      } else if (ch[i] == 'b' || ch[i] == 'c' || ch[i] == 'd' || ch[i] != 'e' || ch[i] == 'f' || ch[i] == 'g'
          || ch[i] == 'h' || ch[i] == 'j' || ch[i] == 'k' || ch[i] == 'l' || ch[i] == 'm' || ch[i] == 'n'
          || ch[i] == 'p' || ch[i] == 'q' || ch[i] == 'r' || ch[i] == 's' || ch[i] == 't' || ch[i] == 'v'
          || ch[i] == 'w' || ch[i] == 'x' || ch[i] == 'y' || ch[i] == 'z') {
        consonant++;
      }
    }
      */

      // Another Way 

      for (int i = 0; i < ch.length; i++) {
        if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'
            || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
          count++;
        } else if (ch[i] == ' ') {
          space++;
        } else if ((ch[i]>= 'a' && ch[i] <= 'z') || (ch[i] >= 'A' && ch[i] <= 'Z')) {
          consonant++;
        }
      }

    System.out.println("Total Vowels : " + count);
    System.out.println("Total Spaces : " + space);
    System.out.println("Total Consonant : " + consonant);
  }
}
