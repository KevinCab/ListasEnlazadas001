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

	@Override
	public String toString() {
		String lista="";
		Nodo aux=head;
		lista+=aux.getDato()+"\n";
		while(aux.getEnlace()!=null){
			lista+=aux.getEnlace().getDato()+"\n";
			aux=aux.getEnlace();
		}
		
		lista+="Tamaño de Lista: "+size;
		return lista;
	}
	
}
