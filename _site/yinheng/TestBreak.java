public class TestBreak {
	public static void main(String[] arg) {
		int i = 0;
		while(i <= 10) {
			if(i == 4) 
				break;
			System.out.println("i = " + i);
			i++;
		}
	}
}