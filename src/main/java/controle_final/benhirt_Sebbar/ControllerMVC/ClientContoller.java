package controle_final.benhirt_Sebbar.ControllerMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import controle_final.benhirt_Sebbar.model.Ticket;
import controle_final.benhirt_Sebbar.service.TicketService;
import controle_final.benhirt_Sebbar.service.UserService;

@Controller
@RequestMapping("/client")
public class ClientContoller {

	@Autowired
	TicketService ticketservice;
	
	@Autowired
	UserService userService;
	
	@GetMapping("/tickets")
	public ModelAndView liste() {
		ModelAndView m = new ModelAndView("tickets/tickets");
		m.addObject("tickets", ticketservice.listeByClient());
		return m;
	}
	
	
}
