package Trabajos_en_clase.clase_4.Ejercicios_en_clase.Relacion_Personas;

public class Main {

    public static void main(String[] args) {

        Persona p0 = new Persona("Emilio",60,EstadoCivil.CASADO);
        Persona p1 = new Persona("Maria ",58,EstadoCivil.CASADO);
        Persona p2 = new Persona(" Juancito ",30,EstadoCivil.SOLTERO);

        p0.agregarHijos(p2);
        p1.agregarHijos(p2);

        p2.agregarPadre(p0);
        p2.agregarPadre(p1);


        System.out.println(" Soy "+p0.getNombre()+ " tengo un hijo que se llama "+p0.getHijos().get(0).getNombre());
        System.out.println(" Soy "+p1.getNombre()+ " tengo un hijo que se llama "+p1.getHijos().get(0).getNombre());

        System.out.println("Soy "+p2.getNombre()+ " y mis padres son ");
        System.out.println(p2.getPadres()[0].getNombre());
        System.out.println(p2.getPadres()[1].getNombre());

    }
}
