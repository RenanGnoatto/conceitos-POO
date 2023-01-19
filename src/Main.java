import java.awt.print.Book;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Decricao do curso java");
		curso1.setCargaHoraria(4);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("Decricao do curso JS");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descricao da mentoria de java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcampo Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devRenan = new Dev();
		devRenan.setNome("Renan");
		devRenan.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Renan: " + devRenan.getConteudosInscritos());
		devRenan.progredir();
		System.out.println("-------");
		System.out.println("Conteúdos ainda Inscritos Renan: " + devRenan.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Renan: " + devRenan.getConteudosConcluidos());
		System.out.println("XP: " + devRenan.calcularTotalXP());
		
		System.out.println();
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Joao: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		System.out.println("-------");
		System.out.println("Conteúdos ainda Inscritos Joao: " + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Joao: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXP());
	}

}
