package com.distribuida;

import com.distribuida.model.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);

		System.out.println("Hola Mundo Desde Spring Boot");

		Cliente cliente = new Cliente(
				1
				,"1790785634"
				,"Allan"
				,"Brito"
				,"Quito"
				,"0978563412"
				,"abrito@correo.com"
		);

		System.out.println(cliente.toString());



	}

}
