import br.com.desafio.poo.dominio.Course;
import br.com.desafio.poo.dominio.Mentoring;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("curso Java");
        course1.setDescription("curso dahora");
        course1.setWorkload(8);


        Course course2 = new Course();
        course2.setTitle("curso Js");
        course2.setDescription("curso dahora de Js");
        course2.setWorkload(4);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoria Java Poo");
        mentoring.setDescription("Poo é vida");
        mentoring.setData(LocalDate.now());


        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentoring);
    }



}
