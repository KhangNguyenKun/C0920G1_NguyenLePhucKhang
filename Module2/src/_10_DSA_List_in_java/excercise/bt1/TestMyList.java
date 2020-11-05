package _10_DSA_List_in_java.excercise.bt1;

public class TestMyList {
   private static class Student{
       private int id;
       private String name;

       public Student(){

       }
       public Student(int id , String name){
           this.id =id;
           this.name = name;
       }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }
   }

    public static void main(String[] args) {
        Student studentFirst = new Student(1, "Khang");
        Student studentSecond = new Student(2, "Tom");
        Student studentThird = new Student(3, "Jerry");

        MyList<Object> studentMyArrayList = new MyList<>();
        studentMyArrayList.add(studentFirst);
        studentMyArrayList.add(studentSecond);
        studentMyArrayList.add(studentThird);
        for (int i =0 ; i<studentMyArrayList.size(); i++){
            Student student = (Student) studentMyArrayList.elements[i];
            System.out.println(student.getId()+" "+student.getName());
        }
    }
}
