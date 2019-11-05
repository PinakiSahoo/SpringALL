package com.project.springrest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.springrest.model.Friend;
import com.project.springrest.service.FriendService;

@RestController
public class FriendController {
	@Autowired
	FriendService friendService;

	@PostMapping("/friend")
	Friend add(@RequestBody Friend friend) {
		return friendService.save(friend);
	
	
	}
	
	@GetMapping("/friend")
	Iterable<Friend> read(){
		return friendService.findAll();
		
		
	}

	@PutMapping("/friend")
	Friend update(@RequestBody Friend friend) {
		return friendService.save(friend);
	

}
    @DeleteMapping("/friend/{id}")
   void delete(@PathVariable Integer id) {
		 friendService.deleteById(id);


}
 @GetMapping("/friend/{id}")
 Optional<Friend> findById(@PathVariable Integer id){
	 return friendService.findById(id);
 }
 @GetMapping("/friend/search")
 Iterable<Friend>findByQuery(
 @RequestParam("first") String firstName, @RequestParam("Last") String lastName){
	 
 return friendService.findByFirstNameandLastName(firstName,lastName);
}
}