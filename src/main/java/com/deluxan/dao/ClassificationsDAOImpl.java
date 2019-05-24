package com.deluxan.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.deluxan.model.Classifications;

public class ClassificationsDAOImpl implements ClassificationsDAO {
	
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void createClassification(Classifications classifications) {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			connection=dataSource.getConnection();
			String SQL="INSERT INTO mainclassification(main_class_id,main_class_name) VALUES(?,?)";
			ps=connection.prepareStatement(SQL);
		
			
			ps.setLong(1, classifications.getClassificationID());
			ps.setString(2, classifications.getClassificationName());
			int executeUpdate =ps.executeUpdate();
			
			if(executeUpdate>0) {
				System.out.println("classification is created");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		}
	}
}
