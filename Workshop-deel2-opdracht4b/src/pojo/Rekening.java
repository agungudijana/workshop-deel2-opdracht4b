package pojo;

import org.springframework.stereotype.Component;

@Component
public class Rekening {
	

	private long id = 1;
	
	private String rekeningnummer = "NL00RABO0123456";
	
	private long saldo = 100000000;
	
	public Rekening(){
	}
	
	public long getSaldo() {
		return saldo;
	}

	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}

	public void setRekeningnummer(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getRekeningnummer() {
		return rekeningnummer;
	}
	public void setStraatnaam(String rekeningnummer) {
		this.rekeningnummer = rekeningnummer;
	}
	
	@Override
	public String toString() {
		return "Rekening [id=" + id + ", rekeningnummer=" + rekeningnummer + ", saldo=" + saldo + "]";
	}
	

}
