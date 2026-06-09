public class Usuario extends Persona {
    private Integer edad;

    public Usuario() throws ExcepcionDatosInvalidos {
        super();
        this.edad = 0;
    }

    public Usuario(Integer dni, String nombre, Integer edad) throws ExcepcionDatosInvalidos {
        super(dni, nombre);
        if(edad == null || edad < 0){
            throw new ExcepcionDatosInvalidos("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public Integer getEdad(){
        return edad;
    }
}
