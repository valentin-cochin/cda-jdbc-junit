package cda.junit.menu.action;



public interface IAllActions {
	public static final Exit EXIT = new Exit();
	public static final ListAllSubjects LIST_ALL_SUBJECTS = new ListAllSubjects();
	public static final SetStudyDate SET_STUDY_DATE = new SetStudyDate();
	public static final EditSubjectState EDIT_SUBJECT_STATE = new EditSubjectState();
	public static final ListByState LIST_BY_LABEL = new ListByState();
	public static final ActionNotFound ACTION_NOT_FOUND = new ActionNotFound();
}
