package com.cricket.ipl.conroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.ipl.enetites.CircketIplEntity;
import com.cricket.ipl.service.CricketImpService;
/**
 * @author Raquif Roshan
 *
 */
@RestController
@RequestMapping(value="/api/cricketipl")
public class CricketControllers {
	CricketImpService cricketImpService;
	
	public CricketControllers(CricketImpService cricketImpService) {
		this.cricketImpService=cricketImpService;
		
	}
	@PostMapping("/add")
	public ResponseEntity<String> addMatch(@RequestBody CircketIplEntity circketIplEntity){
		
		return new ResponseEntity<String>(cricketImpService.AddIplMatch(circketIplEntity), HttpStatus.CREATED);
		
	}
  public ResponseEntity<String >getMatch(){
	return null;
	  
  }
}
