public class Persona{
    private Integer dni;
    private String nombre;

    public Persona() throws ExcepcionDatosInvalidos {
        this.nombre = "";
        this.dni = 0;
    }

    public Persona(Integer dni, String nombre) throws ExcepcionDatosInvalidos {
        if(dni < 0 || dni == null){
            throw new ExcepcionDatosInvalidos("El DNI no puede ser negativo.");
        }
        this.dni = dni;
        if(nombre == null || nombre.isEmpty()){
            throw new ExcepcionDatosInvalidos("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public Integer getDni(){
        return dni;
    }

    public String getNombre(){
        return nombre;
    }
}