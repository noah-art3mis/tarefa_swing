/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastrocliente;

import java.util.Objects;

/**
 *
 * @author Gustavo
 */
public class Cliente {

    private String nome;
    private String endereco;
    private Long cpf;
    private Long telefone;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(
            String nome,
            String cpf,
            String telefone,
            String endereco,
            String numero,
            String cidade,
            String estado) {

        this.nome = nome;
        this.cpf = Long.valueOf(cpf);
        this.telefone = Long.valueOf(telefone);
        this.endereco = endereco;
        this.numero = Integer.valueOf(numero);
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf.toString();
    }

    public void setCpf(String cpf) {
        this.cpf = Long.parseLong(cpf);
    }

    public String getTelefone() {
        return telefone.toString();
    }

    public void setTelefone(String telefone) {
        this.telefone = Long.parseLong(telefone);
    }

    public String getNumero() {
        return numero.toString();
    }

    public void setNumero(String numero) {
        this.numero = Integer.parseInt(numero);
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Cliente cliente = (Cliente) obj;
        return Objects.equals(cpf, cliente.cpf);
    }
}

