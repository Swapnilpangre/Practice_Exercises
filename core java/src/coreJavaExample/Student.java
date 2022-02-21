package coreJavaExample;

import java.util.ArrayList;
import java.util.List;

//Exercise 27 : Create a class 'Student' with three data members which are name, age and address. 
//The constructor of the class assigns default values name as "unknown", age as '0' and address as 
//"not available". It has two members with the same name 'setInfo'. First method has two parameters for 
//name and age and assigns the same whereas the second method takes has three parameters which are assigned to 
//name, age and address respectively. Print the name, age and address of 10 students.
//Hint - Use array of objects.
public class Student

{

String name;

int age;

String address;

public Student()

{

this.name="unknown";

this.age=0;

this.address="not avaliable";

}

public void setinfo(int age,String name)

{

this.name=name;

this.age=age;

}

public void setinfo(int age ,String name,String address)

{

this.name=name;

this.age=age;

this.address=address;

}

@Override

public String toString()

{

return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";

}

public static void main(String[] args)

{

List<Student> stu=new ArrayList<>();

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.add(new Student());

stu.get(0).setinfo(55, "swapnil");

stu.get(2).setinfo(50, "ram","Aurangabad");

stu.get(3).setinfo(45, "shyam","Aurangabad");

stu.get(5).setinfo(30, "raju","Aurangabad");

stu.get(6).setinfo(65, "baburao","Aurangabad");

stu.get(8).setinfo(55, "ganesh");

for(Student s :stu)
{
System.out.println(s);
}
}
}
