package ru.spsuace.course.classwork.classes;

public class ExtendedClasses {


    // ---------- extends ----------
    static class SuperClass {

        private final String surname;
        protected final String name;

        protected SuperClass(String surname, String name) {
            this.surname = surname;
            this.name = name;
        }

        public String myName() {
            return name + " " + surname;
        }

        protected SuperClass itIsMe() {
            return this;
        }
    }

    static class SubClass extends SuperClass {
        private final int age;

        protected SubClass(String surname, String name, int age) {
            super(surname, name);
            this.age = age;
        }


        @Override
        public String myName() {
            return super.myName() + " " + age;
        }

        // @Override -- method doesn't override anything
        public String myName(String appeal) {
            return appeal + " " + myName();
        }

        @Override
        protected SubClass itIsMe() {
            return this;
        }
    }

//    public static void main(String[] args) {
//        SuperClass i = new SubClass("Galkin", "Alexander", 27);
//        System.out.println(i.itIsMe().myName());
//        System.out.println( ((SubClass)i.itIsMe()).myName("Mr."));
//    }

    // ---------- abstract ----------

    public static interface Speaking {
        void say();

        default void say(String str) {
            System.out.println(str);
        }
    }


    public static abstract class Pet implements Speaking {

        protected String name;
        protected int age;

        protected Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public abstract String sayAndReturn();
    }

    static class Cat {

        public static final int MAX_SIZE = 100;

        public static boolean isFakeCat(final Cat cat) {
            boolean result;
            cat.rename("Murzik");
            if (cat.size > MAX_SIZE) {
                result = true;
            } else {
                result = false;
            }
            boolean result1 = cat.size > MAX_SIZE;
            return result;
        }

        private String name;
        private int age;
        private final int size;

        public Cat(String name, int age, int size) {
            this.name = name;
            this.age = age;
            this.size = size;
        }

        public Cat(String name, int size) {
            this(name, 0, size);
        }

        public void rename(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public boolean isFake() {
            return size > MAX_SIZE;
        }

        public Cat compare(Cat otherCat) {
            if (this.size > otherCat.size) {
                return this;
            } else {
                return otherCat;
            }
        }

        public String sayAndReturn() {
            String meow = "Meow! ";
            System.out.print(meow);
            return meow;
        }

        public void say() {
            System.out.println("Meow!");
        }

        public void say(String str) {
            System.out.print(str);
            say();
        }

        public void kyc() {
            System.out.println("Кусь");
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", size=" + size +
                    '}';
        }
    }

    public static void main(String[] args) {
        Cat menson = new Cat("Menson", 3, 30);
        menson.say();
        System.out.println("return : " + menson.sayAndReturn());
        menson.say("Мур ");
        menson.kyc();

        Cat murzik = new Cat("Murzik", 3, 10);

        Cat greater = menson.compare(murzik);
        System.out.println(greater);

//        System.out.println(menson.getName() + " is fake? " + menson.isFake());
//        System.out.println(menson.getName() + " is fake? " + menson.isFakeCat(menson));
//        System.out.println(menson.getName() + " is fake? " + Cat.say());


        System.out.println("--------------");


//        Pet pet = new Cat("Barsik", 5);
//        pet.say();
//        System.out.println("return : " + pet.sayAndReturn());
//        pet.say("Мур ");
////        pet.kyc();
//
//        System.out.println("--------------");
//
//        Speaking speaking = new Cat("Barsik", 5);
//        speaking.say();
////        System.out.println("return : " + speaking.sayAndReturn());
//        speaking.say("Мур ");
////        speaking.kyc();

    }

    // ----------  Anonymous ----------

    private static void anon(Runnable runnable) throws InterruptedException {
        Thread t = new Thread(runnable);
        t.start();
        Thread.sleep(1000);
    }


//    public static void main(String[] args) throws InterruptedException {
//        String str1 = "effectively final";
//        String str2 = "not final";
//        anon(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(str1);
//                System.out.println("Thread is running");
////                System.out.println(str2);
//            }
//        });
//        System.out.println(" ----------- ");
//
//        anon(ExtendedClasses::printText);
//        anon(() -> ExtendedClasses.printText(str1, "Thread is running", str2));
////        str2 = "not final 2";
//    }

    private static void printText() {
        System.out.println("effectively final");
        System.out.println("Thread is running");
    }

    private static void printText(String s1, String main, String s2) {
        System.out.println(s1);
        System.out.println(main);
        System.out.println(s2);
    }
}
