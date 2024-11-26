public class Client {
    public static void main(String[] args) {
        OldSystem oldSystem = new OldSystem();
        Adapter adapter = new Adapter(oldSystem);
        NewSystem newSystem = new NewSystem();
        String jsonData = adapter.getEmployeeDataInJSON();
        newSystem.processEmployeeDataInJSON(jsonData);
    }
}
