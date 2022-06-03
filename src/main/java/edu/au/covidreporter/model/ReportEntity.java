package edu.au.covidreporter.model;

import javax.persistence.*;

/**
 * JPA Entity for 'report' database table.
 */
//DONE: declare as an Entity and do a correct mapping to the 'report' DB table
@Entity(name = "report_entity")
@Table(name = "report")
public class ReportEntity {

	/*
	DONE:
	 - add fields and map them to corresponding DB columns;
	 - map 'id' column to a field of type Integer;
	 - add annotations to a field mapped to 'id' column:
	   	@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	 - add getters and setters for fields.
	 */

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fileName")
    private String fileName;

    public Integer getId() { return id; }

    public void setFileName(String fileName) { this.fileName = fileName;}
    public String getFileName() { return fileName; }
}
