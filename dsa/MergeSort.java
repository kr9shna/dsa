package dsa;

class Mainnnn {
	@SuppressWarnings("unchecked")
	private static<T extends Number> void merge(T[] arr, int mid, int l, int r) {
		Number [] larr = new Number[mid - l + 1];
		Number [] rarr = new Number[r - mid];
		for(int i = 0; i<larr.length; i++)
		{
			larr[i] = arr[l+i];
		}
		
		for(int i = 0; i<rarr.length; i++)
		{
			rarr[i] = arr[mid + i + 1];
		}
		int i = 0;
		int j = 0;
		int k = l;
		while(i<larr.length && j<rarr.length)
		{
			if(larr[i].doubleValue() < rarr[j].doubleValue())
			{
				
			arr[k++] = (T) larr[i++];
			}
			
			else
			{
				arr[k++] = (T) rarr[j++];
			}
		}
		
		while(i<larr.length)
		{
			arr[k++] = (T) larr[i++];
		}
		
		while(j<rarr.length)
		{
			arr[k++] = (T) rarr[j++];
		}
		
	}
public static <T extends Number>void mergeSort(T[] arr, int l, int r)
{
	if(l<r)
	{
		int mid = (r + l)/2;
		mergeSort(arr,l,mid);
		mergeSort(arr,mid+1,r);
		merge(arr,mid,l,r);
	}
}

}


