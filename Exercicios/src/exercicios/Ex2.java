package exercicios;

import java.util.ArrayList;

public class Ex2 {
	ArrayList<Aluno> alunos;
	

	public Ex2(){
		alunos = new ArrayList();
		Inserir();
		visualizar();
	}
	
	public void Inserir(){
		
		Aluno al1 = new Aluno("Antonio",10,"917894563");
		alunos.add(al1);
		
		Aluno al2 = new Aluno("Beatriz",16,"961234567");
		alunos.add(al2);
		
		Aluno al3 = new Aluno("Carlos",14,"916541238");
		alunos.add(al3);
		
		Aluno al4 = new Aluno("Daniel",19,"927852214");
		alunos.add(al4);
		
		Aluno al5 = new Aluno("Erica",10,"914863201");
		alunos.add(al5);
	}
	
	public void visualizar(){
		
		for(int i=0;i<alunos.size();i++){
			Aluno alu = alunos.get(i);
			System.out.println("Nome: " + alu.getNome() + "\tNota: " + alu.getNota() + "\tContacto: " + alu.getContacto());
		}
		
	}
	
	public static void main(String[] args) {
		
		new Ex2();
		
	}

}
