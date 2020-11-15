package ar.udec.tablerodecomandos.persistence;

import ar.udec.tablerodecomandos.core.domain.RRHH;
import ar.udec.tablerodecomandos.core.repository.IConsultarRRHHRepository;
import ar.udec.tablerodecomandos.persistence.crud.IConsultarRRHHCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ConsultarRRHHImplementation implements IConsultarRRHHRepository {

    @Autowired
    IConsultarRRHHCrud iConsultarRRHHCrud;


    @Override
    public List<RRHH> obtenerDatosRRHH() {
        return null;
    }
}
