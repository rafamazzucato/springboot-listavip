package br.com.alura.springboot.listavip.repository;

import br.com.alura.springboot.listavip.model.Convidado;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rafaelthomazelli on 30/03/17.
 */
public interface ConvidadoRepository extends CrudRepository<Convidado, Long> {

}
