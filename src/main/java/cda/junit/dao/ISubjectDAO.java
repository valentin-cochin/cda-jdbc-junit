package cda.junit.dao;

import java.util.List;

import cda.junit.model.Subject;

public interface ISubjectDAO {
	void setStudyDate(java.sql.Date date, int id);
	List<Subject> getAll();
	void updateState(String oldState, String newState);
	List<Subject> listByState(String state);
}
