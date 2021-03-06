/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Markedu.telas;

import Markedu.Banco.conectaBanco;
import Modelo.ModeloTabela;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author luan
 */
public class TelaEventos extends javax.swing.JFrame {

    conectaBanco conecta = new conectaBanco();
    
    public TelaEventos() {
        initComponents();
        conecta.conexao();
        preencherTabela("select * from eventos order by codigo_evento");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codigoEvento = new javax.swing.JTextField();
        nomeEvento = new javax.swing.JTextField();
        responsavelEvento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        novoEvento = new javax.swing.JButton();
        salvarEvento = new javax.swing.JButton();
        alterarEvento = new javax.swing.JButton();
        deletarEvento = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        botaoPrimeiro = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaEventos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        ativOfEvento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Eventos");
        setResizable(false);

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Menu Cadastro de Eventos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Código:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Responsável");

        codigoEvento.setEnabled(false);

        nomeEvento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        nomeEvento.setEnabled(false);

        responsavelEvento.setEnabled(false);
        responsavelEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsavelEventoActionPerformed(evt);
            }
        });

        jLabel5.setText("Curso:");

        novoEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/novo.png"))); // NOI18N
        novoEvento.setToolTipText("Novo");
        novoEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novoEventoActionPerformed(evt);
            }
        });

        salvarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/salvar.png"))); // NOI18N
        salvarEvento.setToolTipText("Salvar");
        salvarEvento.setEnabled(false);
        salvarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarEventoActionPerformed(evt);
            }
        });

        alterarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/refresh.png"))); // NOI18N
        alterarEvento.setEnabled(false);
        alterarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarEventoActionPerformed(evt);
            }
        });

        deletarEvento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/deletar.png"))); // NOI18N
        deletarEvento.setEnabled(false);
        deletarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarEventoActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/sair.png"))); // NOI18N
        jButton5.setToolTipText("Sair");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        botaoPrimeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/botao primeiro.png"))); // NOI18N
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });

        botaoAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/botao anterior.png"))); // NOI18N
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoUltimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/botao ultimo.png"))); // NOI18N
        botaoUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimoActionPerformed(evt);
            }
        });

        botaoProximo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Markedu/imagens/botao proximo.png"))); // NOI18N
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        tabelaEventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tabelaEventos);

        jLabel6.setText("Data Início:");

        jLabel7.setText("Data Término");

        jLabel8.setText("Atividades Oferecidas:");

        ativOfEvento.setEnabled(false);

        jLabel9.setText("Situação:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addComponent(nomeEvento)
                            .addComponent(codigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(responsavelEvento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ativOfEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(novoEvento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(salvarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deletarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(botaoPrimeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(codigoEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(responsavelEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ativOfEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoPrimeiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvarEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterarEvento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoUltimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoProximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletarEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        setSize(new java.awt.Dimension(748, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void responsavelEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsavelEventoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsavelEventoActionPerformed

    private void salvarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarEventoActionPerformed
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("insert into eventos (nome_evento, responsavel_evento, ativiof_evento)values(?, ?, ?)");
        pst.setString(1, nomeEvento.getText());
        pst.setString(2, responsavelEvento.getText());
        pst.setString(3, ativOfEvento.getText());
        pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso");
             preencherTabela("select * from eventos order by codigo_evento");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Inserção Falhada\n Error "+ ex);
        }
        
        nomeEvento.setText("");
        responsavelEvento.setText("");
        codigoEvento.setText("");
    
        ativOfEvento.setText("");
        
        nomeEvento.setEnabled(true);
        responsavelEvento.setEnabled(true);
        
        salvarEvento.setEnabled(false);
        alterarEvento.setEnabled(false);
        deletarEvento.setEnabled(false);
        novoEvento.setEnabled(true);
    }//GEN-LAST:event_salvarEventoActionPerformed

    private void deletarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarEventoActionPerformed
       
       conecta.executaSQL("delete from eventos where nome_evento='" +nomeEvento.getText()+"'");
        preencherTabela("select * from eventos order by codigo_evento");
       
       nomeEvento.setText("");
        responsavelEvento.setText("");
        codigoEvento.setText("");
        nomeEvento.setText("");
        
        nomeEvento.setEnabled(true);
        responsavelEvento.setEnabled(true);
        salvarEvento.setEnabled(true);
        alterarEvento.setEnabled(true);
        deletarEvento.setEnabled(true);
        novoEvento.setEnabled(false); 
    }//GEN-LAST:event_deletarEventoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void novoEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novoEventoActionPerformed
       
        nomeEvento.setText("");
        responsavelEvento.setText("");
        codigoEvento.setText("");
        
                
        nomeEvento.setEnabled(true);
        responsavelEvento.setEnabled(true);
      
        ativOfEvento.setEnabled(true);
        salvarEvento.setEnabled(true);
        alterarEvento.setEnabled(true);
        deletarEvento.setEnabled(true);
        novoEvento.setEnabled(false);
    }//GEN-LAST:event_novoEventoActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
            
        alterarEvento.setEnabled(true);
        deletarEvento.setEnabled(true);
        nomeEvento.setEnabled(true);
        responsavelEvento.setEnabled(true);
        try {
            conecta.executaSQL("select * from eventos");
            conecta.rs.first();
            codigoEvento.setText(String.valueOf(conecta.rs.getInt("codigo_evento")));
            nomeEvento.setText(conecta.rs.getString("nome_evento"));
            responsavelEvento.setText(conecta.rs.getString("responsavel_evento"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar\n Error "+ ex);
        }
    }//GEN-LAST:event_botaoPrimeiroActionPerformed

    private void botaoUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimoActionPerformed
             
        alterarEvento.setEnabled(true);
        deletarEvento.setEnabled(true);
        nomeEvento.setText("");
        responsavelEvento.setText("");
        try {
            conecta.executaSQL("select * from eventos");
            conecta.rs.last();
            codigoEvento.setText(String.valueOf(conecta.rs.getInt("codigo_evento")));
            nomeEvento.setText(conecta.rs.getString("nome_evento"));
            responsavelEvento.setText(conecta.rs.getString("responsavel_evento"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Mostrar\n Error "+ ex);
        } 
        
    }//GEN-LAST:event_botaoUltimoActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
       
        alterarEvento.setEnabled(true);
        deletarEvento.setEnabled(true);
        nomeEvento.setText("");
        responsavelEvento.setText("");
        try {
            conecta.rs.previous();
            codigoEvento.setText(String.valueOf(conecta.rs.getInt("codigo_evento")));
            nomeEvento.setText(conecta.rs.getString("nome_evento"));
            responsavelEvento.setText(conecta.rs.getString("responsavel_evento"));
        } catch (SQLException ex) {
            Logger.getLogger(TelaEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        alterarEvento.setEnabled(true);
        deletarEvento.setEnabled(true);
        nomeEvento.setText("");
        responsavelEvento.setText("");
         try {
            conecta.rs.next();
            codigoEvento.setText(String.valueOf(conecta.rs.getInt("codigo_evento")));
            nomeEvento.setText(conecta.rs.getString("nome_evento"));
            responsavelEvento.setText(conecta.rs.getString("responsavel_evento"));
        } catch (SQLException ex) {
            Logger.getLogger(TelaEventos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void alterarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarEventoActionPerformed
       
        nomeEvento.setEnabled(true);
        responsavelEvento.setEnabled(true);
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("update eventos set nome_evento= ?, responsavel_evento=? where codigo_evento=?");
        pst.setString(1, nomeEvento.getText());
        pst.setString(2, responsavelEvento.getText());
        pst.setInt (3, Integer.parseInt(codigoEvento.getText()));
        pst.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Editado com Sucesso");
             preencherTabela("select * from eventos order by codigo_evento");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro\n Error "+ ex);
        }
      
    }//GEN-LAST:event_alterarEventoActionPerformed

    public void preencherTabela(String SQL){
            ArrayList dados = new ArrayList();
            String [] Colunas = new String []{"CODIGO", "NOME", "RESPONSAVEL"};
            
            conecta.executaSQL(SQL);
        try {
            conecta.rs.first();
              do{
                dados.add (new Object[]{conecta.rs.getInt("codigo_evento"), conecta.rs.getString("nome_evento"), conecta.rs.getString("responsavel_evento")});
            }while(conecta.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Preencher");
        }
        
      ModeloTabela modelo = new ModeloTabela (dados, Colunas);
      tabelaEventos.setModel(modelo);
      tabelaEventos.getColumnModel().getColumn(0).setPreferredWidth(80);
      tabelaEventos.getColumnModel().getColumn(0).setResizable(false);
      tabelaEventos.getColumnModel().getColumn(1).setPreferredWidth(290);
      tabelaEventos.getColumnModel().getColumn(1).setResizable(false); 
      tabelaEventos.getColumnModel().getColumn(2).setPreferredWidth(280);
      tabelaEventos.getColumnModel().getColumn(2).setResizable(false);
      tabelaEventos.getTableHeader().setReorderingAllowed(false);
      tabelaEventos.setAutoResizeMode(tabelaEventos.AUTO_RESIZE_OFF);
      tabelaEventos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEventos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEventos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarEvento;
    private javax.swing.JTextField ativOfEvento;
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoUltimo;
    private javax.swing.JTextField codigoEvento;
    private javax.swing.JButton deletarEvento;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nomeEvento;
    private javax.swing.JButton novoEvento;
    private javax.swing.JTextField responsavelEvento;
    private javax.swing.JButton salvarEvento;
    private javax.swing.JTable tabelaEventos;
    // End of variables declaration//GEN-END:variables
}
