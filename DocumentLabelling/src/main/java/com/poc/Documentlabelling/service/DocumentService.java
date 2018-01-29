package com.poc.Documentlabelling.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.poc.Documentlabelling.entity.Document;


public interface DocumentService {
	
 public	List<Document> getAllDocuments();

}






/*package com.poc.Documentlabelling.service;

import java.util.Map;

public interface DocumentService {
	
	public Map<String,Map> findAllDocs();

}
*/