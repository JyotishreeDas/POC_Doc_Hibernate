package com.poc.Documentlabelling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.poc.Documentlabelling.DAO.DocumentDaoImpl;
import com.poc.Documentlabelling.entity.Document;

@Service("employeeService")
@Transactional

public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentDaoImpl documentDAO;
	
	@Override
	public List<Document> getAllDocuments() {
	     
	    List<Document> list = documentDAO.getAllDocuments();
	    return documentDAO.getAllDocuments();
	}
}




/*package com.poc.Documentlabelling.service;

import java.io.File;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.poc.Documentlabelling.DAO.DocumentDao;
import com.poc.Documentlabelling.DAO.DocumentDaoImpl;
import com.poc.Documentlabelling.entity.Document;

@Service
public class DocumentServiceImpl implements DocumentService {
	
	@Autowired
	//private DocumentDao documentDAO;
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Document> getAllDocuments(){
		
		DocumentDao documentDAO = new DocumentDaoImpl(jdbcTemplate);
		return documentDAO.getAllDocuments();
		
	}
	
	
}


*/





/*package com.poc.Documentlabelling.service;

import java.io.File;
import java.util.*;

public class DocumentServiceImpl implements DocumentService {
	
	public Map<String,Map> findAllDocs(){
		Map<String,Map> result = new HashMap<>();
		String FileDir = "D:\\POC_Doc_labelling\\DocumentLabelling\\src\\main\\resources\\waybill\\";
	
	    File folder = new File(FileDir);
	    File[] listOfFiles = folder.listFiles();
	
	    Map<Integer,Map<String,String>> counter = new HashMap<>();
	   
	    for( int i=0; i < listOfFiles.length; i++){
	    	Map<String,String> fl = new HashMap<>();
	    		fl.put("name",listOfFiles[i].getName());
	    		fl.put("path",FileDir+listOfFiles[i].getName());
	    		
	    	counter.put(i, fl);
	    	
	     }
		    
		    
		result.put("FileList", counter);
    
		return result;
	}
}
*/