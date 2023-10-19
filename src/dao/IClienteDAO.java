/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import cadastrocliente.Cliente;

/**
 *
 * @author Gustavo
 */
public interface IClienteDAO {
    public Boolean create(Cliente cliente);

    public Cliente read(Long cpf);

    public void update(Cliente cliente);

    public void delete(Long cpf);
}
