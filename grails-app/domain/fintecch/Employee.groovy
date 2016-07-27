package fintecch

class Employee {

    String employeeName;
    Integer age;
    static constraints = {
        employeeName(blank: false,nullable: false)
        age(blank: false)
        age validator: {
            if(age<18)
            {
                return "the employee is minor"
            }
        }
    }
}
