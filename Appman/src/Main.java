
public class Main {

	public static void main(String[] args) {
			System.out.println(string2int("121545kjhkjhk")); 
	}
	public static int string2int(String input) {
		String num = input.replaceAll("[^0-9]", "");
		int output = 0;
		for(int i = 0; i < num.length(); i++) {
			output = output * 10 + num.charAt(i)-'0';
		}
		return output;
	}

}
