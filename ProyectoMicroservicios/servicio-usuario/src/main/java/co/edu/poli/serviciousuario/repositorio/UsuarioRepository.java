package co.edu.poli.serviciousuario.repositorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.poli.serviciousuario.entidades.Usuario;



@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}