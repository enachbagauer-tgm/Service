package check;

import helpTasksMath.*;

public class CheckInputString {
	private String in;
	private String[] emptyString;
	private DBConn db;

	public CheckInputString(String in) {
		db = new DBConn();

		this.in = in;
		this.in.toLowerCase();

		String[] emptyString = new String[] { " ", "", "\t", "\n" };

	}

	private boolean isEmpty() {
		if (in.equals("")) {
			return true;
		}
		for (int i = 0; i < emptyString.length; i++) {
			if (in.equals(emptyString[i].toString())) {
				return true;
			}
		}
		return false;
	}

	private String[] splitt() {
		if (!isEmpty()) {
			return in.split(":");
		}
		return new String[] { "error", "getCommand" };
	}

	public String sort() {
		Type type = new EmptyType();

		String resault = "NA";
		if (!isEmpty()) {
			if (db.requestExsits(in)) {
				return db.sendDBResault();
			} else {
				switch (splitt()[0].toString()) {
				case "#pi":
					type = new Pi();
					break;
				case "#fibo":
					type = new Fibonacci(splitt()[1].toString());

				default:
					break;
				}
				type.getTask();
				resault = type.resault();
			}

		} else {
			return "Your Input is Empty";
		}
		return resault;
	}

}
