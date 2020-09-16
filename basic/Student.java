class Person{
    protected String name;
    protected int age;

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

}

class Student extends Person{
    private String name;

    public Student(String name,int age,String name1) {
        super(name,age);
        this.name = name1;
    }

    public void getInfo(){
        System.out.println(this.name);      //Child
        System.out.println(super.name);     //Father
        System.out.println(super.age);     //Father
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        Student zs = new Student("张三",23,"李四");
        zs.getInfo();
    }
}