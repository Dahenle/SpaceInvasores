/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.event.KeyEvent;

/**
 *
 * @author nataliamartinezdiaz
 */
public class Facil extends javax.swing.JFrame {

    String navecita1;
    public Facil(String navecita1) {
        initComponents();
        this.navecita1=navecita1;
        switch (navecita1){
            case "roja":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_red.png")));
            break;
            
            case "azul":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_blue.png")));
            
            break;
            case "verde":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_green.png")));
            break;
            case "naranja":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_orange.png")));
            break;    
        }
    }

    private Facil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        navecita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);
        jPanel1.add(navecita);
        navecita.setBounds(230, 270, 110, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/Fondo con gradiente.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int derecha = navecita.getX();
        int izquierda = navecita.getY();
        
        if (evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A'){
            derecha -= 8;
            navecita.setLocation(derecha, izquierda);
           
        }
        
        if (evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D'){
            derecha += 8;
            navecita.setLocation(derecha, izquierda);
           
        }
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_LEFT){
            derecha -= 8;
            navecita.setLocation(derecha, izquierda);
           
        }
        
        if (evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
            derecha += 8;
            navecita.setLocation(derecha, izquierda);
           
        }
        
        

// TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel navecita;
    // End of variables declaration//GEN-END:variables
}
