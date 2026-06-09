import java.util.ArrayList;

public class Noticia {
    private String titulo;
    private String detalle;
    private Integer dia;
    private Integer mes;
    private Integer anio;
    private Autor autor;
    private ArrayList<Comentario> comentarios;

    public Noticia() throws ExcepcionDatosInvalidos {
        this.titulo = "";
        this.detalle = "";
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
        this.autor = new Autor();
        comentarios = new ArrayList<Comentario>();
    }

    public Noticia(String titulo, String detalle, Integer dia, Integer mes, Integer anio, Autor autor) throws ExcepcionDatosInvalidos {
        this.titulo = titulo;
        this.detalle = detalle;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.autor = autor;
        comentarios = new ArrayList<Comentario>();
    }

    public String getTitulo(){
        return titulo;
    }

    public String getDetalle(){
        return detalle;
    }

    public Integer getDia(){
        return dia;
    }

    public Integer getMes(){
        return mes;
    }

    public Integer getAnio(){
        return anio;
    }

    public Autor getAutor(){
        return autor;
    }

    public ArrayList<Comentario> getComentario(){
        return comentarios;
    }

}
