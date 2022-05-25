package controle_final.benhirt_Sebbar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import controle_final.benhirt_Sebbar.model.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	User findByUserName(String name);
	

}
