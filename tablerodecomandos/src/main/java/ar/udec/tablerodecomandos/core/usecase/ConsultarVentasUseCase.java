package ar.udec.tablerodecomandos.core.usecase;

import ar.udec.tablerodecomandos.core.domain.Ventas;
import ar.udec.tablerodecomandos.core.input.IConsultarVentasInput;
import ar.udec.tablerodecomandos.core.repository.IConsultarVentasRepository;

import java.util.List;

public class ConsultarVentasUseCase implements IConsultarVentasInput{


    private IConsultarVentasRepository iConsultarVentasRepository;

    public ConsultarVentasUseCase(IConsultarVentasRepository iConsultarVentasRepository){

        this.iConsultarVentasRepository = iConsultarVentasRepository;
    }

    @Override
    public List<Ventas> obtenerDatosVentas() {
        return iConsultarVentasRepository.obtenerDatosVentas();
    }


    @Override
    public double totalVentasMes() {
        return iConsultarVentasRepository.totalVentasMes();
    }
}
