package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp(){
        autor = new Autor(
                1
                ,"Luis"
                ,"Perez"
                ,"Mexico"
                ,"Quito"
                ,"0912634598"
                ,"luisp@correo.com"
        );
    }

    @Test
    public void testAutorConstructorAndGetters(){
        assertAll( "Pruebas unitarias constructor Autor",
                () -> assertEquals(1,autor.getIdAutor()),
                () -> assertEquals("Luis", autor.getNombre()),
                () -> assertEquals("Perez", autor.getApellido()),
                () -> assertEquals("Mexico", autor.getPais()),
                () -> assertEquals("Quito", autor.getDirreccion()),
                () -> assertEquals("0912634598", autor.getTelofono()),
                () -> assertEquals("luisp@correo.com", autor.getCorreo())
        );
        System.out.println(autor.toString());
    }

    @Test
    public void testAutorToString(){
        String str = autor.toString();
        assertAll("Validar datos de autor con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Luis")),
                () -> assertTrue(str.contains("Perez")),
                () -> assertTrue(str.contains("Mexico")),
                () -> assertTrue(str.contains("Quito")),
                () -> assertTrue(str.contains("0912634598")),
                () -> assertTrue(str.contains("luisp@correo.com"))
        );
    }

}
