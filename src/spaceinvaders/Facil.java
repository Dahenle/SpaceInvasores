
package spaceinvaders;

import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;


public class Facil extends javax.swing.JFrame {

    String navecita1,nombre, colorlaser;
    int punt=0,velocidad;
    String punto;
    Timer timer;
    JLabel marciano[] = new JLabel[19];
    String nivel;
    JLabel fondo;
    
    

    public Facil(String navecita1,String nombre, int velocidad, String nivel) {
        initComponents();
        this.navecita1=navecita1;
        this.nombre=nombre;
        this.velocidad =velocidad;
        System.out.println(velocidad);
        this.nivel=nivel;
        
        fondo = new JLabel();
        fondo.setBounds(0,0,720,520);
        if (nivel=="uno"){
           fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/facil1.gif")));
        }else{
           fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/sun.gif")));
           fondo.setBounds(0,0,720,520);
        }
        jPanel1.add(fondo);
        
        

        switch (navecita1){
            case "roja":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_red.png")));
                colorlaser = "/lasers/laserRed01.png";
            break;
            
            case "azul":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_blue.png")));
                colorlaser = "/lasers/laserBlue16.png";
                break;
     
            case "verde":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_green.png")));
                colorlaser = "/lasers/laserGreen11.png";
                break;
            case "naranja":
                navecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/naves/playerShip2_orange.png")));
                colorlaser = "/lasers/fire06.png";
                break;       
        }

        int y = 0, l = 0;
        for (int i = 1; i <= 2; i++) {
            int x = 0; 
            for (int j = 1; j <= 9; j++) {
                l = l+1;
                marciano[l] = new JLabel();
                marciano[l].setSize(120, 130);
                if (l>=1 && l<=9){
                   marciano[l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/alien1.png"))); 
                }else{
                   marciano[l].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/alien1.png"))); 
                }
                
                marciano[l].setLocation(x, y);
                jPanel1.add(marciano[l], 1);
                jPanel1.validate();
                x = x+50;  
            }
            y = y+40;
        }
        Timer movimiento = new Timer();
        TimerTask mov = new TimerTask(){
            JLabel marcianos;
            int y_marciano;
            int x_marciano;
            int tod;
            int j=1;
            @Override
            public void run(){
                for (int i = 1; i <= 18; i++){
                    marcianos = marciano[i];
                    x_marciano = marcianos.getX();
                    y_marciano = marcianos.getY();
                    if (x_marciano == 0){
                        tod = 1;
                    }
                    if (x_marciano == 650){
                        tod = 0;
                    }
                    
                }
                if (tod == 0){
                    for (int i = 1; i <= 18; i++){
                        marcianos = marciano[i];
                        if (j==0){
                            x_marciano = marcianos.getX();
                            y_marciano = marcianos.getY();
                            x_marciano -=50;
                            marcianos.setLocation(x_marciano, y_marciano);
                        }else{
                            x_marciano = marcianos.getX();
                            y_marciano = marcianos.getY();
                            y_marciano +=30;
                            marcianos.setLocation(x_marciano, y_marciano);
                            marciano[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/alien2.png")));
                        }
                        if (i==18){
                            j=0;
                        }
                        
                    }

                }

                if (tod == 1){
                    for (int i = 1; i <= 18; i++){
                        JLabel marcianos = marciano[i];
                        if ((j>0)&&(j<6)){
                           x_marciano = marcianos.getX();
                           y_marciano = marcianos.getY();
                           x_marciano +=50;
                           marcianos.setLocation(x_marciano, y_marciano);
                           if (i==18){
                               System.out.println(x_marciano);
                               j=j+1;
                           }
                        }else{
                            x_marciano = marcianos.getX();
                            y_marciano = marcianos.getY();
                            y_marciano +=30;
                            marcianos.setLocation(x_marciano, y_marciano);
                            marciano[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/alien1.png")));
                            if (i==18){
                               j=1;
                            }
                        }
                        
                    } 
                }
            }
        };
        movimiento.schedule(mov, velocidad, velocidad);                      
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
        puntos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(710, 500));
        jPanel1.setLayout(null);
        jPanel1.add(navecita);
        navecita.setBounds(300, 380, 120, 130);

        puntos.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        puntos.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(puntos);
        puntos.setBounds(640, 10, 60, 30);

        jLabel2.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        jLabel2.setText("Puntos: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 10, 110, 30);

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        jLabel1.setText("Vidas:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 60, 80, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(530, 0, 190, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 920, 520);

        setSize(new java.awt.Dimension(720, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int x_nav = navecita.getX();
        int y_nav = navecita.getY();
        
        
        if (evt.getKeyChar() == 'a' || evt.getKeyChar() == 'A' || evt.getExtendedKeyCode() == KeyEvent.VK_LEFT){
            if(x_nav>0){
                x_nav -= 50;
                navecita.setLocation(x_nav, y_nav);  
            }
        }
        
        if (evt.getKeyChar() == 'd' || evt.getKeyChar() == 'D' || evt.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
            if(x_nav<600){
                x_nav += 50;
                navecita.setLocation(x_nav, y_nav);
            }
        }
        
        if(evt.getKeyChar() == 'w' || evt.getKeyChar() == 'W' || evt.getExtendedKeyCode() == KeyEvent.VK_UP){

            JLabel laserxd = new JLabel();
            laserxd.setLocation(navecita.getX()+50, navecita.getY()+40);
            laserxd.setIcon(new javax.swing.ImageIcon(getClass().getResource(colorlaser)));
            laserxd.setSize(20, 60);
            jPanel1.add(laserxd, 1);
            jPanel1.validate();
            Timer time = new Timer();
            TimerTask task = new TimerTask(){
                int y_laser = laserxd.getY();
                int x_laser = laserxd.getX();
                @Override
                public void run(){
                    if (y_laser > -60){
                        y_laser = y_laser - 10;
                        laserxd.setLocation(x_laser, y_laser);
                    }else{
                        jPanel1.remove(laserxd);
                        time.cancel();

                    }
                           
                }
            };
            
            time.schedule(task, 0, 40);
            Timer posicion = new Timer();
            TimerTask verificacion = new TimerTask(){
                JLabel marcianos;
                JLabel laser;
                int invi[]=null;
                int x_laser;
                int y_laser;
                int x_marciano;
                int y_marciano;
                boolean aliens[];
                
                
               

                @Override
                public void run(){
                    
                    
                    for (int i = 1; i <= 18; i++) {
                        marcianos = marciano[i];
                        laser = laserxd;
                        x_laser = laser.getX();
                        y_laser = laser.getY();
                        x_marciano = marcianos.getX();
                        y_marciano = marcianos.getY();
                        

                        if(x_marciano == x_laser && y_marciano == y_laser && marcianos.isVisible()==true){
                                marciano[i].setIcon(null);
                                jPanel1.remove(laser);
                                jPanel1.remove(marcianos);
                                punt=punt+10;
                                punto = String.valueOf(punt);
                                puntos.setText(punto);
                                marcianos.setVisible(false);
     
                        }
                    }
                }
            };
            
            posicion.schedule(verificacion, 0, 40);
        }    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel navecita;
    private javax.swing.JLabel puntos;
    // End of variables declaration//GEN-END:variables

}
