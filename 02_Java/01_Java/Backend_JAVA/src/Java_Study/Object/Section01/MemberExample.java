package Java_Study.Object.Section01;

public class MemberExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue", 20);
        Member obj2 = new Member("blue", 10);
        Member obj3 = new Member("red", 20);

        if(obj1.equals(obj2)){
            System.out.println("Equals obj1 & obj2");
        }
        else{
            System.out.println("Not equals obj1 & obj2");
        }

        if (obj1.equals(obj3)){
            System.out.println("Equals obj1 & obj2");
        }
        else {
            System.out.println("Not equals obj1 & obj3");
        }

    }
}
