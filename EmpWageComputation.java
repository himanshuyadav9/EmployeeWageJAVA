public class EmpWageComputation
{
     //constants
    public static final int FULL_TIME_EMP= 1;
    public static final int PART_TIME_EMP=2;
    public static final int EMP_RATE_PER_HOUR=20;
    public static final int TOTAL_DAYS=20;

    public static void main(String[]args)
    {
      System.out.println("welcome to employee wage computation program ");
       
      EmpWageComputation emp= new EmpWageComputation();
      emp.calculateWage();
     }
         public  void calculateWage()
         {
           int empHrs;
           int empWage;
           

           for(int day=1 ; day<=TOTAL_DAYS ; day++ )
           {
            int randomCheck =(int)((Math.random()*10)%3);

            switch(randomCheck)
            {
            case PART_TIME_EMP:
                 System.out.println("employee is Part time");
                     empHrs=4;
                      break;

            case FULL_TIME_EMP:
                 System.out.println("employee is Full time");
                     empHrs=8;
                      break;

            default:
                  System.out.println("employee is Absent");
                    empHrs=0;
           }
             
            empWage=empHrs*EMP_RATE_PER_HOUR;
            System.out.println("Employee Wage: " + empWage);
         }
     }
}
