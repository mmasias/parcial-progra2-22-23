package main.ex1;

import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

public class ManagementSystem {
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;

    public ManagementSystem(String path) throws IOException {
        this.fileHandler = new FileHandler();
        loadData(path);
    }

    void loadData(String path){
        fileHandler.loadFileContent(path);
    }

    List<Client> getClients(){
        return clients;
    }

    void addAppointment(Appointment, Client){

    }

    List<Appointment> getAppointments(){
        return appointments;
    }

    boolean isClient(Client){
        return true;
    }
}
