package co.edu.poli.serviciomoto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.poli.serviciomoto.entidades.Moto;



@Repository
public interface MotoRepository extends JpaRepository<Moto, Integer>{

	List<Moto> findByUsuarioId(int usuarioId);
	
}
