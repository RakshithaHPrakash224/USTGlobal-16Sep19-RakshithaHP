package com.ustglobal.thread.defining;

public class TestThread {

	public static void main(String[] args) {

		System.out.println("Main Started");

		MyThread t1 = new MyThread();
		t1.start();   // register the thread with thread scheduler  and it will intarally call run metho
		/*
		 * dont call run() method , it behaves like normal propgm All code will be
		 * excuted inside main thread only
		 */
		//t1.run();
		for (int i = 0; i < 10 ; i++) {
			System.out.println("main thread");

		}
		System.out.println("Main Ended");
	}
}
