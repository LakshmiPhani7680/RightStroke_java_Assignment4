package com.rightstroke.java;

class stack<T extends Object>{
	int size;
	T stackArr[];
	int top;
//--------------------------------------------------------------------------------------
	@SuppressWarnings("unchecked")
	public stack(int size) {
		this.size=size;
		this.stackArr=(T[])new Object[this.size];
		this.top=-1;
	}
//--------------------------------------------------------------------------------------
	private void increaseStackCapacity(){
        
        @SuppressWarnings("unchecked")
        T[] newStack = (T[]) new Object[this.size*2];
        for(int i=0;i<size;i++){
            newStack[i] = this.stackArr[i];
        }
        this.stackArr = newStack;
        this.size = this.size*2;
    }
//--------------------------------------------------------------------------------------
	public boolean isStackEmpty() {
        return (top == -1);
    }
//--------------------------------------------------------------------------------------
	public boolean isStackFull() {
        return (top == size - 1);
    }
//--------------------------------------------------------------------------------------
	void push(T data) {
		if(this.isStackFull()){
            System.out.println(("Stack is full. Increasing the capacity."));
            this.increaseStackCapacity();
        }
        System.out.println("Adding: "+data);
        this.stackArr[++top] = data;
	}
//---------------------------------------------------------------------------------------
	 public T pop() {
	        if(this.isStackEmpty()){
	            System.out.println("Stack is empty. Can not remove element.");
	        }
	        T data = this.stackArr[top];
	        System.out.println("Removed entry: "+data);
	        stackArr[top]=null;
	        return data;
	    }
//---------------------------------------------------------------------------------------
	void show() {
		for(T show : stackArr) {
			System.out.print(show + " ");
		}
	}
	
}
//----------------------------------------------------------------------------------------
public class Generic_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack<Integer> stack1 = new stack<Integer>(2);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.pop();
		stack<String> stack2 = new stack<String>(2);
		stack2.push("Lakshmi");
		stack2.push("Gana");
		stack2.push("Ravi");
		stack2.pop();
		stack1.show();
		stack2.show();

	}

}
