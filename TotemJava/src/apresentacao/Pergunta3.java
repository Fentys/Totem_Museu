package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import propriedades.*;

public class Pergunta3 extends javax.swing.JDialog {
    
    public Pergunta3(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup3 = new javax.swing.ButtonGroup();
        txt1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        jrBtn1 = new javax.swing.JRadioButton();
        jrBtn2 = new javax.swing.JRadioButton();
        jrBtn3 = new javax.swing.JRadioButton();
        jrBtn4 = new javax.swing.JRadioButton();
        btnEnviar = new javax.swing.JButton();
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
        txt1.setText("TERCEIRA PERGUNTA");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 350, -1));

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("<html>\n<div style= 'text-align: center'>\n<p>Qual desses rovers parou de funcionar em 2010<br/>\n<p style='margin-top: 10'>enquanto estava em marte?\n");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 800, -1));

        btnGroup3.add(jrBtn1);
        jrBtn1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jrBtn1.setForeground(new java.awt.Color(239, 236, 236));
        jrBtn1.setText(" Curiosity");
        getContentPane().add(jrBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 140, -1));

        btnGroup3.add(jrBtn2);
        jrBtn2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jrBtn2.setForeground(new java.awt.Color(239, 236, 236));
        jrBtn2.setText(" Perseverance");
        getContentPane().add(jrBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 180, -1));

        btnGroup3.add(jrBtn3);
        jrBtn3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jrBtn3.setForeground(new java.awt.Color(239, 236, 236));
        jrBtn3.setText(" Opportunity");
        getContentPane().add(jrBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 180, -1));

        btnGroup3.add(jrBtn4);
        jrBtn4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jrBtn4.setForeground(new java.awt.Color(239, 236, 236));
        jrBtn4.setText(" Spirit");
        getContentPane().add(jrBtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 100, -1));

        btnEnviar.setBackground(new java.awt.Color(224, 77, 1));
        btnEnviar.setFont(new java.awt.Font("Nasalization Rg", 0, 30)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(37, 29, 58));
        btnEnviar.setText("Enviar");
        btnEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnEnviar.setBorderPainted(false);
        btnEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setFocusPainted(false);
        btnEnviar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEnviarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEnviarMouseExited(evt);
            }
        });
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, 50));

        background.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        
        if (!jrBtn1.isSelected() && !jrBtn2.isSelected() &&
            !jrBtn3.isSelected() && !jrBtn4.isSelected()) {           
            new Erro(null, true).setVisible(true); // Chama a mensagem de erro
        }
        else if (jrBtn4.isSelected()) {
            Estaticos.resCorretas ++; // Adiciona um ponto ao contador caso a resposta tenho sido correta
            new Info3(null, true).setVisible(true); // Chama o próximo JDialog
            this.dispose();
        }
        else {
            new Info3(null, true).setVisible(true); // Chama o próximo JDialog
            this.dispose();
        }
    }//GEN-LAST:event_btnEnviarActionPerformed
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup(); // Tema padrão definido para a aplicação

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pergunta3 dialog = new Pergunta3(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnEnviar;
    private javax.swing.ButtonGroup btnGroup3;
    private javax.swing.JRadioButton jrBtn1;
    private javax.swing.JRadioButton jrBtn2;
    private javax.swing.JRadioButton jrBtn3;
    private javax.swing.JRadioButton jrBtn4;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
}
