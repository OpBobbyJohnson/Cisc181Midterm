package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {

	}
	
	@Test
	public void testStaff() {
		ArrayList<Staff> TestStaff = new ArrayList<Staff>();
		Staff One = new Staff(
				"Bob",
				"Joe",
				"Smith",
				new Date(1997, 20, 2015),
				"804 North Country Club Dr, Newark DE",
				"1234567890",
				"someGuy@udel.edu",
				"None",
				1,
				50000.00,
				new Date(2017, 19, 3),
				eTitle.MR);
		TestStaff.add(One);
		
		Staff Two = new Staff(
				"Bob",
				"Joe",
				"Smith",
				new Date(1997, 20, 2015),
				"804 North Country Club Dr, Newark DE",
				"1234567890",
				"someGuy@udel.edu",
				"None",
				2,
				25000.00,
				new Date(2017, 19, 3),
				eTitle.MR);
		TestStaff.add(Two);
		
		Staff Three = new Staff(
				"Bob",
				"Joe",
				"Smith",
				new Date(1997, 20, 2015),
				"804 North Country Club Dr, Newark DE",
				"1234567890",
				"someGuy@udel.edu",
				"None",
				3,
				1000.00,
				new Date(2017, 19, 3),
				eTitle.MR);
		TestStaff.add(Three);
		
		Staff Four = new Staff(
				"Bob",
				"Joe",
				"Smith",
				new Date(1997, 20, 2015),
				"804 North Country Club Dr, Newark DE",
				"1234567890",
				"someGuy@udel.edu",
				"None",
				4,
				10000.00,
				new Date(2017, 19, 3),
				eTitle.MR);
		TestStaff.add(Four);
		
		Staff Five = new Staff(
				"Bob",
				"Joe",
				"Smith",
				new Date(1997, 20, 2015),
				"804 North Country Club Dr, Newark DE",
				"1234567890",
				"someGuy@udel.edu",
				"None",
				5,
				5000.00,
				new Date(2017, 19, 3),
				eTitle.MR);
		TestStaff.add(Five);
		
		double AverageSalary = 0;
		for (Staff st : TestStaff) {
			AverageSalary += st.getSalary();
		}
		AverageSalary /= 5;
		
		int ave = (int) AverageSalary;
		
		assertEquals(ave,18200);
	}	
	@Test
	public void testPhone(){
		Staff One = new Staff(
				"Bob",
				"Joe",
				"Smith",
				new Date(1997, 20, 2015),
				"804 North Country Club Dr, Newark DE",
				"24567890",
				"someGuy@udel.edu",
				"None",
				1,
				50000.00,
				new Date(2017, 19, 3),
				eTitle.MR);
		boolean thrown = false;

		    String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
			 
			Pattern pattern = Pattern.compile(regex);
			try{
				 Matcher matcher = pattern.matcher(One.getPhone());
				if (!matcher.matches()){
					throw new PersonException("this number is invalid.");
				}
		  } catch (PersonException ex){
			  thrown = true;
		  }
		    
		  

		  assertTrue(thrown);
		  
	}
}