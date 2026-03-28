package trees.copy;

public class Tree {
class Node{
	Node left,right;
	int data;
}
Node root;

public void print() {
	print(root);
}

private void print (Node nn) {
	if(nn==null){
		return;
	}
	
	System.out.println(nn.data);
	print(nn.left);
	print(nn.right);
}

public void lvl(Node nn) {
	
	
}
}
