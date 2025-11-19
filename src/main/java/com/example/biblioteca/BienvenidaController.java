package com.example.biblioteca;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class BienvenidaController {

        @GetMapping("/hola")
        public String saludar() {
            return "¡Hola Deyna! La aplicación funciona correctamente.";
        }
    }
//		//<dependency>
//			<groupId>mysql</groupId>
//			<artifactId>mysql-connector-java</artifactId>
//			<version>8.0.33</version>
//		</dependency>//
//spring.application.name=biblioteca
//#Cambio el puerto de la aplicacion
//server.port=8090
//#mis cambios para forzar el conflicto
//spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
//spring.datasource.url=jdbc:mysql://localhost:3306/apirest
//spring.datasource.username=root
//spring.datasource.password=
//
//spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
//spring.jpa.hibernate.ddl-auto=update
//#cada vez que levantamos la aplicación mira si existen o no las tablas. Si no existen las crea.
//spring.jpa.show-sql=true
//#Para que muestre las sentencias sql en los logs
//spring.jpa.properties.hibernate.format_sql=true