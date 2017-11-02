package empSortUsingSalaryComparatorPKG;                // declared package

//this program inserts EWmployee objects into  treeset with name and salary, then prints emp info by sorting based on the salary and name if the salary is same for the employees

import java.util.TreeSet;         // Importing Treeset 

public class EmpSortUsingSalaryComparatorJP  {         //declared and defined class
 
    public static void main(String a[]){          // main method
     
        System.out.println();        // printing a blank line
        
        TreeSet<EmployeeRecords> salComp = new TreeSet<EmployeeRecords>(new MySalaryComp());         //Creating treeset object using salary comparator (int comparison)
        
        salComp.add(new EmployeeRecords("Sujit",7000));         // adding employee object into treeset
        salComp.add(new EmployeeRecords("Veda",4000));      // adding employee object into treeset
        salComp.add(new EmployeeRecords("Shruti",5000));       // adding employee object into treeset
        salComp.add(new EmployeeRecords("Ajay",5000));      // adding employee object into treeset
        salComp.add(new EmployeeRecords("Ajit",4000));      // adding employee object into treeset
        
        System.out.println("Employee Record After Sort Based On The Salary Are : ");   // printing info
        System.out.println();
        
        for(EmployeeRecords e:salComp){             // using for each loop
            System.out.println(e);       // printing employee details
        }
    }
}