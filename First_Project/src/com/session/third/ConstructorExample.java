package com.session.third;

public class ConstructorExample {
	private String session;
	private int noOfPersons;

	public ConstructorExample() {
		session = "weekends";

	}

	public ConstructorExample(String session, int noOfPersons) {
		if (session.equals("solomon") || session.equals("pradeep") || session.equals("dappy") || session.equals("musty")
				|| session.equals("kola") || session.equals("gbenga")) {
			this.session = session;
			this.noOfPersons = noOfPersons;
		}
	}

	public String getSession() {
		return session;
	}

	public int getNoOfPersons() {
		return noOfPersons;
	}

	@Override
	public String toString() {
		return "ConstructorExample [session=" + session + ", noOfPersons=" + noOfPersons + "]";
	}

}
