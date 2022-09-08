package practice.string.programs;

import java.util.LinkedHashSet;

public class VowelsWithOutDuplicates {

	public static void main(String[] args) {
		String s="stockholmes";
		LinkedHashSet<Character>lhs=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			lhs.add(s.charAt(i));
		}
		int count=0;
		for(Character c:lhs) {
		
			
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count++;
				}
			}
			
		
		
		System.out.println(s+" "+count);
	}

}
