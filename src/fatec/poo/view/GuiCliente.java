package fatec.poo.view;

import fatec.poo.model.Cliente;
import fatec.poo.model.Pessoa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author EdCarlosMateusNunesVictorLembo
 */
public class GuiCliente extends javax.swing.JFrame {

    public GuiCliente(ArrayList<Pessoa> c) {
        initComponents();
        cadCliVend = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereço = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblUf = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblLimiteCredito = new javax.swing.JLabel();
        lblLimiteDisponivel = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtLimiteCred = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cbxUf = new javax.swing.JComboBox<>();
        txtDdd = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        lblLimiteDisp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");

        lblCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCpf.setText("CPF");

        lblNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNome.setText("Nome");

        lblEndereço.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEndereço.setText("Endereço");

        lblCidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCidade.setText("Cidade");

        lblUf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblUf.setText("UF");

        lblCep.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCep.setText("CEP");

        lblTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTelefone.setText("Telefone");

        lblLimiteCredito.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLimiteCredito.setText("Limite Crédito");

        lblLimiteDisponivel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblLimiteDisponivel.setText("Limite Disponível");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        txtNome.setEnabled(false);
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtCep.setEnabled(false);
        txtCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCepActionPerformed(evt);
            }
        });

        txtLimiteCred.setEnabled(false);

        txtTelefone.setEnabled(false);

        cbxUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO", "DF" }));
        cbxUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUfActionPerformed(evt);
            }
        });

        txtDdd.setEnabled(false);

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setMnemonic('S');
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

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

        lblLimiteDisp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblEndereço, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblCidade))
                            .addComponent(lblLimiteCredito)
                            .addComponent(lblNome)
                            .addComponent(lblCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblUf)
                                                .addGap(18, 18, 18)
                                                .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblLimiteDisponivel))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lblCep)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblLimiteDisp, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(56, 56, 56))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTelefone)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereço)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf)
                    .addComponent(cbxUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblCep))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTelefone)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLimiteCredito)
                            .addComponent(txtLimiteCred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLimiteDisponivel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblLimiteDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
            int i;
            String cpfFormatted;
            for (i = 0; i < cadCliVend.size(); i++) {
                if (cadCliVend.get(i) instanceof Cliente) {
                    if (((Pessoa) cadCliVend.get(i)).getCpf().equals(txtCpf.getText())) {
                        break;
                    }
                }
            }

            cpfFormatted = txtCpf.getText().replace("-", "").replace(".", "");
            if (Pessoa.validarCPF(cpfFormatted)) {
                if (i < cadCliVend.size()) {
                    posCliente = i;
                } else {
                    posCliente = -1;
                }

                if (posCliente >= 0) {
                    txtCpf.setText(((Pessoa) cadCliVend.get(posCliente)).getCpf());
                    txtNome.setText(cadCliVend.get(posCliente).getNome());
                    txtEndereco.setText(cadCliVend.get(posCliente).getEndereco());
                    txtCidade.setText(cadCliVend.get(posCliente).getCidade());
                    cbxUf.setSelectedItem(String.valueOf(((Cliente) cadCliVend.get(posCliente)).getUf()));
                    txtCep.setText(String.valueOf(((Cliente) cadCliVend.get(posCliente)).getCep()));
                    txtDdd.setText(String.valueOf(((Cliente) cadCliVend.get(posCliente)).getDdd()));
                    txtTelefone.setText(cadCliVend.get(posCliente).getTelefone());
                    txtLimiteCred.setText(String.valueOf(((Cliente) cadCliVend.get(posCliente)).getLimiteCred()));
                    lblLimiteDisp.setText(String.valueOf(((Cliente) cadCliVend.get(posCliente)).getLimiteDisp()));

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
                txtLimiteCred.setEnabled(true);
                lblLimiteDisp.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "CPF Inválido!");
                txtCpf.requestFocus();
            }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCepActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed

    }//GEN-LAST:event_txtCpfActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (posCliente >= 0) {
            cadCliVend.remove(posCliente);
            posCliente = -1;
        }

        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUf.setSelectedItem(null);
        txtCep.setText(null);
        txtDdd.setText(null);
        txtTelefone.setText(null);
        txtLimiteCred.setText(null);
        lblLimiteDisp.setText(null);
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
        txtLimiteCred.setEnabled(false);
        lblLimiteDisp.setEnabled(false);
        txtCpf.requestFocus();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
         if(txtNome.getText() == null || txtNome.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o nome do Cliente!");
        }
         if(txtLimiteCred.getText() == null || txtLimiteCred.getText().trim().equals("")){
             JOptionPane.showMessageDialog(null, "Informe o limite de credito do Cliente!");
         }
         else {
            
        Cliente c = new Cliente(txtCpf.getText(), 
                                txtNome.getText(),
                                Double.parseDouble(txtLimiteCred.getText()));
                                        c.setEndereco(txtEndereco.getText());
                                        c.setCidade(txtCidade.getText());
                                        c.setCep(txtCep.getText());
                                        c.setDdd(txtDdd.getText());
                                        c.setUf(String.valueOf(cbxUf.getSelectedItem()));
                                        c.setTelefone(txtTelefone.getText());
                                        c.setLimiteCred(Double.parseDouble(txtLimiteCred.getText()));
                                        c.setLimiteDisp(Double.parseDouble(txtLimiteCred.getText()));
                                        cadCliVend.add(c); 
        
        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUf.setSelectedItem(null);
        txtCep.setText(null);
        txtDdd.setText(null);
        txtTelefone.setText(null);
        txtLimiteCred.setText(null);
        lblLimiteDisp.setText(null);
        
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
        txtLimiteCred.setEnabled(false);
        txtCpf.requestFocus();
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        txtCpf.setEnabled(false);
        cadCliVend.get(posCliente).setNome(txtNome.getText());
        cadCliVend.get(posCliente).setEndereco(txtEndereco.getText());
        cadCliVend.get(posCliente).setCidade(txtCidade.getText());
        cadCliVend.get(posCliente).setDdd(txtDdd.getText());
        cadCliVend.get(posCliente).setTelefone(txtTelefone.getText());
        cadCliVend.get(posCliente).setCep(txtCep.getText());
        cadCliVend.get(posCliente).setUf(String.valueOf(cbxUf.getSelectedItem()));
        ((Cliente)cadCliVend.get(posCliente)).setLimiteCred(Double.parseDouble(txtLimiteCred.getText()));
        ((Cliente)cadCliVend.get(posCliente)).setLimiteDisp(Double.parseDouble(txtLimiteCred.getText()));
        
        txtCpf.setText(null);
        txtNome.setText(null);
        txtEndereco.setText(null);
        txtCidade.setText(null);
        cbxUf.setSelectedItem(null);
        txtCep.setText(null);
        txtDdd.setText(null);
        txtTelefone.setText(null);
         txtLimiteCred.setText(null);
        lblLimiteDisp.setText(null); 
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
        txtLimiteCred.setEnabled(false);
        lblLimiteDisp.setEnabled(false);  
        txtCpf.requestFocus();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void cbxUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUfActionPerformed

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
    private javax.swing.JLabel lblEndereço;
    private javax.swing.JLabel lblLimiteCredito;
    private javax.swing.JLabel lblLimiteDisp;
    private javax.swing.JLabel lblLimiteDisponivel;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtDdd;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtLimiteCred;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Pessoa> cadCliVend;
    private int posCliente;
}
