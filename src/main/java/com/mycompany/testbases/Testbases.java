/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testbases;

import com.mycompany.testbases.modelo.Cliente;
import com.mycompany.testbases.persistencia.ClienteJpaController;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alex
 */
public class Testbases {

    public static void main(String[] args) {
        ClienteJpaController clienteJpaController = new ClienteJpaController();
        List<Cliente> clientes = null;


        try{
        ///  clienteJpaController.create(cliente);
        //cliente=clienteJpaController.findCliente(101L);
            clientes= clienteJpaController.findClienteEntities();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        assert clientes != null;
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre());
            System.out.println(cliente.getApellido());
        }

  
    }
}
