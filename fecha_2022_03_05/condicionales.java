package fecha_2022_03_05;

public class condicionales {

	public static void main(String[] args) {
		
//		verificar si es mayor de edad
		int edad = 18;
		if(edad >= 18) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
		
		
//		verificar si un numero x, esta en el rango [a,b]
//		and: &&           or:||         not: !		
		
		int x = 20;
		int a = 10,b = 30;
		if(a <= x || x <= b) {
			System.out.println("Esta en el rango");
		}else {
			System.out.println("No esta en el rango");
		}
		
		
//		color->  1: rojo    2: amarillo      3: verde
		int color = 3;
		
		if(color == 1) {
			System.out.println("rojo");
		}else if(color == 2) {
			System.out.println("amarillo");
		}else {
			System.out.println("verde");
		}
		
		
//		switch case
		int dia = 465498;
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;		
		default:
			System.out.println("error!");
			break;
		}
		
	}

}
