package com.distribuida.dao;

import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class ClienteTestIntegracion {

    @Autowired
    private ClienteDAO clienteDAO;

    @Test
    public void findAll(){
        List<Cliente> clientes = clienteDAO.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0);
        for (Cliente item : clientes){
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne(){
        Optional<Cliente> cliente = clienteDAO.findById(1);
        assertTrue(cliente.isPresent(), "El cliente con id = 1, deberia existir");
        System.out.println(cliente.toString());
    }

    @Test
    public void save(){
        Cliente cliente = new Cliente(
                0, "1782565623", "Juano", "Taipe"
                , "Av.por ahi", "0958635241", "jtaipe@correo.com");
        Cliente clienteGuardado = clienteDAO.save(cliente);
        assertNotNull(clienteGuardado.getIdCliente(), "El cliente guardado debe tener un id:");
        assertEquals("1782565623",clienteGuardado.getCedula());
        assertEquals("Juano",clienteGuardado.getNombre());
    }

    @Test
    public void update(){
        Optional<Cliente> cliente = clienteDAO.findById(44);
        assertTrue(cliente.isPresent(), "El cliente con id=44 debe de existir para ser actualizado");

        cliente.orElse(null).setCedula("1720526341");
        cliente.orElse(null).setNombre("Juana");
        cliente.orElse(null).setApellido("Taipa");
        cliente.orElse(null).setDirreccion("Av.88");
        cliente.orElse(null).setTelofono("0999352418");
        cliente.orElse(null).setCorreo("jtaipa@correo.com");

        Cliente clienteActualizado = clienteDAO.save(cliente.orElse(null));

        assertEquals("Juana", clienteActualizado.getNombre());
        assertEquals("Taipa", clienteActualizado.getApellido());

    }

    @Test
    public void delete(){
        if (clienteDAO.existsById(44)){
            clienteDAO.deleteById(44);
        }
        assertFalse(clienteDAO.existsById(44), "El id=44 deberia haberse eliminado");

    }

}
