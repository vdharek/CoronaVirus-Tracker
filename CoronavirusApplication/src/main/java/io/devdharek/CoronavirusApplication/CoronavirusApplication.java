package io.devdharek.CoronavirusApplication;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.devdharek.CoronavirusApplication.Model.ApiData;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.devdharek.CoronavirusApplication.services.CoronaDataService;

@SpringBootApplication
public class CoronavirusApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusApplication.class, args);
	}
	
	/*@Bean
	CommandLineRunner runner(CoronaDataService coronaDataService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<ApiData>> typeReference = new TypeReference<List<ApiData>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/confirmed.json");
			try {
				List<ApiData> apiData = mapper.readValue(inputStream,typeReference);
				coronaDataService.save(apiData);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };
	}*/
	
	@Bean 
	CommandLineRunner runner(CoronaDataService coronaDataService) {
		return args->{
			
			try {
				
				RestTemplate restTemplate = new RestTemplate();
				
				ApiData[] apiData = 
						restTemplate.getForEntity("https://covid19.mathdro.id/api/confirmed", ApiData[].class).getBody();
				
				for(ApiData baseApidata : apiData) {
					coronaDataService.save(baseApidata);
				}
				System.out.println("Data Saved!");
			}catch(Exception e) {
				System.out.println("Unable to store data:");
			}
			
		};
	}
}
