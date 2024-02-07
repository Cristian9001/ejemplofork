package aaaa;

public class Arrays {
	
	public static void mostrar(int n[], int tam) {
		int indice;
		for(indice=0; indice<tam;indice++) {
			System.out.println("nota alumno" +indice+ ":"+n[indice]);
		}
	}
	
	
	
	public static void main(String args) {
		int notas[]= {2,5,7,6,9};
		mostrar(notas,5);
		System.out.println("hola");
	}
	
	public static void mostrar1(int n[]) {
		int indice;
		for(indice=0; indice<n.length;indice++) {
			System.out.println("nota alumno" +indice+ ":"+n[indice]);
		}
	}
		public static void incrementar(int n[]) {
			int i;
			for(i=0;i<n.length;i++) {
				n[i]=n[i]+1;
			}
		
	}
		
		public static void mostrar() {
			int notas[]= {2,5,7,6,9};
			mostrar(notas,5);
			incrementar(notas);
			mostrar1(notas);
		}

}
