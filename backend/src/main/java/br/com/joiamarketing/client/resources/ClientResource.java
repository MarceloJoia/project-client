package br.com.joiamarketing.client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joiamarketing.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Maria", "01223654789", 2587.96, Instant.parse("2021-11-20T17:01:20Z"), 4));
		list.add(new Client(1L, "Maria", "98745632102", 5487.96, Instant.parse("2021-05-13T20:01:20Z"), 2));
		return ResponseEntity.ok().body(list);
	} 
}
