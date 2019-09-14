
public class RandomnNumbers {

	public static void main(String[] args) {
		
		int i = (int)(Math.random()*100);
		
		System.out.println(i);
		
		RandomnNumbers rn=new RandomnNumbers();
		rn.Go2();

	}
	
	public static void Go1(){
		
		System.out.println("GO1");
		//Go2();
	}
	
	public void Go2(){
		
		System.out.println("GO2");	
		Go1();
	}

}
