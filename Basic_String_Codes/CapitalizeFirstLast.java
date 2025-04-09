public class CapitalizeFirstLast {
  public static void main(String[] args) {
    String str = "hello world";

     String[] s = str.split(" ");
     for(int i =0 ; i<s.length; i++){
      String sob =s[i].substring(0 ,1).toUpperCase() + s[i].substring(1 , s[i].length()-1) + s[i].substring(s[i].length()-1).toUpperCase();
    System.out.println(sob);
     }
     
  }
}
