
public class Main {

	public static void main(String[] args) {
			string2int("1asda12377313asd");
		}
		

	
	public static int string2int(String input) {
		String number = input.replaceAll("[^0-9]", "");
		
		String[] input2 = number.split("");
		int[] output = new int[input2.length];
		for(int i = 0; i < input2.length; i++) {
			Integer j = Integer.valueOf(input2[i]);
			output[i] = j;
		}		
		int toNumber=0;
		for(int l = 0; l < output.length; l++) {
			toNumber = 10 * toNumber + output[l];
		}
		return toNumber;
	}

}
