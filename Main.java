import java.util.ArrayList;
import java.util.Scanner;

class Student
{
    String Student_name;      
    String Student_id;        
    private String Student_password;  
    static final String year= "FY2024";  
    String batch;            
    String address;           
    int mvcMarks;             
    int physicsMarks;         
    int oopjMarks;            
    String attendance;          
    String signedEvent;       
    String issue;      
   
    public Student(String name, String id, String batch, String address, int mvc, int physics, int oopj) {
        this.Student_name = name;
        this.Student_id = id;
        this.Student_password = "UCE" + id; 
        this.batch = batch;
        this.address = address;
        this.mvcMarks = mvc;
        this.physicsMarks = physics;
        this.oopjMarks = oopj;
        this.attendance =""; 
        this.signedEvent = "None";  
        this.issue = "";  
    }//Teachers may mark P: present , A: absent

}

class Teacher
{
    String Teacher_name;
    String Teacher_id;
    private String Teacher_password;
    static String subject;
    String issue;

    public Teacher(String Teacher_name, String Teacher_id, String subject){
        this.Teacher_name=Teacher_name;
        this.Teacher_id=Teacher_id;
        this.Teacher_password="TUN"+Teacher_id;
        this.subject=subject;
        this.issue="";
    }
}

class Admin
{
    String Admin_name;
    String Admin_id;
    private String Admin_password;
    String events;

}

//Use above classes to make arraylists to store data.
//Use the following classes to add in methods.

//Hardcode the student data. So each object of type student arraylist will represent 1 student.Do the same for teachers as well as students. 

class Student_Account
{ 
//ArrayList <Student> Students_list= new ArrayList <>();
 Student[] studentListA1 = new Student[4];  
 Student[] studentListA2 = new Student[3];  
 Student[] studentListB1 = new Student[4];  
 
 void assignValues(){
        studentListA1[0] = new Student("Srushti", "A1_01", "A1", "Pune", 85, 78, 90);
        studentListA1[1] = new Student("Rucha", "A1_03", "A1", "Nagpur", 69, 72, 65);
        studentListA1[2] = new Student("Shruti", "A1_04", "A1", "Pune", 84, 87, 89);
        studentListA1[3] = new Student("Pragya", "A1_02", "A1", "Nagpur", 75, 80, 84);

        studentListA2[0] = new Student("Shrishti", "A2_01", "A2", "Mumbai", 82, 76, 88);
        studentListA2[1] = new Student("Shreya", "A2_02", "A2", "Mumbai", 94, 90, 93);
        studentListA2[2] = new Student("Priya", "A2_03", "A2", "Pune", 88, 90, 70);
       
        studentListB1[0] = new Student("Rutuja", "B1_01", "B1", "Delhi", 70, 68, 79);
        studentListB1[1] = new Student("Nidhi", "B1_02", "B1", "Pune", 92, 89, 94);
        studentListB1[2] = new Student("Sejal", "B1_03", "B1", "Mumbai", 88, 91, 86);
        studentListB1[3] = new Student("Chinmayee", "B1_04_", "B1", "Pune", 77, 74, 80);   
}

void Attendance(){
    
}

void MVCMarks(){
    
}

void PhysicsMarks(){
    
}

void OOPJMarks(){
    
}
    
void display(){ // this is only for checking chnage it to proper display method
    for(Student s: studentListA1){
        System.out.println(s.Student_name+" "+s.Student_id+" "+Student.year+" "+s.attendance+""+s.mvcMarks+" "+s.oopjMarks+" "+s.physicsMarks);
    }

    for(Student s: studentListA2){
        System.out.println(s.Student_name+" "+s.Student_id+" "+Student.year+" "+s.mvcMarks+" "+s.oopjMarks+" "+s.physicsMarks);
    }

    for(Student s: studentListB1){
        System.out.println(s.Student_name+" "+s.Student_id+" "+Student.year+" "+s.mvcMarks+" "+s.oopjMarks+" "+s.physicsMarks);
    }
}
}



