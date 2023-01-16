package arrayofobjects;
import java.util.Scanner;
public class Arrayofobjects {
    public static void main(String[] args)
    {
      Student[] list=new Student[3];
      Student s1=new Student();
      s1.setName("Peter");
      s1.setAge(19);
      
      Student s2=new Student();
      s2.setAge(20);
      s2.setName("Gaurav");
      
      Student s3=new Student();
      s3.setAge(22);
      s3.setName("Naitik");
      
      list [0]=s1;
      list [1]=s2;
      list [2]=s3;
      
      for(int a=0;a<=2;a++){
      System.out.print(list[a].getAge()+" ");
      System.out.print(list[a].getName());
      System.out.println();
      }
   }
}