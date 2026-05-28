package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriaTest {

    private Categoria categoria;

    @BeforeEach
    public void setUp(){
       categoria = new Categoria(
               1
               ,"Terror"
               ,"Inspirado en hechos reales"
       );
    }

    @Test
    public void testCategoriaConstructorAndGetters(){
        assertAll( "Pruebas unitarias constructor Categoria",
                () -> assertEquals(1,categoria.getIdCategoria()),
                () -> assertEquals("Terror", categoria.getCategoria()),
                () -> assertEquals("Inspirado en hechos reales", categoria.getDescripcion())
        );
        System.out.println(categoria.toString());
    }

    @Test
    public void testCategoriaToString(){
        String str = categoria.toString();
        assertAll("Validar datos de categoria con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Terror")),
                () -> assertTrue(str.contains("Perez"))
        );
    }

}
