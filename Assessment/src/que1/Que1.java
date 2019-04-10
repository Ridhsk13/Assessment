package que1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Que1 {
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	public Que1() {
		map.put(1,"AAA");
		map.put(2,"BBB");
		map.put(3,"CCC");
		map.put(4,"DDD");
	}
	
	public static void main(String[] args) {
		System.out.println("Plese enter key");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String key = null;
		try {
			key = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Que1 que1 = new Que1();
		que1.printValue(Integer.parseInt(key));
	}
	
	public void printValue(int key) {
		//System.out.println(map);
		if(map.containsKey(key)) {
			System.out.println(map.get(key));
		} else {
			System.out.println("Not a valid key");
		}
		
	}
}
