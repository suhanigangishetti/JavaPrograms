import java.util.*; 
/** 
 * Real-world use case: Retail / warehouse management systems automatically 
 * flag products that need to be reordered when stock falls below a 
 * configured threshold. 
 */ 
public class T61_InventoryReorderAlert {    
	static class Product {        
		String name;        
		int quantityInStock;        
		int reorderThreshold;        
		
		Product(String name, int quantityInStock, int reorderThreshold) {            
			this.name = name;            
			this.quantityInStock = quantityInStock;            
			this.reorderThreshold = reorderThreshold;        
			}    }    
	public static List<String> findProductsToReorder(Product[] inventory) {        
		List<String> reorderList = new ArrayList<>();        
		for (Product p : inventory) {            
			if (p.quantityInStock <= p.reorderThreshold) {                
				reorderList.add(p.name + " (in stock: " + p.quantityInStock                        
						+ ", threshold: " + p.reorderThreshold + ")");            
				}        }        
		return reorderList;    }   
	public static void main(String[] args) {        
		Product[] inventory = {                
				new Product("USB-C Cable", 12, 20),                
				new Product("Wireless Mouse", 45, 15),                
				new Product("Laptop Stand", 3, 10),                
				new Product("HDMI Adapter", 8, 8)        };        
		List<String> toReorder = findProductsToReorder(inventory);        
		System.out.println("Products that need reordering:");        
		for (String item : toReorder) {            
			System.out.println(" - " + item);        
			}    } }