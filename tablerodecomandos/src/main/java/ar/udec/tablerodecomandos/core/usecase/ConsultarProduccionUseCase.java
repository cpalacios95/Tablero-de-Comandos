package ar.udec.tablerodecomandos.core.usecase;

import ar.udec.tablerodecomandos.core.domain.Produccion;
import ar.udec.tablerodecomandos.core.input.IConsultarProduccionInput;
import ar.udec.tablerodecomandos.core.repository.IConsultarProduccionRepository;

import java.util.List;

public class ConsultarProduccionUseCase implements IConsultarProduccionInput {


    private IConsultarProduccionRepository iConsultarProduccionRepository;

    public ConsultarProduccionUseCase(IConsultarProduccionRepository iConsultarProduccionRepository){
        this.iConsultarProduccionRepository=iConsultarProduccionRepository;
    }


    @Override
    public List<Produccion> obtenerDatosProduccion() {

        return iConsultarProduccionRepository.obtenerDatosProduccion();
    }
}
