package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static ArrayList<Staff> staff= new ArrayList<Staff>(); 
	private static ArrayList<Staff> staff2= new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		int x=0; 
		double sal=900.0;
		while (x<5) {
			
			staff.add(new Staff("Bob", "Billy", "Bob",new Date(1900, 11, 10), "Hershey Drive", "(444)-444-4444","ncalle@udel.edu", "7-5",
					3,sal+=100.0, new Date(1900,10,17), eTitle.MR ));
			x++;
		}
		staff2.add(new Staff("Bob", "Billy", "Bob",new Date(1600, 12, 18), "Hershey Drive", "(444)-444-4444","ncalle@udel.edu", "7-5",
				3,sal+=100.0, new Date(2000,10,17), eTitle.MR ));
	}
	
	@Test
	public void test() {
		double total=0;
		
		for(Staff i:staff) {
			total+=i.getSalary();
		}
		
		assertEquals((total/5.0),1200.0, 0.00001);

	}	

}
