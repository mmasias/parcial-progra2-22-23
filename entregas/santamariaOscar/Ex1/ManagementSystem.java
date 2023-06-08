public class ManagementSystem {
    private FileHandler fileHandler;
    private boolean client;

    public FileHandler getFileHandler() {
        return fileHandler;
    }

    public void setFileHandler(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public boolean isClient() {
        return client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }

    public ManagementSystem() {
        this.fileHandler=new FileHandler();
        this.client=false;
    }

    public void loadData(String path) {

           // Load clients from file
            // For each line in file
            String[] data = line.split(";");
             // Extract data from line and remove quotes
            String name = data[0].replaceAll("\"", "");
            String surname = data[1].replaceAll("\"", "");
            String address = data[2].replaceAll("\"", "");
            String phoneNumber = data[3].replaceAll("\"", "");
            // Create client and add to list
        Client client=new Client(name,surname,address,phoneNumber);


    }
    public void addAppointment(Appointment appointment, Client client) {

    }

}
