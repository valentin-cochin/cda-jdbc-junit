package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

import cda.junit.dao.ISubjectDAO;
import cda.junit.daosql.SubjectDAOImpl;
import cda.junit.ihm.WrongInputException;

final class EditSubjectLabel extends Action {
	private static final int ID = 3;
	private static final String DESC = "Éditer le nom d'un sujet";
	private ISubjectDAO subjectDAO;
	
	EditSubjectLabel() {
		super(ID, DESC);
		this.subjectDAO = new SubjectDAOImpl();
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> ");
		
		try {
			IHM_INS.display("Donnez l'id du dont vous voulez modifier le nom du cours");
			int id = IHM_INS.readNaturalNb();

			IHM_INS.display("Donnez le nouveau nom");
			String newLabel = IHM_INS.readWord();
			
			this.subjectDAO.updateLabel(newLabel, id);
		} catch (WrongInputException e) {
			e.printStackTrace();
		}
		return Boolean.TRUE;
	}
}
