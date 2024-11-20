import metodos.DoctoresCRUD;

public class prueba {

    public static void main(String[] args) {
        DoctoresCRUD DocCRUD = new DocCRUD();
        String resultado = DocCRUD.getInfoDoctorPorEspecialidad("0");
        System.out.println();
    }
}
