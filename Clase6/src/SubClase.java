
public class SubClase extends SuperClase {
	int atributo;
	
	
	public void Imprimir(){
		super.Imprimir();
		System.out.println("Soy subclase");
		System.out.println(atributo);
	}
}
