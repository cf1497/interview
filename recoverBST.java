package leetcode;

public class ReoverBST {
	 protected static TreeNode first = null;
	 protected static TreeNode second = null;
	 protected static TreeNode pre = null;
	private static TreeNode root;
	
	public static class TreeNode{
		public TreeNode left = null;
		public TreeNode right = null;
		public int value = 0;
		
		public TreeNode(int value){
			this.value = value;
		}
	}
	
	public static void main(String[] args){
        TreeNode root = new TreeNode(5);
        TreeNode n1 = new TreeNode(6);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(8);
        TreeNode n5 = new TreeNode(3);
        
        root.left = n1;
        root.right = n3;
        
        n1.right = n2;
        
        n3.left = n5;
        n3.right = n4;
        
        print(root);
        
        recover(root);
        System.out.println();
        
        print(root);
                
	}
	
	public static void recover(TreeNode root){
		rec(root);
		swap(first, second);
	}
	
	public static void rec(TreeNode root){
		if(root==null){
			return;
		}
		
		rec(root.left);
		
		if(pre==null){
			pre = root;
		}else{
			if(pre.value>root.value){
				if(first==null){
					first = pre;
					second = root;
				}else{
					second = root;
				}
			}
			
			pre = root;
		}
		
		rec(root.right);
	}
	
	public static void swap(TreeNode n1, TreeNode n2){
		int tmp = n1.value;
		n1.value = n2.value;
		n2.value = tmp;
	}
	
	public static void print(TreeNode root){
		if(root==null){
			return;
		}
		
		print(root.left);
		System.out.print(root.value+" ");
		print(root.right);
	}
	

}
