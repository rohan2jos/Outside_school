import java.util.LinkedList;
import java.util.Queue;
public class BinSTree {
	// so that every object of the BinSTree will contain the root node
	// this root node will be used to manipulate the tree as and how we wish
	Node root;
	
	public static void main(String args[]){
		BinSTree b = new BinSTree();
		b.insert(5);
		b.insert(6);
		b.insert(4);
		b.insert(7);
		b.printTree(b.root);
	}
	
	public void insert(int newVal){
		root = insertNode(root, newVal);
	}
	
	// we are returning the node, and the node will get attached to the root,
	// as the root is the main caller
	// 1. if the node is empty, then create a new node with the value
	// 2. if the node is not empty, then check if the new value is greater than
	// the value of the node.
	// 3. if yes, then it goes to the right subtree
	// 4. if no, then it goes to the left subtree.
	// 5. If all these fail, then it is a duplicate value, and we dont allow those in
	// a binary tree, and ignore them.
	public Node insertNode(Node node, int newVal){
		if(node == null)
			// if the node is null, that means that it does not exist
			// we create a new node here and then it will get linked
			// to the caller node
			node = new Node(newVal);
		else if(node.getData() < newVal)
			// by Binary tree rules, the new node goes to the right node if it is 
			// greater than the parent
			node.right = insertNode(node.right, newVal);
		else if(node.getData() > newVal)
			// by Binary tree rules, the new node goes to the left node if it is
			// lesser than the parent
			node.left = insertNode(node.left, newVal);
		else
			// since all the cases have been covered, there is just once case thats left.
			// That is a duplicate value is trying to be inserted.  We know there are no duplicates,
			// and hence we will ignore the value
			System.out.println("you are trying to insert a duplicate node");
		return node;
	}

	
	public void printTree(Node root){
		Queue<Node> q = new LinkedList<Node>();
		
		// the first node in the queue is the root.
		int curr = 1;
		int next = 0;
		q.add(root);
		
		while(!q.isEmpty()){
			Node temp = q.remove();
			System.out.println(temp.getData() + " ");
			// now iteratively check if the left and right nodes are empty
			// if they are not, then insert them into the queue
			// they will get removed and printed when the nodes one level
			// above them are all printed
			if(temp.left != null){
				q.add(temp.left);
				next = next + 1;
			}
			if(temp.right!=null){
				q.add(temp.right);
				next = next + 1;
			}
			
			// we have reached the end of the nodes in the current level
			curr--;
			if(curr == 0){
				System.out.println("");
				curr = next;
				next = 0;
			}
		}
			
	}
}
