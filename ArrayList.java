import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
  public static void main(String[] args) {
  // Write your code here
  ArrayList <String> na= new ArrayList<String>();
  na.add("red");
  na.add("blue");
  na.add("green");
  na.add("yellow");
  na.add(0,"orange");
  for(int i=0;i<na.size();i++)
  {
    System.out.println(na.get(i));
  }
 }
}