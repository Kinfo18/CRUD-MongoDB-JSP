package CellPhoneStore;

import java.util.ArrayList;

import com.mongodb.BasicDBObject;

public class Celulares {
	private String Marca;
	private String Linea;
	private String Modelo;
	private Integer Precio;
	private Boolean Disponibilidad;
	private ArrayList<String> Caracteristicas;
	
	public Celulares(String marca, String linea, String modelo, Integer precio, Boolean disponibilidad,
			ArrayList<String> caracteristicas) {
		super();
		Marca = marca;
		Linea = linea;
		Modelo = modelo;
		Precio = precio;
		Disponibilidad = disponibilidad;
		Caracteristicas = caracteristicas;
	}
	
	
	public String getMarca() {
		return Marca;
	}



	public void setMarca(String marca) {
		Marca = marca;
	}



	public String getLinea() {
		return Linea;
	}



	public void setLinea(String linea) {
		Linea = linea;
	}



	public String getModelo() {
		return Modelo;
	}



	public void setModelo(String modelo) {
		Modelo = modelo;
	}



	public Integer getPrecio() {
		return Precio;
	}



	public void setPrecio(Integer precio) {
		Precio = precio;
	}



	public Boolean getDisponibilidad() {
		return Disponibilidad;
	}



	public void setDisponibilidad(Boolean disponibilidad) {
		Disponibilidad = disponibilidad;
	}



	public ArrayList<String> getCaracteristicas() {
		return Caracteristicas;
	}



	public void setCaracteristicas(ArrayList<String> caracteristicas) {
		Caracteristicas = caracteristicas;
	}



	public BasicDBObject Conversor () {
		BasicDBObject conversor = new BasicDBObject();
		
		conversor.append("marca", this.getMarca());
		conversor.append("linea", this.getLinea());
		conversor.append("modelo", this.getModelo());
		conversor.append("disponibilidad", this.getDisponibilidad());
		conversor.append("caracteristicas", this.getCaracteristicas());
		
		return conversor;
	}
	
}
