package br.com.alura.springboot.listavip.services;

import br.com.alura.springboot.listavip.model.Convidado;
import br.com.alura.springboot.listavip.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rafaelthomazelli on 31/03/17.
 */
@Service
public class ConvidadoService {

    @Autowired
    private ConvidadoRepository convidadoRepository;

    public Iterable<Convidado> buscarTodos(){
        return convidadoRepository.findAll();
    }

    public void salvar(Convidado convidado){
        convidadoRepository.save(convidado);
    }

}
