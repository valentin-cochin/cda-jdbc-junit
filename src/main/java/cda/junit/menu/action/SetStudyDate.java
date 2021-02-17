package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

import cda.junit.dao.ISubjectDAO;
import cda.junit.daosql.SubjectDAOImpl;
import cda.junit.ihm.WrongInputException;

final class SetStudyDate extends Action {
	private static final int ID = 2;
	private static final String DESC = "Renseigner la date du sujet";
	private ISubjectDAO subjectDAO;
	
	SetStudyDate() {
		super(ID, DESC);
		this.subjectDAO = new SubjectDAOImpl();
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> ");
		IHM_INS.display("Donnez l'id du dont vous voulez modifier la date");
		int id;
		try {
			IHM_INS.readNaturalNb();
		} catch (WrongInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Boolean.TRUE;
	}
}
