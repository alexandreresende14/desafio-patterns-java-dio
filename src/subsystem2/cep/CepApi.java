package subsystem2.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instance;
    }

    public String restoreCity(String cep) {
        return "Santos";
    }

    public String restoreState(String cep) {
        return "SP";
    }
}
