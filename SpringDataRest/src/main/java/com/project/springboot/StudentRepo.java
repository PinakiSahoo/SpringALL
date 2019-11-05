package com.project.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.project.springboot.model.Alien;



@RepositoryRestResource(collectionResourceRel ="aliens",path="aliens")
public interface StudentRepo extends JpaRepository<Alien, Integer > {

}
