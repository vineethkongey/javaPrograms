
package practice.string.programs;

public class ReverseAString {
		public static void main(String[] args) {
			String s="xiaomi";
			for(int i=s.length()-1;i>=0;i--) {
				System.out.print(s.charAt(i));
			}
		}
}
