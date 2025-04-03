package array;

public class Practice_Array_8 {

	public static void main(String[] args) {
		int age[] = new int[2];
		age[0] = 23;
		age[1] = 34;
		
		int sum = 0;
		
		for(int i=0; i<age.length ; i++) {
			sum = sum + age[i];
		}
		int avg = sum/2; 
		System.out.println(avg);

	}

}
