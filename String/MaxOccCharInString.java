package String;

public class MaxOccCharInString {

	public static void main(String[] args) {
		String str = "RaviRaviRaviRaviRvv";
		int max = 0;
		char ch = ' ';
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			ch = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			if (count > max) {
				max = count;

			}
		}
		System.out.println("max no of occurance is charachter " + ch + " " + max);

	}

}
