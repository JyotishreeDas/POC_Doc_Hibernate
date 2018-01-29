package com.poc.Documentlabelling.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="aisservice_locEnvDB.FILES")

public class Document {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="file_id")
    
	private int file_id;
	
	@Column(name="file_name")
	private String file_name;
	
	@Column(name="file_size")
	private int file_size;
	
	@Column(name="file_content")
	private  byte[] file_content;
	
	@Column(name="MODIFICATIONCOUNTER")
	private int MODIFICATIONCOUNTER;
	
	

	public Document(int file_id, String file_name, int file_size, byte[] file_content) {
		super();
		this.file_id = file_id;
		this.file_name = file_name;
		this.file_size = file_size;
		this.file_content = file_content;
	}
	
	
	public int getFile_id() {
		return file_id;
	}

	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public int getFile_size() {
		return file_size;
	}

	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}

	public byte[] getFile_content() {
		return file_content;
	}

	public void setFile_content(byte[] file_content) {
		this.file_content = file_content;
	}
	
	public int getMODIFICATIONCOUNTER() {
		return MODIFICATIONCOUNTER;
	}


	public void setMODIFICATIONCOUNTER(int mODIFICATIONCOUNTER) {
		MODIFICATIONCOUNTER = mODIFICATIONCOUNTER;
	}

	

}





/*package com.poc.Documentlabelling.entity;


public class Document {
	private int ID;
	private String file_name;
	private int file_size;
	private  byte[] file_content;	
	private int MODIFICATIONCOUNTER;
	
	

	public Document()
	{
	
	}
		
	public Document(int ID, String file_name, int file_size, byte[] file_content, int MODIFICATIONCOUNTER) {
		super();
		this.ID = ID;
		this.file_name = file_name;
		this.file_size = file_size;
		this.file_content = file_content;
		this.MODIFICATIONCOUNTER= MODIFICATIONCOUNTER;
	}
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public int getFile_size() {
		return file_size;
	}
	public void setFile_size(int file_size) {
		this.file_size = file_size;
	}
	public byte[] getFile_content() {
		return file_content;
	}
	public void setFile_content(byte[] file_content) {
		this.file_content = file_content;
	}
	
	public int getMODIFICATIONCOUNTER() {
		return MODIFICATIONCOUNTER;
	}

	public void setMODIFICATIONCOUNTER(int mODIFICATIONCOUNTER) {
		MODIFICATIONCOUNTER = mODIFICATIONCOUNTER;
	}

}





*/