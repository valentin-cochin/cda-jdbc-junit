package cda.junit.dao;

import java.util.Date;
import java.util.List;
import cda.junit.model.Subject;

public interface ISubjectDAO {
	void setStudyDate(Date date);
	List<Subject> getAll();
	void updateState(String oldState, String newState);
	List<Subject> listByLabel(String label);
}
