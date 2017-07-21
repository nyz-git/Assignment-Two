package com.stackroute.datamunger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvHeaderReader {
	public String fetchHeader(String tableName) {
		String headerColumn = null;
		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\" + tableName + ".csv"));
			headerColumn = bufferedReader.readLine();
		} catch (IOException e) {
			System.out.println("Error While Fetching Header");
		}
		return headerColumn;
	}
}
