public class Autor extends Persona{
    private String medio;

    public Autor() throws ExcepcionDatosInvalidos {
        super();
        this.medio = "";
    }

    public Autor(Integer dni, String nombre, String medio) throws ExcepcionDatosInvalidos {
        super(dni, nombre);
        if(medio == null || medio.isEmpty()){
            throw new ExcepcionDatosInvalidos("El medio no puede estar vacío.");
        }
        this.medio = medio;
    }

    public String getMedio(){
        return medio;
    }
}
