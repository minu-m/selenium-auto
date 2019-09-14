
public class MethodTest {

  static int e = 8;
	public int sum(int a, int b, int c){
		
		int d = a+b+c;
		//System.out.println("Sum = "+ d);
		return d;
		
	}
	
	public int subtract(int a, int b, int c){
		
		int d = a-b-c;
		System.out.println("subtract = "+ d);
		return d;
	}
	
	public static void main(String args[]){
		
		MethodTest mt= new MethodTest();
		int sum = mt.sum(1, 2, 3);
		System.out.println("New Sum = "+sum);
		
		//MethodTest mt1= new MethodTes();
		mt.subtract(4, 2, 0);
		
		//MethodTest mt2= new MethodTest();
		
		MethodTest.e++;
		MethodTest.e++;
		System.out.println("d = " +MethodTest.e++);
	}
}
