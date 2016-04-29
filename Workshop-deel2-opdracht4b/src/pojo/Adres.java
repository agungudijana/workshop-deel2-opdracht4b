package pojo;

import org.springframework.stereotype.Component;


import java.io.Serializable;

@Component
public class Adres implements Serializable {
	
	private long id;
	
	private String straatnaam = "eigen straatnaam";
	
	private String postcode = "eigen postcode";

	private int huisnummer = 69;
	
	private String woonplaats = "eigen woonplaats";
	
	public Adres(){}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getStraatnaam() {
		return straatnaam;
	}
	public void setStraatnaam(String straatnaam) {
		this.straatnaam = straatnaam;
	}
	
	
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public int getHuisnummer() {
		return huisnummer;
	}
	public void setHuisnummer(int huisnummer) {
		this.huisnummer = huisnummer;
	}
	
	
	public String getWoonplaats() {
		return woonplaats;
	}
	public void setWoonplaats(String woonplaats) {
		this.woonplaats = woonplaats;
	}

	@Override
	public String toString() {
		return "Adres [id=" + id + ", straatnaam=" + straatnaam + ", postcode=" + postcode + ", huisnummer="
				+ huisnummer + ", woonplaats=" + woonplaats + "]";
	}

	
	
}
