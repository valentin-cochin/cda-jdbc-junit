package cda.junit.daosql;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import cda.junit.daosql.MyConnection;

import cda.junit.dao.ISubjectDAO;
import cda.junit.model.Subject;

public class SubjectDAOImpl implements ISubjectDAO {

	@Override
	public void setStudyDate(Date date) {
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
	public List<Subject> getAll() {
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
