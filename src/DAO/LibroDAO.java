package DAO;

import Clases.Libro;
import java.util.List;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Conexion.Conexion;
import java.util.Date;

public class LibroDAO {

    private Connection conexion;

    public LibroDAO() {
    }

    //Guardar
    public boolean guardarLibro(Libro l) throws SQLException {
        //centinela revisa si se guarda o no
        boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "INSERT INTO LIBRO (NOMBRE, FECHA, EDITORIAL, AUTOR, DESCRIPCION, GENERO) VALUES (?,?,?,?,?,?)";
            CallableStatement cstmt = conexion.prepareCall(query);
            cstmt.setString(1, l.getNombre());
            cstmt.setDate(2, new java.sql.Date(l.getFecha().getTime()));
            cstmt.setString(3, l.getEditorial());
            cstmt.setString(4, l.getAutor());
            cstmt.setString(5, l.getDescripcion());
            cstmt.setString(6, l.getGenero());
            int control = cstmt.executeUpdate();
            if (control > 0) {
                //se logro guardar
                centinela = true;
            }
        } catch (Exception e) {
            System.err.println("ERROR AL GUARDAR!! " + e.getMessage());
        } finally {
            //cerramos conexion 
            this.conexion.close();
        }
        return centinela;
    }

    //Modificar
    public boolean modificarLibro(Libro l) throws SQLException {
        // Centinela revisa si se modifica o no
        boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "UPDATE LIBRO SET NOMBRE=?, FECHA=?, EDITORIAL=?, AUTOR=?, DESCRIPCION=?, GENERO=? WHERE ID=?";
            CallableStatement cstmt = conexion.prepareCall(query);
            cstmt.setString(1, l.getNombre());
            cstmt.setDate(2, new java.sql.Date(l.getFecha().getTime()));
            cstmt.setString(3, l.getEditorial());
            cstmt.setString(4, l.getAutor());
            cstmt.setString(5, l.getDescripcion());
            cstmt.setString(6, l.getGenero());
            cstmt.setInt(7, l.getId());
            int control = cstmt.executeUpdate();
            if (control > 0) {
                // Se logró modificar
                centinela = true;
            }
        } catch (Exception e) {
            System.err.println("ERROR AL MODIFICAR!! " + e.getMessage());
        } finally {
            // Cerramos conexión
            this.conexion.close();
        }
        return centinela;
    }

    //Eliminar
    public boolean eliminarLibro(int id) throws SQLException {
        // Centinela revisa si se elimina o no
        boolean centinela = false;
        try {
            this.conexion = new Conexion().obtenerConexion();
            String query = "DELETE FROM LIBRO WHERE ID=?";
            CallableStatement cstmt = conexion.prepareCall(query);
            cstmt.setInt(1, id);
            int control = cstmt.executeUpdate();
            if (control > 0) {
                // Se logró eliminar
                centinela = true;
            }
        } catch (Exception e) {
            System.err.println("ERROR AL ELIMINAR!! " + e.getMessage());
        } finally {
            // Cerramos conexión
            this.conexion.close();
        }
        return centinela;
    }

    //Listar
    public List<Libro> listarLibros() throws SQLException {
        List<Libro> listado = new ArrayList<>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String llamada = "SELECT * FROM LIBRO";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                Libro l = new Libro();
                l.setNombre(rs.getString("nombre"));
                l.setFecha(rs.getDate("fecha"));
                l.setEditorial(rs.getString("editorial"));
                l.setAutor(rs.getString("autor"));
                l.setDescripcion(rs.getString("descripcion"));
                l.setGenero(rs.getString("genero"));
                l.setId(rs.getInt("id"));

                listado.add(l);
            }
        } catch (Exception e) {
            System.err.println("Error al listar : " + e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listado;
    }

    public List<Libro> filtrarLibro(String genero) throws SQLException {
        List<Libro> listado = new ArrayList<>();
        try {
            this.conexion = new Conexion().obtenerConexion();
            String llamada = "SELECT * FROM LIBRO WHERE GENERO = ?";
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            cstmt.setString(1, genero);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                Libro l = new Libro();
                l.setNombre(rs.getString("nombre"));
                l.setFecha(rs.getDate("fecha"));
                l.setEditorial(rs.getString("editorial"));
                l.setAutor(rs.getString("autor"));
                l.setDescripcion(rs.getString("descripcion"));
                l.setGenero(rs.getString("genero"));
                l.setId(rs.getInt("id"));

                listado.add(l);
            }
        } catch (Exception e) {
            System.err.println("Error al listar por género: " + e.getMessage());
        } finally {
            this.conexion.close();
        }
        return listado;

    }
}
