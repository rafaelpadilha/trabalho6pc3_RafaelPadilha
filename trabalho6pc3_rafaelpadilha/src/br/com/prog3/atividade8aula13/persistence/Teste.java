package br.com.prog3.atividade8aula13.persistence;

import br.com.prog3.atividade8aula13.model.Aluno;

public class Teste {
	public static void main(String[] args) {
		// Connection con = ConnectionFactory.getConnection();
		/*
		 * AlunoDaoImp ad = new AlunoDaoImp(); Aluno a = new Aluno(); a.setMatricula(6);
		 * a.setNome("Maria Paula"); a.setRA("Taguatinga");
		 * System.out.println(ad.save(a));
		 * 
		 * }
		 */
		/*
		 * AlunoDaoImp ad = new AlunoDaoImp(); Aluno a = new Aluno(); a.setMatricula(6);
		 * a.setNome("Maria Paula Almeida"); a.setRA("Taguatinga Norte");
		 * System.out.println(ad.update(a));
		 */

		/*
		 * AlunoDaoImp ad = new AlunoDaoImp(); System.out.println(ad.delete(6));
		 */
		AlunoDaoImp ad = new AlunoDaoImp();
		Aluno aluno = ad.findByMatricula(2);
		if (aluno != null) {
			System.out.println(aluno.getNome());
		}
		/*
		 * List<Aluno> alunos = ad.list(); if (alunos != null) { for (Aluno al : alunos)
		 * { System.out.println("Aluno: " + al.getNome()); } }
		 */
	}
}
