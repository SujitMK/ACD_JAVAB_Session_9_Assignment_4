package empSortUsingSalaryComparatorPKG;   // declared a package

import java.util.Comparator;  // Importing comparator

public class MySalaryComp  implements Comparator<EmployeeRecords>{    // declared and defined a class that implements Comaparator
 
    public int compare(EmployeeRecords e1, EmployeeRecords e2)            // overriden compare method
    {
        if(e1.getSalary() > e2.getSalary())        // comparing salary using if condition
        { 
            return 1;                 // returing true if condition satisfies
        } 
        else if (e1.getSalary() == e2.getSalary())  // comparing salary using else if condition
        {
            return e1.getName().compareTo(e2.getName());  // returning employee name in alphabetical order
        }
        else               // else condition
        {
            return -1;
        }
    }
}