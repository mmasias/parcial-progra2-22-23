import ex1.ManagementSystem;

public class Main {
    public static void main(String[] args) {
        ManagementSystem managementSystem = new ManagementSystem();

        managementSystem.loadData("data/clients.dat");

        managementSystem.getClients().forEach(client -> {
            System.out.println(client.getFullName());
        });
    }
}