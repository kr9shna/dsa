package dsa;
//selection sort algorithm
 class SelectionSort {
public static <T extends Number>void selectionSort(T [] arr)
{
	for(int i=0; i<arr.length;i++)
	{
		int pivot = i;
		
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[j].doubleValue()<arr[pivot].doubleValue())
			{
				pivot = j;
			}
		}
		T temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;
	}
}
}


