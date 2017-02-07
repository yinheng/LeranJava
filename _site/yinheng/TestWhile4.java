// 输出101到200内的质数
public class TestWhile4 {
	public static void main(String[] arg) {
		for (int i = 101; i <= 200; i += 2) {
			boolean isZhiShu = true;
			for(int j = 2; j < i; j++) {
				if (i % j == 0) {
					// System.out.println("j=" + j);
				    // System.out.println("i%j=" + (i % j));
					isZhiShu = false;
					break;
				}
			}
			// System.out.println(i + "" + " isZhiShu?" + isZhiShu);
			if (!isZhiShu) {
				continue;	
			}
			System.out.println(i + "");
		}
		
	}
}