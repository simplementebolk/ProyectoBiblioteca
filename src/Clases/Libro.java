package Clases;

import java.util.Date;
/**
 *
 * @author bolk
 */
public class Libro {
    private int id;
    private String nombre;
    private Date fecha;
    private String editorial;
    private String autor;
    private String descripcion;
    private String genero;

    public Libro() {
    }

    public Libro(String nombre, Date fecha, String editorial, String autor, String descripcion, String genero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.editorial = editorial;
        this.autor = autor;
        this.descripcion = descripcion;
        this.genero = genero;
        this.id = id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", fecha=" + fecha + ", editorial=" + editorial + ", autor=" + autor + ", descripcion=" + descripcion + ", genero=" + genero + ", id=" + id + '}';
    }

}
