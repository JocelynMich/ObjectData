public class Alumno {
    private String  nombre="Prueba1", matricula;
    double calif1,calif2,calif3;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCalif1(double calif1) {
        this.calif1 = calif1;
    }

    public void setCalif2(double calif2) {
        this.calif2 = calif2;
    }

    public void setCalif3(double calif3) {
        this.calif3 = calif3;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

