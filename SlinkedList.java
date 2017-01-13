public class SlinkedList {

	protected Nodo head;
	protected long size;
	
	public SlinkedList(){
		head=null;
		size=0;		
	}
	
	public void InsertarAlFinal(Nodo s){
		if(head==null){
			head= s;
			size=1;
		}
		else{
			Nodo aux;
			aux= head;
			while(aux.getEnlace()!=null){
				aux=aux.getEnlace();
			}
			aux.setEnlace(s);
			size=size+1;
		}
	}
	
	public void InsertarAlInicio(Nodo s){
		if(head==null){
			head= s;
			size=1;
			}
	else{
		Nodo aux=head;
		s.setEnlace(aux);
		head=s;
		size=size+1;
		}	
	}
	
	public Nodo BuscarDato(String clave){
		Nodo aux=head;	
		if(clave.equalsIgnoreCase(aux.getDato()))
			return aux;			
		while(aux.getEnlace()!=null){
			if(clave.equalsIgnoreCase(aux.getEnlace().getDato()))
				return aux;
			aux=aux.getEnlace();
		}	
		return null;
	}

	@Override
	public String toString() {
		String lista="";
		Nodo aux=head;
		lista+=aux.getDato()+"\n";
		while(aux.getEnlace()!=null){
			lista+=aux.getEnlace().getDato()+"\n";
			aux=aux.getEnlace();
		}
		
		lista+="TamaÃ±o de Lista: "+size;
		return lista;
	}
	
}
