
public class BinFind {

	public static void main(String args[]){
		int[] nos = {1,2,4,5,9,67,89};
		int ans = binarySearch(nos, 89, nos[0], nos.length -1); 
		System.out.println("position :: " + (ans + 1));
		System.out.println("index is :: " + ans);
	}
	
	static int binarySearch(int[] nos, int key, int lo, int hi){
		int mid = (lo + hi) / 2;
		
		// the program is over, the value is not present in the array
		if(lo > hi){
			return -1;
		}
		
		// value has been reached, and we will print it out in the main method
		if(key == nos[mid])
			return mid;
		else if(key > nos[mid]){
			// send in parameters to the same method
			System.out.println("recursing with key > mid");
			return binarySearch(nos, key, mid + 1, hi);
		}
		else{
			// send in parameters to the same method
			System.out.println("recursing with key < mid");
			return binarySearch(nos, key, lo, mid - 1);
		}
	}
}
