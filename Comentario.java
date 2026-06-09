public class Comentario {
    private Integer numero;
    private String texto;
    private Usuario usuario;

    public Comentario() throws ExcepcionDatosInvalidos {
        this.numero = 0;
        this.texto = "";
        this.usuario = new Usuario();
    }

    public Comentario(Integer numero, String texto, Usuario usuario) throws ExcepcionDatosInvalidos{
        if(numero == null || numero < 0){
            throw new ExcepcionDatosInvalidos("El número del comentario no puede ser negativo.");
        }
        this.numero = numero;
        if(texto == null || texto.trim().isEmpty()){
            throw new ExcepcionDatosInvalidos("El texto del comentario no puede estar vacío.");
        }
        this.texto = texto;
        if(usuario == null){
            throw new ExcepcionDatosInvalidos("El usuario del comentario no puede ser nulo.");
        }
        this.usuario = usuario;
    }

    public Integer getNumero(){
        return numero;
    }

    public String getTexto(){
        return texto;
    }

    public Usuario getUsuario(){
        return usuario;
    }
}
