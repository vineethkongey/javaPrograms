package practice.string.programs;

public class VowelsWithDuplicates {

	public static void main(String[] args) {
		String s="stockholmes";
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				count++;
			}
		}
		
		System.out.println(s+"   " +count);
	}

}
