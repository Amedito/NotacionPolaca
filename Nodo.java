public class Nodo{
  	 public Object datos; 
     public Nodo siguiente;
     public Nodo anterior;
     public  Nodo (Object valor){ 
	 	datos =valor;
	  	siguiente =anterior= null;
	 }
	 public Object getElemento(){return datos;}
	 public Nodo getSig(){return siguiente;}
	 public Nodo getAnt(){return anterior; }
}