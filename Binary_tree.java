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
	Binary_tree b =new Binary_tree();
	b.root=new Node(10);
	b.root.left=new Node(20);
	b.root.right=new Node(30);
	b.root.left.left=new Node(40);
	b.root.right.left=new Node(50);
	System.out.println(b.root.data);
	b.print(b.root);
	System.out.println(b.root.right.data);
	b.print(b.root.right);
	}
}
