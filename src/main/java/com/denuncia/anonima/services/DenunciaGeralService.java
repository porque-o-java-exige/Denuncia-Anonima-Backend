package com.denuncia.anonima.services;

import org.springframework.stereotype.Service;

import com.denuncia.anonima.dto.DenunciaGeralDTO;
import com.denuncia.anonima.entities.DenunciaGeralEntity;
import com.denuncia.anonima.repositories.DenunciaGeralRepository;


@Service
public class DenunciaGeralService {

	private final DenunciaGeralRepository denunciaGeralRepository;

	public DenunciaGeralService(DenunciaGeralRepository denunciaGeralRepository) {
		this.denunciaGeralRepository = denunciaGeralRepository;
	}

	public String SalvarDenuncia(DenunciaGeralDTO dto){
		DenunciaGeralEntity denuncia = new DenunciaGeralEntity();
		denuncia.setDenunciaGeral(dto.getDenunciaGeral());
		denuncia.setIpUsuario(dto.getIpUsuario());
		
		// Salva no banco		
		denunciaGeralRepository.save(denuncia);	
				 
		return "Denuncia salva com sucesso";
	}
	
}
