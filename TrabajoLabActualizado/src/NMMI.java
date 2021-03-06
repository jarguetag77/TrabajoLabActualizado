import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class NMMI extends javax.swing.JFrame {

    
     ArrayList<Persona> lista = new ArrayList<Persona>();
    public NMMI() {
        
        initComponents();
        jButton4.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        TFdep = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Jrand = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NOMBRE", "DEPARTAMENTOS", "CODIGO", "SUELDO", "COMISIONES", "BONIFICACIONES", "IGGS", "ISR", "SUELDO LIQUIDO"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 1050, 167));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jButton1.setText("INGRESAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 200, 40));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 185, 36));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 185, 36));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("IGGS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, 36));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SUELDO LIQUIDO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 170, -1, 36));

        jButton2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jButton2.setText("SUELDO LIQUIDO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, 260, 40));

        jButton3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jButton3.setText("CALCULOS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 200, 40));

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, 185, 36));

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ISR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, 36));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PUESTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, 36));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 185, 36));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DEPARTAMENTOS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 36));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 185, 36));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CODIGO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 36));

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SUELDO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 36));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("COMISIONES");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 36));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BONIFICACIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 36));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 185, 36));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 185, 36));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 185, 36));

        jLabel10.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("NOMBRE");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 36));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puesto que si\t", "Puesto que no" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 190, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   1", "   2", "   3", "   4", "   5" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 60, 30));

        TFdep.setText("Q.20,000.°°");
        TFdep.setEnabled(false);
        jPanel1.add(TFdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 110, 30));

        jButton4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jButton4.setText("?");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, 40, 40));

        Jrand.setText("Random");
        Jrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrandMouseClicked(evt);
            }
        });
        jPanel1.add(Jrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
     //Boton para ingresar a la tabla/planilla
     
        jButton4.setVisible(false);
        
        
        if(!(jTextField1.getText().equals("")||jTextField3.equals("")||jTextField4.equals("")||jTextField5.equals("")||jTextField6.equals("")||jTextField7.equals("")||jTextField8.equals("")||jTextField9.equals("")) )
      {
       try{
           
           jLabel8.setForeground(Color.white);
            Persona persona;
            String depa= departamento();
            
                persona = new Persona(jTextField1.getText(),depa, jTextField3.getText(), jTextField4.getText(), jTextField5.getText(), jTextField6.getText(), jTextField7.getText(), jTextField8.getText(), jTextField9.getText() );
            
                
            
                 lista.add(persona);
        mostrar();
        
        jTextField1.setText("");
         jComboBox2.setSelectedIndex(0);
         jComboBox1.setSelectedIndex(0);
          jTextField3.setText("");
           jTextField4.setText("");
            jTextField5.setText("");
             jTextField6.setText("");
              jTextField7.setText("");
               jTextField8.setText("");
                jTextField9.setText("");

               }
        catch(Exception e){
                  JOptionPane.showMessageDialog(rootPane,"Error al ingresos"+e);
               
        }
       
      
        
        
        }else{
               if(!(jTextField1.getText().matches("[A-Z][a-z]*"))){
            JOptionPane.showMessageDialog(null, "Nombre incorrecto");
        }else{
            
        }
       
        if(!(jTextField3.getText().matches("\\d{3}"))){
            JOptionPane.showMessageDialog(null, "Codigo Incorrecto");
        }else{
            
        }
        if(!(jTextField4.getText().matches("\\d{6}"))){
            JOptionPane.showMessageDialog(null, "Comision Incorrecta");
        }else{
            
        }
        if(!(jTextField5.getText().matches("\\d{6}"))){
            JOptionPane.showMessageDialog(null, "Bonificacion Incorrecta");
            
        }else{
            
        }
        if(!(jTextField6.getText().matches("\\d{6}"))){
            JOptionPane.showMessageDialog(null, "Ingreso Clave Incorrecto");
            
        }else{
            
        }
        if(!(jTextField7.getText().matches("\\d*"))){
            JOptionPane.showMessageDialog(null, "Dar al boton 'Calcular'");
            
        }else{
            
        }
        if(!(jTextField8.getText().matches("\\d*"))){
            JOptionPane.showMessageDialog(null, "Dar al boton 'Calcular'");
            
        }else{
            
        }
        if(!(jTextField9.getText().matches("\\d*"))){
            JOptionPane.showMessageDialog(null, "Dar al boton 'Sueldo Liquido'");
            
        }else{
            
        }
    
        
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    public String departamento(){
        
        //funcion para departamento
        
        String res="";
        
        if(jComboBox2.getSelectedIndex()==0)
            res="20000";
        if(jComboBox2.getSelectedIndex()==1)
            res="30000";
        if(jComboBox2.getSelectedIndex()==2)
            res="50000";
        if(jComboBox2.getSelectedIndex()==3)
            res="15000";
        if(jComboBox2.getSelectedIndex()==4)
            res="25000";
        
        return res;
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
        jButton4.setVisible(true);
        sueldol();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
        if(jTextField7.isEnabled()){
            jTextField7.setText("");
            iggs();
        }else{
            jTextField7.setText("0");
        }
        
        isr();
        
     
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        
        if(jComboBox1.getSelectedIndex()==1){
            jLabel8.setForeground(Color.red);
            jTextField7.setEnabled(false);
        }else{
            jLabel8.setForeground(Color.white);
            jTextField7.setEnabled(true);
        }
        
        
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        if(jComboBox2.getSelectedIndex()==0)
            TFdep.setText("Q.20,000.°°");
        if(jComboBox2.getSelectedIndex()==1)
            TFdep.setText("Q.30,000.°°");
        if(jComboBox2.getSelectedIndex()==2)
            TFdep.setText("Q.50,000.°°");
        if(jComboBox2.getSelectedIndex()==3)
           TFdep.setText("Q.15,000.°°");
        if(jComboBox2.getSelectedIndex()==4)
            TFdep.setText("Q.25,000.°°");
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

          JOptionPane.showMessageDialog(null, "Departamento:                (+)  "+departamento()+"\nSUELDO BASE:             (+)  "+jTextField4.getText()+"\nCOMISIONES:                    (+)  "+jTextField5.getText()+"\nBONIF:                           (+)  "+jTextField6.getText()+"\nIGGS:                               (-)  "+jTextField7.getText()+"\nISR:                                 (-)  "+jTextField8.getText()+"\n--------------------------------------------------\nTOTAL:                                     (=) "+jTextField9.getText(),"Calculos",JOptionPane.INFORMATION_MESSAGE);


//        JLabel label = new JLabel("\t\thi");
//        JDialog dialog = new JDialog();
//        dialog.setLocationRelativeTo(null);
//        dialog.setTitle("PROCEDIMIENTO");
//        dialog.add(label);
//        dialog.pack();
//        dialog.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrandMouseClicked
        int random;
        random=(int)(Math.random()*15000+2500);
        jTextField4.setText(""+random);
        random=(int)(Math.random()*2000+2000);
        jTextField5.setText(""+random);
        random=(int)(Math.random()*1000+1000);
        jTextField6.setText(""+random);
        
    }//GEN-LAST:event_JrandMouseClicked
    public void sueldol(){
        
        //funcion total sueldo
        
    int depart=Integer.parseInt(departamento());
    double suel9, com9, bon9, igs9,isr9;
    double t1, t2, tt;
       suel9 = Integer.parseInt(jTextField4.getText());
       com9 = Integer.parseInt(jTextField5.getText());
       bon9 = Integer.parseInt(jTextField6.getText());
       igs9 = Double.parseDouble(jTextField7.getText());
       isr9 = Double.parseDouble(jTextField8.getText());
       
       t1 = suel9+com9+bon9+depart;
       t2 = igs9+isr9;
       tt = t1-t2;
       
        jTextField9.setText(""+tt);
    
    }
    
    public void isr(){
    
    double isr41;
    double isr1 = 0.03;
    double isr2 = 0.05;
    double isr3 = 0.10;
   
    
  
         isr41 = Integer.parseInt(jTextField4.getText());
     if (isr41<=5000){
     
       isr41 = Math.round((isr41*isr1)*100.0)/100.0;
       jTextField8.setText(""+isr41);

     }
     if(isr41>5000 && isr41<10000){
       isr41 = Math.round((isr41*isr2)*100.0)/100.0;
       jTextField8.setText(""+isr41);
     }
     if(isr41>10001 && isr41<100000){
     isr41 = Math.round((isr41*isr3)*100.0)/100.0;
     jTextField8.setText(""+isr41);
     
     }
    
    
    
    
    }
    public void iggs(){

        double igs, ig1;
        double op11 = 0.0483;
        igs = Integer.parseInt(jTextField4.getText());
        
        ig1= Math.round((igs*op11)*100.0)/100.0;
        
        jTextField7.setText(""+ig1);
    }
    public void mostrar() {
        
        String matriz [][] = new String[lista.size()][9];
        
        for (int i = 0;  i<lista.size(); i++){
        
        matriz[i][0]=lista.get(i).getNombre();
        matriz[i][1]=lista.get(i).getDepa();
        matriz[i][2]=lista.get(i).getCod();
        matriz[i][3]=lista.get(i).getSuel();
        matriz[i][4]=lista.get(i).getCom();
        matriz[i][5]=lista.get(i).getBon();
        matriz[i][6]=lista.get(i).getIgg();
        matriz[i][7]=lista.get(i).getIsr();    
        matriz[i][8]=lista.get(i).getSl();
       
        
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
            matriz,
                 
            new String [] {
                "NOMBRE", "DEPARTAMENTOS", "CODIGO", "SUELDO", "COMISIONES", "BONIFICACIONES", "IGGS", "ISR","SUELDO LIQUIDO"
            }
        ));
            
        }

    }
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
            java.util.logging.Logger.getLogger(NMMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NMMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NMMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NMMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NMMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jrand;
    private javax.swing.JTextField TFdep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
