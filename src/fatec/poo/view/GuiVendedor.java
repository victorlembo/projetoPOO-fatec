package fatec.poo.view;

import fatec.poo.model.Pessoa;
import fatec.poo.model.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author EdCarlosMateusNunesVictorLembo
 */
public class GuiVendedor extends javax.swing.JFrame {

    public GuiVendedor(ArrayList<Pessoa> v) {
        initComponents();
        cadCliVend = v;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCidade = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblCep = new javax.swing.JLabel();
        cbxUf = new javax.swing.JComboBox<>();
        lblTelefone = new javax.swing.JLabel();
        txtDdd = new javax.swing.JTextField();
        lblSalarioBase = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblTaxaComissao = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        btnIncluir = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        lblCpf = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnExcluir = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lblEndereco = new javax.swing.JLabel();
        txtSalBase = new javax.swing.JTextField();
        lblTxComissao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Vendedor");

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCidade.setText("Cidade");

        lblUf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUf.setText("UF");

        txtTelefone.setEnabled(false);

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCep.setText("CEP");

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone");

        txtDdd.setEnabled(false);

        lblSalarioBase.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSalarioBase.setText("Salário Base");

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setMnemonic('S');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblTaxaComissao.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTaxaComissao.setText("Taxa de Comissão");

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

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
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

        txtEndereco.setEnabled(false);

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

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCpf.setText("CPF");

        txtCidade.setEnabled(false);

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

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome");

        txtCep.setEnabled(false);
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereco.setText("Endereço");

        txtSalBase.setEnabled(false);
        txtSalBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalBaseActionPerformed(evt);
            }
        });

        lblTxComissao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCep)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblCidade))
                    .addComponent(lblSalarioBase)
                    .addComponent(lblNome)
                    .addComponent(lblCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEndereco)
                            .addComponent(txtNome)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTelefone))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblTaxaComissao)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblTxComissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUf)
                                .addGap(18, 18, 18)
                                .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCidade)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUf)
                            .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCep))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefone)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSalarioBase)
                            .addComponent(txtSalBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTaxaComissao)))
                    .addComponent(lblTxComissao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        int i;
        String cpfFormatted;
        for (i = 0; i < cadCliVend.size(); i++) {
            if (cadCliVend.get(i) instanceof Vendedor) {
                if (((Pessoa) cadCliVend.get(i)).getCpf().equals(txtCpf.getText())) {
                    break;
                }
            }
        }

        cpfFormatted = txtCpf.getText().replace("-", "").replace(".", "");
        if (Pessoa.validarCPF(cpfFormatted)) {
            if (i < cadCliVend.size()) {
                posVendedor = i;
            } else {
                posVendedor = -1;
            }

            if (posVendedor >= 0) {
                txtCpf.setText(((Pessoa) cadCliVend.get(posVendedor)).getCpf());
                txtNome.setText(cadCliVend.get(posVendedor).getNome());
                txtEndereco.setText(cadCliVend.get(posVendedor).getEndereco());
                txtCidade.setText(cadCliVend.get(posVendedor).getCidade());
                cbxUf.setSelectedItem(String.valueOf((cadCliVend.get(posVendedor)).getUf()));
                txtCep.setText(cadCliVend.get(posVendedor).getCep());
                txtDdd.setText(cadCliVend.get(posVendedor).getDdd());
                txtTelefone.setText(cadCliVend.get(posVendedor).getTelefone());
                txtSalBase.setText(String.valueOf(((Vendedor) cadCliVend.get(posVendedor)).getSalarioBase()));
                lblTxComissao.setText(String.valueOf(((Vendedor) cadCliVend.get(posVendedor)).getTaxaComissao()));

                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(false);
                btnAlterar.setEnabled(true);
                btnExcluir.setEnabled(true);
            } else {
                btnConsultar.setEnabled(false);
                btnIncluir.setEnabled(true);
                btnAlterar.setEnabled(false);
                btnExcluir.setEnabled(false);
                txtNome.requestFocus();
            }
            txtCpf.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtCidade.setEnabled(true);
            cbxUf.setEnabled(true);
            txtCep.setEnabled(true);
            txtDdd.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtSalBase.setEnabled(true);
            lblTxComissao.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Cpf Inválido!");
            txtCpf.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtSalBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalBaseActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
         if(txtCpf.getText() == null || txtNome.getText() == null || txtSalBase == null
          || txtEndereco.getText() == null || txtCidade.getText() == null || txtCep.getText() == null || txtDdd.getText() == null || txtTelefone.getText() == null) {
            JOptionPane.showMessageDialog(null, "Informe todos os dados!");
            txtCpf.requestFocus();  
        } else {
        
        Vendedor v = new Vendedor(txtCpf.getText(),
                                    txtNome.getText(),
                                    Double.parseDouble(txtSalBase.getText()));
                                    v.setEndereco(txtEndereco.getText());
                                    v.setCidade(txtCidade.getText());
                                    v.setCep(txtCep.getText());
                                    v.setDdd(txtDdd.getText());
                                    v.setUf(String.valueOf(cbxUf.getSelectedItem()));
                                    v.setTelefone(txtTelefone.getText());
                                    cadCliVend.add(v);

        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUf.setSelectedItem(null);
        txtCep.setText(null);
        txtDdd.setText(null);
        txtTelefone.setText(null);
        txtSalBase.setText(null);
        lblTxComissao.setText(null);

        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxUf.setEnabled(false);
        txtCep.setEnabled(false);
        txtDdd.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSalBase.setEnabled(false);
        lblTxComissao.setEnabled(false);
        
        txtCpf.requestFocus();
    }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtCpf.setEnabled(false);
        cadCliVend.get(posVendedor).setNome(txtNome.getText());
        cadCliVend.get(posVendedor).setEndereco(txtEndereco.getText());
        cadCliVend.get(posVendedor).setCidade(txtCidade.getText());
        cadCliVend.get(posVendedor).setDdd(txtDdd.getText());
        cadCliVend.get(posVendedor).setTelefone(txtTelefone.getText());
        cadCliVend.get(posVendedor).setCep(txtCep.getText());
        cadCliVend.get(posVendedor).setUf(String.valueOf(cbxUf.getSelectedItem()));
        ((Vendedor) cadCliVend.get(posVendedor)).setSalarioBase(Double.parseDouble(txtSalBase.getText()));
        ((Vendedor)cadCliVend.get(posVendedor)).setTaxaComissao(Double.parseDouble(lblTxComissao.getText()));

        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUf.setSelectedItem(null);
        txtCep.setText(null);
        txtDdd.setText(null);
        txtTelefone.setText(null);
        txtSalBase.setText(null);
        lblTxComissao.setText(null);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxUf.setEnabled(false);
        txtCep.setEnabled(false);
        txtDdd.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSalBase.setEnabled(false);
        lblTxComissao.setEnabled(false);
        
        txtCpf.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posVendedor >= 0) {
            cadCliVend.remove(posVendedor);
            posVendedor = -1;
        }

        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUf.setSelectedItem(null);
        txtCep.setText(null);
        txtDdd.setText(null);
        txtTelefone.setText(null);
        txtSalBase.setText(null);
        lblTxComissao.setText(null);
        
        btnConsultar.setEnabled(true);
        btnIncluir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
        
        txtCpf.setEnabled(true);
        txtNome.setEnabled(false);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtCidade.setEnabled(false);
        cbxUf.setEnabled(false);
        txtCep.setEnabled(false);
        txtDdd.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtSalBase.setEnabled(false);
        lblTxComissao.setEnabled(false);
        
        txtCpf.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cbxUf;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSalarioBase;
    private javax.swing.JLabel lblTaxaComissao;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTxComissao;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSalBase;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadCliVend;
    private int posVendedor;
}
