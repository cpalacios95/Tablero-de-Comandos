package ar.udec.tablerodecomandos.core.usecase;

import ar.udec.tablerodecomandos.core.domain.DatosVarios;
import ar.udec.tablerodecomandos.core.input.IConsultarDatosVariosInput;
import ar.udec.tablerodecomandos.core.repository.IConsultarDatosVariosRepository;

import java.util.List;

public class ConsultarDatosVariosUseCase implements IConsultarDatosVariosInput {

    private IConsultarDatosVariosRepository iConsultarDatosVariosRepository;

    public ConsultarDatosVariosUseCase(IConsultarDatosVariosRepository iConsultarDatosVariosRepository){

        this.iConsultarDatosVariosRepository = iConsultarDatosVariosRepository;
    }


    @Override
    public List<DatosVarios> obtenerDatosVarios() {
        return iConsultarDatosVariosRepository.obtenerDatosVarios();
    }
}
