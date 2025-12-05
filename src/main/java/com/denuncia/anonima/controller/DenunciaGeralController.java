package com.denuncia.anonima.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denuncia.anonima.entities.DenunciaGeralEntity;
import com.denuncia.anonima.repositories.DenunciaGeralRepository;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/denuncia-geral")
public class DenunciaGeralController {
	private final DenunciaGeralRepository denunciaGeralRepository;

	public DenunciaGeralController(DenunciaGeralRepository denunciaGeralRepository) {
		this.denunciaGeralRepository = denunciaGeralRepository;
	}

	// Endpoint para salvar denúncia geral
	@PostMapping
	public DenunciaGeralEntity salvarDenuncia(@RequestBody DenunciaGeralEntity denuncia, HttpServletRequest request) {

		// Captura o IP
		String ip = extrairIp(request);

		// Seta o IP na entidade
		denuncia.setIpUsuario(ip);

		// Salva no banco
		return denunciaGeralRepository.save(denuncia);
	}

	// Método auxiliar para capturar IP
	private String extrairIp(HttpServletRequest request) {
		// usado se tiver proxy/load balancer
		String ip = request.getHeader("X-Forwarded-For");
		if (ip == null || ip.isEmpty()) {
			// IP direto da conexão
			ip = request.getRemoteAddr();
		}
		return ip;
	}
}
