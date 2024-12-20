package registro_productos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import menu_Inicio.menu_principal;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class registrar_productos extends javax.swing.JFrame {

    /**
     * Creates new form calculadora_pasteles
     */
    public registrar_productos() {
        initComponents();
        modeloTabla = (DefaultTableModel) tb_ver.getModel();
        verConsulta();
    }
    private DefaultTableModel modeloTabla;

    public static boolean validador_de_letras(String datos) {

        return datos.matches("[a-zA-Z]+");
    }

    public static boolean validador_de_numeros(String datos) {

        return datos.matches("[0-9]+");
    }

    public static boolean validador_de_estado(String datos) {

        return datos.matches("[0-1]+");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox4 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_ver = new javax.swing.JTable();
        btn_Editar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD Productos");

        jPanel1.setBackground(new java.awt.Color(226, 115, 150));

        jPanel2.setBackground(new java.awt.Color(234, 242, 215));

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(226, 115, 150));
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(226, 115, 150));
        jLabel7.setText("Estado:");

        txtPrecio.setBackground(new java.awt.Color(234, 242, 215));
        txtPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(226, 115, 150));
        jPanel3.setForeground(new java.awt.Color(226, 115, 150));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        btn_registrar.setBackground(new java.awt.Color(234, 242, 215));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(234, 242, 215));
        btn_salir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_salir.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        txtNombre.setBackground(new java.awt.Color(234, 242, 215));
        txtNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(226, 115, 150));
        jLabel9.setText("Nombre:");

        jLabel11.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(226, 115, 150));
        jLabel11.setText("Tipo:");

        txtTipo.setBackground(new java.awt.Color(234, 242, 215));
        txtTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTipo.setText("Ingrediente");
        txtTipo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tb_ver.setBackground(new java.awt.Color(255, 153, 255));
        tb_ver.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID producto", "Nombre", "Cantidad", "Precio", "Descripcion", "Tipo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_ver.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(tb_ver);

        btn_Editar.setBackground(new java.awt.Color(234, 242, 215));
        btn_Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Editar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Editar.setText("Editar");
        btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditarActionPerformed(evt);
            }
        });

        btn_Eliminar.setBackground(new java.awt.Color(234, 242, 215));
        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Eliminar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        cmbEstado.setBackground(new java.awt.Color(226, 115, 150));
        cmbEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cmbEstado.setForeground(new java.awt.Color(234, 242, 215));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Activo", "Desactivado" }));

        jLabel8.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(226, 115, 150));
        jLabel8.setText("Cantidad:");

        txtCantidad.setBackground(new java.awt.Color(234, 242, 215));
        txtCantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Arial Black", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(226, 115, 150));
        jLabel10.setText("Descripcion:");

        txtDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jScrollPane2.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btn_registrar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Eliminar)
                            .addGap(12, 12, 12))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTipo)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(59, 59, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_salir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_registrar)
                    .addComponent(btn_Editar)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_Inicio/file (2).png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu_Inicio/file (2).png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASTELERIA - REGISTRAR PRODUCTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("registrar_productos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
//validaciones

        if (txtNombre.getText().isEmpty() || txtCantidad.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtTipo.getText().isEmpty() || cmbEstado.getSelectedItem().toString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            boolean datosCorrectos = true;

            if (!validador_de_letras(txtNombre.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Nombre incorrecto: solo se permiten letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                datosCorrectos = false;
            }

            if (!validador_de_numeros(txtPrecio.getText().trim()) || Double.parseDouble(txtCantidad.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Precio incorrecto: solo se permiten numeros positivos", "Advertencia", JOptionPane.WARNING_MESSAGE);
                datosCorrectos = false;
            }
            if (!validador_de_numeros(txtCantidad.getText().trim()) || Integer.parseInt(txtPrecio.getText()) < 0) {
                JOptionPane.showMessageDialog(null, "Cantidad incorrecta: solo se permiten numeros positivos enteros", "Advertencia", JOptionPane.WARNING_MESSAGE);
                datosCorrectos = false;
            }

            if (!validador_de_letras(txtTipo.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Tipo incorrecto: solo se permiten letras", "Advertencia", JOptionPane.WARNING_MESSAGE);
                datosCorrectos = false;
            }
            if (!validador_de_letras(cmbEstado.getSelectedItem().toString()) || cmbEstado.getSelectedItem().toString().equals("Ninguno")) {
                JOptionPane.showMessageDialog(null, "Estado incorrecto: seleccione un estado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                datosCorrectos = false;
            }
            if (datosCorrectos) {
                String nombre = txtNombre.getText();
                int cantidad = Integer.parseInt(txtCantidad.getText());
                Double precio = Double.parseDouble(txtPrecio.getText());
                String descripcion = txtDescripcion.getText();
                String tipo = txtTipo.getText();
                String estadoActual = cmbEstado.getSelectedItem().toString();
                boolean estado = true;
                if (estadoActual.equals("Activo")) {

                    estado = true;

                } else if (estadoActual.equals("Desactivado")) {

                    estado = false;

                }
                try {

                    // Insertar el producto en la base de datos
                    ConexionSQL conexionSQL = new ConexionSQL();
                    boolean exito = conexionSQL.insertarProducto(nombre, cantidad, precio, descripcion, tipo, estado);

                    if (exito) {
                        JOptionPane.showMessageDialog(this, "Producto guardado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        // Opcional: actualizar la tabla para mostrar el nuevo registro
                        DefaultTableModel modelo = (DefaultTableModel) tb_ver.getModel();
                        int filas = modelo.getRowCount();
                        for (int i = filas - 1; i >= 0; i--) {
                            modelo.removeRow(i); // Eliminar fila desde el final para evitar problemas con los índices
                        }

                        verConsulta();
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al guardar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "La cantidad debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }

        }


    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed

        menu_principal volver = new menu_principal();

        volver.setVisible(true);

        this.setVisible(false);

    }//GEN-LAST:event_btn_salirActionPerformed
    private boolean modoActualizar = false;

    private void btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditarActionPerformed
        int filaSeleccionado = tb_ver.getSelectedRow();

        if (!modoActualizar) {
            int seleccionado = tb_ver.getSelectedRow();

            if (seleccionado != -1) {
                DefaultTableModel renacuajo = (DefaultTableModel) tb_ver.getModel();
                btn_Editar.setText("Actualizar");
                
                String nombre = renacuajo.getValueAt(filaSeleccionado, 1).toString();
                String cantidad_num = renacuajo.getValueAt(filaSeleccionado, 2).toString();
                String precio_num = renacuajo.getValueAt(filaSeleccionado, 3).toString();
                String descripcion = renacuajo.getValueAt(filaSeleccionado, 4).toString();
                String tipo = renacuajo.getValueAt(filaSeleccionado, 5).toString();
                String estado_Actual = renacuajo.getValueAt(filaSeleccionado, 6).toString();

                txtNombre.setText(nombre);
                txtCantidad.setText(cantidad_num);
                txtPrecio.setText(precio_num);
                txtDescripcion.setText(descripcion);
                txtTipo.setText(tipo);
                cmbEstado.setSelectedItem(estado_Actual);
                modoActualizar = true;

            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro primero.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
            return;
        }
        if (modoActualizar) {
            
             DefaultTableModel renacuajo = (DefaultTableModel) tb_ver.getModel();
            int id_num = Integer.parseInt(renacuajo.getValueAt(filaSeleccionado, 0).toString());
            String b = txtNombre.getText();
            int c = Integer.parseInt(txtCantidad.getText());
            Double d =Double.parseDouble(txtPrecio.getText());
            String e =txtDescripcion.getText();
            String f = txtTipo.getText();
            String g =cmbEstado.getSelectedItem().toString();
                          
                boolean estado = true;
                if (g.equals("Activo")) {

                    estado = true;

                } else if (g.equals("Desactivado")) {

                    estado = false;

                }else if (g.equals("Ninguno")){
                
                JOptionPane.showMessageDialog(null, "Por favor, selecciona un estado", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return;
                }
                

            ConexionSQL conexionSQL = new ConexionSQL();
            boolean exito = conexionSQL.editarProducto(id_num,b,c,d,e,f,estado);
            if (exito) {

                JOptionPane.showMessageDialog(null, "Producto editado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

                DefaultTableModel modelo = (DefaultTableModel) tb_ver.getModel();
                int filas = modelo.getRowCount();
                for (int i = filas - 1; i >= 0; i--) {
                    modelo.removeRow(i); // Eliminar fila desde el final para evitar problemas con los índices
                }
                modoActualizar = false;
                verConsulta();
                btn_Editar.setText("Editar");
            }

        }
    }//GEN-LAST:event_btn_EditarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int filaSeleccionado = tb_ver.getSelectedRow();
        if (filaSeleccionado != -1) {

            DefaultTableModel renacuajo = (DefaultTableModel) tb_ver.getModel();

            String id_num = renacuajo.getValueAt(filaSeleccionado, 0).toString();
            String nombre = renacuajo.getValueAt(filaSeleccionado, 1).toString();
            String cantidad_num = renacuajo.getValueAt(filaSeleccionado, 2).toString();
            String precio_num = renacuajo.getValueAt(filaSeleccionado, 3).toString();
            String descripcion = renacuajo.getValueAt(filaSeleccionado, 4).toString();
            String tipo = renacuajo.getValueAt(filaSeleccionado, 5).toString();
            String estado_Actual = renacuajo.getValueAt(filaSeleccionado, 6).toString();
            int id = Integer.parseInt(id_num);
            int cantidad = Integer.parseInt(cantidad_num);
            Double precio = Double.parseDouble(precio_num);
            boolean estado = true;
            if (estado_Actual.equals("Activo")) {

                estado = true;

            } else if (estado_Actual.equals("Desactivado")) {

                estado = false;

            }
            ConexionSQL conexionSQL = new ConexionSQL();
            boolean exito = conexionSQL.eliminarProducto(id, nombre, cantidad, precio, descripcion, tipo, estado);
            if (exito) {

                JOptionPane.showMessageDialog(null, "Producto borrado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                // Opcional: actualizar la tabla para mostrar el nuevo registro
                DefaultTableModel modelo = (DefaultTableModel) tb_ver.getModel();
                int filas = modelo.getRowCount();
                for (int i = filas - 1; i >= 0; i--) {
                    modelo.removeRow(i); // Eliminar fila desde el final para evitar problemas con los índices
                }
                verConsulta();
            }

        } else {
            JOptionPane.showMessageDialog(null, "No se selecciono nada", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_EliminarActionPerformed
    private void limpiarCampos() {
        txtNombre.setText("");

        txtPrecio.setText("");
        txtTipo.setText("");

    }

    public void verConsulta() {
        ConexionSQL conexionSQL = new ConexionSQL();
        Connection conn = conexionSQL.conectarMySQL();
        // Intentar conectar
        if (conn != null) {
            System.out.println("Conexión establecida. Ejecutando consulta...");
            try {
                // Crear un objeto Statement para ejecutar consultas
                Statement stmt = conn.createStatement();

                // Consulta SQL
                String query = "SELECT * FROM Productos";

                // Ejecutar la consulta y obtener resultados
                ResultSet rs = stmt.executeQuery(query);

                // Iterar sobre los resultados
                System.out.println("Resultados:");
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nombre = rs.getString("nombre");
                    int cantidad = rs.getInt("cantidad");
                    Double precio = rs.getDouble("precio");
                    String descripcion = rs.getString("descripcion");
                    String tipo = rs.getString("tipo");
                    boolean estadoActual = rs.getBoolean("estado");
                    // evaluador generico
                    String estado = "Activo";
                    if (!estadoActual) {

                        estado = "Desactivado";

                    }

                    //System.out.println( "Nombre: " + nombre + ", Cantidad: " + cantidad);
                    String consulta[] = {String.valueOf(id), nombre, String.valueOf(cantidad), String.valueOf(precio), descripcion, tipo, estado};
                    DefaultTableModel tabla = (DefaultTableModel) tb_ver.getModel();
                    tabla.addRow(consulta);
                }
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                System.err.println("Error al ejecutar la consulta.");
                e.printStackTrace();
            } finally {
                // Cerrar la conexión
                try {
                    conn.close();
                    System.out.println("Conexión cerrada.");
                } catch (SQLException e) {
                    System.err.println("Error al cerrar la conexión.");
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("No se pudo establecer la conexión.");
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
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrar_productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrar_productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Editar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_ver;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
