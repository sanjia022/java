package array;

public class Array_8 {

	public static void main(String[] args) {
		//Find out the average value of an array of int datatype whos size is 4. values are : 17,15,41,32

		int num[] = new int[3];
		num[0] = 17;
		num[1] = 17;
		num[2] = 17;
		
		int sum = 0;
		
		for(int i=0; i<num.length;i++) {
			sum = sum + num[i];
		}
		int avg = sum/3;
		System.out.println("The average value is " + avg);
		
	}

}
