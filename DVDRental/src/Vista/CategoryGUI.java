/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Category;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Calendar;
import Controlador.ControladorCategory;
import java.sql.Timestamp;
import java.util.Date;
/**
 *
 * @author crist
 */
public class CategoryGUI extends javax.swing.JFrame {

    /**
     * Creates new form CategoryGUI
     */
    public CategoryGUI() {
        initComponents();
        setLocationRelativeTo(null);
        cargarCategorias();
    }
private void limpiarListadoTabla(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jtListado.getModel();
        for(int i=modelo.getRowCount()-1; i>=0 ; i--){
            modelo.removeRow(i);
        }
    }
    
    
    public void cargarCategorias(){
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jtListado.getModel();    
        ArrayList<Category> listadoCategorias = new ArrayList();
        listadoCategorias=ControladorCategory.listadoCategory(0);
        limpiarListadoTabla();
        for(int i= 0; i < listadoCategorias.size(); i++){
              modelo.addRow(new Object[]{
              listadoCategorias.get(i).getCategoryid(),
              listadoCategorias.get(i).getName(),
              listadoCategorias.get(i).getLasUpdate(),
              });
        }
    }
    
      public int calcularId(){
     ArrayList<Category>all = new ArrayList();
     ControladorCategory s = new ControladorCategory();
     return s.listadoCategory(0).size()+1;
 }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField1.setEnabled(false);
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField2.setEnabled(false);
        jLabel4 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Controles");

