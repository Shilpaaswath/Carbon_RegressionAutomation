package Java_demo;

public class Bubblesort {

	public static void main(String[] args) {
		
		//Draft personadded 99 and 99
		System.out.println("Branch add two integres 99 and 99");
		System.out.println("Main add two integres 99 and 99");
		System.out.println("Branch changed byt not stashed or add or commit");
		System.out.println("No stash pop i did");
		int a[] = { 7,3,9,2,7,10,34,22,78,99,99};
		int temp;
		
		for(int i = 0;i<a.length;i++)
		{
			for (int j=0;j<a.length-1-i;j++)
			{
				if (a[j] > a[j+1])
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		System.out.println("The sorted array is ");
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i] + " , ");
		}

	}

}
