package ar.udec.tablerodecomandos.core.usecase;

import ar.udec.tablerodecomandos.core.domain.RRHH;
import ar.udec.tablerodecomandos.core.input.IConsultarRRHHInput;
import ar.udec.tablerodecomandos.core.repository.IConsultarRRHHRepository;

import java.util.List;

public class ConsultarRRHHUseCase implements IConsultarRRHHInput {

    private IConsultarRRHHRepository iConsultarRRHHRepository;

    public ConsultarRRHHUseCase(IConsultarRRHHRepository iConsultarRRHHRepository){

        this.iConsultarRRHHRepository = iConsultarRRHHRepository;
    }


    @Override
    public List<RRHH> obtenerDatosHHRR() {
        return iConsultarRRHHRepository.obtenerDatosRRHH();
    }
}
