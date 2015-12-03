
public class Node {

	Node left;
	Node right;
	private int data;
	
	public Node(){
		left = null;
		right = null;
		data = 0;
	}
	
	public Node(int data){
		left = null;
		right = null;
		this.data = data;
	}
	
	public int getData(){
		return data;
	}
	
	public Node getLeft(){
		return left;
	}
	
	public Node getRight(){
		return right;
	}
	
	public void setData(int data){
		this.data = data;
	}
	
	public void setLeft(Node left){
		this.left = left;
	}
	
	public void setRight(Node right){
		this.right = right;
	}
}
