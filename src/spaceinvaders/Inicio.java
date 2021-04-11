package spaceinvaders;


public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
       initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        inicio = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        inicio.setBackground(new java.awt.Color(255, 255, 255));
        inicio.setLayout(null);

        Title.setFont(new java.awt.Font("Copperplate", 3, 50)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Space Invaders");
        inicio.add(Title);
        Title.setBounds(100, 80, 410, 110);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Copperplate", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Inicia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        inicio.add(jButton1);
        jButton1.setBounds(180, 230, 250, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/space.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        inicio.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 380);

        getContentPane().add(inicio);
        inicio.setBounds(0, 0, 600, 380);

        setSize(new java.awt.Dimension(614, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Nombre nombre = new Nombre();
        nombre.setResizable(false);
        nombre.setSize(590,400);
        nombre.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

    void dispuse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
