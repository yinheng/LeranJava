//输出1到100中签五个被3整除的数。
public class TestFor3 {
	public static void main(String[] arg) {
		int num = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 3 == 0) {
			System.out.println(i + "");	
			num++;
			}
			if(num == 5)
				break;
		}
	}
}