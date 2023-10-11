public class Alumno {
    private String  nombre="Prueba1", matricula;
    double calif1,calif2,calif3;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    double calculaPromedio(){
        return (calif1+calif2+calif3)/3;
    }

    public String getNombre(){
        return nombre;
    }
    public double getCalif1(){
        return calif1;
    }

    public double getCalif2() {
        return calif2;
    }

    public double getCalif3() {
        return calif3;
    }

    public String getMatricula() {
        return matricula;
    }
}

