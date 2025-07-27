package pages;
import java.util.HashMap;
import java.util.Map;

public class countAlphabets {
	
	public void countTotalAlphabetsOccurance() {
		String a = "shailesh";
		char[] b = a.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char c : b) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(map);
	}
	
	public void swapAlphabets() {
		String a ="s!h@a#i$l%e^s&h";
		char[] b = a.toCharArray();
		int c = 0;
		int d = b.length-1;
		while(c < d) {
			if(!Character.isAlphabetic(b[c])) {
				c++;
			} else if(!Character.isAlphabetic(b[d])){
				d--;
			} else {
				char temp = b[c];
				b[c] = b[d];
				b[d] = temp;
				c++;
				d--;
			}
		}
		System.out.println("Output: " + new String(b));
	}
	
	public void normalSwap() {
		String a = "shailesh";
		for(int i=a.length()-1; i>=0; i--) {
			char c = a.charAt(i);
			System.out.print(c);
		}
	}

}
