package MainPackage;

import java.util.HashSet;

import RestarantPackage.Restaurant;

public class Main {

	public static void main(String[] args) {
		// DEFINICIÓ DE VARIABLES
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();		
		
		// ACCIONS
		restaurants.add(new Restaurant("La cabra maldita", 7));
		restaurants.add(new Restaurant("La croqueta petra", 6));
		restaurants.add(new Restaurant("Entra y no saldrás", 9));
		restaurants.add(new Restaurant("El pescado mareado", 8));
		restaurants.add(new Restaurant("Casa Pepe", 8));
		
		System.out.println("*** LLISTA DE RESTAURANTS ***");
		mySyso(restaurants);
		
		System.out.println("\r\n*** NO ES POT AFEGIR RESTAURANTS IGUALS PERÒ SÍ AMB PUNTUACIÓ DIFERENT ***");
		restaurants.add(new Restaurant("Entra y no saldrás", 9));
		restaurants.add(new Restaurant("Casa Pepe", 9));
		
		mySyso(restaurants);
		
		// SORTIDA
		
		
	}

	private static void mySyso(HashSet<Restaurant> restaurants) {
		// DEFINICIO VARIABLES
		String text = "";


		// ACCIONS
		for (Restaurant restaurant : restaurants) {
			text =String.format("%s\r\nNom: %s; Puntuació: %s",text, 
					restaurant.getNom(), restaurant.getPuntuacio());	
		}		
		

		// SORTIDA
		System.out.println(text);
		
	}
	
}
