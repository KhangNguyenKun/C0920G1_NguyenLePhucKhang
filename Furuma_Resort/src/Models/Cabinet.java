package Models;

import Controllers.AddEmployee;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Cabinet {
    public static Stack<Employee> employeeStack = new Stack<>();
    static {
        AddEmployee addEmployee = new AddEmployee();
        for (Map.Entry<Integer, Employee> employeeEntry: addEmployee.listEmployee().entrySet()){
            employeeStack.push(employeeEntry.getValue());
        }
    }
    public static void find(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the name of employee to find");
        String name = scanner.nextLine();
        Employee employee = findHSNV(name);
        if (employee!= null){
            System.out.println("File employee:" + employee.toString());
        } else {
            System.out.println("Dont find");
        }
    }
    public static Employee findHSNV(String name){
        Employee employee = null;
        while (!employeeStack.isEmpty()){
            employee = employeeStack.pop();
            if (employee.getName().equals(name)){
                return employee;
            }
        }
        return employee;
    }
}
