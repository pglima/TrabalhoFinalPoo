/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pootrabalhofinal;

/**
 *
 * @author Metodista
 */
public class Produto {
    private String nome;
    private double valor_compra;
    private double valor_venda;
    private double lucratividade;
    private boolean bloqueado = false;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor_compra() {
        return valor_compra;
    }

    public void setValor_compra(double valor_compra) {
        this.valor_compra = valor_compra;
    }

    public double getValor_venda() {
        return valor_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }

    public double getLucratividade() {
        return lucratividade;
    }

    public void setLucratividade(double lucratividade) {
        this.lucratividade = lucratividade;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }
    
    
    
}
