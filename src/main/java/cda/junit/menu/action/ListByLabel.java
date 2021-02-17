package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

import cda.junit.dao.ISubjectDAO;
import cda.junit.daosql.SubjectDAOImpl;
import cda.junit.ihm.WrongInputException;

final class ListByLabel extends Action{
	private static final int ID = 4;
	private static final String DESC = "Lister tous les sujets selon certaines conditions";
	private ISubjectDAO subjectDAO;
	
	ListByLabel() {
		super(ID, DESC);
		this.subjectDAO = new SubjectDAOImpl();
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> Comment voulez-vous lister les sujets ?");
		IHM_INS.display("0) Revenir en arrière");
		IHM_INS.display("1) Les sujet vus mais à revoir");
		IHM_INS.display("2) Les sujets à découvrir");
		IHM_INS.display("3) Les sujets compris à approfondir");
		int choice = 0;
		try {
			choice = IHM_INS.readNaturalNb();
		} catch (WrongInputException e) {
			e.printStackTrace();
		}
		switch (choice) {
		case 1:
			String label01 = "Vus mais à revoir";
			this.subjectDAO.listByLabel(label01);
			break;
		case 2:
			String label02 = "A découvrir";
			this.subjectDAO.listByLabel(label02);
			break;
		case 3:
			String label03 = "Compris, à approfondir si possible";
			this.subjectDAO.listByLabel(label03);
			break;
		default:
			break;
		}
		return Boolean.TRUE;
	}
}
