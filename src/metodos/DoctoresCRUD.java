package metodos;

import entidades.Doctor;

import java.io.*;
import java.util.ArrayList;

public class DoctoresCRUD {

    public void agregarDoctor() {

    }

    public String getInfoDoctorPorEspecialidad(String especialidad){
        try {
            FileInputStream lerr = new FileInputStream("");
            ObjectInputStream miStream2 = new ObjectInputStream(lerr);
            Object o = miStream2.readObject();
            ArrayList<Doctor> listaLeida = (ArrayList<Doctor>) o;
            Doctor k;
            for(int i=0; i<listaLeida.size();i++)
            {
                k= listaLeida.get(i);
                if(especialidad.equals(k.getEspecialidad()));
                {
                    return k.getNombre() + " " + k.getApellidoPat();
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";


    public void actualizarDoctor(){

    }

    public void eliminarDoctor(){

    }
}
