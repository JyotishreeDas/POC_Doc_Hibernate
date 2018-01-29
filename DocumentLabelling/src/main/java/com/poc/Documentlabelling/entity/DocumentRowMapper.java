/*package com.poc.Documentlabelling.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;  

public class DocumentRowMapper implements RowMapper<Document> {
	
	@Override
	public Document mapRow(ResultSet row, int rowNum) throws SQLException {
		Document doc = new Document();
		doc.setID(row.getInt("ID"));
		doc.setFile_name(row.getString("file_name"));
		doc.setFile_size(row.getInt("file_size"));
		doc.setFile_content(row.getBytes("file_content"));
		doc.setMODIFICATIONCOUNTER(row.getInt("MODIFICATIONCOUNTER"));
		return doc;

  }
}
*/