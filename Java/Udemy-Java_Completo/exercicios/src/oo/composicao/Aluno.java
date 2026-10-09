package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	// quando um objeto é final o seu endereço de memória é imutável, mas o conteúdo
	// dele é variável
	final List<Curso> cursos = new ArrayList<>();

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	Curso obterCursoPorNome(String nome) {
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}

		return null;
	}

	public String toString() {
		return nome;
	}
}
