/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.vendascarro.objetos.bean;

import br.vendascarro.objetos.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author marcus
 */
@ManagedBean
@SessionScoped
public class ClienteBean {
    private Cliente cliente = new Cliente();
    private List<Cliente> clientes = new ArrayList<>();
    
    public String adicionar() {
        FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("nome", cliente.getNome().toString());
        
        clientes.add(cliente);
        cliente = new Cliente();

        return "carros";
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
