package collectionsconcept;
import java.util.*;
class Student{
	int rollid;
	String name;
	int age;
	Student(int r, String n,int a){
		rollid=r;
		name=n;
		age=a;
	}
}
public class ObjectsAddingToArrayList {

	public static void main(String[] args) {
          Student s1=new Student(14,"Hari",20);
          Student s2=new Student(45,"Mohan",20);
          Student s3=new Student(60,"Mukund",20);
          ArrayList<Student> al=new ArrayList<Student>();
          al.add(s1);
          al.add(s2);
          al.add(s3);
          Iterator i=al.iterator();
          while(i.hasNext()) {
        	  Student s=(Student)i.next();
        	  System.out.println(s.rollid +" "+s.name+" "+s.age);
          }
          System.out.println("List iterator");
          ListIterator<Student> ls=al.listIterator();
          while(ls.hasNext()) {
        	  ls.next();
          }
          while(ls.hasPrevious()) {
        	  Student s=(Student)ls.previous();
        	  System.out.println(s.rollid + " " + s.name + " " + s.age);
          }
          System.out.println("Enhanced for loop");
          for(Student s4:al) {
        	  System.out.println(s4.rollid+" "+s4.name+" "+s4.age);
          }
	}

}
