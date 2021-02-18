package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

import java.time.LocalDate;

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
		try {
			int id = IHM_INS.readNaturalNb();
			
			IHM_INS.display("Donnez la nouvelle annnée");
			int year = IHM_INS.readNaturalNb();
			
			IHM_INS.display("Donnez le nouveau mois");
			int month = IHM_INS.readNaturalNb();
			
			IHM_INS.display("Donnez le nouveau jour");
			String day = IHM_INS.readWord();
			
			LocalDate date = LocalDate.parse(year + "-" + month + "-" + day);
			this.subjectDAO.setStudyDate(java.sql.Date.valueOf(date), id);
		} catch (WrongInputException e) {
			e.printStackTrace();
		}
		return Boolean.TRUE;
	}
}
