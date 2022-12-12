package ClassPackage;

import java.util.Objects;

public class Month {
	// ATRIBUTS
	protected String name;

	// CONSTRUCTOR
	public Month(String name) {
		this.name = name;
	}
	
	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Month other = (Month) obj;
		return Objects.equals(name, other.name);
	}

}
