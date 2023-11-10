package org.areg.finanzas.controllers;

import java.util.Date;
import java.util.List;

import org.areg.finanzas.exceptions.BusinessException;
import org.areg.finanzas.models.Anticipo;
import org.areg.finanzas.services.AnticiposService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AnticiposController {
	
	@Autowired
	private AnticiposService service;
	
	@GetMapping("/anticipos")
	public List<Anticipo> anticipos(@RequestParam Integer claveEmpresa, 
									@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaAplicacionPago
									) throws BusinessException{
		
		return service.buscarAnticipos(fechaAplicacionPago, claveEmpresa);
	}

}
