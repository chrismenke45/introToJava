public class ClassPractice {
    interface Inter {
        int num = 22;
        public int number();
    }
    static abstract class Abstract {
        public abstract int number2();
        public int number4() {
            return 4;
        }
    }

    public static class Parent extends Abstract {
        public static int number() {
            return 1;
        }
        public int number2() {
            return 2;
        } 
        
    }
    public static class Child extends Parent {
        public static int number3() {
            return 3;
        }
    }
    public static class OtherChild implements Inter {
        public int number() {
            return num;
        }
    }
    public static void main(String args[]) {
        Parent p = new Child();
        OtherChild oc = new OtherChild();

        System.out.println(Child.number());
        System.out.println(p.number2());
        System.out.println(Child.number3());
        System.out.println(p.number4());
        System.out.println(oc.number());
        
    }

    
}
