package array;

public class ShiftingBackUsingKey_Array {

	public static void main(String[] args) {

		int a[]= {2,7,4,9,1};
        int key=3;
        
		for(int i=0;i<key;i++) 
		{
			
			int temp=a[0];
			for(int j=0; j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}