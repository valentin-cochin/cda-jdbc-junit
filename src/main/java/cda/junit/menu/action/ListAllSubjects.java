package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

import java.util.List;

import cda.junit.dao.ISubjectDAO;
import cda.junit.daosql.SubjectDAOImpl;
import cda.junit.model.Subject;

final class ListAllSubjects extends Action{
	private static final int ID = 1;
	private static final String DESC = "Consulter tous les sujets étudiés";
	private ISubjectDAO subjectDAO;
	
	ListAllSubjects() {
		super(ID, DESC);
		this.subjectDAO = new SubjectDAOImpl();
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> ");
		List<Subject> subjects = this.subjectDAO.getAll();
		for (Subject subject : subjects) {			
			IHM_INS.display(subject.toString());
		}
		return Boolean.TRUE;
	}
}
