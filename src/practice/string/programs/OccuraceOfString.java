package practice.string.programs;


import java.util.LinkedHashSet;


public class OccuraceOfString {

	public static void main(String[] args) {
		
		String s="vineeth";
		
		LinkedHashSet<Character>hs= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for(Character ch:hs) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if (ch.equals(s.charAt(i))) {
					count++;
				}
				
			}
			System.out.println(ch + " occuring " + count);
		}

	}

}
