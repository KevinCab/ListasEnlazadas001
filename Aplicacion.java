
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo s=new Nodo("Casa",null);
		Nodo t=new Nodo("Maria Chun chun",null);
		Nodo u=new Nodo("Hola",null);
		Nodo v=new Nodo("Asus",null);
		
		SlinkedList lista1 = new SlinkedList();
		lista1.InsertarAlFinal(s);
		lista1.InsertarAlFinal(t);
		lista1.InsertarAlInicio(u);
		lista1.InsertarAlInicio(v);
				
		System.out.println(lista1.toString());
		System.out.println(lista1.BuscarDato("hola"));
		
		System.out.println("\n\n");
		lista1.EliminarPrimerNodo();
		System.out.println(lista1.toString());
		
		System.out.println("\n\n");
		lista1.EliminarUltimoNodo();
		System.out.println(lista1.toString());

		
	}
}

