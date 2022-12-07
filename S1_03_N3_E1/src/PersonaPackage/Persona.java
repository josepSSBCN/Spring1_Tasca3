package PersonaPackage;

public class Persona {
	// ATRIBUTS
	private String nom;
	private String cognom;
	private String dni;

	// CONSTRUCTORA
	public Persona(String nom, String cognom, String dni) {
		this.nom = nom;
		this.cognom = cognom;
		this.dni = dni;
	}

	// GETTERS & SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// METODES
	@Override
	public boolean equals(Object personaIn) {
		// ACCIONS
		if (this.getDni().equals(((Persona) personaIn).getDni())) {
			return true;
		} else {
			return false;
		}
	}

}
