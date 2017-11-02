package empSortUsingSalaryComparatorPKG;            // declared package 

public class EmployeeRecords {                                // declared and defined a class
    
   private String name;           // declared a private String variable 
   private int salary;               // declared a private int variable 
    
   public EmployeeRecords(String n, int s){             // defined a parameterized constructor
       this.name = n;                // assigning a local variable value to a global variable
       this.salary = s;              // assigning a local variable value to a global variable
   }
    
   public String getName() {               // defined getter method
       return name;                  // returning emp name
   } 
   public void setName(String name) {               // defined a setter method
       this.name = name;          // assigning a local variable value to a global variable
   }
   public int getSalary() {                      // defined getter method
       return salary;                       // returning emp salary
   }
   public void setSalary(int salary) {            // defined a setter method
       this.salary = salary;                // assigning a local variable value to a global variable
   }
   public String toString(){              // defined a tostring method
       return "Name: "+this.name+"       Salary: "+this.salary;       // returning emp name and salary
   }
}