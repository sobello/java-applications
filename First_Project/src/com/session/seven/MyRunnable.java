package com.session.seven;

class MyRunnable implements Runnable {
	private String name;

	public MyRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name + " started at " + new java.util.Date());
		for (int i = 1; i < 6; i++) {
			System.out.println(i + " from thread " + name);
		}
		System.out.println(name + " ended at " + new java.util.Date());
	}
}
