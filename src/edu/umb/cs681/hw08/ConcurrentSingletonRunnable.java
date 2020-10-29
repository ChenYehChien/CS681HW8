package edu.umb.cs681.hw08;

public class ConcurrentSingletonRunnable implements Runnable {

	public void run() {
		try{
			for(int i = 0; i < 10; i++){
				System.out.println(ConcurrentSingleton.getInstance());
				Thread.sleep(2);
			}
		}catch(InterruptedException exception){}
	}
	
	public static void main(String[] args) {
		new Thread(new ConcurrentSingletonRunnable()).start(); //1
		new Thread(new ConcurrentSingletonRunnable()).start(); //2
		new Thread(new ConcurrentSingletonRunnable()).start(); //3
	}
	
}