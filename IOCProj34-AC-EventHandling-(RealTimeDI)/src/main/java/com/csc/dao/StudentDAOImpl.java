package com.csc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.csc.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	private static final String STUDENT_INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
	private DataSource ds;

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {

		Connection con = null;
		PreparedStatement pst = null;
		con = ds.getConnection();
		pst = con.prepareStatement(STUDENT_INSERT_QUERY);
		pst.setInt(1, bo.getSno());
		pst.setString(2, bo.getSname());
		pst.setInt(3, bo.getTotal());
		pst.setFloat(4, bo.getAvg());
		pst.setString(5, bo.getResult());
		return pst.executeUpdate();
	}

}