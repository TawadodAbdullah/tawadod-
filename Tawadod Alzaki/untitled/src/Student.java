public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", age =" + age + '}';


    }
    public  static void main (String [] args){
        Student [] students = new Student[2];
        students [0] = new Student("Ahmed", 20);
        students [1] = new Student("Asma", 23);


        for (int i=0; i < students.length; i++){
            System.out.println("name students:"+students[i].getName());
            System.out.println("age students:"+students[i].getAge());

            System.out.println();
        }

    }









}
