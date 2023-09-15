package chapter2;

public class TaskA {
	   public static void main (String[] args) {
	       
	       int a = 5;
	       int b = 7;
	       
	       System.out.println("A = " + a + ", B = " + b);
	       
	       Swapper swapper = new Swapper();
	       swapper.swap(a, b);
	                   
	   }
	}


	class Swapper {	    
	    
	    public void swap(int a, int b) {
	               
	        if(a >= 0 && b >= 0) {
	            
	            System.out.println("Time for some magic!");
	            
	            a = a + b;
	            b = a - b;
	            a = a - b;
	            
	            System.out.println("A = " + a + ", B = " + b);
	            
	        } else {
	            System.out.println("Wrong numbers");
	        }

	    }
	    
	}