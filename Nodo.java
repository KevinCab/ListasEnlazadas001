public class Nodo {
	private String dato;
	private Nodo enlace;
	
	public Nodo(String s, Nodo n){
		dato=s;
		enlace=n;
	}
	
	public String getDato(){
		return dato;
	}
	
	public Nodo getEnlace(){
		return enlace;
	}
	
	public void setDato(String newDato){
		dato=newDato;
	}
	
	public void setEnlace(Nodo newEnlace){
		enlace= newEnlace;
	}

	@Override
	public String toString() {
		return "Nodo [dato=" + dato + "]";
	}
	
}
