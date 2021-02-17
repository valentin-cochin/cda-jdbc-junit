package cda.junit.menu.action;

import static cda.junit.ihm.Ihm.IHM_INS;

final class SetStudyDate extends Action {
	private static final int ID = 2;
	private static final String DESC = "Renseigner la date du sujet";
	
	SetStudyDate() {
		super(ID, DESC);
	}

	@Override
	public boolean execute() {
		IHM_INS.display("> ");
		
		return Boolean.TRUE;
	}
}
