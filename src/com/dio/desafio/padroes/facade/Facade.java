package com.dio.desafio.padroes.facade;

import subsystem1.crm.CrmService;
import subsystem2.cep.CepApi;

public class Facade {
    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().restoreCity(cep);
        String state = CepApi.getInstance().restoreState(cep);

        CrmService.stampClient(name, cep, city, state);
    }
}
