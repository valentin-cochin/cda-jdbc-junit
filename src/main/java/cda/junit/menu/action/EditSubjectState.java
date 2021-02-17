package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

final class EditSubjectState extends Action {
	private static final int ID = 3;
	private static final String DESC = "Éditer l'état d'un sujet";
	
	EditSubjectState() {
		super(ID, DESC);
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> ");
		
		return Boolean.TRUE;
	}
}
