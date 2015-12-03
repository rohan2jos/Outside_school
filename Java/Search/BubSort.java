
public class BubSort {
	public static void main(String args[]){
		int[] nos = {20, 42, 1, 3, 32, 56};
		boolean loopFlag = true;
		
		while(loopFlag!=false){
			loopFlag = false;
			for(int i = 0; i < nos.length - 1; i++){
				if(nos[i] > nos[i+1]){
					//implement the swapping logic here
					int temp = nos[i];
					nos[i] = nos[i + 1];
					nos[i + 1] = temp;
					loopFlag = true;
				}
			}
		}
		for(int j : nos){
			System.out.println(j);
		}
	}
}
