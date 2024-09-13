/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.testbases.persistencia;

import com.mycompany.testbases.modelo.Cliente;

import java.util.List;

/**
 *
 * @author alex
 */
public class Controladorapersistencia {
    
    private ClienteJpaController clientejpa=new ClienteJpaController();

    public void crearCliente(Cliente cliente){
        try{
            clientejpa.create(cliente);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void editarCliente(Cliente cliente){
        try{
            clientejpa.edit(cliente);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void eliminarCliente(Long id){
        try{
            clientejpa.destroy(id);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public void buscarCliente(Long id){
        try{
            Cliente cliente=clientejpa.findCliente(id);
            System.out.println(cliente.getNombre());
            System.out.println(cliente.getApellido());
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }

    public List<Cliente> obtenerClientes(int maxResults, int firstResult){
        List<Cliente> clientes=null;
        try{
            clientes=clientejpa.findClienteEntities(maxResults, firstResult);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return clientes;
    }

    public List<Cliente> obtenerClientes(){
        List<Cliente> clientes=null;
        try{
            clientes=clientejpa.findClienteEntities();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return clientes;
    }

    public Cliente obtenerCliente(Long id){
        Cliente cliente=null;
        try{
            cliente=clientejpa.findCliente(id);
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return cliente;
    }




}
