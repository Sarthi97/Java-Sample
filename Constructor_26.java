class Constructor_26 {
        String firstName="Sumit";
        int age=15;

        Constructor_26(String firstName, int age){
            this.firstName = firstName;
            this.age = age;

            // System.out.println(firstName+ "" +age);


        }
        // void name(){
        // System.out.println(firstName+ "" +age);
        // }
    }
    class Hello {
        public static void main(String[] args) {
            Constructor_26 obj = new Constructor_26("Sumit", 17);
            Constructor_26 obj1 = new Constructor_26("Mayank", 20);
            System.out.println(obj.firstName);
            System.out.println(obj1.firstName);
        }
    }
    

