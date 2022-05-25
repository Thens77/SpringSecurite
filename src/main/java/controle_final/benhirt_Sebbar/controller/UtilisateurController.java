package controle_final.benhirt_Sebbar.controller;

import java.util.List;
 

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import controle_final.benhirt_Sebbar.model.Ticket;
import controle_final.benhirt_Sebbar.model.Utilisateur;
import controle_final.benhirt_Sebbar.repository.UtilisateurRepository;
import controle_final.benhirt_Sebbar.service.TicketService;
import controle_final.benhirt_Sebbar.service.UtilisateurService;

@RestController
@RequestMapping
public class UtilisateurController {
	 @Autowired
	 TicketService ticketService ;
	 
	
	

	
	

}
