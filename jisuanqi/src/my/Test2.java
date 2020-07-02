package my;
import java.util.*;
class Student{
    private String id;
    private String name;
    public Student(String id,String name){
        this.id=id;
        this.name=name;
    }
    
    public String toString(){
        return (id+":"+name);
    }
    
    
    
    @Override
    public int hashCode(){
        return id.hashCode();
    }
    
    public boolean equals(Object obj){
        if(this==obj){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        Student stu = (Student) obj;
        boolean b = this.id.equals(stu.id);
        return b;
    }
}

public class Test2 {
    @SuppressWarnings("unchecked")
	public static void main(String[] args){
        @SuppressWarnings("rawtypes")
		HashSet has = new HashSet();
        Student stu2 = new Student("2","Rose");
        Student stu3 = new Student("2","Rose");
        Student stu1 = new Student("1","Jack");

        has.add(stu1);
        has.add(stu2);
        has.add(stu3);
      
        System.out.println(has);
        
    }
}