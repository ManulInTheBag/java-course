package edu.au.covidreporter.dto;

import java.util.StringJoiner;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * DTO for incoming parameters for report creation.
 */

//TODO(*): validation: fromDate is before toDate
public class CreateReportParametersDto {

	//DONE: validation: not blank
	@NotBlank
	private String country;

	//DONE: validation: not blank
	//DONE: validation: matches pattern "^\\d{4}-\\d{2}-\\d{2}$"
	@NotBlank
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")
	//TODO(*): validation: this is a real date (the pattern above will accepts, for example, '9999-99-99')
	private String fromDate;

	//DONE: validation: not blank
	//DONE: validation: matches pattern "^\\d{4}-\\d{2}-\\d{2}$"
	@NotBlank
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$")
	//TODO(*): validation: this is a real date (the pattern above accepts, for example, '9999-99-99')
	private String toDate;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", CreateReportParametersDto.class.getSimpleName() + "[", "]")
				.add("country='" + country + "'")
				.add("fromDate='" + fromDate + "'")
				.add("toDate='" + toDate + "'")
				.toString();
	}
}
