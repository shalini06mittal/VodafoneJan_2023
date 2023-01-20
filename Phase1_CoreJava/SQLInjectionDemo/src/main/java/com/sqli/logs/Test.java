package com.sqli.logs;

public class Test {

	public static void main(String[] args) {
		PresidentDAO dao = new PresidentDAO();
		dao.getByLastName("Adams");

	}

}
