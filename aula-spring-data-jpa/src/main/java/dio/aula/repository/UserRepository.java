package dio.aula.repository;

import dio.aula.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface UserRepository extends JpaRepository<User,Integer>{
	
	User findByUsername(String username);
	List<User> findByNameContaining(String name);

}
