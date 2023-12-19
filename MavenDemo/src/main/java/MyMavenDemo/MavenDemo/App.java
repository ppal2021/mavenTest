package MyMavenDemo.MavenDemo;

import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("A", "Java");
		treeMap.put("C", "SQL");
		treeMap.put("B", "Python");
		for (String key : treeMap.keySet()) {
			System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
		}
	}
}
