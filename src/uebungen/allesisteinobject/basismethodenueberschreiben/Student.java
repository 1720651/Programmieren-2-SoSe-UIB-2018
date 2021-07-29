package uebungen.allesisteinobject.basismethodenueberschreiben;

class Student extends Mensch implements Cloneable {
	private int matrikelnummer;
	
	public Student(String vorname, String nachname, int matrikelnummer) {
		setVorname(vorname);
		setNachname(nachname);
		setMatrikelnummer(matrikelnummer);
	}
	
	public int getMatrikelnummer() {
		return this.matrikelnummer;
	}
	
	private void setMatrikelnummer(int matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	
	@Override
	public String toString() {
		return"Name: " + this.getName() + " Matrikelnummer: " +this.getMatrikelnummer();
	}
	
	@Override
	public int hashCode() {
		return this.matrikelnummer;
	}

	@Override
	public boolean equals(Object o) {
		if(o==null) return false;
		if(o == this) return true;
		if(o.getClass() != Student.class) return false;
		Student ocast = (Student) o; 
		return(this.hashCode()==ocast.hashCode());
	}
	
	@Override
	public Student clone() {
		Student s = new Student(this.getVorname(), this.getNachname(), this.matrikelnummer);
		return s;		
	}
}
