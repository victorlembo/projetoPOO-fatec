package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author EdCarlosMateusNunesVictorLembo
 */
public class Cliente extends Pessoa {

    private double limiteCred;
    private double limiteDisp;
    private boolean sexo;
    private ArrayList<Pedido> pedidos;
    private int qtdePedidos = 0;

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        this.limiteDisp = limiteCred;
        pedidos = new ArrayList<Pedido>();
    }

    public double getLimiteCred() {
        return limiteCred;
    }

    public void setLimiteCred(double limiteCred) {
        this.limiteCred = limiteCred;
    }

    public void setLimiteDisp(double limiteDisp) {
        this.limiteDisp = limiteDisp;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }

    public void addPedido(Pedido p) {
        pedidos.add(p);
        p.setCliente(this);

        int i;

        for (i = 0; i < pedidos.size(); i++) {
            qtdePedidos++;
        }
    }

    public int getQtdePedidos() {
        return qtdePedidos;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

}
