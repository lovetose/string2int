
public class Main {

	public static void main(String[] args) {
			string2int("1313asd");
		}
		

	
	public static int[] string2int(String input) {
		String[] input2 = input.split("");
		int[] output = new int[input2.length];
		for(int i = 0; i < input2.length; i++) {
			
			Integer j = Integer.valueOf(input2[i]);
			output[i] = j;
			System.out.println(j);

		}
		return output;
	}

}
