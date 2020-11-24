package Controllers;

import Models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AddEmployee {

    String line =null;
    public List<Employee> readerEmployee(){
        List<Employee> employeeList = new ArrayList<>();
        try {
            Employee employee;
            BufferedReader bufferedReader = new BufferedReader(new FileReader( new File("src/Data/Employee.csv")));
             bufferedReader.readLine();
             while ((line=bufferedReader.readLine()) != null){
                 String[] str = line.split(",");
                 employee = new Employee(str[0] , str[1] , str[2]);
                 employeeList.add(employee);
             }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employeeList;
    }
    public Map<Integer, Employee> listEmployee(){
        List<Employee> employeeList = readerEmployee();
        Map<Integer, Employee> map = new TreeMap<>();
        for (int i=0; i<employeeList.size();i++) {
            map.put(i , employeeList.get(i));
        }
       return map;
    }
}
