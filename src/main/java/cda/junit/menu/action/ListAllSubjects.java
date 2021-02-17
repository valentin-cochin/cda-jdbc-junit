package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

final class ListAllSubjects extends Action{
	private static final int ID = 1;
	private static final String DESC = "Consulter tous les sujets étudiés";
	
	ListAllSubjects() {
		super(ID, DESC);
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> ");
		
		return Boolean.TRUE;
	}
}
