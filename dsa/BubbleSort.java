package dsa;
//BubbleSort alogorithm
 class BubbleSort{
public static <T extends Number> void bubbleSort(T [] arr)
{
	for(int i = 0; i< arr.length;i++)
	{
		for (int j=0; j<arr.length-i-1; j++)
		{
			if(arr[j].doubleValue() > arr[j+1].doubleValue())
			{
				T temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
		 
	}
}
}

