package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author EdCarlosMateusNunesVictorLembo
 */
public class Pedido {

    private String numero;
    private String dataEmissao;
    private String dataPagto;
    private boolean formaPagto;
    private boolean situacao;
    private Cliente cliente;
    private Vendedor vendedor;

    private ArrayList<ItemPedido> itensPedido;

    public Pedido(String numero, String dataEmissao) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        itensPedido = new ArrayList<ItemPedido>();
    }

    public boolean isFormaPagto() {
        return formaPagto;
    }

    public ItemPedido getItensPedido(int i) {
        return itensPedido.get(i);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public void setFormaPagto(Boolean formaPagto) {
        this.formaPagto = formaPagto;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public String getNumero() {
        return numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public Boolean getFormaPagto() {
        return formaPagto;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void addItensPedido(ItemPedido itensPed) {
        itensPedido.add(itensPed);
        itensPed.setPedido(this);
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (itensPed.getProduto().getPreco() * itensPed.getQtdeVendida()));

    }
}
