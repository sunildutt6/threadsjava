package com.synchronize;

import java.io.*;
import java.util.*;

class Sender {
	public void send(String msg) {
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

class ThreadedSend extends Thread {
	private String msg;
	private Thread t;
	Sender sender;

	public ThreadedSend(String m, Sender obj) {

		msg = m;
		sender = obj;
	}

	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
	}

}

 class SyncDemo {
	public static void main(String[] args) throws InterruptedException {

		Sender snd = new Sender();
		ThreadedSend s1 = new ThreadedSend("Hi ", snd);
		ThreadedSend s2 = new ThreadedSend("Bye ", snd);
		s1.start();
		s1.join();
		s2.start();
		s2.join();
		
		
		

	}
}
 
 
