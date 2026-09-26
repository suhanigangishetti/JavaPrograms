import java.util.*; 
/** * Real-world use case: HR systems validate that employee IDs imported from * a payroll spreadsheet are unique before processing payroll. */ 
public class T63_DuplicateEmployeeIdDetector 
{    
	public static List<Integer> findDuplicateIds(int[] employeeIds) {        
		Set<Integer> seen = new HashSet<>();        
		Set<Integer> duplicates = new LinkedHashSet<>();        
		for (int id : employeeIds) {            
			if (!seen.add(id)) {                
				duplicates.add(id);            
				}        
			}        
		return new ArrayList<>(duplicates);    
		}    
	public static void main(String[] args) {        
		int[] employeeIds = {1001, 1002, 1003, 1002, 1004, 1001, 1005};        
		List<Integer> duplicates = findDuplicateIds(employeeIds);        
		if (duplicates.isEmpty()) {            
			System.out.println("No duplicate employee IDs found.");        
			} else {            
				System.out.println("Duplicate employee IDs detected: " + duplicates);        
				}    
		} 
	}