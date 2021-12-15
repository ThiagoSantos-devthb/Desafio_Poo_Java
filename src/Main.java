import br.com.desafio.poo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("course Java");
        course1.setDescription("Description course Java");
        course1.setWorkload(8);


        Course course2 = new Course();
        course2.setTitle("course Js");
        course2.setDescription("Description course Js");
        course2.setWorkload(4);

        Content content = new Course();
        Content content1 = new Mentoring();

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Mentoring Java Poo");
        mentoring.setDescription("doubts about Poo");
        mentoring.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring);

        Dev devThiago = new Dev();
        devThiago.setName("Thiago");
        devThiago.inscribeBootcamp(bootcamp);
        System.out.println("Contents inscribe"+ devThiago.getContentsInscribe());
        devThiago.progress();
        devThiago.progress();

        System.out.println("-");

        System.out.println("Contents concluded"+ devThiago.getContentsInscribe());
        System.out.println("Contents concluded"+ devThiago.getContentsConcluded());
        System.out.println("XP:"+ devThiago.calculateXp());

        System.out.println("____________________________");

        Dev devJose = new Dev();
        devJose.setName("Jose");
        devJose.inscribeBootcamp(bootcamp);
        System.out.println("Contents inscribe"+ devJose.getContentsInscribe());
        devJose.progress();
        devJose.progress();
        devJose.progress();

        System.out.println("-");

        System.out.println("Contents concluded"+ devJose.getContentsConcluded());

        System.out.println("Contents concluded"+ devJose.getContentsInscribe());
        System.out.println("Contents concluded"+ devJose.getContentsConcluded());
        System.out.println("XP:"+ devJose.calculateXp());




    }



}
