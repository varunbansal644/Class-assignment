class Node
{
	int data;
	Node left,right;
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class Binary_tree
{
	Node root;
	Binary_tree(int data)
	{
		root=new Node(data);
	}
	Binary_tree()
	{
		root=null;
	}
	public void print(Node root)
	{
		if(root.left!=null)
		{
		System.out.println(root.left.data);
		root=root.left;
		print(root);
		}	
	}
	public static void main(String[] args) 
	{	
	Binary_tree btree =new Binary_tree();
	btree.root=new Node(10);
	btree.root.left=new Node(20);
	btree.root.right=new Node(30);
	btree.root.left.left=new Node(40);
	btree.root.right.left=new Node(50);
	btree.root.right.right=new Node(60);	
	System.out.println(b.root.data);
	btree.print(btree.root);
	System.out.println(btree.root.right.data);
	btree.print(btree.root.right);
	}
}
