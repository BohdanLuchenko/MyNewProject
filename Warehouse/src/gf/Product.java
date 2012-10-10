package gf;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	
	String name = "Potato";
	boolean availability = true; 
	int calorieFoods = 150; //in 100 grams of product.
	String origin = "plant"; //animal, plant, organic, drinks. nutritionalSupplements. For each one write method.
	double quantityInWarehouse = 15.7;
	
	
	public String getName(){
		return name;
	}
	
	@XmlElement
	public void setName(String name){
		this.name = name;
	}
	
	public Boolean getAvailability(){
		return availability;
	}
	
	@XmlElement
	public void setAvailability(Boolean availability){
		this.availability = availability;
	}
	
	public int getCalorieFoods(){
		return calorieFoods;
	}
	
	@XmlElement
	public void setCalorieFoods(int calorieFoods){
		this.calorieFoods = calorieFoods;
	}
	
	public String getOrigin(){
		return origin;
	}
	
	@XmlElement
	public void setOrigin(String origin){
		this.origin = origin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void adderOfProduct(){
		Scanner  scanner = new Scanner(System.in);
		System.out.println("-=: The form for adding the product to the warehouse :=-/n ");
		System.out.println("Please, write the name of product: ");
		name = scanner.nextLine();		
		System.out.println(name);
		System.out.println("Please, write the calories of the " + name + ":");
		calorieFoods = scanner.nextInt();	
		System.out.println(calorieFoods);
		System.out.println("Please, write the origin of the " + name + " (Samples: animal, plant, organic, drink, nutritional supplement) -> ");
		origin = scanner.nextLine();
		System.out.println(origin);
		System.out.println("Please, write the quantity of the " + name + " for warehouse: ");
		quantityInWarehouse = scanner.nextInt();	
		System.out.println(quantityInWarehouse);
		
	}*/
		
	 /*public Map<String, Object> createAnswerMap() {
		  UserInterface newObj = new UserInterface();
		  Map<String, Object> answersMap = new HashMap<String, Object>();
		  answersMap.put(name, newObj);
		  
		  return answersMap;
		 }*/

}
