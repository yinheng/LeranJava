// 输出1到100内前五个被3整除的数
public class Testwhile3 {
	public static void main(String[] arg) {
		int num = 0;
		int i = 1;
		while(i <= 100){
			if(i % 3 ==0) {
				System.out.println(i + "");
				num++;
			}
			if(num == 5)
				break;
		i++;
		}
	}
}