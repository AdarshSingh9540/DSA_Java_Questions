package OOPS;

public class Basic_Concept {
    public static class Human{
        String name;
        int age;
        char sex;


        Human(String name,int age, char sex){
            this.name = name;
            this.age =age;
            this.sex = sex;
        }

        void print(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Sex: "+sex);
        }
    }

    public static void main(String[] args) {
        Human h1 = new Human("Adarsh singh",20,'M');
        Human h2 = new Human("Anish singh",30,'M');

        h1.print();
        System.out.println("\n");
        h2.print();
    }
}
