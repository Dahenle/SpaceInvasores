
package spaceinvaders;

import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



public class Facil extends javax.swing.JFrame {

    String navecita1,nombre, colorlaser;
    String [] aliencolor1 = {"Verde","Rojo","Morado","Rosado","Naranja","Azul"};
    String aliencolor;
    Random color = new Random();
    int select;
    int punt,velocidad;
    String punto;
    Timer timer;
    JLabel marciano[] = new JLabel[40];
    String nivel;
    JLabel fondo;
    int filas;
    int can_marcianos = 0;
    int mar_restantes = 100;
    int vida;
    int puntajefinal1,puntajefinal2,puntajefinal3;
    int ronda;
    

    public Facil(String navecita1, String nombre, int velocidad, String nivel, int punt, int filas, int vida,int puntajefinal1,int puntajefinal2,int puntajefinal3, int ronda) {
        initComponents();
        this.navecita1=navecita1;
        this.nombre=nombre;
        this.velocidad =velocidad;
        this.nivel=nivel;
        this.filas = filas;
        this.punt = punt;
        this.vida=vida;
        this.puntajefinal1=puntajefinal1;
        this.puntajefinal2=puntajefinal2;
        this.puntajefinal3=puntajefinal3;
        this.ronda = ronda;
        contador.setText(String.valueOf(ronda));
        System.out.println(nivel);
        switch (vida){
            case 1:
               vidas.setText("♥");
               break;
            case 2:
                vidas.setText("♥♥");
                break;
            case 3:
                vidas.setText("♥♥♥");
                break;
                            
        }
        
        puntos.setText(String.valueOf(punt));
        fondo = new JLabel();
        fondo.setBounds(0,0,720,520);
        
        if (nivel=="uno"){
           fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/facil1.gif")));
           fondo.setBounds(0,0,720,520);
        }
        if (nivel=="dos"){
           fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondos/fondo11.gif")));
           fondo.setBounds(0,0,720,520);
        }
        if (nivel=="tres"){
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
    
          
        int y = 0;
        for (int i = 1; i <= filas; i++) {
            select=color.nextInt(aliencolor1.length);
            int x = 0; 
            for (int j = 1; j <= 9; j++) {
                can_marcianos += 1;
                marciano[can_marcianos] = new JLabel();
                marciano[can_marcianos].setSize(120, 130);
                if (i % 2 == 0){
                   marciano[can_marcianos].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/"+aliencolor1[select]+".png"))); 
                }else{
                   marciano[can_marcianos].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/"+aliencolor1[select]+".png")));
                } 
                marciano[can_marcianos].setLocation(x, y);
                jPanel1.add(marciano[can_marcianos], 1);
                jPanel1.validate();
                x = x+50;  
            }
            y = y+40;
        }
            mar_restantes = can_marcianos;
            System.out.println(mar_restantes);
            Timer movimiento = new Timer();
            TimerTask mov = new TimerTask(){
            JLabel marcianos;
            int y_marciano;
            int x_marciano;
            int tod;
            int j=1;
            int vida = vidas.getText().length();
            int contador1=Integer.parseInt(contador.getText());
            

            @Override
            public void run(){
                
                for (int i = 1; i <= can_marcianos; i++){
                    marcianos = marciano[i];
                    x_marciano = marcianos.getX();
                    y_marciano = marcianos.getY();
                    if (x_marciano == 0 && marcianos.isVisible()==true){
                        tod = 1;
                    }
                    if (x_marciano == 650 && marcianos.isVisible()==true){
                        tod = 0;
                    }
                    
                }
                
                if (tod == 0){
                    for (int i = 1; i <= can_marcianos; i++){
                        if (i % 9 - 1 == 0){
                           select=color.nextInt(aliencolor1.length);
                        }
                        marcianos = marciano[i];
                        if (j==0){
                            x_marciano = marcianos.getX();
                            y_marciano = marcianos.getY();
                            x_marciano -=50;
                            marcianos.setLocation(x_marciano, y_marciano);
                        }else{
                            x_marciano = marcianos.getX();
                            y_marciano = marcianos.getY();
                            y_marciano +=40;
                            marcianos.setLocation(x_marciano, y_marciano);
                            marciano[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/"+aliencolor1[select]+".png")));
                        }
                        if (i==can_marcianos){
                            j=0;
                        }
                        
                    }
                }
                

                if (tod == 1){
                    for (int i = 1; i <= can_marcianos; i++){
                        marcianos = marciano[i];
                        if (i % 9 - 1 == 0){
                               select=color.nextInt(aliencolor1.length);
                        }
                        if (j>0){
                           x_marciano = marcianos.getX();
                           y_marciano = marcianos.getY();
                           x_marciano +=50;
                           marcianos.setLocation(x_marciano, y_marciano);
                           if (i==can_marcianos){
                               j=j+1;
                           }
                        }else{
                            x_marciano = marcianos.getX();
                            y_marciano = marcianos.getY();
                            y_marciano +=40;
                            marcianos.setLocation(x_marciano, y_marciano);
                            marciano[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/alien/"+aliencolor1[select]+".png")));
                            if (i==can_marcianos){
                               j=1;
                            }
                        }
                        
                    } 
                }
                for (int i = 1; i <= can_marcianos; i++) {
                    marcianos = marciano[i];
                    y_marciano = marcianos.getY();
                    x_marciano = marcianos.getX();
                    if (y_marciano == 360 && marcianos.isVisible()==true){
                        vida = vida-1;
                        System.out.println(vida);
                        switch (vida){
                            case 0:
                                vidas.setText("");
                                mensaje.setText("Perdiste, pulsa cualquier tecla para regresar al inicio");
                                movimiento.cancel();
                                break;
                            case 1:
                                vidas.setText("♥");
                                break;
                            case 2:
                                vidas.setText("♥♥");
                                break;
                            case 3:
                                vidas.setText("♥♥♥");
                                break;
                            
                        }
                        mar_restantes -= 1;
                        
                        if (mar_restantes == 0 && vida>0){
                            mensaje.setText("Toque cualquier tecla para continuar");
                            movimiento.cancel();
                        }
                        marcianos.setIcon(null);
                        jPanel1.remove(marcianos);
                        marcianos.setVisible(false);
                        
                        
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
        vidas = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        contador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        puntos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(puntos);
        puntos.setBounds(640, 10, 60, 30);

        jLabel2.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        jLabel2.setText("Puntos: ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(540, 10, 110, 30);

        jPanel3.setBackground(new java.awt.Color(153, 0, 153));
        jPanel3.setLayout(null);

        vidas.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        vidas.setForeground(new java.awt.Color(255, 0, 0));
        vidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(vidas);
        vidas.setBounds(90, 60, 80, 30);

        jLabel5.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        jLabel5.setText("Vidas:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(10, 60, 80, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(530, 0, 190, 110);

        mensaje.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        mensaje.setForeground(new java.awt.Color(255, 255, 255));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mensaje);
        mensaje.setBounds(0, 210, 720, 80);

        contador.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Copperplate", 1, 24)); // NOI18N
        jLabel3.setText("Ronda");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contador, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(contador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 520);

        setSize(new java.awt.Dimension(720, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int x_nav = navecita.getX();
        int y_nav = navecita.getY();
        vida=vidas.getText().length();
        if (mar_restantes <= 0 && vida > 0) {
           this.dispose();
            if (ronda<3){
               velocidad-=100;
               Facil facil = new Facil(navecita1,nombre,velocidad,nivel, punt, filas,vida,puntajefinal1,puntajefinal2,puntajefinal3, ronda+1);
               facil.setResizable(false);
               facil.setSize(715,520);
               facil.setVisible(true);
               contador.setText(String.valueOf(ronda)); 
            }
            if (ronda == 3) {
                JOptionPane.showMessageDialog(null,"Has pasado el nivel, felicitaciones!");
                this.dispose();
                Test test = new Test(nombre, navecita1,puntajefinal1,puntajefinal2,puntajefinal3);
                test.setVisible(true);
                test.setResizable(false);
                test.setSize(590,400);
            }
        }
        
        
        
        if (vidas.getText()==""){
            if (nivel.equals("uno")==true){
                JOptionPane.showMessageDialog(null, nombre+" tu record en este nivel es: "+puntajefinal1);
            }
            if (nivel.equals("dos")==true){
                JOptionPane.showMessageDialog(null, nombre+" tu record en este nivel es: "+puntajefinal2); 
            }
            if (nivel.equals("tres")==true){
                JOptionPane.showMessageDialog(null, nombre+" tu record en este nivel es: "+puntajefinal3); 
            }
            this.dispose();
            Test test = new Test(nombre, navecita1,puntajefinal1,puntajefinal2,puntajefinal3);
            test.setVisible(true);
            test.setResizable(false);
            test.setSize(590,400);
        }
        
        
        
        
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
                JLabel marcianos;
                int y_laser = laserxd.getY();
                int x_laser = laserxd.getX();
                int x_marciano;
                int y_marciano;
                int can_marciano;
                @Override
                public void run(){
                    
                    if (y_laser > -60){
                        y_laser = y_laser - 10;
                        laserxd.setLocation(x_laser, y_laser);
                    }else{
                        jPanel1.remove(laserxd);
                        time.cancel();
                    }
                    for (int i = 1; i <= can_marcianos; i++) {
                        marcianos = marciano[i];
                        x_laser = laserxd.getX();
                        y_laser = laserxd.getY();
                        x_marciano = marcianos.getX();
                        y_marciano = marcianos.getY();
                        
                        if(x_marciano == x_laser && y_marciano == y_laser && marcianos.isVisible()==true){
                                mar_restantes -= 1;
                                marcianos.setIcon(null);
                                jPanel1.remove(laserxd);
                                jPanel1.remove(marcianos);
                                punt=punt+10;
                                if (nivel=="uno"&&puntajefinal1<punt){
                                    puntajefinal1=punt;
                                }
                                if (nivel=="dos"&&puntajefinal2<punt){
                                    puntajefinal2=punt;
                                }
                                if (nivel=="tres"&&puntajefinal2<punt){
                                    puntajefinal3=punt;
                                }
                                punto = String.valueOf(punt);
                                puntos.setText(punto);
                                marcianos.setVisible(false);
                                time.cancel();
                        }
                        if (mar_restantes == 0) {
                            mensaje.setText("Toque cualquier tecla para continuar");
                            time.cancel();  
                        }
                        if (vidas.getText()==""){
                            time.cancel();
                        }

                    }
                     
                    
                                
                }
            };
            
            time.schedule(task, 0, 40);

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
    private javax.swing.JLabel contador;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel navecita;
    private javax.swing.JLabel puntos;
    private javax.swing.JLabel vidas;
    // End of variables declaration//GEN-END:variables

}
