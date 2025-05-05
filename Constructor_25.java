class Constructor_25 {
        String firstName="Sumit";
        int age=15;

        Constructor_25(String firstName, int age){
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
            Constructor_25 obj = new Constructor_25("Sumit", 17);
            Constructor_25 obj1 = new Constructor_25("Mayank", 20);
            System.out.println(obj.firstName);
            System.out.println(obj1.firstName);
        }
    }
    

