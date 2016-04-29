package pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KlantConfig {
	
	@Bean
	public Klant klant(){
		return new Klant();
	}
	
	@Bean
	public Adres adres(){
		return new Adres();
	}
		
	@Bean
	public Rekening rekening(){
		return new Rekening();
	}
}
