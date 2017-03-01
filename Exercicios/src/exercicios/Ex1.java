package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	static ArrayList<Object> valores = new ArrayList<Object>();
	static Scanner sc = new Scanner(System.in);
	
	private static void Mostrar() {
	
		for (int i=0; i<valores.size();i++) {
		System.out.println(valores.get(i));
		}
		
	}//final Mostrar
	
	
	private static void Inserir(){
		Object entered;
		System.out.println("O que quer introduzir? ");
		entered = sc.next();
		valores.add(entered);
	}
	
	public static void main(String[] args) {
		
		valores.add('b');
		valores.add(3);
		valores.add("Carruagens");
		valores.add(8.56);
		valores.add("caixas de armazenamento");
		
		System.out.println("Os valores que estão na ArrayList são:"+valores);
		Mostrar();
		Inserir();
		Mostrar();
	}

}
