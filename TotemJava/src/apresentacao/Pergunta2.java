package apresentacao;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.awt.*;
import propriedades.*;

public class Pergunta2 extends javax.swing.JDialog {
    
    private TecladoVirtual tecladoVirtual; // Define o objeto teclado virtual
    
    public Pergunta2(java.awt.Frame parent, boolean modal) {
        super(parent, false);
        initComponents();
        tecladoVirtual = new TecladoVirtual(); // Chama a classe construtora do teclado virtual
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt1 = new javax.swing.JLabel();
        txt3 = new javax.swing.JLabel();
        txt4 = new javax.swing.JLabel();
        txt5 = new javax.swing.JLabel();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        txfResposta = new javax.swing.JTextField();
        btnEnviar = new javax.swing.JButton();
        btnTeclado = new javax.swing.JButton();
        marte = new javax.swing.JLabel();
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
        txt1.setText("SEGUNDA PERGUNTA");
        getContentPane().add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 370, -1));

        txt3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt3.setForeground(new java.awt.Color(239, 236, 236));
        txt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt3.setText("<html>\n<div style= 'text-align: center'>\n<p>Qual foi a missão inicial da nave espacial<br/>\n<p style='margin-top: 10'>Odissey, que orbita Marte até hoje?");
        getContentPane().add(txt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 800, -1));

        txt4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt4.setForeground(new java.awt.Color(239, 236, 236));
        txt4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt4.setText("<html>\n<b>1)</b> Procurar sinais de vida passada");
        getContentPane().add(txt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 280, -1));

        txt5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt5.setForeground(new java.awt.Color(239, 236, 236));
        txt5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt5.setText("<html>\n<b>2)</b> Analisar a composição atmosférica");
        getContentPane().add(txt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 310, -1));

        txt6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt6.setForeground(new java.awt.Color(239, 236, 236));
        txt6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt6.setText("<html>\n<b>3)</b> Estudar a geologia do planeta");
        getContentPane().add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 270, -1));

        txt7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt7.setForeground(new java.awt.Color(239, 236, 236));
        txt7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt7.setText("<html>\n<b>4)</b> Investigar possibilidade de colonização humana");
        getContentPane().add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 410, -1));

        txfResposta.setBackground(new java.awt.Color(37, 29, 58));
        txfResposta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txfResposta.setForeground(new java.awt.Color(140, 140, 140));
        txfResposta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
        txfResposta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(224, 77, 1)));
        txfResposta.setFocusable(false);
        getContentPane().add(txfResposta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 600, 40));

        btnEnviar.setBackground(new java.awt.Color(224, 77, 1));
        btnEnviar.setFont(new java.awt.Font("Nasalization Rg", 0, 24)); // NOI18N
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
        getContentPane().add(btnEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, 100, 40));

        btnTeclado.setBackground(new java.awt.Color(224, 77, 1));
        btnTeclado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/teclado.png"))); // NOI18N
        btnTeclado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnTeclado.setBorderPainted(false);
        btnTeclado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTeclado.setFocusPainted(false);
        btnTeclado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTecladoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTecladoMouseExited(evt);
            }
        });
        btnTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTecladoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTeclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 100, 50));

        marte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/terra.png"))); // NOI18N
        getContentPane().add(marte, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, -1, -1));

        background.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.jpg"))); // NOI18N
        background.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        background.setMaximumSize(new java.awt.Dimension(800, 600));
        background.setMinimumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed

        tecladoVirtual.fechar();

        if (txfResposta.getText().trim().equals("estudar a geologia do planeta")){
            
            Estaticos.resCorretas ++; // Adiciona um ponto ao contador caso a resposta tenho sido correta
            new Info2(null, true).setVisible(true); // Chama o próximo JDialog
            this.dispose();
        }
        else if (txfResposta.getText().trim().equals("procurar sinais de vida passada") ||
                 txfResposta.getText().trim().equals("analisar a composiçao atmosferica") ||
                 txfResposta.getText().trim().equals("investigar possibilidade de colonizaçao humana")){

            new Info2(null, true).setVisible(true); // Chama o próximo JDialog
            this.dispose();
        }
        else {
            new Erro(null, true).setVisible(true); // Chama a mensagem de erro
            txfResposta.setFocusable(false);
            txfResposta.setText("Clique no botão de teclado para digitar sua resposta");
            txfResposta.setForeground(new Color(140,140,140));
            txfResposta.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnEnviarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseExited
        btnEnviar.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnEnviarMouseExited

    private void btnEnviarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarMouseEntered
        btnEnviar.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnEnviarMouseEntered

    private void btnTecladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTecladoActionPerformed

        txfResposta.setFocusable(true);
        txfResposta.setText("");
        txfResposta.setForeground(new Color(239,236,236));
        txfResposta.setFont(new Font("Segoe UI", Font.BOLD, 22));
        tecladoVirtual.setTextFieldAtual(txfResposta); // Define o campo de texto da Pergunta1 como o atual
        tecladoVirtual.mostrar(); // Abre o teclado virtual
    }//GEN-LAST:event_btnTecladoActionPerformed

    private void btnTecladoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTecladoMouseExited
        btnTeclado.setBackground(new Color(224, 77, 1));
    }//GEN-LAST:event_btnTecladoMouseExited

    private void btnTecladoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTecladoMouseEntered
        btnTeclado.setBackground(new Color(255, 119, 0));
    }//GEN-LAST:event_btnTecladoMouseEntered
  
    public static void main(String args[]) {
        
        FlatArcDarkOrangeIJTheme.setup(); // Tema padrão definido para a aplicação

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pergunta2 dialog = new Pergunta2(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnTeclado;
    private javax.swing.JLabel marte;
    private javax.swing.JTextField txfResposta;
    private javax.swing.JLabel txt1;
    private javax.swing.JLabel txt3;
    private javax.swing.JLabel txt4;
    private javax.swing.JLabel txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    // End of variables declaration//GEN-END:variables
}
