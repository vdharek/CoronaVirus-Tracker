package io.devdharek.CoronavirusApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.devdharek.CoronavirusApplication.Model.ApiData;
import io.devdharek.CoronavirusApplication.services.CoronaDataService;

@RestController
@RequestMapping("/")
public class Controller {

	private CoronaDataService coronaDataService;
	
	public Controller(CoronaDataService coronaDataService) {
		this.coronaDataService = coronaDataService;
	}
	
	@GetMapping("/list")
	public Iterable<ApiData> list(){
		return coronaDataService.list();
	}
	
}
