package spaceinvaders;

public class Test extends javax.swing.JFrame {

    String nombre,nave,navecita1;
    int puntaf,puntad;
    public Test(String nombre, String nave,int puntaf,int puntad) {
        initComponents();
        this.setVisible(true);
        this.setResizable(false);
        this.setSize(590,400);
        this.nombre = nombre;
        this.nave = nave;
        this.Nombre.setText(nombre);
        this.puntaf=puntaf;
        this.puntad=puntad;

        
        //condicional nave
        if (nave.matches("roja")==true){
            Nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_red.png")));
            this.navecita1="roja";
        }else{
            if (nave.matches("azul")==true){
               Nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_blue.png")));
               this.navecita1="azul";
            }else{
                if (nave.matches("verde")==true){
                    Nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_green.png")));
                    this.navecita1="verde";
                }else{
                    Nave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_orange.png")));
                    this.navecita1="naranja";
                }
            }  
        }
        
            
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
        Nave = new javax.swing.JLabel();
        Title1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);
        jPanel1.add(Nave);
        Nave.setBounds(90, 110, 120, 180);

        Title1.setFont(new java.awt.Font("Copperplate", 3, 50)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setText("Escoge el nivel");
        jPanel1.add(Title1);
        Title1.setBounds(90, 10, 420, 80);

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Copperplate", 3, 18)); // NOI18N
        jButton1.setText("Facil");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 110, 250, 60);

        jButton2.setFont(new java.awt.Font("Copperplate", 3, 18)); // NOI18N
        jButton2.setText("Dificil");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(310, 270, 250, 60);

        jButton3.setFont(new java.awt.Font("Copperplate", 3, 18)); // NOI18N
        jButton3.setText("Medio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(310, 190, 250, 60);

        Nombre.setFont(new java.awt.Font("Copperplate", 2, 48)); // NOI18N
        Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Nombre);
        Nombre.setBounds(10, 320, 250, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/nivel.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 50, 510, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 380);

        setSize(new java.awt.Dimension(604, 429));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Facil facil = new Facil(navecita1,nombre,1000,"uno", 0, 2, 3,puntaf,puntad, 1);
        facil.setResizable(false);
        facil.setSize(715,520);
        facil.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        Facil facil = new Facil(navecita1,nombre, 600,"dos", 0, 3, 2,puntaf,puntad, 1);
        facil.setResizable(false);
        facil.setSize(715,520);
        facil.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        Facil facil = new Facil(navecita1,nombre, 600,"tres", 0, 4, 1,puntaf,puntad, 1);
        facil.setResizable(false);
        facil.setSize(715,520);
        facil.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nave;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Title1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
