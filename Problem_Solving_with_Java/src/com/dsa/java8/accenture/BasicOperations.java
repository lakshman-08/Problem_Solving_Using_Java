package com.dsa.java8.accenture;
import java.util.*;
import java.util.stream.Collectors;
public class BasicOperations {

	public static void main(String[] args) {
		List<Integer> listOfValues=Arrays.asList(10,55,33,23,60,4,5,10,33);
		List<Integer> squareOfEvenNum=listOfValues.stream().filter(i->i%2==0).map(i->i*i).sorted().collect(Collectors.toList());
		
		int sumOfAllNum=listOfValues.stream().reduce(0,Integer::sum);
		//System.out.println(sumOfAllNum);
		
		double averageOfNum=listOfValues.stream().filter(i->i>10).mapToDouble(i->i).average().orElse(0);
		//System.out.println(averageOfNum);
		
		int max=listOfValues.stream().filter(i->i%2!=0).sorted(Comparator.reverseOrder()).distinct().findFirst().orElse(null);
		//System.out.println(max);
		
		List<Integer> removeDuplicates=listOfValues.stream().distinct().collect(Collectors.toList());
		//System.out.println(removeDuplicates);
		
		List<Integer> sortElements=listOfValues.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
		//System.out.println(sortElements);
		
		LinkedList<Integer> linkedlist=listOfValues.stream().distinct().collect(Collectors.toCollection(LinkedList::new));
		
		List<Integer> orders=Arrays.asList(100000,200000,60000,25000);
		
		boolean matchOne=orders.stream().anyMatch(n->n>10000);
		//System.out.println(matchOne);
		
		//Given List<Employee> with name, dept, salary, use Streams to:Group by department
       //For each department, find the employee with the highest salary (return Map<String, Optional<Employee>> or Map<String, Employee>).
		
		 List<Employee> employees = Arrays.asList(
	                new Employee("John", "IT", 60000),
	                new Employee("David", "IT", 75000),
	                new Employee("Alex", "IT", 55000),

	                new Employee("Sara", "HR", 7000),
	                new Employee("Priya", "HR", 2000),

	                new Employee("Mike", "Finance", 65000),
	                new Employee("Rita", "Finance", 68000),
	                new Employee("Sam", "Finance", 72000)
	        );
		 
		 Map<String,List<Employee>> getDepartment=employees.stream().collect(Collectors.groupingBy(Employee::getDept));
		 
		 Map<String,String> highestSalaryEmp=new HashMap<>();
		 
		 for(String getDep:getDepartment.keySet())
		 {
			 String getEmployeeNames=getDepartment.get(getDep).stream().max(Comparator.comparing(Employee::getSalary)).get().getName();
			 highestSalaryEmp.put(getDep, getEmployeeNames);
		 }
		 
		 System.out.println(highestSalaryEmp);
		 
		 int[] arr= {10,5,8,9,7,6,5,4};
		 
		 List<Integer> stringList = Arrays.stream(arr).boxed().collect(Collectors.toList());
		 
		 
		 //Average salary by department
		 Map<String,Double> averageofEmployees=employees.stream().
				 collect(Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary)));
				 
				 
		System.out.println(averageofEmployees);
		
		//Count employees per department
		Map<String,Long> countOfEmployees=employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
		
		System.out.println(countOfEmployees);
		
		//Partitioning by condition
		Map<Boolean,List<String>> paritionEmployees=employees.stream().collect(Collectors.partitioningBy(n->n.getSalary()>50000,
				Collectors.mapping(Employee::getName,Collectors.toList())));
		
		System.out.println(paritionEmployees);
		
		//Find 2nd highest salary
		Employee e=employees.stream().sorted(Comparator.comparingInt(Employee::getSalary).reversed()).distinct().skip(1).findFirst().orElse(null);
		System.out.println(e.toString());
		
		//Join employee names
		String listOfEmp=employees.stream().filter(x->x.getSalary()>50000).map(x->x.getName()).collect(Collectors.joining(","));
		System.out.println(listOfEmp);
		 
		 
		


	}

}

class Employee {
    private String name;
    private String dept;
    private int salary;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDept() { return dept; }
    public int getSalary() { return salary; }
    
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
