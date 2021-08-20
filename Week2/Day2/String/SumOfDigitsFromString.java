package assignment8;

public class SumOfDigitsFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Tes12Le79af65";
		int sum = 0;
		String original = text.replaceAll("\\d", "");
		System.out.println(original);
		char[] ch = original.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int num = Character.getNumericValue(ch[i]);
			sum = sum + num;
		}
		System.out.println(sum);

	}

}
