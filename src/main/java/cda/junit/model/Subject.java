package cda.junit.model;

import java.util.Date;

public class Subject {
	private int id;
	private String label;
	private String state;
	private Date studyDate;
	
	public Subject(String label, String state, Date studyDate) {
		this.label = label;
		this.state = state;
		this.studyDate = studyDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getStudyDate() {
		return studyDate;
	}

	public void setStudyDate(Date studyDate) {
		this.studyDate = studyDate;
	}
	
	public String toString() {
		return "Sujet n°" + this.id + "\nLabel: " + this.label + "\nÉtat: " + this.state + "\nÉtudié le: " + this.studyDate; 
	}
}
