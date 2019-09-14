
public class ArrayTest {

	public static void main(String[] args) {
		
		//int[] empsal;
		int [] empsal = new int[5];
		empsal[0] = 5000;
		empsal[1] = 6000;
		empsal[2] = 4500;
		empsal[3] = 3500;
		empsal[4] = 4500;

		for(int i=0;i<empsal.length;i++){
			
			System.out.println("Salary "+ (i+1)+ " ="+ empsal[i]);
		}
		
		String s[] =  {"jan", "Feb"};
		
		for(int i=0;i<s.length;i++)
			
			System.out.println("Month " +(i+1)+ " ="+ s[i]);
	}

}
