package controle_final.benhirt_Sebbar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import controle_final.benhirt_Sebbar.model.Ticket;
import controle_final.benhirt_Sebbar.service.TicketService;

@RestController
@RequestMapping("/admin")
public class AdminController {
		
	@Autowired
	TicketService ticketService;
	
	
	
	
 
	 
}
