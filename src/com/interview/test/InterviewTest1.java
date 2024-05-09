package com.interview.test;

public class InterviewTest1 {
	
	//(3,-3)(4,-4)(3,1,-4)
	// {1,3,5,-3,-2,}
	
	static int  count = 1;
	static int range = 10 ;
	
	public  void printEvenNumber() throws InterruptedException {
		
		while( count < range) {
			synchronized (this) {
				if(count % 2 == 0) {
					System.out.println("Even Nmber"+ count );
					count++;
					this.notify();
				}else {
					this.wait();
				}
				
				
			}
			
		}
		
	}
	
	public  void printoddNumber( ) throws InterruptedException {
		
		while( count < range) {
			synchronized (this) {
				if(count % 2 != 0) {
					System.out.println("odd Nmber"+ count );
					count++;
					this.notify();
				}else {
					this.wait();
				}
				
				
			}
			
		}
		
	}
	



	public static void main(String[] args) {
		
		InterviewTest1 test = new InterviewTest1();
		
		Thread t1 = new Thread(() -> {
			try {
				test.printEvenNumber();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		Thread t2 = new Thread(() -> {
			try {
				test.printoddNumber();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
		t1.start();
		t2.start();
		
		
		
		
	}

}
