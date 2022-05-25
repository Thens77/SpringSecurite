package controle_final.benhirt_Sebbar.service;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import controle_final.benhirt_Sebbar.model.Ticket;
import controle_final.benhirt_Sebbar.model.User;
import controle_final.benhirt_Sebbar.repository.TicketRepository;
import controle_final.benhirt_Sebbar.repository.UserRepository;


@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<Ticket> liste() {

		return ticketRepository.findAll();
	}

	@Override
	public void supprimer(Long id) {
		ticketRepository.deleteById(id);
		;
	}

	@Override
	public void ajouter(Ticket ticket) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		User u = userRepository.findByUserName(username);
		ticket.setClient(u);
		ticket.setStatus(false);
	    ticket.setEtat("Nouveau");
		ticketRepository.save(ticket);

	}

	@Override
	public void modifier(Ticket ticket) {
		Ticket t = getTicket(ticket.getId());
		System.out.println("ticket " + t.getId());
		if (t != null) {
			System.out.println(t);
			System.out.println(ticket);
			t.setDescr(ticket.getDescr());
			t.setEtat(ticket.getEtat());
			t.setDev(ticket.getDev());
			t.setUrgence(ticket.getUrgence());
			if(ticket.getDev()!=null) {
				t.setStatus(true);
			}
			if(ticket.getDev()==null) {
				t.setStatus(false);
			}
			ticketRepository.save(t);
		}

	}

	@Override
	public Ticket getTicket(Long id) {
		if (id != null) {
			if (ticketRepository.existsById(id)) {
				return ticketRepository.findById(id).get();
			}
		}
		return null;
	}

	@Override
	public List<Ticket> listeByClient() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String username = auth.getName();
		return ticketRepository.getTicketByCLient(username);
	}

	public List<Ticket> listeByDev() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		
		String username = auth.getName();
		return ticketRepository.getTicketByDev(username);
	}

	@Override
	public List<Ticket> getTicketNA() {

		return ticketRepository.getTicketNA();
	}

	@Override
	public void setEncours(Long id) {
		Ticket t = getTicket(id);
		t.setEtat("Encours");
		ticketRepository.save(t);
		
	}

	@Override
	public void setTermine(Long id) {
		Ticket t = getTicket(id);
		t.setEtat("Termine");
		ticketRepository.save(t);
		
	}

}
