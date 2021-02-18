package cda.junit.test;

import static cda.junit.ihm.Ihm.IHM_INS;

import java.util.TreeMap;

import cda.junit.ihm.WrongInputException;
import cda.junit.menu.action.Action;
import cda.junit.menu.action.IAllActions;

public class Program {
	public static void main(String[] args) {
		TreeMap<Integer, Action> actions = new TreeMap<>();
		addAllActions(actions);
		
		boolean isContinue;
		int vActionSaisie = IAllActions.ACTION_NOT_FOUND.getId();
		do {
			IHM_INS.display("\n*******************\nSaisissez une action");
			for (Action action : actions.values()) {
				IHM_INS.display("\t" + action.getId() + ")- " + action.getDescription());
			}
			try {
				vActionSaisie = IHM_INS.readNaturalNb();
			} catch (WrongInputException e) {
				vActionSaisie = IAllActions.ACTION_NOT_FOUND.getId();
			}
			isContinue = actions.getOrDefault(vActionSaisie, IAllActions.ACTION_NOT_FOUND).execute();
		} while (isContinue);

	}

	private static void addAllActions(TreeMap<Integer, Action> actions) {
		addAction(actions, IAllActions.EXIT);
		addAction(actions, IAllActions.LIST_ALL_SUBJECTS);
		addAction(actions, IAllActions.SET_STUDY_DATE);
		addAction(actions, IAllActions.EDIT_SUBJECT_STATE);
		addAction(actions, IAllActions.LIST_BY_LABEL);
	}

	private static void addAction(TreeMap<Integer, Action> actions, Action action) {
		actions.put(action.getId(), action);
	}
}