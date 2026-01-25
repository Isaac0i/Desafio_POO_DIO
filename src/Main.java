import desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Ajudando você a melhorar seu domínio da linguagem Java.");
        mentoria1.setData(LocalDate.now());

        Bootcamp  bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devJuninho  = new Dev();
        devJuninho.setNome("Juninho");
        devJuninho.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Juninho: " + devJuninho.getConteudosInscritos());
        devJuninho.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Juninho: " +   devJuninho.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Juninho: " + devJuninho.getConteudosInscritos());
        System.out.println("XP: " + devJuninho.calcularXp());

        System.out.println("----------------");

        Dev devKraudio = new Dev();
        devKraudio.setNome("Kraudio");
        devKraudio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Kraudio: " +  devKraudio.getConteudosInscritos());
        devKraudio.progredir();
        System.out.println("-");
        System.out.println("Conteudos concluidos Kraudio: " +   devKraudio.getConteudosConcluidos());
        System.out.println("Conteudos inscritos Kraudio: " +  devKraudio.getConteudosInscritos());
        System.out.println("XP: " + devKraudio.calcularXp());

    }
}
