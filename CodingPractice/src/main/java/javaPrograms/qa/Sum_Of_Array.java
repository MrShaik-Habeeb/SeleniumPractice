package javaPrograms.qa;



public class Sum_Of_Array {

	public static void main(String[] args) {
		
		int a[] = {5,2,4,5,6,};
		int sum = 0;
		
		/*for(int i=0; i<=a.length; i++){
			sum = sum + a[i];
			System.out.println("sum of array elements :"+sum);
		}*/

		//Enhanced for loop
		
		for(int value:a){
			sum = sum+value;
		}
		System.out.println("sum of Array Elements is: "+sum);
	}

}
