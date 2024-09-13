/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.testbases;

import com.mycompany.testbases.modelo.Cliente;
import com.mycompany.testbases.modelo.Controladora;

/**
 *
 * @author alex
 */
public class Testbases {

    public static void main(String[] args) {

        Controladora control=new Controladora();
        Cliente cliente=control.obtenerCliente(2L);
        
      //   control.crearCliente(cliente);
      cliente.setApellido("aviles");
        control.editarCliente(cliente);
        

  
    }
}
