public class BinaryRecursiveSearch implements Practice03Search{
	public String searchName(){
		return "BinaryRecursiveSearch";
	}
	public int search(int [] arr, int target){
		int low = 0;
		int high = arr.length;
		if (low>high)
			return -1;
		int mid = (high+low)/2;
		if (arr[mid]==target)
			return mid;
		if (target>arr[mid])
			return search(arr, target);
		else
			return search(arr, target);

	}

}