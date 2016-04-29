package pojo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
//import org.hibernate.annotations.Cascade;
//import java.util.Set;
//import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Klant implements Serializable{
	

	private String naam = "standaard naam";
	
	@Autowired
	private Adres adres;
	
	@Autowired
	private Rekening rekening;
	
	public Klant() {
	}
	

	public String getNaam() {
		return naam;
	}
	
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	public Adres getAdres() {
		return adres;
	}
	
	public void setAdres(Adres adres) {
		this.adres = adres;
	}
	
	public Rekening getRekening() {
		return rekening;
	}


	public void setRekening(Rekening rekening) {
		this.rekening = rekening;
	}


	@Override
	public String toString() {
		return "Klant [naam=" + naam + ", adres=" + adres + ", rekening=" + rekening + "]";
	}
	
 
	
}