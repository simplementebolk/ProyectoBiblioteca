package Vistas;

import Clases.Libro;
import DAO.LibroDAO;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bolk
 */
public class EliminarLibros extends javax.swing.JFrame {

    public EliminarLibros() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMG/icon.png")));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
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
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar Libros ");
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
        jScrollPane1.setViewportView(tblLibro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 540, 330));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Eliminar libros");
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

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 310, -1));

        txtFecha.setEnabled(false);
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 310, -1));

        txtEditorial.setEnabled(false);
        getContentPane().add(txtEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 310, -1));

        txtAutor.setEnabled(false);
        getContentPane().add(txtAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 310, -1));

        txtDescripcion.setEnabled(false);
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 310, 60));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Ficción", "No ficción", "Misterio y Suspense", "Romance", "Terror y Horror", "Aventura", "Ciencia", "Poesía", "Humor", "Drama", "Ciencia Ficción", "Fantasía", "Realismo Mágico", "Distopía", "Novela Histórica", "Biografía", "Autobiografía", "Ensayo", "Historia", "Policiaca", "Thriller Psicológico", "Literatura Infantil", "Literatura Juvenil", "Ciencia Popular", "Economía y Finanzas", "Autoayuda", "Filosofía", "Arte y Fotografía", "Cocina y Gastronomía", "Viajes y Aventuras" }));
        cboGenero.setEnabled(false);
        getContentPane().add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 220, -1));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 290, 50));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Sede-img.jpg"))); // NOI18N
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 431));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tblLibroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibroMouseClicked
        int fila = tblLibro.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(this, "Usuario no seleccionado");
        } else {
            String nombre = (String)tblLibro.getValueAt(fila, 0);
            String fecha = (String)tblLibro.getValueAt(fila, 1);
            String editorial = (String)tblLibro.getValueAt(fila, 2);
            String autor = (String)tblLibro.getValueAt(fila, 3);
            String descripcion = (String)tblLibro.getValueAt(fila, 4);
            String genero = (String)tblLibro.getValueAt(fila, 5);
            int id = Integer.parseInt((String)tblLibro.getValueAt(fila,6));

            spId.setValue(id);
            txtNombre.setText(nombre);
            txtFecha.setText(fecha);
            txtEditorial.setText(editorial);
            txtAutor.setText(autor);
            txtDescripcion.setText(descripcion);
            cboGenero.setSelectedItem(genero);
        }
    }//GEN-LAST:event_tblLibroMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        this.listarLibros();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    try {
            int id = (int) spId.getValue();

            if (new LibroDAO().eliminarLibro(id)) {
                JOptionPane.showMessageDialog(this, "Libro Eliminado");
                this.listarLibros();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(this, "Libro NO Eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar : " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void Limpiar(){
        spId.setValue(0);
        txtNombre.setText("");
        txtFecha.setText("");
        txtEditorial.setText("");
        txtAutor.setText("");
        txtDescripcion.setText("");
        cboGenero.setSelectedItem("Seleccione");
    }

    private void listarLibros(){
        LibroDAO dao = new LibroDAO();
        try {
            List<Libro> lista = dao.listarLibros();
            
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Fecha de salida");
            model.addColumn("Editorial");
            model.addColumn("Autor");
            model.addColumn("Descripción");
            model.addColumn("Género");
            model.addColumn("ID");
            
            for (Libro libro : lista) {
                String[] filas = new String[7];
                filas[0] = libro.getNombre();
                filas[1] = new SimpleDateFormat("dd/MM/yyyy").format(libro.getFecha());
                filas[2] = libro.getEditorial();
                filas[3] = libro.getAutor();
                filas[4] = libro.getDescripcion();
                filas[5] = libro.getGenero();
                filas[6] = String.valueOf(libro.getId());   
                model.addRow(filas);
            }
            tblLibro.setModel(model);           
        } catch (Exception e) {
            System.err.println("Error : "+e.getMessage());
        } 
    }    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarLibros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spId;
    private javax.swing.JTable tblLibro;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
