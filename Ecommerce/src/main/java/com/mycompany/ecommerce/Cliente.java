/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ecommerce;

import javax.swing.JOptionPane;

public class Cliente {

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
     return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private int idade;
    private double saldo;   
    
    public Cliente(String nome,String email,String telefone,int idade){
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setIdade(idade);
    }
    public double adicionaSaldo(){
        double adiciona = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto vai ser adicionado"));
        saldo+=adiciona;
        return saldo;
    }
  


}