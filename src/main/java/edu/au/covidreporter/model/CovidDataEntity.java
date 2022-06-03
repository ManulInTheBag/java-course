package edu.au.covidreporter.model;

import java.time.LocalDate;
import javax.persistence.*;

/**
 * JPA Entity for 'covid_data' database table.
 */
//DONE: declare as an Entity and do a correct mapping to the 'covid_data' DB table
@Entity(name = "CovidDataEntity")
@Table(name = "covid_data")
public class CovidDataEntity {

	/*
	DONE:
	 - add fields and map them to corresponding DB columns;
	 - add @Id annotation to a field mapped to 'id' column;
	 - add getters and setters for all fields.
	 */

	 //Я подумал головой и понял, что добавлять все не нужно - количество смертей и т.д. может считать и сама бд прям внутри, данных хватает
	 //другое дело, что реализовывать мне это лень, хе-хе
	 //еще бы такой логикой не пропустить на самом деле важное поле

	 //Columns

	@Id
    private Integer id;

    @Column(name = "date_year")
    private Integer dateYear;

    @Column(name = "date_month")
    private Integer dateMonth;

    @Column(name = "date_day")
    private Integer dateDay;

    @Column(name = "country_region")
    private String countryRegion;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "province_state")
    private String provinceState;

    @Column(name = "confirmed_diff")
    private Integer confirmedDiff;

    @Column(name = "deaths_diff")
    private Integer deathsDiff;

    @Column(name = "recovered_diff")
    private Integer recoveredDiff;

	//DONE: map to 'date' column
	@Column(name = "date")
    private LocalDate date;  // use LocalDate for the 'date' column mapping

    //Getters&Setters

    public Integer getId() { return id; }

    public void setDateYear(Integer dateYear) { this.dateYear = dateYear; }
    public Integer getDateYear() { return dateYear; }

    public void setDateMonth(Integer dateMonth) { this.dateMonth = dateMonth; }
    public Integer getDateMonth() {return dateMonth;}

    public void setDateDay(Integer dateDay) {this.dateDay = dateDay; }
    public Integer getDateDay() {return dateDay;}

    public void setCountryRegion(String countryRegion) { this.countryRegion = countryRegion; }
    public String getCountryRegion() { return countryRegion; }

    public void setLatitude(Double latitude) { this.latitude = latitude; }
    public Double getLatitude() { return latitude; }

    public void setLongitude(Double longitude) {this.longitude = longitude; }
    public Double getLongitude() { return longitude; }

    public void setProvinceState(String provinceState) { this.provinceState = provinceState; }
    public String getProvinceState() { return provinceState; }

    public void setConfirmedDiff(Integer confirmedDiff) { this.confirmedDiff = confirmedDiff;}
    public Integer getConfirmedDiff() { return confirmedDiff; }

    public void setDeathsDiff(Integer deathsDiff) { this.deathsDiff = deathsDiff; }
    public Integer getDeathsDiff() { return deathsDiff; }

    public void setRecoveredDiff(Integer recoveredDiff) { this.recoveredDiff = recoveredDiff; }
    public Integer getRecoveredDiff() {return recoveredDiff; }

    public void setDate(LocalDate date) { this.date = date; }
    public LocalDate getDate() { return date; }
}
