package com.practice;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the city 1.bhopal 2.jabalpur 3.indore");
		     String name = sc.next();
		     switch (name) {
			case "bhopal":{System.out.println("bhopal");
			               break;	
			               }
			case "jabalpur":{System.out.println("jabalpur");
                            break;	
                           }
			case "indore":{System.out.println("indore");
                           break;	
                          }
			
			default:{System.out.println("select from list");
                    break;	
                    }
			
		     }
	   
	}  
		     
}	     
		 
		/*  boolean flag=false;
		  int num = sc.nextInt(); 
		  int n=num/2; for(int
		  i=2;i<=n;i++) {
		  
		  if((num%i)==0) { flag=true; break; }
		  
		  
		  }
		  
		  if(flag==true) { System.out.println("number is not prime"); } else {
		  System.out.println("number is prime"); }
		 
		
		
	}*/

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