class Teacher_Account extends Student_Account
{
Scanner scanner= new Scanner(System.in);
ArrayList <Teacher> Teacher_list= new ArrayList <>();

void assignValues(){
    Teacher mvc= new Teacher("Ms.Amita", "t201", "MVC");
    Teacher physics= new Teacher("Ms.Deepali","t102","Physics");
    Teacher oopj= new Teacher("Ms.Kavita", "t101", "OOPJ");
    Teacher_list.add(mvc);
    Teacher_list.add(physics);
    Teacher_list.add(oopj);
    super.assignValues();
}
@Override 
void Attendance(){
    System.out.println("Enter the batch :");
    String b=scanner.nextLine();
    
    if(b.equalsIgnoreCase("A1")){
        for(Student student: studentListA1){
            System.out.print(student.Student_id);
            System.out.println("Enter the attendance");
            student.attendance=scanner.next();                      
        }
    }
    else if(b.equalsIgnoreCase("A2")){
        for(Student student: studentListA2){
            System.out.print(student.Student_id);
            System.out.println("Enter the attendance");
            student.attendance=scanner.next();                      
        }
    }
    else if(b.equalsIgnoreCase("B1")){
        for(Student student: studentListB1){
            System.out.print(student.Student_id);
            System.out.println("Enter the attendance");
            student.attendance=scanner.next();                      
        }
    }

    else{
 //Add exceptions to check correct input
    }
    
}
@Override 
void MVCMarks(){
    System.out.println("Enter the batch :");
    String b=scanner.nextLine();
    
    if(b.equalsIgnoreCase("A1")){
        for(Student student: studentListA1){
            System.out.print(student.Student_id);
            System.out.println("enter marks");
            student.mvcMarks=scanner.nextInt();                
        }
    }
    else if(b.equalsIgnoreCase("A2")){
        for(Student student: studentListA2){
            System.out.print(student.Student_id);
             System.out.println("enter marks");
            student.mvcMarks=scanner.nextInt();
        }
    }
    else if(b.equalsIgnoreCase("B1")){
        for(Student student: studentListB1){
            System.out.print(student.Student_id);
            System.out.println("enter marks");
            student.mvcMarks=scanner.nextInt();
        }
    }
    }
@Override 
void PhysicsMarks(){
    System.out.println("Enter the batch :");
    String b=scanner.nextLine();
    
    if(b.equalsIgnoreCase("A1")){
        for(Student student: studentListA1){
            System.out.print(student.Student_id);
            System.out.println("enter marks");
            student.physicsMarks=scanner.nextInt();                
        }
    }
    else if(b.equalsIgnoreCase("A2")){
        for(Student student: studentListA2){
            System.out.print(student.Student_id);
             System.out.println("enter marks");
            student.physicsMarks=scanner.nextInt();
        }
    }
    else if(b.equalsIgnoreCase("B1")){
        for(Student student: studentListB1){
            System.out.print(student.Student_id);
            System.out.println("enter marks");
            student.physicsMarks=scanner.nextInt();
        }
    }
}
 @Override    
void OOPJMarks(){
    System.out.println("Enter the batch :");
    String b=scanner.nextLine();
    
    if(b.equalsIgnoreCase("A1")){
        for(Student student: studentListA1){
            System.out.print(student.Student_id);
            System.out.println("enter marks");
            student.oopjMarks=scanner.nextInt();                
        }
    }
    else if(b.equalsIgnoreCase("A2")){
        for(Student student: studentListA2){
            System.out.print(student.Student_id);
             System.out.println("enter marks");
            student.oopjMarks=scanner.nextInt();
        }
    }
    else if(b.equalsIgnoreCase("B1")){
        for(Student student: studentListB1){
            System.out.print(student.Student_id);
            System.out.println("enter marks");
            student.oopjMarks=scanner.nextInt();
        }
    }
}
}

class Admin_Account extends Teacher_Account
{

}
public class Campus 
{
    public static void main(String args[])
    {
        System.out.println("--Welcome to Virtual Campus--");
        Scanner main_input= new Scanner(System.in);
        int choice;
        String Student_id,Teacher_id,Admin_id;
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
                        Student_id=main_input.next();
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
                Teacher_Account teacher_acc= new Teacher_Account();
                teacher_acc.assignValues();
                 System.out.println("**Teacher**");
                System.out.println("Enter Teacher ID");
                Teacher_id=main_input.next();
                //System.out.println("Enter Password");
                //String pass=main_input.next();
                Teacher loggedin=null;
                for(Teacher t: teacher_acc.Teacher_list){
                    if(Teacher_id.equalsIgnoreCase(t.Teacher_id) /*&& pass.equalsIgnoreCase(t.Teacher_password)*/){
                        System.out.println("You are loged in as "+ t.Teacher_name);
                        loggedin=t;
                        flag=1;
                        
                    }
                    if(flag==0){
                    System.out.println("Teacher id not recognized. Please try again.");
                    }
    
                    if(flag==1)
                    {
                     do{
                    System.out.println("Enter number corresponding to the task:\n 1:Mark Attendence \n 2: Change Marks \n 3:Display events \n 4: Sign up for events \n 5: Raise a query \n Enter 0 to log out");
    
                    choice=main_input.nextInt();
    
                    switch(choice)
                    {

                 case 1:
                 {
                   teacher_acc.Attendance(); 
                   teacher_acc.display(); // this was just to check whether the code is working or not
                 break;
                 }
                 case 2:
                 {
                       if(Teacher.subject.equalsIgnoreCase("MVC")){
                        teacher_acc.MVCMarks();
                       }
                       else if(Teacher.subject.equalsIgnoreCase("Physics")){
                        teacher_acc.PhysicsMarks();
                       }
                       else if(Teacher.subject.equalsIgnoreCase("OOPJ")){
                        teacher_acc.OOPJMarks();
                       }
                       //teacher_acc.display();
                    }  
                 break;
                 

                 case 3:
                 {
                 //events
                 break;
                 }

                 case 4:
                 {
                 //events
                 break;
                 }

                 case 5:
                 {
                    System.out.println("Enter your conplaints if any");
                    loggedin.issue=main_input.nextLine();
                    System.out.println("Your complaint has been recorded");
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
                }
            }
                break;
             case 3:
             {
                System.out.println("Admin");
                System.out.print("Enter Admin ID:");
                Admin_id=main_input.next();
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
