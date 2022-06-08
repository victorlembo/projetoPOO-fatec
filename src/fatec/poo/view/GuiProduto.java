package fatec.poo.view;

import fatec.poo.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author EdCarlosMateusNunesVictorLembo
 */
public class GuiProduto extends javax.swing.JFrame {

    public GuiProduto(ArrayList<Produto> p) {
        initComponents();
        cadProd = p;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        lblQtdeDisponivel = new javax.swing.JLabel();
        lblPrecoUnitario = new javax.swing.JLabel();
        lblEstoqueMinimo = new javax.swing.JLabel();
        txtEstoqueMin = new javax.swing.JTextField();
        txtPrecoUnit = new javax.swing.JTextField();
        txtQtdeDisp = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblUnidMed = new javax.swing.JLabel();
        txtUnidMed = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Produtos");

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setText("Código");

        lblDescricao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescricao.setText("Descrição");

        txtDescricao.setEnabled(false);

        lblQtdeDisponivel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblQtdeDisponivel.setText("Qtde. Disponivel");

        lblPrecoUnitario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPrecoUnitario.setText("Preço Unitário");

        lblEstoqueMinimo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstoqueMinimo.setText("Estoque Mínimo");

        txtEstoqueMin.setEnabled(false);

        txtPrecoUnit.setEnabled(false);

        txtQtdeDisp.setEnabled(false);

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setMnemonic('C');
        btnConsultar.setText("Consulta");
        btnConsultar.setBorder(null);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setMnemonic('I');
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setMnemonic('A');
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setMnemonic('E');
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setMnemonic('S');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblUnidMed.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUnidMed.setText("Unidade Medida");

        txtUnidMed.setEnabled(false);
        txtUnidMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidMedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUnidMed)
                            .addComponent(lblQtdeDisponivel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtQtdeDisp, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(txtUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPrecoUnitario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEstoqueMinimo)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricao)
                            .addComponent(lblCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtQtdeDisp, txtUnidMed});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQtdeDisponivel)
                    .addComponent(lblPrecoUnitario)
                    .addComponent(lblEstoqueMinimo)
                    .addComponent(txtEstoqueMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtdeDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUnidMed)
                    .addComponent(txtUnidMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtQtdeDisp, txtUnidMed});

        pack();
    }// </editor-fold>//GEN-END:initComponents
      private static boolean isNumeric(String c) {
        try {
            Long.parseLong(c);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
      };
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        String codigo = txtCodigo.getText();
        if (isNumeric(codigo) == true) {
            int i;
            for (i = 0; i < cadProd.size(); i++) {
                if (((Produto) cadProd.get(i)).getCodigo().equals(txtCodigo.getText())) {
                    break;
                }
            }
            if (i < cadProd.size()) {
                posProduto = i;
            } else {
                posProduto = -1;
            }

            if (posProduto >= 0) {
                txtCodigo.setText(((Produto) cadProd.get(posProduto)).getCodigo());
                txtDescricao.setText(cadProd.get(posProduto).getDescricao());
                txtQtdeDisp.setText(String.valueOf(cadProd.get(posProduto).getQtdeEstoque()));
                txtPrecoUnit.setText(String.valueOf(cadProd.get(posProduto).getPreco()));
                txtEstoqueMin.setText(String.valueOf(cadProd.get(posProduto).getEstoqueMinimo()));
                txtUnidMed.setText(cadProd.get(posProduto).getUnidadeMedida());
                
                
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            } else {
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                txtDescricao.requestFocus();
            }
            txtCodigo.setEnabled(false);
            txtDescricao.setEnabled(true);
            txtQtdeDisp.setEnabled(true);
            txtPrecoUnit.setEnabled(true);
            txtEstoqueMin.setEnabled(true);
            txtUnidMed.setEnabled(true);
            txtDescricao.requestFocus();

        } else {
            JOptionPane.showMessageDialog(null, "Digite um código válido!");
            txtCodigo.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        Produto p = new Produto(txtCodigo.getText(),
                txtDescricao.getText());
        p.setQtdeEstoque(Double.parseDouble(txtQtdeDisp.getText()));
        p.setPreco(Double.parseDouble(txtPrecoUnit.getText()));
        p.setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
        p.setUnidadeMedida(txtUnidMed.getText());
        cadProd.add(p);

        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtEstoqueMin.setText(null);
        txtPrecoUnit.setText(null);
        txtQtdeDisp.setText(null);
        txtUnidMed.setText(null);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtUnidMed.setEnabled(false);
        
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtCodigo.setEnabled(false);
        cadProd.get(posProduto).setDescricao(txtDescricao.getText());
        ((Produto) cadProd.get(posProduto)).setQtdeEstoque(Double.parseDouble(txtQtdeDisp.getText()));
        ((Produto) cadProd.get(posProduto)).setPreco(Double.parseDouble(txtPrecoUnit.getText()));
        ((Produto) cadProd.get(posProduto)).setEstoqueMinimo(Double.parseDouble(txtEstoqueMin.getText()));
        ((Produto) cadProd.get(posProduto)).setUnidadeMedida(txtUnidMed.getText());

        txtDescricao.setText(null);
        txtEstoqueMin.setText(null);
        txtPrecoUnit.setText(null);
        txtQtdeDisp.setText(null);
        txtUnidMed.setText(null);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtUnidMed.setEnabled(false);
        
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posProduto >= 0) {
            cadProd.remove(posProduto);
            posProduto = -1;
        }

        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtEstoqueMin.setText(null);
        txtPrecoUnit.setText(null);
        txtQtdeDisp.setText(null);
        txtUnidMed.setText(null);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCodigo.setEnabled(true);
        txtDescricao.setEnabled(false);
        txtEstoqueMin.setEnabled(false);
        txtPrecoUnit.setEnabled(false);
        txtQtdeDisp.setEnabled(false);
        txtUnidMed.setEnabled(false);
        
        txtCodigo.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtUnidMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnidMedActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblEstoqueMinimo;
    private javax.swing.JLabel lblPrecoUnitario;
    private javax.swing.JLabel lblQtdeDisponivel;
    private javax.swing.JLabel lblUnidMed;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMin;
    private javax.swing.JTextField txtPrecoUnit;
    private javax.swing.JTextField txtQtdeDisp;
    private javax.swing.JTextField txtUnidMed;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Produto> cadProd;
    private int posProduto;
}
