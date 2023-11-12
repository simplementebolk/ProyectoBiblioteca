package Vistas;

import Clases.Libro;
import DAO.LibroDAO;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bolk
 */
public class ModificarLibros extends javax.swing.JFrame {

    public ModificarLibros() {
        initComponents();
        this.listarLibros();
        URL iconoURL = getClass().getResource("/IMG/icon.png");
        ImageIcon icono = new ImageIcon(iconoURL);
        this.setIconImage(icono.getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tblLibros = new javax.swing.JScrollPane();
        tblLibro = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        spId = new javax.swing.JSpinner();
        lblId = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtEditorial = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cboGenero = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Libros");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLibro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha de salida", "Editorial", "Autor", "Descripcion", "Genero", "id"
            }
        ));
        tblLibro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibroMouseClicked(evt);
            }
        });
        tblLibros.setViewportView(tblLibro);

        getContentPane().add(tblLibros, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 540, 330));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Modificar libros");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        spId.setEnabled(false);
        getContentPane().add(spId, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));

        lblId.setBackground(new java.awt.Color(255, 255, 255));
        lblId.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("ID: ");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 40, -1));

        lblNombre.setBackground(new java.awt.Color(255, 255, 255));
        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("Fecha:");
        getContentPane().add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editorial:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Autor:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Descripción:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Género:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 310, -1));
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 310, -1));
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 310, -1));
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 310, -1));
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 310, 60));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Thriller Detectivesco", "Fantasía Oscura", "Romance Histórico", "Aventura Fantástica", "Misterio Romántico", "Fantasía Épica", "Fantasía Emocional", "Aventura Infantil", "Thriller Romántico", "Ciencia Ficción Alternativa", "Ficción Cósmica", "Thriller Temporal", "Realismo Mágico", "Misterio Histórico", "Fantasía Dimensional", "Fantasía Mitológica", "Fantasía Espiritual", "Fantasía", "Thriller Psicológico", "Romance Fantástico", "Ciencia Ficción Tecnológica", "Ficción Histórica", "Aventura Histórica", "Fantasía Contemporánea", "Realismo Fantástico", "Drama Musical", "Surrealismo", "Misterio Familiar", "Fantasía Temporal", "Ciencia Ficción Apocalíptica", "Ficción", "No ficción", "Misterio y Suspense", "Romance", "Terror y Horror", "Aventura", "Ciencia", "Poesía", "Humor", "Drama", "Ciencia Ficción", "Distopía", "Novela Histórica", "Biografía", "Autobiografía", "Ensayo", "Historia", "Policiaca", "Literatura Infantil", "Literatura Juvenil", "Ciencia Popular", "Economía y Finanzas", "Autoayuda", "Filosofía", "Arte y Fotografía", "Cocina y Gastronomía", "Viajes y Aventuras" }));
        getContentPane().add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 220, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Sede-img.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 431));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        this.listarLibros();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibroMouseClicked
        int fila = tblLibro.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Usuario no seleccionado");
        } else {
            String nombre = (String) tblLibro.getValueAt(fila, 0);
            String fecha = (String) tblLibro.getValueAt(fila, 1);
            String editorial = (String) tblLibro.getValueAt(fila, 2);
            String autor = (String) tblLibro.getValueAt(fila, 3);
            String descripcion = (String) tblLibro.getValueAt(fila, 4);
            String genero = (String) tblLibro.getValueAt(fila, 5);
            int id = Integer.parseInt((String) tblLibro.getValueAt(fila, 6));

            spId.setValue(id);
            txtNombre.setText(nombre);
            txtFecha.setText(fecha);
            txtEditorial.setText(editorial);
            txtAutor.setText(autor);
            txtDescripcion.setText(descripcion);
            cboGenero.setSelectedItem(genero);
        }
    }//GEN-LAST:event_tblLibroMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            int id = (int) spId.getValue();
            String nombre = txtNombre.getText();
            String fechaStr = txtFecha.getText();
            String editorial = txtEditorial.getText();
            String autor = txtAutor.getText();
            String descripcion = txtDescripcion.getText();
            String genero = (String) cboGenero.getSelectedItem();

            if ("Seleccione".equals(genero)) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un género válido");
                return;
            } else if (nombre.trim().length() < 3) {
                JOptionPane.showMessageDialog(this, "Error, nombre invalido");
            } else if (editorial.trim().length() < 3) {
                JOptionPane.showMessageDialog(this, "Error, editorial invalida");
            } else if (autor.trim().length() < 3) {
                JOptionPane.showConfirmDialog(this, "Error, autor invalido");
            } else if (descripcion.trim().length() < 3) {
                JOptionPane.showMessageDialog(this, "Error, descripcion invalida");
            } else {
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                dateFormat.setLenient(false);
                Date fecha;

                try {
                    fecha = dateFormat.parse(fechaStr);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese una fecha válida en formato dia/mes/año");
                    return;
                }

                Libro libroModificado = new Libro();
                libroModificado.setId(id);
                libroModificado.setNombre(nombre);
                libroModificado.setFecha(fecha);
                libroModificado.setEditorial(editorial);
                libroModificado.setAutor(autor);
                libroModificado.setDescripcion(descripcion);
                libroModificado.setGenero(genero);

                if (new LibroDAO().modificarLibro(libroModificado)) {
                    JOptionPane.showMessageDialog(this, "Libro Modificado");
                    this.listarLibros();
                    Limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Libro NO Modificado");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al modificar : " + e.getMessage());
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void Limpiar() {
        spId.setValue(0);
        txtNombre.setText("");
        txtFecha.setText("");
        txtEditorial.setText("");
        txtAutor.setText("");
        txtDescripcion.setText("");
        cboGenero.setSelectedItem("Seleccione");
    }

    private void listarLibros() {
        // Crear una instancia del DAO para acceder a los libros
        LibroDAO dao = new LibroDAO();
        try {
            // Obtener la lista de libros desde el DAO
            List<Libro> lista = dao.listarLibros();

            // Ordenar la lista por el campo ID
            Collections.sort(lista, Comparator.comparingInt(Libro::getId));

            // Crear un modelo de tabla para la JTable
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Fecha de salida");
            model.addColumn("Editorial");
            model.addColumn("Autor");
            model.addColumn("Descripción");
            model.addColumn("Género");
            model.addColumn("ID");

            // Llenar el modelo con los datos de la lista de libros
            for (Libro libro : lista) {
                String[] filas = new String[7];
                filas[0] = libro.getNombre();
                filas[1] = new SimpleDateFormat("dd/MM/yyyy").format(libro.getFecha());
                filas[2] = libro.getEditorial();
                filas[3] = libro.getAutor();
                filas[4] = libro.getDescripcion();
                filas[5] = libro.getGenero();
                filas[6] = String.valueOf(libro.getId());

                // Agregar la fila al modelo
                model.addRow(filas);
            }

            // Establecer el modelo en la JTable
            tblLibro.setModel(model);

        } catch (Exception e) {
            // Manejar cualquier excepción que pueda ocurrir al acceder a los libros
            System.err.println("Error : " + e.getMessage());
        }

    }

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
            java.util.logging.Logger.getLogger(ModificarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ModificarLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spId;
    private javax.swing.JTable tblLibro;
    private javax.swing.JScrollPane tblLibros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
