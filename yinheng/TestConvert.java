public class TestConvert{
	public static void main(String[] args){
	int i1=100,i2=200;
	float i3 =i1+i2;
	double i4=i1+i3;
	System.out.println("i3="+i3+",i4"+i4);
	
	float f1=123,f2=12.3f;
	double f3=f1+f2;
	System.out.println("f3="+f3);
	
	double d1=111.2, d2=1e200,d3=1.1;
	double d5 = f2+d2;
	System.out.println("d5"+d5);
	
	byte b1=12,b2=13;
	byte b3=(byte)(b1+b2);
	System.out.println("b3"+b3);
	
	}
}