package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		 ArrayList<Course> courseRecords= new ArrayList<Course>();
		 ArrayList<Semester> semester= new ArrayList<Semester>();
		 ArrayList<Section> section= new ArrayList<Section>();
		 ArrayList<Student> students=new ArrayList<Student>();

		 courseRecords.add(new Course(UUID.randomUUID(), "Science", 80,eMajor.COMPSI));
		 courseRecords.add(new Course(UUID.randomUUID(), "Science", 85,eMajor.COMPSI));
		 courseRecords.add(new Course(UUID.randomUUID(), "Science", 90,eMajor.COMPSI));
		 
		 semester.add(new Semester(UUID.randomUUID(), new Date(Calendar.AUGUST), new Date(Calendar.DECEMBER)));
		 semester.add(new Semester(UUID.randomUUID(), new Date(Calendar.FEBRUARY), new Date(Calendar.MAY)));
		 
		 for(int i=0; i<6; i++) {
		 section.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 10));
		 }
		 
		 for(int i=0; i<10; i++) {
			  students.add(new Student("Noah", "Wyatt", "Calle", new Date(1960, 7, 20), eMajor.COMPSI,
						"Hershey", "(444)-444-4444", "ncalle@udel.edu"));
		 }
		 
	}

	@Test
	public void test() {

		assertEquals(2.5,2.5);
			
		}
		
	}
