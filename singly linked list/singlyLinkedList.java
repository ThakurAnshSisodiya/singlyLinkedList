/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

public class Main
{
    
    public class Node
    {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node head=null;
    
    public void createList(){
    
        int data,n;
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("enter the data");
        data=sc.nextInt();
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        
         System.out.print("if you want add more data press 1 and press any key for exit");
         n=sc.nextInt();
        
        }
        
        while(n==1);
        
    }
    
    public void traverseList(){
        
        Node temp=head;
        
        if(head==null){
            System.out.print("not exit ll");
        }
        
        else{
            while(temp!=null){
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
        
    }
    
	public static void main(String[] args) {
	    
	    Main ll=new Main();
	    ll.createList();
	    ll.traverseList();
		
	}
}
