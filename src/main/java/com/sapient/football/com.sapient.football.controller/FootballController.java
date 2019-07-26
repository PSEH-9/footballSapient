package com.sapient.football.com.sapient.football.controller;

import com.sapient.football.com.sapient.football.services.FootballService;
import com.sapient.football.models.ResponseModel;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FootballController {

	@Autowired
	FootballService footballService;

	@RequestMapping(value = "/sample",method = RequestMethod.GET)
	public String getFootballData(@RequestParam String action, @RequestParam String APIkey){
		System.out.println("reponse is"+footballService.getFootballMatchData(action,APIkey).toString());
		return footballService.getFootballMatchData(action,APIkey);
	}

}
