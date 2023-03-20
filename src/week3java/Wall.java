package week3java;

/**
 * 15. Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * * Method named getWidth without any parameters, it needs to return the value of width field.
 * * Method named getHeight without any parameters, it needs to return the value of height field.
 * * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * * Method named getArea without any parameters, it needs to return the area of the wall.
 * TEST EXAMPLE
 * → TEST CODE: (Write bellow code into main method and run and compare result with OUTPUT)
 * Wall wall = new Wall (5, 4);
 * System.out.println("area= " + wall.getArea());
 * wall.setHeight(-1.5);
 * System.out.println("width= " + wall.getWidth());
 * System.out.println("height= " + wall.getHeight());
 * System.out.println("area= " + wall.getArea());
 * → OUTPUT:
 * area= 20.0
 * width= 5.0
 * height= 0.0
 * area= 0.0
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 5 methods and 2 constructors.
 */
public class Wall {
    double width;                                //declared variable
    double height;

    public Wall() {                              //1st constructor in a class without parameters

    }

    public Wall(double width, double height) { //2nd constructor with 2params
        if (width < 0) {                           //condition of width if it's less than 0
            this.width = 0;                      //this keyword to use differentiate betweeen local and class variable
        } else {                             //condition of height if it's less than 0
            this.width = width;
        }
        if (height < 0) {                      //condition
            this.height = 0;                  //this to differentiate local and instance variable
        } else {
            this.height = height;           //this will execute if condition is false
        }


    }

    public double getWidth() {            //instance method with return type no params
        return width;
    }

    public double getHeight() {          //2nd instance method without any params ans with return type

        return height;
    }

    public void setWidth(double width) {  //3rd instance method with params and no return type
        if (width < 0) {                           //condition of width if it's less than 0
            this.width = 0;
        } else {                        //condition of height if it's less than 0
            this.width = width;
        }

    }


    public void setHeight(double height) {            //4th instance method with return type and no params
        if (height < 0) {                             //condition
            this.height = 0;                          //if condition true this will execute and this is used to differentiate variables
        } else {
            this.height = height;             //if condition false then this will execute

        }

    }

    public double getArea() {                      //5th instance method with return type and no params
        return width * height;                    //logic returned
    }

        public static void main (String[]args){          //main method
        Wall wall= new Wall(5,4);              //constructor
            System.out.println("area=" +wall.getArea());   //printed area and method called
            wall.setHeight(-1.5);                          //set height to -1.5
            System.out.println("width=" +wall.getWidth()); //print width and called width method
            System.out.println("height="+wall.getHeight()); //print height and called get height method
            System.out.println("area" + wall.getArea());    //print area and called getarea method

        }
    }
