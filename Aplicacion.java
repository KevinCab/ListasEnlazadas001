
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nodo s=new Nodo("Casa",null);
		Nodo t=new Nodo("Maria Chun chun",null);
		Nodo u=new Nodo("Hola",null);
		
		SlinkedList lista1 = new SlinkedList();
		lista1.InsertarAlFinal(s);
		lista1.InsertarAlFinal(t);
		lista1.InsertarAlInicio(u);
				
		System.out.println(lista1.toString());
		System.out.println(lista1.BuscarDato("hola"));

	}

}
