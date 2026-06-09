public class SistemaNoticias {
    private Persona persona;
    private Usuario usuario;
    private Autor autor;
    private Noticia noticia;

    public void registrarAutor(Integer dni, String nombre, String medio) throws ExcepcionDatosInvalidos {
        autor = new Autor(dni, nombre, medio);
    }

    public void registrarUsuario(Integer dni, String nombre, Integer edad) throws ExcepcionDatosInvalidos {
        usuario = new Usuario(dni, nombre, edad);
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de noticias");
        System.out.println("--- MENU DE OPCIONES ---");
        System.out.println("1. Registrar un Autor");
        System.out.println("2. Registrar un Usuario");
        System.out.println("3. Publicar Noticia");
    }
}
