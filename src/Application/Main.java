package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entitites.Employee;
import Entitites.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {
		
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> listEmployee = new ArrayList<>();
		
		System.out.print("Enter the number of employees:");
		int numberOfEmployees = sc.nextInt();
		System.out.println();
		
		for (int i = 1 ; i <= numberOfEmployees ; i++){
			
			System.out.println("Employee #" + i + "data:");
			System.out.print("Outsourced (y/n)?");
			char internalOrExternal = sc.next().toUpperCase().charAt(0);
			
			if(internalOrExternal == 'N') {
				
				System.out.print("The woker name:");
				String nameOfWoker = sc.next().toUpperCase();
				
				System.out.print("Horas:");
				int hoursOfWorker = sc.nextInt();
				
				System.out.print("Value per hours:");
				double valuePerHoursOfWorker = sc.nextDouble();
			
				
				Employee worker = new Employee( nameOfWoker ,hoursOfWorker, valuePerHoursOfWorker  );
				listEmployee.add(worker);
				
			}
			
			else if (internalOrExternal == 'Y') {
				
				System.out.print("The woker name:");
				String nameOfWoker = sc.next().toUpperCase();
				
				System.out.print("Horas:");
				int hoursOfWorker = sc.nextInt();
				
				System.out.print("Value per hours:");
				double valuePerHoursOfWorker = sc.nextDouble();
			
				System.out.print("Additional charge: ");
				double additionalChargeOfWorker = sc.nextDouble();
				
				
				Employee worker = new OutsourcedEmployee( nameOfWoker, hoursOfWorker, valuePerHoursOfWorker, additionalChargeOfWorker) ;
				listEmployee.add(worker);
			}
			
			else {
				
				
				i = i - 1;
			}
			
		}
		System.out.println();
		System.out.println("Payments: ");
        for (Employee emp : listEmployee){
        	
        	System.out.println();
    		System.out.println(emp.getName() + "-$" + String.format("%2f", emp.payment()));
			
		}
		
		
		
		sc.close();
		

	}


}


