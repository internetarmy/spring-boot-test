package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test/{id}")
	public ResponseEntity<Object> testAPI(@PathVariable Integer id) {
		
		List<Person> personsList = List.of(
				new Person(1, "Siva", "Bhmavaram", "JAVA Dev"),
				new Person(2, "Mahi", "Vij", "Tester"),
				new Person(3, "Nani", "VIJ", "Net Admin"),
				new Person(4, "Venkatesth", "RJY", "JAVA Dev"),
				new Person(5, "Siva", "TDP", "JAVA Dev"));
		Optional<Person> filteredPerson = personsList.stream().filter(p -> p.getId()==id).findFirst();
		if(filteredPerson.isPresent()) {
			return new ResponseEntity(filteredPerson, HttpStatus.OK);
		} else {
			return new ResponseEntity("no data for provided id.",HttpStatus.BAD_REQUEST);
		}
	}
}