        btnNuevo.setText("Nuevo");
        btnNuevo.setActionCommand("b");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setEnabled(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Category ID");

        jLabel3.setBackground(new java.awt.Color(255, 0, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Categorias");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jtListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Categoria ID", "Categoria", "Last_Update"
            }
        ));
        jtListado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtListadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtListado);

        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Categoria");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(15, 15, 15)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(440, 440, 440)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(btnRegistrar)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar))
                .addGap(7, 7, 7)
                .addComponent(btnModificar)
                .addGap(7, 7, 7)
                .addComponent(btnCancelar)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnVolver)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        jTextField1.setText(calcularId()+"");
        jTextField2.setText("");

     
        if(btnNuevo.getText().equals("Nuevo")){
            btnRegistrar.setEnabled(true);
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(true);
            btnRegistrar.setEnabled(true);
            btnBorrar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnNuevo.setText("Cancelar");
            jtListado.setEnabled(false);
            jTextField1.requestFocusInWindow();
        }
        else{
            btnRegistrar.setEnabled(false);
            jTextField1.setEnabled(false);
            jTextField2.setEnabled(false);
            btnNuevo.setText("Nuevo");
            btnModificar.setEnabled(true);
            btnBorrar.setEnabled(true);
            jtListado.setEnabled(true);
            btnNuevo.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        InterfazPrincipal ip =new InterfazPrincipal();
        setVisible(false);
        ip.setVisible(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
       jTextField1.selectAll();
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(jTextField1.getText().trim().equals(""))
            JOptionPane.showMessageDialog(this,"Ingrese el ID");
        else{
            if (jTextField2.getText().trim().equals("")){
                JOptionPane.showMessageDialog(this,"Agregue  nombre a la categoria");
                             
            }                
            else {
                    Category category = new Category();
                category.setCategoryid(Integer.parseInt(jTextField1.getText()));
                category.setName(jTextField2.getText());
               
             Date date = new Date();
             category.setLasUpdate(new Timestamp(date.getTime()));
                
                
                                
                int tamaño;
                tamaño = ControladorCategory.listadoCategory(category.getCategoryid()).size();

                if(tamaño == 0){
                    int resultado = 0;
                    resultado = ControladorCategory.grabarCategory(category);
                    if(resultado == 1){
                        JOptionPane.showMessageDialog(this,
                                    "Categoria Grabado con éxito",
                                "Confirmación",JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Error al grabar",
                                "Confirmación",JOptionPane.ERROR_MESSAGE);
                    }

                   cargarCategorias();

                    btnNuevo.setText("Nuevo");
                    jTextField1.setEnabled(false);
                    jTextField2.setEnabled(false);
         
                    btnNuevo.setEnabled(true);
                    btnRegistrar.setEnabled(false);
                    btnBorrar.setEnabled(true);
                    btnModificar.setEnabled(true);       
                    jtListado.setEnabled(true);
                    btnNuevo.requestFocusInWindow();
                                       
                }
                else{
                   JOptionPane.showMessageDialog(this,
                           "ID ya registrado","Confirmación",
                           JOptionPane.ERROR_MESSAGE); 
                   jTextField1.requestFocusInWindow();
                }
                 
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
          jTextField1.setEnabled(false);
        jTextField2.setEnabled(false);       
        btnBorrar.setEnabled(true);
        btnNuevo.setEnabled(true);
        btnRegistrar.setEnabled(false);
        btnModificar.setText("Modificar");
        btnCancelar.setEnabled(false);
        jtListado.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
             if(jTextField1.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor seleccione una Categoria","Error", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
            int respuesta = JOptionPane.showConfirmDialog(this,
                    "¿Desea Eliminar la categoria de id: " +
                           jTextField1.getText().trim()+
                    " ?", "Confirmación de Acción", JOptionPane.YES_NO_OPTION);
            if(respuesta == JOptionPane.YES_OPTION){
                int id = 0;
                id  = Integer.parseInt(jTextField1.getText().trim());
                
                if(ControladorCategory.borrarCategory(id) == 1){
                    JOptionPane.showMessageDialog(this, 
                            "Registro Borrado con éxtio", 
                            "Confirmación de acción", 
                            JOptionPane.INFORMATION_MESSAGE);                    
                    cargarCategorias();
                }
                else{
                    JOptionPane.showMessageDialog(this, 
                            "Error al borrar", "Confirmación de acción", 
                            JOptionPane.ERROR_MESSAGE);                    
                }
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      if(btnModificar.getText().equalsIgnoreCase("Modificar")){
            if(jtListado.getSelectedRow() == -1){
               if(jtListado.getRowCount() == 0){
                   JOptionPane.showMessageDialog(this,"No hay registros");
               }
               else{
                   JOptionPane.showMessageDialog(this,"Seleccione una fila");
               }

            } else{        
 
               jTextField2.setEnabled(true);        
               btnBorrar.setEnabled(false);
               btnNuevo.setEnabled(false);
               btnRegistrar.setEnabled(false);
               btnModificar.setText("Actualizar");
               btnCancelar.setEnabled(true);
               jtListado.setEnabled(false);
           }
        } else {
            
 
               jTextField2.setEnabled(false);
             btnBorrar.setEnabled(true);
             btnNuevo.setEnabled(true);
             btnRegistrar.setEnabled(false);
             btnModificar.setText("Modificar");
             btnCancelar.setEnabled(false);
             jtListado.setEnabled(true);
             
            
             Category category = new Category();
             
          
             category.setCategoryid(Integer.parseInt(jTextField1.getText()));
             category.setName(jTextField2.getText());  
             Date date = new Date();
             category.setLasUpdate(new Timestamp(date.getTime()));                                          
           
                         
             if(ControladorCategory.modificarCategory(category) == 1){
                 JOptionPane.showMessageDialog(this,"Actualización exitosa");
                 this.cargarCategorias();
             } else {
                 JOptionPane.showMessageDialog(this,"Actualización Fallida");
             }
             
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jtListadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtListadoMouseClicked
        DefaultTableModel modelo;
        modelo = (DefaultTableModel) jtListado.getModel();
                            
        if(jtListado.getSelectedRow()==-1){
            if(jtListado.getRowCount()==0){
                JOptionPane.showMessageDialog(this,"No hay registros");
            }
            else{
                JOptionPane.showMessageDialog(this,"Seleccione una fila");
            }
        }else {
                                  
            jTextField1.setText(modelo.getValueAt(
                    jtListado.getSelectedRow(), 0).toString());            
            jTextField2.setText(modelo.getValueAt(
                    jtListado.getSelectedRow(), 1).toString());
     
        }
    }//GEN-LAST:event_jtListadoMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable jtListado;
    // End of variables declaration//GEN-END:variables
}
