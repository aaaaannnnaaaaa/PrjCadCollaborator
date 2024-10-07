package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Collaborator;
import com.example.demo.repository.CollaboratorRepository;

@Service
public class CollaboratorService {
	
	private final CollaboratorRepository collaboratorrepository;
		
	@Autowired
	public CollaboratorService(CollaboratorRepository collaboratorrepository) {
		this.collaboratorrepository = collaboratorrepository;
	}
		
	//criaçao do produto
	public Collaborator saveCollaborator(Collaborator collaborator) {
		return collaboratorrepository.save(collaborator);
	}
		
	//buscar produto
	public Collaborator getCollaboratorById( Long id ) {
		return collaboratorrepository.findById(id).orElse(null);
	}
		
	//procurar todos os produtos
	public List<Collaborator> getAllCollaborator() {
		return collaboratorrepository.findAll();
	}
		
	//excluir os produtos 
	public void deleteCollaborator(Long id) {
		collaboratorrepository.deleteById(id);

	}	

	
}
