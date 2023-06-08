package src.main.ex1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ManagementSystem {
	private List<Pet> pets;
	private FileHandler fileHandler;

	public ManagementSystem() {
		this.pets = new ArrayList<>();
		this.fileHandler = new FileHandler();
	}

	public void loadPets(String path) {
		List<String> lines = this.fileHandler.loadFileContent(path);
		if (lines == null) {
			System.err.println("Error loading pets");
			return;
		}
		for (String line : lines) {
			String[] petData = line.split(",");
			if (petData.length != 3) {
				System.err.println("Invalid pet data");
				continue;
			}
			String name = petData[0];
			String color = petData[1];
			int age = Integer.parseInt(petData[2]);
			Pet pet = new Pet(name, color, age);
			this.pets.add(pet);
		}
	}

	public void printPets() {
		for (Pet pet : this.pets) {
			System.out.println(pet.getName());
		}
	}

	public void printPetsByColor(String color) {
		for (Pet pet : this.pets) {
			if (pet.getColor().equals(color)) {
				System.out.println(pet.getName());
			}
		}
	}

	public void printPetsByAge(int age) {
		for (Pet pet : this.pets) {
			if (pet.getAge() == age) {
				System.out.println(pet.getName());
			}
		}
	}

	public void printPetsByColorAndAge(String color, int age) {
		for (Pet pet : this.pets) {
			if (pet.getColor().equals(color) && pet.getAge() == age) {
				System.out.println(pet.getName());
			}
		}
	}

	public void printPetsByColorOrAge(String color, int age) {
		for (Pet pet : this.pets) {
			if (pet.getColor().equals(color) || pet.getAge() == age) {
				System.out.println(pet.getName());
			}
		}
	}

	public void printPetsByColorAndAgeOrName(String color, int age, String name) {
		for (Pet pet : this.pets) {
			if ((pet.getColor().equals(color) && pet.getAge() == age) || pet.getName().equals(name)) {
				System.out.println(pet.getName());
			}
		}
	}


	public Collection<Object> getClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String[]> loadData(String filePath) {
		List<String[]> list = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				list.add(values);
				System.out.println("Archivo leído correctamente");
			}
		} catch (IOException e) {
			System.err.println("Error al leer el archivo: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		String[][] data = new String[list.size()][];
		for (int i = 0; i < list.size(); i++) {
			data[i] = list.get(i);
		}
		return Arrays.asList(data);

	}
	public void addAppointment(Appointment appointment, Client client) {
		// Add appointment to list

	}

	public Collection<Object> getAppointments() {
		return null;
	}
}

