package br.com.joiamarketing.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.joiamarketing.client.entities.Client;
import br.com.joiamarketing.client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	public ClientRepository repository;
	
	@Transactional(readOnly=true)
	public List<Client> findAll(){
		return repository.findAll();
	}
}
