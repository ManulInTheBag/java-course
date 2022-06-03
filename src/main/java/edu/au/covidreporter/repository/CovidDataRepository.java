package edu.au.covidreporter.repository;

/**
 * Spring Data Repository for CovidDataEntity
 */
import edu.au.covidreporter.model.CovidDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
//DONE: declare as a Repository
@Repository
public interface CovidDataRepository extends JpaRepository<CovidDataEntity, Integer> /* DONE: extend JpaRepository interface with proper type parameters */ {

	/*
	DONE:
	 - place all methods to request data from 'covid_data' DB table here.
	 - use 'Query' annotations or specially named methods for queries
	 */

	 @Query(
	 		"select distinct table.countryRegion " +
            "from edu.au.covidreporter.model.CovidDataEntity as table " +
            "order by table.countryRegion asc"
            )
    List<String> getAllCountries();

    @Query(
    	   "select covid " +
           "from edu.au.covidreporter.model.CovidDataEntity as covid " +
           "where covid.countryRegion = :country and covid.date between :from and :to " +
           "order by covid.date"
           )
    List<CovidDataEntity> getBetweenDates(@Param("from") LocalDate from, @Param("to") LocalDate to, @Param("country") String country);
}
