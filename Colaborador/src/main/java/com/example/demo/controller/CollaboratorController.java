package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Collaborator;
import com.example.demo.service.CollaboratorService;

	@RestController
	@RequestMapping("/collaborador")
	public class CollaboratorController {
	   
	   public final CollaboratorService collaboratorService;
	   
	   @Autowired
	   public CollaboratorController (CollaboratorService collaboratorService) {
	       this.collaboratorService = collaboratorService;
	   }
	   
	   @PostMapping
	   public Collaborator createCollaborator (@RequestBody Collaborator collaborator) {
	       return collaboratorService.saveCollaborator(collaborator);
	   }
	   
	   @GetMapping
	   public List<Collaborator> getAllCollaborator(){
	       return collaboratorService.getAllCollaborator();
	   }
	   
	   @GetMapping("/{id}")
	   public Collaborator getCollaborator(@PathVariable Long id) {
	       return collaboratorService.getCollaboratorById(id);
	   }

	   @DeleteMapping("/{id}")
	   public void deleteCollaborator(@PathVariable Long id) {
	       collaboratorService.deleteCollaborator(id);
	   }

	
}
