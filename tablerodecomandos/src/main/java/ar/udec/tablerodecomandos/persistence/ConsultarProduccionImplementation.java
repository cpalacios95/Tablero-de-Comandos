package ar.udec.tablerodecomandos.persistence;

import ar.udec.tablerodecomandos.core.domain.Produccion;
import ar.udec.tablerodecomandos.core.repository.IConsultarProduccionRepository;
import ar.udec.tablerodecomandos.persistence.crud.IConsultarProduccionCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ConsultarProduccionImplementation implements IConsultarProduccionRepository {

    @Autowired
    IConsultarProduccionCrud iConsultarProduccionCrud;

    @Override
    public List<Produccion> obtenerDatosProduccion() {
        return null;
    }
}
