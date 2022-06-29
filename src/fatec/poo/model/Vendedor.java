package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author EdCarlosMateusNunesVictorLembo
 */
public class Vendedor extends Pessoa {

    private double salarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;
    private int qtdePedidos = 0;

    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getTaxaComissao() {
        return taxaComissao / 100;
    }

    public void addPedido(Pedido p) {
        pedidos.add(p);
        p.setVendedor(this);

        int i;

        for (i = 0; i < pedidos.size(); i++) {
            qtdePedidos++;
        }
    }

    public int getQtdePedidos() {
        return qtdePedidos;
    }

}
