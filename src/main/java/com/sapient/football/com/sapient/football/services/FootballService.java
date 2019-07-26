package com.sapient.football.com.sapient.football.services;

import com.sapient.football.models.ResponseModel;
import org.json.JSONObject;
import org.omg.CORBA.ObjectHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FootballService {


    @Value("${footballMatchURL}")
    private String matchURL;
    @Autowired
    RestTemplate restTemplate;

    @Bean
    RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    public String  getFootballMatchData(String action,String apikey){


    String uri=matchURL+"action="+action+"&APIkey="+apikey;
        System.out.println("URI is"+uri);
        ResponseEntity<String> responseEntity= restTemplate.getForEntity(uri, String.class);


        return responseEntity.getBody();
    }
}
