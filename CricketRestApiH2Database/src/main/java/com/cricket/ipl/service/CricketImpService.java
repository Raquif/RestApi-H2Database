package com.cricket.ipl.service;



import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cricket.ipl.enetites.CircketIplEntity;
import com.cricket.ipl.repo.CricketIplRepo;
/**
 * @author Raquif Roshan
 *
 */
@Service
public class CricketImpService {
	private CricketIplRepo cricketIplRepo;
	
	
	CricketImpService(CricketIplRepo cricketIplRepo){
		this.cricketIplRepo=cricketIplRepo;
		
	}
	
	public String AddIplMatch(CircketIplEntity  circketIplEntity) {
		cricketIplRepo.save(circketIplEntity);
		
		return "Match Stored....";
		
	}
	
	public CircketIplEntity getmatchById(CircketIplEntity circketIplEntity) {
		
	Optional<CircketIplEntity>byId=cricketIplRepo.findById(circketIplEntity.getId());
		
		return circketIplEntity;
		
	}

}
