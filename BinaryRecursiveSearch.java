public class BinaryRecursiveSearch implements Practice03Search{
	public String searchName(){
		return "BinaryRecursiveSearch";
	}
	public int search(int [] arr, int target, int low, int high){
		if (low>high)
			return -1;
		int mid = (high+low)/2;
		if (arr[mid]==target)
			return mid;
		if (target>arr[mid])
			return search(arr, target, mid+1, high);
		else
			return search(arr, target, low, mid-1);

	}
	public int search(int[] arr, int target){
		return search(arr, target, 0, arr.length - 1);
	}

}