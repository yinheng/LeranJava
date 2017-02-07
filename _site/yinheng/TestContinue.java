public class TestContinue {
	public static void main(String[] arg) {
		int skip = 4;
		for(int i = 1; i <= 10; i++) {
			if(i == skip) {
				continue;
			}
			System.out.println("i = " + i);
		}
	}
}