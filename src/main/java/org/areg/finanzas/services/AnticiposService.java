package org.areg.finanzas.services;

import java.util.Date;
import java.util.List;

import org.areg.finanzas.exceptions.BusinessException;
import org.areg.finanzas.models.Anticipo;

public interface AnticiposService {
	
	List<Anticipo> buscarAnticipos(Date fechaAplicacion, Integer clvEmpresa)  throws BusinessException;
}
