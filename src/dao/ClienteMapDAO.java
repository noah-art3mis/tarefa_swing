/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import cadastrocliente.Cliente;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Gustavo
 */
public class ClienteMapDAO implements IClienteDAO {

  private Map<Long, Cliente> map;

  public ClienteMapDAO() {
    map = new TreeMap<>();
  }

  @Override
  public Boolean create(Cliente cliente) {
    if (map.containsKey(cliente.getCpf())) {
      return false;
    }
    map.put(cliente.getCpf(), cliente);
    return true;
  }

  @Override
  public Cliente read(Long cpf) {
    if (!map.containsKey(cpf)) {
      return null;
    }
    Cliente cliente = map.get(cpf);
    return cliente;
  }

  @Override
  public void update(Cliente novoCliente) {
    if (map.containsKey(novoCliente.getCpf())) {
      return;
    } else {
      Cliente registro = map.get(novoCliente.getCpf());

      registro.setNome(novoCliente.getNome());
      registro.setCpf(novoCliente.getCpf());
      registro.setTelefone(novoCliente.getTelefone());
      registro.setEndereco(novoCliente.getEndereco());
      registro.setCidade(novoCliente.getCidade());
      registro.setNumero(novoCliente.getNumero());
      registro.setEstado(novoCliente.getEstado());
    }
  }

  @Override
  public void delete(Long cpf) {
    if (map.containsKey(cpf)) {
      map.get(cpf);
      map.remove(cpf);
    } else {
      return;
    }
  }
}
