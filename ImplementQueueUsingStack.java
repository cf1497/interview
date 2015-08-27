package leetcode;

import java.util.Stack;

public class ImplementQueueUsingStack {
	
	public static Stack<Integer> s1 = new Stack<Integer>();
	public static Stack<Integer> s2 = new Stack<Integer>();
	
	public static void main(String[] args){
		ImplementQueueUsingStack q = new ImplementQueueUsingStack();
		q.push(1);
		q.push(2);
		q.push(3);
		
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.peek());

	}
	
	
	
	public static void push(int x){
		s1.push(x);
	}
	
	public static int pop(){
		if(s2.isEmpty()){
			s1Tos2();
		}
		return s2.pop();
		
	}
	
	public static int peek(){
		if(s2.isEmpty()){
			s1Tos2();
		}
		
		return s2.peek();
		
	}
	
	public static boolean isEmpty(){
		return s1.isEmpty()&&s2.isEmpty();
		
	}
	
	public static void s1Tos2(){
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
	}
	
	
	
}
