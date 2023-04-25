package main.ex1;

import java.util.List;

public class ManagementSystem {
    FileHandler filehandler;
    List<Client> clients;
    List <Appointment> appointments;
    private long pet;

    public ManagementSystem(FileHandler filehandler, List<Client> clients, List<Appointment> appointments) {
        this.filehandler = filehandler;
        this.clients = clients;
        this.appointments = appointments;
    }
    public void loadData(String path) throws InterruptedException {
        List<String> lines = filehandler.loadFileContent(path);
        if(lines == null){
            System.err.println("Error loading file");
            return;
        }
        for(String line : lines){
            String[] tokens = line.split(" ");
            if(tokens.length != 4){
                System.err.println("Invalid line");
                continue;
            }
            String name = tokens[0];
            String petName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String color = tokens[3];
            Client client = new Client(name, age, color);
            client.wait(pet);
            clients.add(client);
        }

    }
}
