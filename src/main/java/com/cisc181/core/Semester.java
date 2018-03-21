package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID StudentID;
	
	private Date StartDate;
	
	private Date EndDate;

	public Semester(UUID studentID, Date startDate, Date endDate) {
		super();
		StudentID = studentID;
		StartDate = startDate;
		EndDate = endDate;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public Date getEndDate() {
		return EndDate;
	}

	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	
	
}