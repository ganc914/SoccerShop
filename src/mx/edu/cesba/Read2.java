/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.cesba;
import conexion2.conexion2;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gusta
 */
public class Read2 extends javax.swing.JFrame {
    conexion2 con = new conexion2();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    /**
     * Creates new form Read2
     */
    public Read2() {
        initComponents();
        
         this.setLocationRelativeTo(null);
        this.setTitle("Menu");
        this.setResizable(false);

        listar();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_item = new javax.swing.JTextField();
        txt_desc = new javax.swing.JTextField();
        txt_color = new javax.swing.JTextField();
        txt_size = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        txt_date = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_consult = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_del = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btn_back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(836, 1551));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Articulos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(289, 13, 386, 44);

        TablaDatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Articulo", "Descripcion", "Talla", "Color", "Precio", "Fecha de Compra"
            }
        ));
        TablaDatos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatos2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos2);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(2, 512, 960, 630);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 90, 33, 31);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Articulo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(80, 120, 90, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripcion");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 150, 120, 22);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Talla");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 180, 90, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(80, 210, 70, 22);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Precio");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 240, 80, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(80, 270, 54, 22);

        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel1.add(txt_id);
        txt_id.setBounds(190, 90, 110, 22);

        txt_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemActionPerformed(evt);
            }
        });
        txt_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_itemKeyTyped(evt);
            }
        });
        jPanel1.add(txt_item);
        txt_item.setBounds(190, 120, 110, 22);

        txt_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_descActionPerformed(evt);
            }
        });
        txt_desc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_descKeyTyped(evt);
            }
        });
        jPanel1.add(txt_desc);
        txt_desc.setBounds(190, 150, 110, 22);

        txt_color.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_colorKeyTyped(evt);
            }
        });
        jPanel1.add(txt_color);
        txt_color.setBounds(190, 210, 110, 22);

        txt_size.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_sizeKeyTyped(evt);
            }
        });
        jPanel1.add(txt_size);
        txt_size.setBounds(190, 180, 110, 22);

        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        txt_precio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_precioKeyTyped(evt);
            }
        });
        jPanel1.add(txt_precio);
        txt_precio.setBounds(190, 240, 110, 22);
        jPanel1.add(txt_date);
        txt_date.setBounds(190, 270, 110, 22);

        btn_add.setText("Agregar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add);
        btn_add.setBounds(80, 370, 97, 68);

        btn_consult.setText("Consultar");
        btn_consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultActionPerformed(evt);
            }
        });
        jPanel1.add(btn_consult);
        btn_consult.setBounds(220, 370, 97, 68);

        btn_update.setText("Actualizar");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update);
        btn_update.setBounds(360, 370, 97, 68);

        btn_clear.setText("Limpiar");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear);
        btn_clear.setBounds(500, 370, 97, 68);

        btn_del.setText("Borrar");
        btn_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delActionPerformed(evt);
            }
        });
        jPanel1.add(btn_del);
        btn_del.setBounds(640, 370, 97, 68);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/logotienda.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(510, 80, 300, 200);

        btn_back.setText("Regresar");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back);
        btn_back.setBounds(830, 370, 97, 68);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen2/wallpaperflare.com_wallpaper (1).jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 950, 510);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(2280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
   
            Agregar();
            limpiartable();
            listar();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
 txt_id.setText("");        // TODO add your handling code here:
    txt_item.setText("");        // TODO add your handling code here:
    txt_desc.setText("");        // TODO add your handling code here:
    txt_size.setText("");        // TODO add your handling code here:
    txt_precio.setText("");        // TODO add your handling code here:
    txt_date.setText("");
    txt_color.setText("");      // TODO add your handling code here:
    //txt_hd.setText("");        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
   
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioActionPerformed

    private void txt_precioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precioKeyTyped
         char onlynum = evt.getKeyChar();
       //int  num = evt
    
       
       if (Character.isLetter(onlynum)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioKeyTyped

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        char onlynum = evt.getKeyChar();
       if (Character.isLetter(onlynum)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null, "INGRESA SOLO NUMEROS");
       
    } 
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idKeyTyped

    private void txt_itemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_itemKeyTyped
        char c = evt.getKeyChar();
       
       if (Character.isLowerCase(c)){
           String cad = ("" + c).toUpperCase();
           c = cad.charAt(0);
           evt.setKeyChar(c);
       }
       if (Character.isDigit(c)){
           getToolkit().beep();
           evt.consume();
           JOptionPane.showMessageDialog(null,"INGRESAR SOLO TEXTO");
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemKeyTyped

    private void btn_consultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultActionPerformed
         limpiartable();
         listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
     limpiartable();
        actualizar(); 
        listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_updateActionPerformed

    private void TablaDatos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatos2MouseClicked
         int fila = TablaDatos2.getSelectedRow(); 
         if (fila == -1){
             JOptionPane.showMessageDialog(null, "NO HAS SELECCIONADO EL USARIO"); 
         }else{
             int row = Integer.parseInt((String) TablaDatos2.getValueAt(fila, 0).toString());
             int id = Integer.parseInt((String) TablaDatos2.getValueAt(fila, 0).toString());
             
             String articulo = (String) TablaDatos2.getValueAt(fila, 1); 
             String descripcion = (String) TablaDatos2.getValueAt(fila, 2);
             String color =(String) TablaDatos2.getValueAt(fila, 3);
             String talla =(String) TablaDatos2.getValueAt(fila, 4);
             String fechacompra =(String) TablaDatos2.getValueAt(fila, 6);
             int precio = Integer.parseInt((String)TablaDatos2.getValueAt(fila, 5).toString()); 
             //int phonenumber= Integer.parseInt((String)TablaDatos2.getValueAt(fila, 5).toString()); 
             //double salary = Double.parseDouble((String)TablaDatos2.getValueAt(fila, 6).toString()); 
             
             txt_id.setText(""+id); 
             txt_item.setText(""+articulo); 
             txt_desc.setText(""+descripcion); 
             txt_color.setText(""+color); 
             txt_size.setText(""+talla); 
             txt_precio.setText(""+precio); 
             txt_date.setText(""+fechacompra); 
             //txt_hd.setText(""+hiredate); 
             
         }
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaDatos2MouseClicked

    private void btn_delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delActionPerformed
         borrar();
    limpiartable();
    listar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_delActionPerformed

    private void txt_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_descActionPerformed
       
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descActionPerformed

    private void txt_descKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descKeyTyped
     char c = evt.getKeyChar();
       
       if (Character.isLowerCase(c)){
           String cad = ("" + c).toUpperCase();
           c = cad.charAt(0);
           evt.setKeyChar(c);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_descKeyTyped

    private void txt_sizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_sizeKeyTyped
       char c = evt.getKeyChar();
       
       if (Character.isLowerCase(c)){
           String cad = ("" + c).toUpperCase();
           c = cad.charAt(0);
           evt.setKeyChar(c);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_sizeKeyTyped

    private void txt_colorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_colorKeyTyped
        
char c = evt.getKeyChar();
       
       if (Character.isLowerCase(c)){
           String cad = ("" + c).toUpperCase();
           c = cad.charAt(0);
           evt.setKeyChar(c);
       }// TODO add your handling code here:
    }//GEN-LAST:event_txt_colorKeyTyped

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
       
Menu2 Menu2 = new Menu2();
        Menu2.setVisible(true);
        this.dispose();        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(Read2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Read2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Read2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Read2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Read2().setVisible(true);
            }
        });
    }
    void actualizar(){
        int id = Integer.parseInt(txt_id.getText());
        int precio = Integer.parseInt(txt_precio.getText());
        //int phonenumber = Integer.parseInt(txt_phone.getText());
        String articulo = txt_item.getText();
        String descripcion = txt_desc.getText();
        String color = txt_color.getText();
        String fechacompra = txt_date.getText();
         String talla = txt_size.getText();
        //Double salary = Double.parseDouble(txt_salary.getText());
        
        String sql = "UPDATE items set id='" + id + "', articulo='" + articulo + "',descripcion='" + descripcion 
                + "',talla='" + talla + "',color='" + color + "',precio='" + precio + "',fechacompra='" + fechacompra 
                + "' where id = " + id;
        
        try{
            cn = con.getConnection(); 
            st = cn.createStatement(); 
            st.executeUpdate(sql); 
            JOptionPane.showMessageDialog(null, "DATOS ACTUALIZADOS CORRECTAMENTE");            
        }catch(Exception e){
             JOptionPane.showMessageDialog(null, "DATOS NO SE GUARDARON CORRECTAMENTE");
             limpiartable();
        }
        
    }
     void listar (){
        String sql = "select * from items";
        
        try{
            cn= con.getConnection();
            st= cn.createStatement();
            rs= st.executeQuery(sql);
            Object[] articulos = new Object[7];
            modelo = (DefaultTableModel) TablaDatos2.getModel();
            
            while (rs.next()){
                articulos[0] = rs.getInt("id");
                articulos[1] = rs.getString("articulo");
                articulos[2] = rs.getString("descripcion");
                articulos[3] = rs.getString("talla");
                articulos[4] = rs.getString("color");
                articulos[5] = rs.getInt("precio");
                articulos[6] = rs.getString("fechacompra");
               // articulo[7] = rs.getString("hiredate");
                modelo.addRow(articulos);
            }
            TablaDatos2.setModel(modelo);
        }catch (Exception e){
          //JOptionPane.showMessageDialog(null, "Algo anda mal");  
        }
    }
    void Agregar() {
        int id = Integer.parseInt(txt_id.getText());
        String articulo = txt_item.getText();
        String descripcion = txt_desc.getText();
        int precio = Integer.parseInt(txt_precio.getText());
        String color = txt_color.getText();
        String fechacompra = txt_date.getText();
        String talla = txt_size.getText();
        
        //int phonenumber = Integer.parseInt(txt_phone.getText());
        //Double salary = Double.parseDouble(txt_salary.getText());
        //String fecha = (txt_fecha.getText().trim());
        
        try {
            String sql = "INSERT INTO items (id, articulo, descripcion, talla, color, precio, fechacompra) values ('" + id + "','" + articulo + "','" + descripcion 
                    + "','" + talla + "','" + color + "','" + precio + "','" + fechacompra + "')";
            cn = con.getConnection();
            st = cn.createStatement();
            st.executeUpdate(sql);
            
            JOptionPane.showMessageDialog(null,"DATOS GUARDADOS CORRECTAMENTE");
            limpiartable();
                    
        }catch (Exception e){
            //JOptionPane.showMessageDialog(null,"DATOS INCORRECTOS");
        }
    }
    void borrar(){
        int fila = TablaDatos2.getSelectedRow();
        int id = Integer.parseInt(txt_id.getText());
        
        if(fila ==-1){
             JOptionPane.showMessageDialog(null,"ELIGE UNA FILA PARA BORRAR REGISTRO");
             }else{
                try{
                    String sql = "DELETE FROM items WHERE id="+id; 
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(null,"DATOS BORRADOS CORRECTAMENTE!!!");
                    
                   limpiartable();
                    
                }catch(Exception e){
                    
                }
        }
        
    }
            
            
            
            
            
    void limpiartable(){
        for (int i=0;1 <=TablaDatos2.getRowCount(); i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos2;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_consult;
    private javax.swing.JButton btn_del;
    private javax.swing.JButton btn_update;
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
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_date;
    private javax.swing.JTextField txt_desc;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_item;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_size;
    // End of variables declaration//GEN-END:variables
}
