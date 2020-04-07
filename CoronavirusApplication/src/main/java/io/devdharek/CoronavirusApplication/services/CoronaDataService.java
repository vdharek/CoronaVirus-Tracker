package io.devdharek.CoronavirusApplication.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.devdharek.CoronavirusApplication.Model.ApiData;
import io.devdharek.CoronavirusApplication.Repository.DataRepository;

@Service
public class CoronaDataService {
	
	/*private static HttpsURLConnection connection;
	
	@PostConstruct
	public void dataService() {
		
		try {
			
			RestTemplate restTemplate = new RestTemplate();
			
			ApiData[] apiData = 
					restTemplate.getForEntity("https://covid19.mathdro.id/api/confirmed", ApiData[].class).getBody();
			
			for(ApiData baseApidata : apiData) {
				dataRepository.save(baseApidata);
			}
		}catch(Exception e) {
			
		}
		
	}
	
	/*@PostConstruct
	public void dataServices() {
		
		try {
			URL url = new URL("https://covid19.mathdro.id/api");
			connection = (HttpsURLConnection) url.openConnection();
			
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			
			int status = connection.getResponseCode();
			System.out.println("the status code is : "+status);	
			
		}catch (MalformedURLException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}*/
	
	private DataRepository dataRepository;
	
	public CoronaDataService(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	public Iterable<ApiData> list() {
        return dataRepository.findAll();
    }

    public ApiData save(ApiData apiData) {
        return dataRepository.save(apiData);
    }

    public void save(List<ApiData> apiData) {
    	dataRepository.saveAll(apiData);
    }
	
}
