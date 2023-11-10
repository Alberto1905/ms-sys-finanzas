package org.areg.finanzas.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.areg.finanzas.dao.entity.GastosViaje;
import org.areg.finanzas.dao.repository.GastosViajeRepository;
import org.areg.finanzas.exceptions.BusinessException;
import org.areg.finanzas.models.Anticipo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnticiposServiceImpl implements AnticiposService {

	@Autowired
	private GastosViajeRepository repository;

	@Override
	@Transactional
	public List<Anticipo> buscarAnticipos(Date fechaAplicacion, Integer clvEmpresa) throws BusinessException {
		List<Anticipo> listAnticipos = new ArrayList<>();
			List<GastosViaje> listGastosViaje = repository.gastosViajeAnticipos(fechaAplicacion, clvEmpresa);
			if(!listGastosViaje.isEmpty() || listGastosViaje != null) {
				listAnticipos = listGastosViaje.stream().map(gastosViaje -> {
			        Anticipo anticipo = new Anticipo();
			        anticipo.setControl(gastosViaje.getControl());
			        anticipo.setNomempresa(gastosViaje.getNomEmpresa());
			        anticipo.setBanco(gastosViaje.getBanco());
			        anticipo.setImporte(gastosViaje.getImporte());
			        anticipo.setFechaTransaccion(gastosViaje.getFechaTransaccion());
			        return anticipo;
			    }).collect(Collectors.toList());
		}
		return listAnticipos;
	}

}
