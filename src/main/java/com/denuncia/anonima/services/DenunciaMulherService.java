package com.denuncia.anonima.services;

import org.springframework.stereotype.Service;

import com.denuncia.anonima.dto.DenunciaMulherDTO;
import com.denuncia.anonima.entities.DenunciaMulherEntity;
import com.denuncia.anonima.repositories.DenunciaMulherRepository;

@Service
public class DenunciaMulherService {
	private final DenunciaMulherRepository denunciaMulherRepository;

	public DenunciaMulherService(DenunciaMulherRepository denunciaMulherRepository) {
		this.denunciaMulherRepository = denunciaMulherRepository;
	}


	public String SalvarDenunciaMulher(DenunciaMulherDTO dto){
		DenunciaMulherEntity denuncia = new DenunciaMulherEntity();
		denuncia.setDenuncia(dto.getDenunciaMulher());
		denuncia.setIpUsuario(dto.getIpUsuario());
		
		// Salva no banco		
		denunciaMulherRepository.save(denuncia);	
				 
		return "Denuncia salva com sucesso";
	}
}
