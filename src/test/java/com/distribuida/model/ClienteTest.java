package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(
                1,
                "1785967485",
                "Bob",
                "Esponja",
                "El mar",
                "0948592615",
                "bobesponga@correo.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters(){
        assertAll( "Pruebas unitarias constructor Cliente",
                () -> assertEquals(1,cliente.getIdCliente()),
                () -> assertEquals("1785967485", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Esponja", cliente.getApellido()),
                () -> assertEquals("El mar", cliente.getDirreccion()),
                () -> assertEquals("0948592615", cliente.getTelofono()),
                () -> assertEquals("bobesponga@correo.com", cliente.getCorreo())
                );
        System.out.println(cliente.toString());
    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1789562389");
        cliente.setNombre("Bob 2");
        cliente.setApellido("Esponja 2");
        cliente.setDirreccion("En el mar 2");
        cliente.setTelofono("0978561423");
        cliente.setCorreo("bobesponga2@correo.com");

        assertAll( "Pruebas unitarias constructor Cliente",
                () -> assertEquals(2,cliente.getIdCliente()),
                () -> assertEquals("1789562389", cliente.getCedula()),
                () -> assertEquals("Bob 2", cliente.getNombre()),
                () -> assertEquals("Esponja 2", cliente.getApellido()),
                () -> assertEquals("En el mar 2", cliente.getDirreccion()),
                () -> assertEquals("0978561423", cliente.getTelofono()),
                () -> assertEquals("bobesponga2@correo.com", cliente.getCorreo())
        );
        System.out.println(cliente.toString());
    }

    @Test
    public void testClienteToString(){
        String str = cliente.toString();
        assertAll("Validar datos de cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1785967485")),
                () -> assertTrue(str.contains("Bob")),
                () -> assertTrue(str.contains("Esponja")),
                () -> assertTrue(str.contains("El mar")),
                () -> assertTrue(str.contains("0948592615")),
                () -> assertTrue(str.contains("bobesponga@correo.com"))
                );
    }



}
