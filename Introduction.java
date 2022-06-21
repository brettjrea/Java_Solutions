public class Introduction {

	private void sayMyname(String intro) {
		System.out.println("My name is " + intro);
	}

	private void sayMyFavColor(String favcolor) {
		System.out.println("My favorite color is " + favcolor);
	}

	private void sayMyLotto(String lotto) {
		System.out.println("If I won the lottery, I would " + lotto);
	}

	public static void main(String[] args) {
		
		Introduction intro = new Introduction();
		intro.sayMyname("brett");

		Introduction favcolor = new Introduction();
		favcolor.sayMyFavColor("blue");

		Introduction lotto = new Introduction();
		lotto.sayMyLotto("Buy a Yacht!");
	}

}