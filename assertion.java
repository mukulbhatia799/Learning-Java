public class assertion {
    public static void main(String[] args) {
        int age = 139;
        age(age);
        System.out.println("error not occured!");
    }
    public static void age(int age)
    {
        assert(age < 130) : "Error occured!!!";
        System.out.println("Your age is " + age);
    }
}

/*
 1. javac filename.java
 2. java -ea classname. After this, is the assertion condition is false then the assertion error will occur else the code will run as usual.

 */

/*
assert(false) : "This will be executed if false";
assert(true) : "This will not be executed if true";
*/

/*
 junit is a 3rd party api which is used for unit testing.
 It is not the part of java jdk.

 nowadays, most of the tools are coded in golang.
 */

 /*
  mawan repo :- 
  dependencies
  springboot
  pom.xml
  */

  /*
   servlet is not outdated.
   */