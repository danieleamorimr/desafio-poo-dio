import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootecamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniele = new Dev();
        devDaniele.setNome("Daniele");
        devDaniele.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daniele" + devDaniele.getConteudoInscritos());
        devDaniele.progredir();
        devDaniele.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Daniele" + devDaniele.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Daniele" + devDaniele.getConteudoConcluidos());
        System.out.println("XP:" + devDaniele.calcularTotalXp());

        System.out.println("-------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria" + devMaria.getConteudoInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria" + devMaria.getConteudoInscritos());
        System.out.println("Conteúdos Concluídos Maria" + devMaria.getConteudoConcluidos());
        System.out.println("XP:" + devMaria.calcularTotalXp());

    }
    
}
