package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;

public class Info5 extends javax.swing.JDialog {
    
    public Info5(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        btnProxima = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setFont(new java.awt.Font("Nasalization Rg", 0, 30)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 119, 0));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt1.setText("RESPOSTA");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 330, -1));

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("<html>\n<div style= 'text-align: center'>\n<p>Em que ano o rover Curiosity<br/>\n<p style='margin-top: 10'>aterrissou em marte?\n");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, -1));

        txt4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(239, 236, 236));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt4.setText("<html>\n<div style= 'text-align: center'>\n<p>O Curiosity era o maior e mais robusto rover já enviado a Marte em sua\n<p style='margin-top: 10'>época, perdendo apenas para o novo rover Perseverance.\n<p style='margin-top: 10'>Foi lançado em novembro de 2011 e <b>aterrissou</b>\n<p style='margin-top: 10'><b>em Marte em 5 de agosto de 2012,</b> na região da cratera Gale.\n<p style='margin-top: 10'>Foi o primeiro pouso realizado em Marte com a ajuda de um paraquedas\n<p style='margin-top: 10'>e momentos antes do contato com o solo,\n<p style='margin-top: 10'>disparou foguetes para diminuir a velocidade de descida.");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 800, -1));

        btnProxima.setBackground(new java.awt.Color(224, 77, 1));
        btnProxima.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/direita.png"))); // NOI18N
        btnProxima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnProxima.setBorderPainted(false);
        btnProxima.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProxima.setFocusPainted(false);
        btnProxima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProximaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProximaMouseExited(evt);
            }
        });
        btnProxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximaActionPerformed(evt);
            }
        });
        getContentPane().add(btnProxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 160, 80));

        background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximaMouseEntered
        btnProxima.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnProximaMouseEntered

    private void btnProximaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProximaMouseExited
        btnProxima.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnProximaMouseExited

    private void btnProximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximaActionPerformed
        new Feedback(null, true).setVisible(true); // Chama o próximo JDialog
        this.dispose();
    }//GEN-LAST:event_btnProximaActionPerformed
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup();

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Info5 dialog = new Info5(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnProxima;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    // End of variables declaration//GEN-END:variables
}
