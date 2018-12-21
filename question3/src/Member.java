 class Member_variable {
    public String name;
    public int salary;
    public int age;


    Member_variable(String name,int salary,int age)
    {
        this.name=name;
        this.salary=salary;
        this.age=age;

    }

     public String toString()
     {
         return "Name: "+name+"\n"+ "Salary: "+salary+"\n" + "Age: "+age;
     }

}
  class member1 extends Member_variable{
      private String name;
      private int salary;
      private int age;
      member1(String name, int salary, int age) {
          super(name, salary, age);
      }

}
public class Member{
    public static void main(String[] args) {
        member1 m=new member1("sujoy",45000,26);
        System.out.println(m.toString());
    }
}
