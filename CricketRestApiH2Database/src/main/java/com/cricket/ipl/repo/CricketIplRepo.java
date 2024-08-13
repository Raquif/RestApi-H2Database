package com.cricket.ipl.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.ipl.enetites.CircketIplEntity;
/**
 * @author Raquif Roshan
 *
 */
@Repository
public interface CricketIplRepo extends JpaRepository<CircketIplEntity, Integer>{

}
