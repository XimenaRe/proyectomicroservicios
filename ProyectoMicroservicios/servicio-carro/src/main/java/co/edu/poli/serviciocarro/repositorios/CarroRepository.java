package co.edu.poli.serviciocarro.repositorios;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.poli.serviciocarro.entidades.Carro;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{

	List<Carro> findByUsuarioId(int usuarioId);
	
}