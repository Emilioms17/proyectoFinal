import entidades.Doctor;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    try {
        ArrayList<Doctor> listaDoctor = new ArrayList<Doctor>();
        Doctor a1 = new Doctor();
        a1.setEspecialidad("Urologo");
        a1.setNombre("Emilio");
        a1.setApellidoPat("Mejia");
        a1.setHorario(12 - 14);

        Doctor a2 = new Doctor();
        a2.setEspecialidad("Dentista");
        a2.setNombre("Luis");
        a2.setApellidoPat("Ramirez");
        a2.setHorario(9 - 13);

        Doctor a3 = new Doctor();
        a3.setEspecialidad("Dermatologo");
        a3.setNombre("Jose");
        a3.setApellidoPat("Rios");
        a3.setHorario(7 -11 );

        listaDoctor.add(a1);
        listaDoctor.add(a2);
        listaDoctor.add(a3);


        FileOutputStream escribir = new FileOutputStream("c: \\Usuarios\\gerar\\IdeaProjects\\proyectoFinal\\baseDatos\\Doctor.txt");
        ObjectOutputStream miStream = new ObjectOutputStream(escribir);
        miStream.writeObject(listaDoctor);
        miStream.flush();
        miStream.close();
        }catch (FileNotFoundException e) {
          throw new RuntimeException(e);
        } catch (IOException e) {
         throw new RuntimeException(e);
    }


    }

}