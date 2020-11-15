package ar.udec.tablerodecomandos.persistence;

import ar.udec.tablerodecomandos.core.domain.DatosVarios;
import ar.udec.tablerodecomandos.core.repository.IConsultarDatosVariosRepository;
import ar.udec.tablerodecomandos.persistence.crud.IConsultarDatosVariosCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ConsultarDatosVariosImplementation implements IConsultarDatosVariosRepository {

    @Autowired
    IConsultarDatosVariosCrud iConsultarDatosVariosCrud;


    @Override
    public List<DatosVarios> obtenerDatosVarios() {
        return null;
    }
}
