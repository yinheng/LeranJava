public class TestFor{
	public static void main (String [] arg){
		long result = 0;
		long f = 1;
		for (int i = 1; i <= 10; i++){
			f = f * i;
			result += f;
		}
		System.out.println("result=" + result);
	}
}