package Main.ex1;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Management {
    private ArrayList<Airport> airports;
    private ArrayList<Route> route;
    private ArrayList<Airline> airlines;

    public Management() {
        this.airports = new ArrayList<>();
        this.route = new ArrayList<>();
        this.airlines = new ArrayList<>();

    }

    public void loadAirports(String path) {
        ReadFile readFile = new ReadFile();
        ArrayList<String> linesAirports;
        try {
            linesAirports = (ArrayList<String>) readFile.loadSource(path);

            for (String line : linesAirports) {
                String[] data = line.split(",");
                System.out.println(line);
                int id = Integer.parseInt(data[0]);
                String name = data[1].compareTo("\\N") == 0 ? "" : data[1];
                String iata = data[4].compareTo("\\N") == 0 ? "" : data[4];
                String icao = data[5].compareTo("\\N") == 0 ? "" : data[5];
                String city = data[2].compareTo("\\N") == 0 ? "" : data[2];
                String country = data[3].compareTo("\\N") == 0 ? "" : data[3];
                String longitude = data[6].compareTo("\\N") == 0 ? "" : data[6];
                String latitude = data[7].compareTo("\\N") == 0 ? "" : data[7];

                Coordinates coordenates = null;
                try {
                    coordenates = new Coordinates(Double.parseDouble(data[6]), Double.parseDouble(data[6]));
                } catch (NumberFormatException e) {
                    coordenates = new Coordinates(0, 0);
                }
                Airport airport = new Airport(id, name, iata, icao, country, coordenates);
                airports.add(airport);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadAirlines(String path) {
        ReadFile readFile = new ReadFile();
        ArrayList<String> linesAirlines;
        try {
            linesAirlines = (ArrayList<String>) readFile.loadSource(path);

            for (String line : linesAirlines) {
                String[] data = line.split(",");
                System.out.println(line);
                int id = Integer.parseInt(data[0]);
                String name = data[1].compareTo("\\N") == 0 ? "" : data[1];
                boolean active = Boolean.parseBoolean(data[7].compareTo("\\N") == 0 ? "" : data[7]);
                String country = data[6].compareTo("\\N") == 0 ? "" : data[6];


                Airline airline = new Airline(id, name, country, active);
                airlines.add(airline);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadRoutes(String path) {
        ReadFile readFile = new ReadFile();
        ArrayList<String> linesRoutes;
        try {
            linesRoutes = (ArrayList<String>) readFile.loadSource(path);

            for (String line : linesRoutes) {
                String[] data = line.split(",");
                System.out.println(line);
                int id = Integer.parseInt(data[0]);
                String name = data[1].compareTo("\\N") == 0 ? "" : data[1];
                boolean active = Boolean.parseBoolean(data[7].compareTo("\\N") == 0 ? "" : data[7]);
                String country = data[6].compareTo("\\N") == 0 ? "" : data[6];


                Airline airline = new Airline(id, name, country, active);
                airlines.add(airline);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        }
    }

    public Airport searchAirportbyID(int code) {
        loadAirports("C:\\Users\\PabloCantero\\Documents\\Programacion Macaya\\AirportManagement\\src\\main\\data\\datos aviones progra 2.txt");
        for(Airport a:this.airports) {
            if (a.getId() == code) {
                return a;
            }


        }
        return null;
    }

    public ArrayList<Airport> searchAirportByCountry(String nameCountry){
        ArrayList<Airport> myList=new ArrayList<>();
        for(Airport a:this.airports) {
            if (a.getCountry().equalsIgnoreCase(nameCountry)) {
                myList.add(a);
            }


        }
        return myList;
    }


}

