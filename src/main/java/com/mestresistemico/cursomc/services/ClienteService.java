package com.mestresistemico.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mestresistemico.cursomc.domain.Cliente;
import com.mestresistemico.cursomc.repositories.ClienteRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) throws ObjectNotFoundException {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + " Tipo: " + Cliente.class.getName());
		}
		return obj;
}

}
