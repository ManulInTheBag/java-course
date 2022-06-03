package edu.au.covidreporter.repository;

import edu.au.covidreporter.model.ReportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data Repository for ReportEntity
 */
//DONE: declare as a Repository
@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Integer> /* DONE: extend JpaRepository interface with proper type parameters */ {

	/*
	TODO:
	 - place all methods to request data from 'report' DB table here (if you need any extra methods besides already
	 defined in the JpaRepository interface)
	 */

	  @Query(
	  		"select tab " +
            "from edu.au.covidreporter.model.ReportEntity as tab " +
            "order by tab.fileName desc"
            )
    public List<ReportEntity> getAllReports();
}
