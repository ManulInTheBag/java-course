package edu.au.covidreporter.service;

import edu.au.covidreporter.repository.CovidDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.List;

//DONE: declare as a Service
@Service("dictionaryService")
public class DictionaryService {

	//DONE: inject required repositories and services

	private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private final CovidDataRepository covidDataRepository;

    @Autowired
    public DictionaryService(CovidDataRepository covidDataRepository) {
        this.covidDataRepository = covidDataRepository;
    }

	/**
	 * Returns all different countries from the 'covid_data' table sorted ascending.
	 * @return all different countries sorted ascending
	 */
	public List<String> getAllCountries() {
		/*
		DONE: Get all distinct values from 'country_region' column of 'covid_data' table using CovidDataRepository.
			  Repository method must return only distinct values and the list must be already sorted ascending.
		 */
		return covidDataRepository.getAllCountries();
	}

}
