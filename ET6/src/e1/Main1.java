package e1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int valor;
		int hora1;
		int minuto;
		Scanner sc = new Scanner(System.in);
		Hora hora = new Hora(0, 0);
		System.out.println("Introduzca las horas");
		valor = sc.nextInt();
		hora1 = valor;
		if (!hora.setHora(valor)) {
			System.out.println("Error al poner las horas");
		}
		System.out.println("Introduzca los minutos");
		valor = sc.nextInt();
		minuto = valor;
		if (!hora.setMinutos(valor)) {
			System.out.println("Error al poner los minutos");
		}
		System.out.println(hora.toString());
		System.out.println("Al incrementar");
		hora.inc();
		System.out.println(hora.toString());
		HoraExacta horaexacta = new HoraExacta(hora1, minuto + 1, 0);
		System.out.println("Introduzca los segundos");
		valor = sc.nextInt();
		if (!horaexacta.setSegundo(valor)) {
			System.out.println("Error al poner los segundos");
		}
		System.out.println(horaexacta.toString());
		horaexacta.inc();
		System.out.println("Al incrementar");
		System.out.println(horaexacta.toString());
		sc.close();
	}

}
