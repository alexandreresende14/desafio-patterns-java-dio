package subsystem1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void stampClient(String name, String cep, String city, String state) {
        System.out.println("Saved client in the CRM system");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
