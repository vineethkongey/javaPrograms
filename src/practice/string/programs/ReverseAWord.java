package practice.string.programs;

public class ReverseAWord {

	public static void main(String[] args) {
		
		String s="dark dar da";
		String[] str = s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			System.out.println(str[i]);
		}

	}

}
