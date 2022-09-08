package practice.string.programs;

import java.util.HashSet;

public class OutPut112233 {

	public static void main(String[] args) {
		
		String s="123123123";
		
		HashSet<Character>hs=new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			hs.add(s.charAt(i));
		}
		for(Character ch:hs) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch.equals(s.charAt(i))) {
					count++;
					System.out.print(ch+" ");
				}
			}
		}

	}

}
