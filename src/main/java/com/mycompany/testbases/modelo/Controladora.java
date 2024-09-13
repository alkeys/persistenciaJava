/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbases.modelo;

import com.mycompany.testbases.persistencia.Controladorapersistencia;

/**
 *
 * @author alex
 */
public class Controladora {
    private Controladorapersistencia controladorapersistencia=new Controladorapersistencia();

    public void crearCliente(Cliente cliente){
        controladorapersistencia.crearCliente(cliente);
    }

    public void editarCliente(Cliente cliente){
        controladorapersistencia.editarCliente(cliente);
    }

    public void eliminarCliente(Long id){
        controladorapersistencia.eliminarCliente(id);
    }

    public void buscarCliente(Long id){
        controladorapersistencia.buscarCliente(id);
    }

    public Cliente obtenerCliente(Long id){
        return controladorapersistencia.obtenerCliente(id);
    }


}
