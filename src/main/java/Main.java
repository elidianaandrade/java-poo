import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição Curso JavaScript");
        curso2.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devElidiana = new Dev();
        devElidiana.setNome("Elidiana");
        devElidiana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devElidiana.getNome() + ": " + devElidiana.getConteudosInscritos());
        devElidiana.progredir();
        devElidiana.progredir();
        System.out.println("...");
        System.out.println("Conteúdos Inscritos " + devElidiana.getNome() + ": " + devElidiana.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devElidiana.getNome() + ": " + devElidiana.getConteudosConcluidos());
        System.out.println("XP: " + devElidiana.calcularTotalXp());

        System.out.println("--------------------------------------------------------------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devLucas.getNome() + ": " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("...");
        System.out.println("Conteúdos Inscritos " + devLucas.getNome() + ": " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devLucas.getNome() + ": " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
    }
}