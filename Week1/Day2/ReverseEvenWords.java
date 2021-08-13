package assignment3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Build a logic to reverse the even position words (output: I ma a erawtfos
		// tester)
		String test = "I am a software tester";
		String[] t = test.split(" ");

		String val = "";
		for (int i = 0; i < t.length; i++) {

			if (i % 2 == 1)
				val = val + new StringBuilder(t[i]).reverse().toString() + " ";
			else
				val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.println(val);

	}

}
