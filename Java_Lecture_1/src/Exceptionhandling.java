
public class Exceptionhandling {

	public static void main(String[] args) {
		
		try{
		System.out.println("First try block");
		int i = 10/0;
		
		}
		
		catch (Exception e){
			
			System.out.println("Error occured : " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Second Try");
		
		try{
			
			int a[] = new int[4];
			a[5] = 100;			
		}
		
		catch(Exception e){
			
			System.out.println("Error occured : " + e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}
