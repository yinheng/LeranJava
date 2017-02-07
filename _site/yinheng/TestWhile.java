public class TestWhile {
	public static void main(String[] arg) {
		int i = 1;
		while(i <= 10) {
			System.out.println("i = " + i);
			i++;
		}
		i=1;
		do {
			System.out.println("i = " + i);
			i++;
		}
		while(i <= 10);
	}
}