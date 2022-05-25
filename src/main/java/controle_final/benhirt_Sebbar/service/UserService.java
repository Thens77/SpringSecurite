package controle_final.benhirt_Sebbar.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import controle_final.benhirt_Sebbar.model.User;



public interface UserService extends UserDetailsService {

	void save(User user);
	
	void saveDev(User user);

	List<User> liste();

	void supprimer(int id);

	void ajouter(User user);

	void modifier(User user);

	User getUser(int id);
	
	List<User> getDevs();
}

