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
           int totalEmpWage=0;
           int totalMaxEmpHrs=100;
           int totalHrs=0;
           int totalWorkingDays=0;

         while( totalHrs<=totalMaxEmpHrs && totalWorkingDays<=TOTAL_DAYS)
         {
            totalWorkingDays++;
            int randomCheck =(int)((Math.random()*10)%3);

         switch(randomCheck)
         {
          case PART_TIME_EMP:
               empHrs=4;
               break;

         case FULL_TIME_EMP:
              empHrs=8;
              break;

         default:
                empHrs=0;
         }
         totalHrs=totalHrs+empHrs;

         }
          totalEmpWage=totalHrs*EMP_RATE_PER_HOUR;
          System.out.println("total Hrs:"+totalHrs);

          System.out.println("total wage:"+totalEmpWage);
    }

}
