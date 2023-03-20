package week3java;

/**
 * 14. Person
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods):
 * *Method named getFirstName without any parameters, it needs to return the value of the firstName
 * field.
 * *Method named getLastName without any parameters, it needs to return the value of the lastName
 * field.
 * *Method named getAge without any parameters, it needs to return the value of the age field.
 * *Method named setFirstName with one parameter of type String, it needs to set the value of the
 * firstName field.
 * *Method named setLastName with one parameter of type String, it needs to set the value of the
 * lastName field.
 * *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
 * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * *Method named isTeen without any parameters, it needs to return true if the value of the age field is
 * greater than 12 and less than 20, otherwise, return false.
 * *Method named getFullName without any parameters, it needs to return the full name of the person.
 * *In case both firstName and lastName fields are empty, Strings return an empty String.
 * *In case firstName is an empty String, return firstName.
 * *In case lastName is an empty String, return lastName.
 * To check if s String is empty, use the method isEmpty from the String class. For example,
 * firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
 * contain any characters.
 * TEST EXAMPLE
 * TEST CODE: (Write below code in to main method then check out put)
 * Person person = new Person();
 * person.setFirstName(""); // firstName is set to empty string
 * person.setLastName(""); // lastName is set to empty string
 * person.setAge(10);
 * System.out.println("fullName= " + person.getFullName());
 * System.out.println("teen= " + person.isTeen());
 * person.setFirstName("John"); // firstName is set to John
 * person.setAge(18);
 * System.out.println("fullName= " + person.getFullName());
 * System.out.println("teen= " + person.isTeen());
 * person.setLastName("Smith"); // lastName is set to Smith
 * System.out.println("fullName= " + person.getFullName());
 * OUTPUT
 * fullName=
 * teen= false
 * fullName= John
 * teen= true
 * fullName= John Smith
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods
 */

public class Person {
    String firstName;    //instance variable declared
    String lastName;     //instance variable declared
    int age;             //instance variable declared

    public String getFirstName() { //1st instance method no params and with return type
        return firstName;         //return first name
    }

    public String getLastName() { //2nd instance method with return type and no params
        return lastName;
    }

    public int getAge() {     //3rd instance method with return type and no params
        return age;
    }

    public void setFirstName(String firstName) {  //no return type with params method
        this.firstName = firstName;               //this is used to differentiate local variable and global instance variable
    }

    public void setLastName(String lastName) {   //no return type with params
        this.lastName = lastName;             //this used to differentiate local variable and instance variable
    }

    public void setAge(int age) {          //no return type with params method
        if (age < 0 || age > 100) {       //if condition true
            this.age = 0;               //this body will execute and this is used to differentiate local and instance variable
        } else {                        //if the above condition is false
            this.age = age;             //this body will execute
        }
    }

    public boolean isTeen() {           //with return type and no params method
        if (age > 12 && age < 20) {     //if the condition is true(&& operator used)
            return true;                //it would return true
        } else {                        //otherwise
            return false;              //it would return false
        }
    }

    public String getFullName() {        //with return type and no params instance method
        String fullName = "";            //string variable named fullName declared
        if (firstName.isEmpty()) {        //is empty method is used if someone hasn't typed anything
            fullName = lastName;         //if firstname is empty then last name would execute
        }
        if (lastName.isEmpty()) {         //if firstname would be empty
            fullName = firstName;
        }
        return fullName=firstName  + " " +lastName;  //if entered both this body will execute

    }

    public static void main(String[] args) {
        Person person = new Person();                         //constructor with object
        person.setFirstName("");                              //firstName is set to empty string
        person.setLastName("");                               //lastName is set to empty string
        person.setAge(10);                                      //set to 10 the age
        System.out.println("fullName= " + person.getFullName()); //print the full name= and it will call the method
        System.out.println("teen=" + person.isTeen());           //printing teen and call isteen method
        person.setFirstName("John");                            //Firstname set to 10
        person.setAge(18);                                      //age set to 18
        System.out.println("fullName= " + person.getFullName()); //fullname printed and called getfullname method
        System.out.println("teen= " + person.isTeen());           //teen printed and method called
        person.setLastName("Smith");                              //last name set to Smith
        System.out.println("fullName= " + person.getFullName());   //fullname executed according to set first name and last name
    }
}
