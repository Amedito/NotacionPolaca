public class Pila{
    public Nodo tope;   
	public Pila(){
		tope=null;
	}
	public boolean vacia (){
	 	return tope == null;
	 }
	public void apilar(Object dato){
		     Nodo p=new Nodo(dato);
		     p.datos=dato;
		     p.siguiente=tope; 
		     tope=p;
	  }
    public Object desApilar(){
    	     //if(vacia()) return ' ';
    	     Object dat;   
    	     Nodo p=tope;
    	     dat=p.datos;  
		     tope=tope.siguiente;
		     p=null;
		     return dat;
	  }	 
    public void imprimir(){
	 	if (vacia()){
			System.out.println("La pila esta vacia...");
		}
		else{
			Nodo Actual=tope;
			do{ 
				System.out.print(Actual.getElemento().toString()+" ");	
				Actual=Actual.siguiente;
			}while(Actual != null);
			System.out.println();
		}
	 } 		   
}