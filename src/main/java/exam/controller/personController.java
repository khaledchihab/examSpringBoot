package exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exam.entity.person;
import exam.service.personService;

@RestController
@RequestMapping("/persons")
public class personController {

	private final personService service;

	@Autowired
	public personController(personService service) {
		this.service = service;
	}

	@PostMapping
	public person addPerson(@RequestBody person person) {
		return service.addPerson(person);
	}

}
