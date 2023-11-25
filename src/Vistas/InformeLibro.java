package Vistas;

import Clases.Libro;
import DAO.LibroDAO;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class InformeLibro extends javax.swing.JFrame {

    public InformeLibro() {
        initComponents();
        this.listarLibros();
        URL iconoURL = getClass().getResource("/IMG/icon.png");
        ImageIcon icono = new ImageIcon(iconoURL);
        this.setIconImage(icono.getImage());
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

    private void filtrarLibro(String genero) {
        // Crear una instancia del DAO para acceder a los libros
        LibroDAO dao = new LibroDAO();
        try {
            // Obtener la lista de libros filtrada por género desde el DAO
            List<Libro> lista = dao.filtrarLibro(genero);

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

            // Llenar el modelo con los datos de la lista de libros filtrada por género
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
            System.err.println("Error: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibro = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        cboGenero = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listar Libros");
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
        jScrollPane1.setViewportView(tblLibro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 530, 320));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Buscar Libros por genero");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 50));

        cboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Thriller Detectivesco", "Fantasía Oscura", "Romance Histórico", "Aventura Fantástica", "Misterio Romántico", "Fantasía Épica", "Fantasía Emocional", "Aventura Infantil", "Thriller Romántico", "Ciencia Ficción Alternativa", "Ficción Cósmica", "Thriller Temporal", "Realismo Mágico", "Misterio Histórico", "Fantasía Dimensional", "Fantasía Mitológica", "Fantasía Espiritual", "Fantasía", "Thriller Psicológico", "Romance Fantástico", "Ciencia Ficción Tecnológica", "Ficción Histórica", "Aventura Histórica", "Fantasía Contemporánea", "Realismo Fantástico", "Drama Musical", "Surrealismo", "Misterio Familiar", "Fantasía Temporal", "Ciencia Ficción Apocalíptica", "Ficción", "No ficción", "Misterio y Suspense", "Romance", "Terror y Horror", "Aventura", "Ciencia", "Poesía", "Humor", "Drama", "Ciencia Ficción", "Distopía", "Novela Histórica", "Biografía", "Autobiografía", "Ensayo", "Historia", "Policiaca", "Literatura Infantil", "Literatura Juvenil", "Ciencia Popular", "Economía y Finanzas", "Autoayuda", "Filosofía", "Arte y Fotografía", "Cocina y Gastronomía", "Viajes y Aventuras" }));
        cboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGeneroActionPerformed(evt);
            }
        });
        getContentPane().add(cboGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 120, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, -1, 20));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Sede-img.jpg"))); // NOI18N
        lblFondo.setText("Listar Libros");
        getContentPane().add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        this.listarLibros();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGeneroActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String generoSeleccionado = (String) cboGenero.getSelectedItem();

        // Crear una instancia del DAO para acceder a los libros
        LibroDAO dao = new LibroDAO();
        try {
            // Obtener la lista de libros filtrada por género desde el DAO
            List<Libro> listaLibros = dao.filtrarLibro(generoSeleccionado);

            // Ordenar la lista por el campo ID
            Collections.sort(listaLibros, Comparator.comparingInt(Libro::getId));

            // Crear un modelo de tabla para la JTable
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Fecha de salida");
            model.addColumn("Editorial");
            model.addColumn("Autor");
            model.addColumn("Descripción");
            model.addColumn("Género");
            model.addColumn("ID");

            // Llenar el modelo con los datos de la lista de libros filtrada por género
            for (Libro libro : listaLibros) {
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
            System.err.println("Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformeLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cboGenero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblLibro;
    // End of variables declaration//GEN-END:variables
}
