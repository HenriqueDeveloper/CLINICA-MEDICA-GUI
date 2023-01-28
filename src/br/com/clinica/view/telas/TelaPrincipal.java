package br.com.clinica.view.telas;

import br.com.clinica.controller.PrincipalController;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;

/**
 *
 * @author Henrique
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private final PrincipalController controller;

    public TelaPrincipal() {
        initComponents();
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/br/com/clinica/imagens/clinica.png"));
        setIconImage(icon.getImage());
        this.controller = new PrincipalController(this);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnPaciente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnMedico = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnFuncionario = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnAgendamento = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnPagamento = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnConsulta = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnSuporte = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnDeslogar = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JToolBar.Separator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(4, 475));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/expandir-sua-clínica-médica-1024x683-1024x675.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        jLabel2.setText("Usuário:");

        labelNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(0, 204, 0));
        labelNome.setText("0");

        labelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelUsuario.setForeground(new java.awt.Color(0, 204, 0));
        labelUsuario.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNome)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(labelUsuario))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar2.setBackground(new java.awt.Color(255, 255, 255));
        jToolBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 204, 255)));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.setMaximumSize(new java.awt.Dimension(776, 32769));
        jToolBar2.setMinimumSize(new java.awt.Dimension(722, 70));
        jToolBar2.setPreferredSize(new java.awt.Dimension(776, 70));
        jToolBar2.add(jSeparator1);

        btnPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnPaciente.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/caucasian_head_man_person_people_avatar_2859.png"))); // NOI18N
        btnPaciente.setText("Pacientes");
        btnPaciente.setToolTipText("Cadastro do Paciente");
        btnPaciente.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPaciente.setBorderPainted(false);
        btnPaciente.setFocusable(false);
        btnPaciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPaciente.setMaximumSize(new java.awt.Dimension(100, 180));
        btnPaciente.setMinimumSize(new java.awt.Dimension(100, 180));
        btnPaciente.setPreferredSize(new java.awt.Dimension(100, 180));
        btnPaciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPaciente);
        jToolBar2.add(jSeparator2);

        btnMedico.setBackground(new java.awt.Color(255, 255, 255));
        btnMedico.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/head_medical_man_avatar_person_2837 (1).png"))); // NOI18N
        btnMedico.setText("Médicos");
        btnMedico.setToolTipText("Cadastro do Médico");
        btnMedico.setFocusable(false);
        btnMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedico.setMaximumSize(new java.awt.Dimension(100, 105));
        btnMedico.setMinimumSize(new java.awt.Dimension(90, 40));
        btnMedico.setPreferredSize(new java.awt.Dimension(100, 105));
        btnMedico.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnMedico);
        jToolBar2.add(jSeparator4);

        btnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        btnFuncionario.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/bootloader_users_person_people_6080 (1).png"))); // NOI18N
        btnFuncionario.setText("Funcionários");
        btnFuncionario.setToolTipText("Cadastro do Funcionário");
        btnFuncionario.setFocusable(false);
        btnFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFuncionario.setMaximumSize(new java.awt.Dimension(100, 105));
        btnFuncionario.setMinimumSize(new java.awt.Dimension(90, 40));
        btnFuncionario.setPreferredSize(new java.awt.Dimension(100, 105));
        btnFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });
        jToolBar2.add(btnFuncionario);
        jToolBar2.add(jSeparator3);

        btnAgendamento.setBackground(new java.awt.Color(255, 255, 255));
        btnAgendamento.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnAgendamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/Calendario_icon.png"))); // NOI18N
        btnAgendamento.setText("Agendamento");
        btnAgendamento.setToolTipText("Realizar Agendamento");
        btnAgendamento.setFocusable(false);
        btnAgendamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgendamento.setMaximumSize(new java.awt.Dimension(100, 105));
        btnAgendamento.setMinimumSize(new java.awt.Dimension(90, 40));
        btnAgendamento.setPreferredSize(new java.awt.Dimension(100, 105));
        btnAgendamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnAgendamento);
        jToolBar2.add(jSeparator6);

        btnPagamento.setBackground(new java.awt.Color(255, 255, 255));
        btnPagamento.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/Pagamento.png"))); // NOI18N
        btnPagamento.setText("Pagamento");
        btnPagamento.setToolTipText("Realizar Pagamento");
        btnPagamento.setFocusable(false);
        btnPagamento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagamento.setMaximumSize(new java.awt.Dimension(100, 105));
        btnPagamento.setPreferredSize(new java.awt.Dimension(100, 105));
        btnPagamento.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagamentoActionPerformed(evt);
            }
        });
        jToolBar2.add(btnPagamento);
        jToolBar2.add(jSeparator10);

        btnConsulta.setBackground(new java.awt.Color(255, 255, 255));
        btnConsulta.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/ferramenta-medicoo.png"))); // NOI18N
        btnConsulta.setText("Consultas");
        btnConsulta.setToolTipText("Realizar Consultas");
        btnConsulta.setFocusable(false);
        btnConsulta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsulta.setMaximumSize(new java.awt.Dimension(100, 105));
        btnConsulta.setMinimumSize(new java.awt.Dimension(90, 40));
        btnConsulta.setPreferredSize(new java.awt.Dimension(100, 105));
        btnConsulta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnConsulta);
        jToolBar2.add(jSeparator7);

        btnSuporte.setBackground(new java.awt.Color(255, 255, 255));
        btnSuporte.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnSuporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/icones_suporte.png"))); // NOI18N
        btnSuporte.setText("Suporte Técnico");
        btnSuporte.setToolTipText("Contatar Suporte");
        btnSuporte.setFocusable(false);
        btnSuporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuporte.setMaximumSize(new java.awt.Dimension(110, 105));
        btnSuporte.setMinimumSize(new java.awt.Dimension(110, 100));
        btnSuporte.setPreferredSize(new java.awt.Dimension(110, 105));
        btnSuporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuporteActionPerformed(evt);
            }
        });
        jToolBar2.add(btnSuporte);
        jToolBar2.add(jSeparator8);

        btnDeslogar.setBackground(new java.awt.Color(255, 255, 255));
        btnDeslogar.setFont(new java.awt.Font("Trebuchet MS", 1, 13)); // NOI18N
        btnDeslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/clinica/imagens/log_logout_door_15633.png"))); // NOI18N
        btnDeslogar.setText("Deslogar");
        btnDeslogar.setToolTipText("Sair do sistema");
        btnDeslogar.setFocusable(false);
        btnDeslogar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDeslogar.setMaximumSize(new java.awt.Dimension(100, 105));
        btnDeslogar.setPreferredSize(new java.awt.Dimension(100, 105));
        btnDeslogar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });
        jToolBar2.add(btnDeslogar);
        jToolBar2.add(jSeparator9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 927, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed

        this.controller.btnPaciente();


    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
        // TODO add your handling code here:
        this.controller.btnMedico();

    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        this.controller.btnFuncionario();
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        this.controller.btnConsulta();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        // TODO add your handling code here:
        this.controller.btnDeslogar();
    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void btnSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuporteActionPerformed
        // TODO add your handling code here
        this.controller.btnEmail();
    }//GEN-LAST:event_btnSuporteActionPerformed

    private void btnAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentoActionPerformed
        // TODO add your handling code here:
        this.controller.btnAgendamento();
    }//GEN-LAST:event_btnAgendamentoActionPerformed

    private void btnPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagamentoActionPerformed
        // TODO add your handling code here:
        this.controller.btnPagamento();
    }//GEN-LAST:event_btnPagamentoActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendamento;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDeslogar;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnMedico;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPagamento;
    private javax.swing.JButton btnSuporte;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar2;
    public javax.swing.JLabel labelNome;
    public javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnAgendamento() {
        return btnAgendamento;
    }

    public void setBtnAgendamento(JButton btnAgendamento) {
        this.btnAgendamento = btnAgendamento;
    }

    public JButton getBtnConsulta() {
        return btnConsulta;
    }

    public void setBtnConsulta(JButton btnConsulta) {
        this.btnConsulta = btnConsulta;
    }

    public JButton getBtnDeslogar() {
        return btnDeslogar;
    }

    public void setBtnDeslogar(JButton btnDeslogar) {
        this.btnDeslogar = btnDeslogar;
    }

    public JButton getBtnFuncionario() {
        return btnFuncionario;
    }

    public void setBtnFuncionario(JButton btnFuncionario) {
        this.btnFuncionario = btnFuncionario;
    }

    public JButton getBtnMedico() {
        return btnMedico;
    }

    public void setBtnMedico(JButton btnMedico) {
        this.btnMedico = btnMedico;
    }

    public JButton getBtnPaciente() {
        return btnPaciente;
    }

    public void setBtnPaciente(JButton btnPaciente) {
        this.btnPaciente = btnPaciente;
    }

    public JButton getBtnPagamento() {
        return btnPagamento;
    }

    public void setBtnPagamento(JButton btnPagamento) {
        this.btnPagamento = btnPagamento;
    }

    public JButton getBtnSuporte() {
        return btnSuporte;
    }

    public void setBtnSuporte(JButton btnSuporte) {
        this.btnSuporte = btnSuporte;
    }

    public JLabel getLabelNome() {
        return labelNome;
    }

    public void setLabelNome(JLabel labelNome) {
        this.labelNome = labelNome;
    }

    public JDesktopPane getjDesktopPane1() {
        return jDesktopPane1;
    }

    public void setjDesktopPane1(JDesktopPane jDesktopPane1) {
        this.jDesktopPane1 = jDesktopPane1;
    }

    public JLabel getLabelUsuario() {
        return labelUsuario;
    }

    public void setLabelUsuario(JLabel labelUsuario) {
        this.labelUsuario = labelUsuario;
    }
    
    

}