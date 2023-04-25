package main.ex1;

import java.util.logging.FileHandler;

public class ManagementSystem extends FileHandler{
    private FileHandler fileHandler;
    private List<Client> clients;
    private List<Appointment> appointments;

    public <<Create>> ManagementSystem();
    public void loadData(String);
    public List<Client> getClients();
    public void addAppointment(Appointment, Client);
    public List<Appointment> getAppointments();
    boolean isClient(Client);
}
