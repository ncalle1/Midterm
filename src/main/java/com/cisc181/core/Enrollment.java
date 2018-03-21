package com.cisc181.core;

import java.util.UUID;

public class Enrollment {

		private UUID SectionID;
		
		private UUID StudentID;
		
		private UUID EnrollmentID;
		
		private double Grade; 
	
	
		Enrollment() {
			
		}
	
		
		public Enrollment(UUID StudentID, UUID SectionID)
		{
			this.StudentID=StudentID;
			this.SectionID=SectionID;
			EnrollmentID=EnrollmentID.randomUUID();
			
			
			
		}
	
	public void setGrade(double Grade) {
		
		this.Grade=Grade;
		
	}
	
	
}
