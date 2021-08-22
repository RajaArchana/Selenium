package assignment9;

public class Desktop extends Comuter {

	public void desktopSize() {
		System.out.println("The Desktop size is 6inch");

	}

	public static void main(String[] args) {
		System.out.println("********Single Inheritance***********");
		Comuter comp = new Comuter();
		comp.computerModel();
		Desktop desk = new Desktop();
		desk.desktopSize();
	}

}
