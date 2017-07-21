package com.stackroute.datamunger.commander;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.stackroute.datamunger.CsvHeaderReader;

public class DataMungerTest {

	static CsvHeaderReader csvHeaderReader;
	
	@BeforeClass
	public static void init() {
		csvHeaderReader = new CsvHeaderReader();
	}
	
	@Test
	public void fetchingHeader(){
		//fetching the emp file
		String header = csvHeaderReader.fetchHeader("emp");
		assertEquals("empid,name,city,salary,dept",header);
	}

}
