import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class week4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> employeeNames = new ArrayList<String>();
		//adding employees 
		employeeNames.add("James Bond");
		employeeNames.add("Inspector Gadget");
		employeeNames.add("Mike Tyson");
		employeeNames.add("Peyton Manning");
		employeeNames.add("Bruce Wayne");
		
		HashSet<Integer> ids = new HashSet<Integer>();
		//adding ids
		ids.add(007);
		ids.add(212);
		ids.add(574);
		ids.add(317);
		ids.add(911);
		
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		int i = 0;
		for( Integer id: ids) {
			employeeMap.put(i, employeeNames.get(i));
			i++;
		}
		
		for(int key : employeeMap.keySet()) {
			System.out.println("Value for key " + key + " is " + employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for(Integer id: ids) {
			idsBuilder.append(id);
			idsBuilder.append("-");
		}
		System.out.println(idsBuilder); 
		
		StringBuilder namesBuilder = new StringBuilder();
		for(String name: employeeNames) {
			namesBuilder.append(name);
			namesBuilder.append(" ");
		}
		System.out.println(namesBuilder);
		
	}

}
