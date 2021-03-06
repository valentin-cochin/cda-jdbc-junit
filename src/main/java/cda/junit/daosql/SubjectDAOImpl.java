package cda.junit.daosql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cda.junit.dao.ISubjectDAO;
import cda.junit.model.Subject;

public class SubjectDAOImpl implements ISubjectDAO {
	
	@Override
	public void createSubject(Subject subject) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("INSERT INTO Subject (id, label, state, studyDate) VALUES (?, ?, ?, ?)");
				ps.setInt(1, subject.getId());
				ps.setString(2, subject.getLabel());
				ps.setString(3, subject.getState());
				ps.setDate(4, (java.sql.Date) subject.getStudyDate());
				ps.execute();				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Subject getSubjectById(int id) {
		Connection c = MyConnection.getConnection();
		Subject subject = null;
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Subject WHERE id=?");
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					subject = new Subject(rs.getInt("id"), rs.getString("label"), rs.getString("state"), rs.getDate("studyDate"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return subject;
	}

	@Override
	public void setStudyDate(java.sql.Date date, int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE Subject SET studyDate=? WHERE id=?");
				ps.setDate(1, date);
				ps.setInt(2, id);
				ps.executeUpdate();
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
					subjects.add(new Subject(r.getInt("id"), r.getString("label"), r.getString("state"),
							r.getDate("studyDate")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return subjects;
	}

	@Override
	public void updateLabel(String newLabel, int id) {
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("UPDATE subject SET label=? WHERE id=?");
				ps.setString(1, newLabel);
				ps.setInt(2, id);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public List<Subject> listByState(String state) {
		List<Subject> subjects = new ArrayList<>();
		Connection c = MyConnection.getConnection();
		if (c != null) {
			try {
				PreparedStatement ps = c.prepareStatement("SELECT * FROM Subject WHERE state=?");
				ps.setString(1, state);
				ResultSet r = ps.executeQuery();

				while (r.next()) {
					subjects.add(new Subject(r.getInt("id"), r.getString("label"), r.getString("state"),
							r.getDate("studyDate")));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return subjects;
	}	
}
