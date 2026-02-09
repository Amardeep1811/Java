class VarArguments{

    static void printNames(String ... s){
        for(String sIndex : s){
            System.out.println("The current String is : " + sIndex);
        }
    }

    static void printNumbers(int ... n){
        System.out.println("The number of arguments this time is " + n.length);
        for (int i : n){
            System.out.print("\n" + i + " ");
        }
    }

     static void fun(String s ,int ... n){
        System.out.println("\nThe string passed is " + s);
        System.out.println("The number of variables passed is " + n.length);
        
        for (int i : n){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        printNames("Amardeep" , "prashant" , "Kapil" , "Gurvir");
        printNames("New Arguments");

        printNumbers(100);
        printNumbers(10,20,31,22,11);

        fun("Amardeep", 100 ,120,299,400);
        fun("Timmy", 200);
    }
}