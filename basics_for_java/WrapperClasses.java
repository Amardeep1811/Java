class WrapperClasses{
    public static void main(String[] args) {
        int a = 10;
        Integer A = a;
        // also called as auto boxing
        System.out.println(A);

        // these are autoBoxing

        char ch = 'A';
        Character charObj = ch;

        byte b = 1;
        Byte byteObj = Byte.valueOf(b);

        float f = 29.2f;
        Float floatObj = Float.valueOf(f);

        double d = 100000000;
        Double doubleObj = Double.valueOf(d);

        System.out.println("\n--------Wrapped objects----------");
        System.out.println("Character object : " + charObj);
        System.out.println("Byte object : " + byteObj);
        System.out.println("Float Object : " + floatObj);
        System.out.println("double object : " + doubleObj);

        //this is unboxing or unwrapping of the objects
        char c = charObj;
        byte b1 = byteObj;
        float f1 = floatObj;
        double d1 = doubleObj;

        System.out.println("\n--------Unwrapped values----------");
        System.out.println("Character value : " + charObj);
        System.out.println("Byte value : " + byteObj);
        System.out.println("Float value : " + floatObj);
        System.out.println("double value : " + doubleObj);

        String s = "100";
        Integer  a1 = 100;

        int integer = Integer.parseInt(s); // we can pass of string
        int value = Integer.valueOf(s);     // we can pass of string 
        int p = Integer.valueOf(a); //we can pass a int value
        int primitiveInt = a1.intValue(); // can change the wrapper class into its primitive type 
        String s2 = Integer.toString(100);
        floatObj.compareTo(2.12f);
        A.equals(b1);
        


    }
}