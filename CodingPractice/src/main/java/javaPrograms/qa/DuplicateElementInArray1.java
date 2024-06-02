package javaPrograms.qa;


public class DuplicateElementInArray1 {
public static void main(String[] args) {
	
	String arr[] = {"Java","c","c++","pythan","Java"};
	
	//Approch 1
	boolean flag =false;
	
	for(int i=0; i<arr.length; i++)
	{
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i]==arr[j])
			{
				System.out.println("Found Duplicate element :"+arr[i]);
				flag=true;
			}
			
		}
		
	}
	if(flag==false){
		System.out.println("Duplicate element Not pound");
	
	}

}
}
