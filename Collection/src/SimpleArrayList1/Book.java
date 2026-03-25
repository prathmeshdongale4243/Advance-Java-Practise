package SimpleArrayList1;

public class Book {
	String name;
	float prise;
	Book(String name,float prise){
		this.name=name;
		this.prise=prise;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public float getPrise() {
		return prise;
	}
	public void setPrise(float prise) {
		this.prise = prise;
	} 
public String toString() {
	return "Book Name="+name+" Prise="+prise;
}
}
