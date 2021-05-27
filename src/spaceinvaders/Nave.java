package spaceinvaders;

public class Nave extends javax.swing.JFrame {

    String nombre;
    int puntajefinal1,puntajefinal2,puntajefinal3;
    public Nave(String nombre) {
       initComponents();
       this.nombre = nombre;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        select = new javax.swing.JPanel();
        Title1 = new javax.swing.JLabel();
        naveNaranje = new javax.swing.JButton();
        naveVerde = new javax.swing.JButton();
        naveAzul = new javax.swing.JButton();
        naveRoja = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        select.setBackground(new java.awt.Color(255, 255, 255));
        select.setLayout(null);

        Title1.setFont(new java.awt.Font("Copperplate", 3, 50)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Escoge una nave");
        select.add(Title1);
        Title1.setBounds(70, 10, 440, 80);

        naveNaranje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_orange.png"))); // NOI18N
        naveNaranje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naveNaranjeActionPerformed(evt);
            }
        });
        select.add(naveNaranje);
        naveNaranje.setBounds(450, 110, 130, 220);

        naveVerde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_green.png"))); // NOI18N
        naveVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naveVerdeActionPerformed(evt);
            }
        });
        select.add(naveVerde);
        naveVerde.setBounds(300, 110, 130, 220);

        naveAzul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_blue.png"))); // NOI18N
        naveAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naveAzulActionPerformed(evt);
            }
        });
        select.add(naveAzul);
        naveAzul.setBounds(160, 110, 130, 220);

        naveRoja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_red.png"))); // NOI18N
        naveRoja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naveRojaActionPerformed(evt);
            }
        });
        select.add(naveRoja);
        naveRoja.setBounds(10, 110, 130, 220);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/fondo.gif"))); // NOI18N
        jLabel2.setText("jLabel1");
        select.add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 380);

        getContentPane().add(select);
        select.setBounds(0, 0, 600, 380);

        setSize(new java.awt.Dimension(614, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void naveRojaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naveRojaActionPerformed
        Test test = new Test(nombre, "roja",puntajefinal1,puntajefinal2,puntajefinal3);
        this.dispose();
    }//GEN-LAST:event_naveRojaActionPerformed

    private void naveAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naveAzulActionPerformed
        Test test = new Test(nombre, "azul",puntajefinal1,puntajefinal2,puntajefinal3);
        this.dispose();
    }//GEN-LAST:event_naveAzulActionPerformed

    private void naveVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naveVerdeActionPerformed
        Test test = new Test(nombre, "verde",puntajefinal1,puntajefinal2,puntajefinal3);
        this.dispose();
    }//GEN-LAST:event_naveVerdeActionPerformed

    private void naveNaranjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naveNaranjeActionPerformed
        Test test = new Test(nombre, "naranja",puntajefinal1,puntajefinal2,puntajefinal3); 
        this.dispose();
    }//GEN-LAST:event_naveNaranjeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton naveAzul;
    private javax.swing.JButton naveNaranje;
    private javax.swing.JButton naveRoja;
    private javax.swing.JButton naveVerde;
    private javax.swing.JPanel select;
    // End of variables declaration//GEN-END:variables

    void dispuse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
