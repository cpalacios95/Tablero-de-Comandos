package ar.udec.tablerodecomandos.controller.config;

import ar.udec.tablerodecomandos.core.usecase.ConsultarVentasUseCase;
import ar.udec.tablerodecomandos.persistence.ConsultarVentasImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VentasConfig {

    @Autowired
    ConsultarVentasImplementation consultarVentasImplementation;

    @Bean
    public ConsultarVentasUseCase consultarVentasUseCase(){
        return new ConsultarVentasUseCase(consultarVentasImplementation);
    }

}
