package com.stackroute.datamunger;

import java.util.Scanner;

public class DataMunger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CsvHeaderReader csvHeaderReader = new CsvHeaderReader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of csv file");
		String csvName = sc.next();

		String headerName = csvHeaderReader.fetchHeader(csvName);
		System.out.println(headerName);

	}

}
