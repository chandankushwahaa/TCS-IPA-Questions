/* Find the count of the words starting with vowel in the string. */

import java.util.*;

public class basic01string {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int cnt = 0;
    String[] s2 = s.split(" ");    
    for(int i=0; i<s2.length; i++){
      char f = s2[i].charAt(0);
      if(f == 'A' || f=='E' || f == 'I' || f == 'O' || f == 'U' || f == 'a' || f == 'e' || f=='i' || f=='o' || f=='u')
      {
        cnt++;
      }
    }
    if(cnt > 0){
      System.out.println(cnt);
    }else{
      System.out.println("No String Found!");
    }
  }
}
