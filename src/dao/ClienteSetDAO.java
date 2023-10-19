/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import cadastrocliente.Cliente;
import java.util.Set;

/**
 *
 * @author Gustavo
 */
public class ClienteSetDAO implements IClienteDAO {

  private Set<Cliente> set;

  @Override
  public Boolean create(Cliente cliente) {
    if (set.contains(cliente)) {
      return false;
    }
    set.add(cliente);
    return true;
  }

  @Override
  public Cliente read(Long cpf) {
    for (Cliente item : set) {
      if (item.getCpf().equals(cpf)) {
        return item;
      }
    }
    return null;
  }

  @Override
  public void update(Cliente novoCliente) {
    Cliente registro = this.read(novoCliente.getCpf());

    registro.setNome(novoCliente.getNome());
    registro.setCpf(novoCliente.getCpf());
    registro.setTelefone(novoCliente.getTelefone());
    registro.setEndereco(novoCliente.getEndereco());
    registro.setCidade(novoCliente.getCidade());
    registro.setNumero(novoCliente.getNumero());
    registro.setEstado(novoCliente.getEstado());
  }

  @Override
  public void delete(Long cpf) {
    Cliente cliente = this.read(cpf);
    set.remove(cliente);
  }
}
