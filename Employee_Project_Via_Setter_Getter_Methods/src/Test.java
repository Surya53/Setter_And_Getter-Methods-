
/*
  Question :
    Develop a program to create RWO Employee in PW.
    create Employee object with the properties eno,ename,esal,dept;
    
    1)Provide access to above properties for read & modifying 
       their values only via setter and getter methods.
    2)Initialize the above properties  via setter methods.
    3)Display all the properties by display method
    4)Increase the salary of an employee by 20%.
    5)Display updated salary of this employee.
    
   Answers :
   First we will analyze which topic we have to use for each step next 
   we will jump into the programming part.
   
   1)Access means permission when we get that word in java then 
   definetly your mind want to goes Access specifer topic.
    To access the above properties for reading and modifying
     only through setter and getter methods means we want declare
      all variables as private.
   2)By setter and getter methods only
   3)Bcoz instead if use getter method it is dynamic nature and code is not 
   readable it is suggestiable when we want to display only one method.
   but here to display all values we will use display() method.
   
  4)Math logic and execution flow change here be carefull.
  5)Use get() here not display().
    
 */
public class Test {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.display();
      
		e.setEno(101);
	    e.setEname("Surya");
	    e.setEsal(50000);
	    e.setDept("CSE");
		
	    
	    e.display();
	    //here  direct access is not possible bcoz of private dec.
	    // sal = sal + sal * 20/100;
        //Assignment operator is setting.
	    e.setEsal(e.getEsal()+e.getEsal()*20/100);
	    
	   System.out.println("Updated Salary "+e.getEsal());
	   
	  e.display();
	}

}
