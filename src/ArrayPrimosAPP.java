import javax.swing.JOptionPane;

public class ArrayPrimosAPP {

	public static void main(String[] args) {
		//INDICAR EL TAMAÑO DEL ARRAY
		String numTexto = JOptionPane.showInputDialog("Introduce el tamaño del array");
		int num[] = new int[Integer.parseInt(numTexto)];
		
		//INVOCAR LAS FUNCIONES
		rellenarPrimoRandom(num, 1, 10);
		
		mostrarValores(num);
		
		//MOSTRAR EL PRIMO MAYOR
		int primoMayor = mayor(num);
		System.out.println("El primo mayor es el " + primoMayor);
	}
	
	public static void rellenarPrimoRandom(int lista[], int num1, int num2) {
		
		int i = 0;
		
		while(i < lista.length) {
			int num = ((int)Math.floor(Math.random() * (num1 - num2) + num2)); 
			if(Primo(num));
				lista[i] = num;
				i++;
		}
	}
	
	public static boolean Primo(int num) {
		
		if(num <= 1) {
			return false;
		}else {
			int valor;
			int contador = 0;
			valor = (int)Math.sqrt(num);
			
			for(; valor > 1; valor++) {
				if(num % valor == 0) {
					contador += 1;
				}
			}
			return contador < 1;
		}
	}   

	public static void mostrarValores(int lista[]){
		
		for(int i=0; i < lista.length; i++){
			System.out.println("En el indice " + i + " esta el valor " + lista[i]);
		}
	}
 
	public static int mayor(int lista[]){
		
		int mayor=0;
		
		for(int i=0; i < lista.length; i++){
			if(lista[i] > mayor){
				mayor = lista[i];
			}
		}
		return mayor;
	}
} 
