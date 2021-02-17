package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;
import cda.junit.dao.ISubjectDAO;
import cda.junit.daosql.SubjectDAOImpl;

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
		this.subjectDAO.getAll();
		return Boolean.TRUE;
	}
}
