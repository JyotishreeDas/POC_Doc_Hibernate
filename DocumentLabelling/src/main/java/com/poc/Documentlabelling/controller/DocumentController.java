package com.poc.Documentlabelling.controller;

import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.poc.Documentlabelling.entity.Document;
import com.poc.Documentlabelling.service.DocumentService;
import com.poc.Documentlabelling.service.DocumentServiceImpl;


@RestController
@Controller
//@RequestMapping("docs")


public class DocumentController {
	
	@Autowired
	private DocumentService documentService;
	
	//@GetMapping("aisservice_locEnvDB.FILES")
	@RequestMapping("/getFiles")
	public ResponseEntity<List<Document>> getAllDocuments() {
		List<Document> list = documentService.getAllDocuments();
		return new ResponseEntity<List<Document>>(list, HttpStatus.OK);
		
		
	}
}













/*package com.poc.Documentlabelling.controller;

import java.util.Map;
import java.io.File;
import java.io.IOException;
import java.util.*;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.poc.Documentlabelling.service.DocumentService;
import com.poc.Documentlabelling.service.DocumentServiceImpl;


@RestController
public class DocumentController {
     
    
    @RequestMapping("/getFiles")
    public Map<String,Map> sample() throws IOException {
    	DocumentService documentService = new DocumentServiceImpl();
    	Map<String,Map> fileList = documentService.findAllDocs();
    	return fileList;
    }
}*/