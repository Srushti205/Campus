import java.util.Scanner;

public class Main 
{
    public static void main(String args[])
    {
        System.out.println("--Welcome to Virtual Campus--");
        Scanner main_input= new Scanner(System.in);
        int choice;
        int Student_id,Teacher_id,Admin_id;
        int flag=0;
        do 
        {
            System.out.println("Login to your account as : \n 1)Student \n 2)Teacher \n 3)Admin\n Enter corresponding number to login.\n Enter 0 to exit.");

            choice=main_input.nextInt();

            switch (choice) {
                case 1:
                {
                    
                        System.out.println("Student");
                        System.out.print("Enter Student ID:");
                        Student_id=main_input.nextInt();
                        /*compare id with present data
                        for(int i=0;i< ;i++)
                         {
                          if(Student_id== && password==)
                          {
                           System.out.println("You are loged in as "+);
                           flag=1;
                          }  
                         }
                         if(flag==0)
                         System.out.println("Student id not recognized. Please try again.");

                         if(flag=1)
                         {
                          do{
                         System.out.println("Enter number corresponding to the task:\n 1:Display Attendence \n 2:Display marks \n 3:Display events \n 4:Sign up for events \n 5:Raise a query \n Enter 0 to log out");

                         choice=main_input.nextInt();

                         switch(choice)
                         {
                         case 1:
                         {
                         
                         break;
                         }

                         case 2:
                         {
                         
                         break;
                         }

                         case 3:
                         {
                         
                         break;
                         }

                         case 4:
                         {
                         
                         break;
                         }

                         case 5:
                         {
                         
                         break;
                         }

                         case 0:
                         {
                         System.out.println("Logged out");
                         break;
                         }
                          
                         default:System.out.println("Please enter valid input");
                         break;
                         
                         }

                         }
                         while(choice!=0);
                         
                         }

                        */

                        break;
                }



             case 2:
             { 
                 System.out.println("Teacher");
                System.out.print("Enter Teacher ID:");
                Teacher_id=main_input.nextInt();
                /*compare id with present data
                for(int i=0;i< ;i++)
                 {
                  if(Teacher_id== && password==)
                  {
                   System.out.println("You are loged in as "+);
                   flag=1;
                  }  
                 }
                 if(flag==0)
                 System.out.println("Teacher id not recognized. Please try again.");

                 if(flag=1)
                 {
                  do{
                 System.out.println("Enter number corresponding to the task:\n 1:Mark Attendence \n 2: Grade papers \n 3:Display events \n 4: Sign up for events \n 5: Raise a query \n Enter 0 to log out");

                 choice=main_input.nextInt();

                 switch(choice)
                 {
                 case 1:
                 {
                 
                 break;
                 }

                 case 2:
                 {
                 
                 break;
                 }

                 case 3:
                 {
                 
                 break;
                 }

                 case 4:
                 {
                 
                 break;
                 }

                 case 0:
                 {
                 System.out.println("Logged out");
                 break;
                 }
                  
                 default:System.out.println("Please enter valid input");
                 break;
                 
                 }

                 }
                 while(choice!=0);
                 
                 }

                */

                break;
             }
             case 3:
             {
                System.out.println("Admin");
                System.out.print("Enter Admin ID:");
                Admin_id=main_input.nextInt();
                /*compare id with present data
                for(int i=0;i< ;i++)
                 {
                  if(Teacher_id== && password==)
                  {
                   System.out.println("You are loged in as "+);
                   flag=1;
                  }  
                 }
                 if(flag==0)
                 System.out.println("Admin id not recognized. Please try again.");

                 if(flag=1)
                 {
                  do{
                 System.out.println("Enter number corresponding to the task:\n 1:Veiw Student fees\n 2: Veiw teacher salary record \n 3:Display teacher data \n 4: create events \n 5: See queries \n Enter 0 to log out");

                 choice=main_input.nextInt();

                 switch(choice)
                 {
                 case 1:
                 {
                 
                 break;
                 }

                 case 2:
                 {
                 
                 break;
                 }

                 case 3:
                 {
                 
                 break;
                 }

                 case 4:
                 {
                 
                 break;
                 }
                 
                 case 5:
                 {
                 
                 break;
                 }

                 case 0:
                 {
                 System.out.println("Logged out");
                 break;
                 }
                  
                 default:System.out.println("Please enter valid input");
                 break;
                 
                 }

                 }
                 while(choice!=0);
                 
                 }

                */

                break;
        }

          








                
                    
                   
            
                default: System.out.println("Enter valid input");
                    break;
            }
    
    
    
        }
        while(choice!=0);
    }
    
}
