package spaceinvaders;

import java.applet.AudioClip;

public class Nombre extends javax.swing.JFrame {
    
    AudioClip sound;
    
    public Nombre(){
        initComponents();
        sound = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/song.wav"));
        sound.play();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JPanel();
        error = new javax.swing.JLabel();
        Title2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nombre.setBackground(new java.awt.Color(255, 255, 255));
        nombre.setLayout(null);

        error.setFont(new java.awt.Font("Copperplate", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        nombre.add(error);
        error.setBounds(370, 230, 210, 30);

        Title2.setFont(new java.awt.Font("Copperplate", 3, 50)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("Ingresa tu nombre");
        nombre.add(Title2);
        Title2.setBounds(50, 140, 500, 80);

        jTextField1.setFont(new java.awt.Font("Noteworthy", 1, 22)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        nombre.add(jTextField1);
        jTextField1.setBounds(200, 220, 170, 40);

        jButton1.setFont(new java.awt.Font("Mukta", 1, 13)); // NOI18N
        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        nombre.add(jButton1);
        jButton1.setBounds(240, 280, 100, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/fondo.gif"))); // NOI18N
        jLabel2.setText("jLabel1");
        nombre.add(jLabel2);
        jLabel2.setBounds(0, 0, 590, 380);

        getContentPane().add(nombre);
        nombre.setBounds(0, 0, 600, 380);

        setSize(new java.awt.Dimension(607, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (this.jTextField1.getText().length()<3){
            error.setText("Debe tener min 3 caracteres");
        }else{
            this.dispose();
            Nave select = new Nave(this.jTextField1.getText(), sound);
            select.setResizable(false);
            select.setSize(590, 400);
            select.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel nombre;
    // End of variables declaration//GEN-END:variables

    void dispuse() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
