package entidades;

import java.io.Serializable;

public class Doctor implements Serializable {
    private String nombre, especialidad, apellidoPat;
    private int horario;

    public Doctor() {
        System.out.println("se mando llamar el constructor");
    }
    public Doctor(String n){
        this.nombre = n;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }


}
