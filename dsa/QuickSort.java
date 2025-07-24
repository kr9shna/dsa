package dsa;



//QuickSort is a divide and conquer technique.
//it is faster among the sorting algorithms.
//this method uses a key value , based on which the values are diveded into two parts 
//values lesser than key value will be on the left side 
//values greater than key value will be on the right side
//key value can be taken any value from the array

 public class QuickSort {
public static <T extends Number> void quickSort(T[] arr, int start , int end)
{
	int pivot = end;     //pivot is the key element based on the comparisions happen
	int i = start-1;     //this is a pointer to the last checked smaller element
	int j = start;       //indexes through the array
	while(j<=pivot)
	{
		
		//shifts smaller elements to the left and larger elements to the right of the pivot
		if(arr[j].doubleValue() < arr[pivot].doubleValue())
		{
			T temp = arr[++i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		j++;
	}
	
	
	
	
	
	if(start<end)
	{
		T temp = arr[++i];
		//System.out.println(pivot);
		arr[i] = arr[pivot];
		arr[pivot] = temp;
		quickSort(arr,start,i-1);
		quickSort(arr,i+1, end);
	}
	
}
}


//public class QuickSort{
//	public static void main(String [] args)
//	{
//		Float [] arr = {73.98f, 23.908f, 65.897f, 874.234f,9.0000776f, 123.0009876f, 23.9084f};
//		Cls.quickSort(arr,0,arr.length-1);
//		System.out.println("using quick sort");
//		for(var val : arr)
//		{
//			System.out.println(val);
//		}
//	}
//}
//
