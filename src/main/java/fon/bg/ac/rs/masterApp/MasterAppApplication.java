package fon.bg.ac.rs.masterApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
public class MasterAppApplication {

	public static void main(String[] args) {

		Locale.setDefault(Locale.ITALIAN);
		TimeZone.setDefault(TimeZone.getTimeZone("Europe/Rome"));
		SpringApplication.run(MasterAppApplication.class, args);
	}

}
