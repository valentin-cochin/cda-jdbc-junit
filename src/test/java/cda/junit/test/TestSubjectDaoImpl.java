package cda.junit.test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileReader;
import java.sql.Connection;
import java.time.LocalDate;
import org.h2.tools.RunScript;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import cda.junit.daosql.MyConnection;
import cda.junit.daosql.SubjectDAOImpl;
import cda.junit.model.Subject;

class TestSubjectDaoImpl {
	static SubjectDAOImpl subjectDAOImpl;
	
	@BeforeAll
	static void init() throws Exception {
		subjectDAOImpl = new SubjectDAOImpl();
		Connection c = MyConnection.getConnection();
		RunScript.execute(c, new FileReader(TestSubjectDaoImpl.class.getResource("/data_script.sql").getFile()));
	}
	
	@Test
	void testGetSubjectById_idGiven_returnsSubjectWithSameId() {		
		java.sql.Date date = java.sql.Date.valueOf(LocalDate.parse("2020-11-20"));		
		Subject subject = new Subject(7, "testGetSubjectById", "A découvrir", date);
		SubjectDAOImpl subjectDAO = new SubjectDAOImpl();
		subjectDAO.createSubject(subject);
		Subject testedSubject = subjectDAO.getSubjectById(subject.getId());		
		assertEquals(subject.getId(), testedSubject.getId());
		assertEquals(subject.getLabel(), testedSubject.getLabel());
		assertEquals(subject.getState(), testedSubject.getState());
		assertEquals(subject.getStudyDate(), testedSubject.getStudyDate());
	}

	@Test
	void testSetStudyDate_givenDate_isDifferentFromOldDate() {
		SubjectDAOImpl subjectDao = new SubjectDAOImpl();
		Subject subject = subjectDao.getSubjectById(1);
		
		java.sql.Date date = java.sql.Date.valueOf(LocalDate.parse("2020-11-20"));	
		subjectDao.setStudyDate(date, subject.getId());
		
		Subject modifiedSubject = subjectDao.getSubjectById(1);
		assertEquals(date, modifiedSubject.getStudyDate());
	}
}
