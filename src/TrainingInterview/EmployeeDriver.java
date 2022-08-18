package TrainingInterview;

import ExceptionClasses.InvalidExperienceException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.stream.Collectors;

public class EmployeeDriver {
    EmployeeBean employeeBean;
    HashSet<EmployeeBean> hashSet = new HashSet();

    //Add Employess Details
    void addEmployeeDetail(int id,String name,String degisnation, String address, int experience,String Department)
    {
       employeeBean = new EmployeeBean();
       employeeBean.setId(id);
       employeeBean.setName(name);
       employeeBean.setAddress(address);
       employeeBean.setDesignation(degisnation);
       employeeBean.setExperience(experience);
       employeeBean.setDepartment(Department);
       hashSet.add(employeeBean);
        System.out.println("Employee "+name+" is successfully added ");
    }

    //Show All Employee Id and Name
    void showAllEmployeeDetail()
    {
        for(EmployeeBean hashSet1 : hashSet)
        {
            System.out.println("Id : "+hashSet1.getId()+"\nName : "+hashSet1.getName());
        }
    }

    //Show Only Managers Details
    void showAllManagers()
    {
        for(EmployeeBean employeeBean1 : hashSet)
        {
            if(employeeBean1.getDesignation().equals("Manager"))
            {
                System.out.println("Id : "+employeeBean1.getId()+"\nName : "+employeeBean1.getName()+"\nDepartment "+
                        employeeBean1.getDepartment());
            }
        }
    }

    //caller()
    void callerMethod(){
        System.out.println("0) Exit\n1) Add Employee\n2) Show All Employees\n3) Promotes Employee\n" +
                "4) Show All Managers");
        while(true) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice)
                {
                    case 0:
                        System.exit(0);
                        break;
                    case 1:
                        this.takeInput(bufferedReader);
                        break;
                    case 2:
                        this.showAllEmployeeDetail();
                        break;
                    case 3:
                        this.promotesEmployee(bufferedReader);
                        break;
                    case 4:
                        this.showAllManagers();
                        break;

                    default:
                        System.out.println("Wrong Input");
                }
            }catch(IOException ioException)
            {
                ioException.printStackTrace();
            }
        }




    }
    void takeInput(BufferedReader bufferedReader) throws IOException
    {
        System.out.println("Enter Employee Id Between 1000 - 2000");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Employee Name");
        String name = bufferedReader.readLine();
        System.out.println("Enter Employee Address");
        String address =bufferedReader.readLine();
        System.out.println("Enter Employee Designation,");
        String designation = bufferedReader.readLine();
        System.out.println("Enter Employee Experience");
        int experience = Integer.parseInt(bufferedReader.readLine());
        System.out.println("Enter Employee Department");
        String department = bufferedReader.readLine();
        this.addEmployeeDetail(id,name,designation,address,experience,department);

    }

    void promotesEmployee(BufferedReader bufferedReader)throws IOException
    {
        System.out.println("Enter id of Employee whom you want to promote");
        int id = Integer.parseInt(bufferedReader.readLine());
        if(!employeeBean.getHashSet().contains(id))
        {
            EmployeeBean obj = hashSet.stream()
                    .filter(ele -> ele.equals(id))
                    .findFirst()
                    .orElse(null);

             for(EmployeeBean employeeBean1 : hashSet)
             {
                 try {
                     if (employeeBean.getHashSet().contains(id) && obj.getExperience() > 5) {
                         obj.setDesignation("Manager");
                     } else {
                         throw new InvalidExperienceException();
                     }
                 }catch(InvalidExperienceException invalidExperienceException)
                 {
                     System.out.println(invalidExperienceException.getMessage());
                 }
             }
        }
    }
    public static void main(String[] args) {
      EmployeeDriver employeeDriver = new EmployeeDriver();
      employeeDriver.callerMethod();
    }
}
