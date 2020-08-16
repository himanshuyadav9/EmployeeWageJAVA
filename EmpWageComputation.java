public class EmpWageComputation
{
    public static final int IS_FULL_TIME= 1;

    public static void main(String[]args)
    {
      System.out.println("welcome to employee wage computation program ");
     
      double empCheck =(int)((Math.random()*10)%2);
      if (empCheck==IS_FULL_TIME)
      {
      System.out.println("Employee is present");
      }
      else
      {
      System.out.println("Employee is Absent");
      }
    }
}
