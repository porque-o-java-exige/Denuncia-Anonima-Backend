package com.denuncia.anonima.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.denuncia.anonima.dto.DenunciaMulherDTO;
import com.denuncia.anonima.services.DenunciaMulherService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/denuncia-mulher")
public class DenunciaMulherController {
	
	private final DenunciaMulherService denunciaMulherService;
	
	public DenunciaMulherController(DenunciaMulherService denunciaMulherService) {
		this.denunciaMulherService = denunciaMulherService;
	}

	// Endpoint para salvar denúncia geral
	@PostMapping(value = "/salvar")
	public ResponseEntity<?> salvarDenuncia(@Valid @RequestBody DenunciaMulherDTO dto, HttpServletRequest request) {
		// Captura o IP
		String ip = extrairIp(request);
		
		// Seta o IP na entidade
		dto.setIpUsuario(ip);
		
		return ResponseEntity.ok(denunciaMulherService.SalvarDenunciaMulher(dto));
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
