package Vistas;
import Clases.Libro;
import DAO.LibroDAO;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author bolk
 */
public class ListarLibros extends javax.swing.JFrame {

    public ListarLibros() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/IMG/icon.png")));
        this.listarLibros();
        
        
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
            model.addColumn("Descripcion");
            model.addColumn("Genero");
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibro = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 850, 360));

        lblTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Listar Libros");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logo.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 290, 50));

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
            java.util.logging.Logger.getLogger(ListarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarLibros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblLibro;
    // End of variables declaration//GEN-END:variables
}
