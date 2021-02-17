package cda.junit.daosql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cda.junit.dao.ISubjectDAO;
import cda.junit.model.Subject;

public class SubjectDAOImpl implements ISubjectDAO {

	@Override
	public void setStudyDate(Date date) {
		// rajouter id en paramètre
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE subject SET studyDate=? WHERE id=?");
				ps.setDate(1, (java.sql.Date) date);
				// ps.setInt(2, id);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Subject> getAll() {
		List<Subject> subjects = new ArrayList<>();
		Connection c = MyConnection.getConnection();

		if (c != null) {
			try {

				PreparedStatement statement = c.prepareStatement("SELECT * FROM Subject");
				ResultSet r = statement.executeQuery();

				while (r.next()) {
					subjects.add(new Subject(r.getString("label"), r.getString("state"), r.getDate("studyDate")));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return subjects;
	}

	@Override
	public void updateState(String oldState, String newState) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				c.close();
//			}
//		}

	}

	@Override
	public List<Subject> listByLabel(String label) {
//		Connection c = MyConnection.getConnection();
//		if (c != null) {
//			try {
//				
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} finally {
//				c.close();
//			}
//		}
		return null;
	}

}
