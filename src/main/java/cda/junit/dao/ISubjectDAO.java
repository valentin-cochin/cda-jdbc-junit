package cda.junit.dao;

import java.util.List;

import cda.junit.model.Subject;

public interface ISubjectDAO {
	void setStudyDate(java.sql.Date date, int id);
	List<Subject> getAll();
	void updateLabel(String newLabel, int id);
	List<Subject> listByState(String state);
}
