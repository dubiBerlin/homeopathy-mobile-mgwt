package de.mgwt.dubravko.client.model;

public class Heilmittel {

	String name;
	String dosis;
	
	public Heilmittel(String name, String dosis) {
		this.name = name;
		this.dosis = dosis;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDosis() {
		return dosis;
	}

	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

}
