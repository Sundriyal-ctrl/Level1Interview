package TrainingInterview;

import ExceptionClasses.DuplicateEmployeeDetailsException;
import ExceptionClasses.InvalidEmployeeIdException;

import java.util.HashSet;
import java.util.NoSuchElementException;

public class EmployeeBean {


    static private HashSet<Integer> hashSet = new HashSet();
    private int id;
    private String name;
    private String address;
    private String designation;
    private int experience;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;
    public int getIdd(int id) {
        return id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id,HashSet<EmployeeBean> hashSet)throws DuplicateEmployeeDetailsException,InvalidEmployeeIdException {
        try {
            if (id >= 1000 && id <= 2000)
            {
                try {
                    EmployeeBean obj=null;
                    try {
                          obj= hashSet.stream()
                                  .filter(ele -> ele.getId()==id)
                                  .findFirst().get();
                        if (obj.getId()==id)
                            throw new DuplicateEmployeeDetailsException();
                      }catch(NoSuchElementException  noSuchElementException){
                        this.id = id;

                    }
                }catch(DuplicateEmployeeDetailsException  duplicateEmployeeDetailsException)
                {
                   throw new DuplicateEmployeeDetailsException();
                }


            }
            else
                throw new InvalidEmployeeIdException();
        }catch(InvalidEmployeeIdException invalidError)
        {
            throw new InvalidEmployeeIdException();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {

        this.designation = designation;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public HashSet<Integer> getHashSet() {
        return hashSet;
    }


}
