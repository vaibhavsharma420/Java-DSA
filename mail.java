import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap<String, Integer> ser= new HashMap<>();
		ser.put("hen",2);
		ser.put("yellow",3);
		ser.put("three",4);
		System.out.println(ser);
		ser.remove("hen");
		System.out.println(ser);
		int g=ser.get("yellow");
		System.out.println(g);
		boolean y=ser.containsKey("three");
		System.out.println(y);
	}
}