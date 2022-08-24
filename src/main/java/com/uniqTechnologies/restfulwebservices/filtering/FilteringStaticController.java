package com.uniqTechnologies.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringStaticController {

	// field1,field2
	@GetMapping("/filtering-static")
	public SomeBeanStatic retrieveSomeBean() {
		SomeBeanStatic someBean = new SomeBeanStatic("value1", "value2", "value3");

		return someBean;
	}

	@GetMapping("/filteringstatic-list")
	public List<SomeBeanStatic> retrieveListOfSomeBean() {

		List<SomeBeanStatic> somebeanlist = Arrays.asList(new SomeBeanStatic("value1", "value2", "value3"),
				new SomeBeanStatic("value12", "value22", "value33"));

		return somebeanlist;
	}

}
