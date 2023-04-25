package main.ex1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ManagementSystem {
    private FileHandler fileHandler;
    public ManagementSystem() {
        fileHandler = new FileHandler();
    }

    public void loadData(String path) {

        FileHandler fileHandler = new FileHandler();
        List<String> listClients;
        try {
            listClients = fileHandler.loadSource(path);
            Client client;
            String name, surname, address, phoneNumber;
            for (String line : listClients) {
                String[] lineData = line.split(";");
                name = lineData[0].replaceAll("\"", "");
                surname = lineData[1].replaceAll("\"", "");
                address = lineData[2].replaceAll("\"", "");
                phoneNumber = lineData[3].replaceAll("\"", "");
                client = new Client(name, surname, address, phoneNumber);
                this.clients.add(client);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public void addAppointment(Appointment appointment, Client client) {
        // Add appointment to list
    }

}

/*
public class Management {
    public ArrayList<Airport> airports;
    public ArrayList<Airline> airlines;
    public ArrayList<Route> routes;
    public Management() {
        airports = new ArrayList<>();
        airlines = new ArrayList<>();
        routes = new ArrayList<>();
    }
    public void loadAirports() {
        ReadFile readFile = new ReadFile();
        List<String> listAirports;
        try {
            listAirports = readFile.loadSource("src/main/data/airports.dat");
            Airport airport;
            int id;
            String name, iata, icao, city, country;
            Coordinates position;
            double lat, lon;
            for (String line : listAirports) {
                String[] lineData = line.split(",");
                id = Integer.parseInt(lineData[0]);
                name = lineData[1];
                city = lineData[2];
                country = lineData[3];
                iata = lineData[4].compareTo("\\N") == 0 ? "": lineData[4];
                icao = lineData[5].compareTo("\\N") == 0 ? "": lineData[5];
                try{
                    lat = lineData[6].compareTo("\\N") == 0 ? 0 : Double.parseDouble(lineData[6]);
                    lon = lineData[7].compareTo("\\N") == 0 ? 0 : Double.parseDouble(lineData[7]);
                }catch (NumberFormatException ex){
                    lat=0;
                    lon=0;
                }

                position = new Coordinates(lat, lon);
                airport = new Airport(id, name, iata, icao, city, country, position);
                this.airports.add(airport);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public void loadAirlines() {
        ReadFile readFile = new ReadFile();
        List<String> listAirlines;
        try {
            listAirlines = readFile.loadSource("src/main/data/airlines.dat");
            Airline airline;
            int id;
            String name, alias, iata, icao, callsign, country;
            boolean active;
            for (String line : listAirlines) {
                String[] lineData = line.split(",");
                id = Integer.parseInt(lineData[0]);
                name = lineData[1];
                alias = lineData[2];
                iata = lineData[3].compareTo("\\N") == 0 ? "": lineData[3];
                icao = lineData[4].compareTo("\\N") == 0 ? "": lineData[4];
                callsign = lineData[5];
                country = lineData[6];
                active = lineData[7].compareTo("Y") == 0;

                airline = new Airline(id, name, alias, iata, icao, callsign, country, active);
                this.airlines.add(airline);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public void loadRoutes() {
        ReadFile readFile = new ReadFile();
        List<String> listRoutes;
        try {
            listRoutes = readFile.loadSource("src/main/data/routes.dat");
            Route route;
            int id, stops;
            String airline, source, sourceAirportID, destinationAirport, destinationAirportID, equipement;
            boolean codeshare;
            for (String line : listRoutes) {
                String[] lineData = line.split(",");
                try {
                    id = Integer.parseInt(lineData[0]);
                } catch (NumberFormatException ex) {
                    id = 0;
                }
                airline = lineData[1].compareTo("\\N") == 0 ? "": lineData[1];
                source = lineData[2];
                sourceAirportID = lineData[3].compareTo("\\N") == 0 ? "": lineData[3];
                destinationAirport = lineData[4].compareTo("\\N") == 0 ? "": lineData[4];
                destinationAirportID = lineData[5];
                codeshare = lineData[6].compareTo("Y") == 0;
                stops = Integer.parseInt(lineData[7]);
                try {
                    equipement = lineData[8].compareTo("\\N") == 0 ? "": lineData[8];
                } catch (ArrayIndexOutOfBoundsException ex) {
                    equipement = "";
                }
                route = new Route(id, airline, source, sourceAirportID, destinationAirport, destinationAirportID, codeshare, stops, equipement);
                this.routes.add(route);
            }
        }
        catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
    public Airport searchAirportFromID (int code) {
        this.loadAirports();
        Airport a = null;
        for (Airport airport : this.airports) {
            if (airport.getId() == code) {
                a = airport;
            }
        }
        return a;
    }
}
*/