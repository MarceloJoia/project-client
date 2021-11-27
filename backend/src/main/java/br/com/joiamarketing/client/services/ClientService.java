package br.com.joiamarketing.client.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.joiamarketing.client.dto.ClientDTO;
import br.com.joiamarketing.client.entities.Client;
import br.com.joiamarketing.client.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	public ClientRepository repository;
	
	@Transactional(readOnly=true)
	public List<ClientDTO> findAll(){
		List<Client> list = repository.findAll();	
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	}
}
