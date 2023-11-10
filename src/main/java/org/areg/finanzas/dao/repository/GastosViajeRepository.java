package org.areg.finanzas.dao.repository;

import java.util.Date;
import java.util.List;

import org.areg.finanzas.dao.entity.GastosViaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface GastosViajeRepository extends JpaRepository<GastosViaje, Integer>{
	
	@Query("SELECT  gv FROM GastosViaje gv WHERE gv.fechaAplicacionPago = ?1 AND gv.clvEmpresa = ?2")
	List<GastosViaje> gastosViajeAnticipos(Date fechaAplicacionPago, Integer clvEmpresa);

}
