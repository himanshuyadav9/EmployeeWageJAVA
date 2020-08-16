public class EmpWageComputation
{
      //constants
     public static final int FULL_TIME_EMP= 1;
     public static final int PART_TIME_EMP=2;
     public static final int EMP_RATE_PER_HOUR=20;
                             
     public static void main(String[]args)
     {
      System.out.println("welcome to employee wage computation program ");
      
        //variables
       int empHrs=0;
       int empWage=0;

       int randomCheck =(int)((Math.random()*10)%3);
       if (FULL_TIME_EMP==randomCheck)
       {
         System.out.println("employee is Full time");
         empHrs=8;
       }
       else if(PART_TIME_EMP==randomCheck)
       {
          System.out.println("employee is Part time");
          empHrs=4;
       }
       else
       {
         System.out.println("employee is Absent");
         empHrs=0;
       }
         empWage=empHrs*EMP_RATE_PER_HOUR;
         System.out.println("employee wage:" +empWage);
    }
}       

  

