package com.project.springrest.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.springrest.model.Friend;

@Repository
@Service
public interface FriendService extends CrudRepository<Friend,Integer>{

	  Iterable<Friend> findByFirstName(String firstname);
	  Iterable<Friend> findByLastName(String lastname);
	
	
}
