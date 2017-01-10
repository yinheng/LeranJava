public class OddSum {
	public static void main(String[] arg) {
	    long sum = 0;
		for(int i = 1; i <=99; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.println("i = " + i);
			}
		}
		System.out.println("sum = " + sum);
	}
}