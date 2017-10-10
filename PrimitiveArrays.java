public class PrimitiveArrays {
    public static void main(String[] args) {
        // The general format for creating an empty primitve array is as follows:
        // type[] name = new type[length];
        
        int[] int_array = new int[10];
        System.out.println("int_array[0] = " + int_array[0]);
        System.out.println("int_array[1] = " + int_array[1]);
        System.out.println("int_array[9] = " + int_array[9]);
        //System.out.println("int_array[10] = " + int_array[10]);
        // ^^ This won't compile, because arrays are 0-indexed, meaning
        // the only valid indexes for int_array are 0 through 9.
        
        // If you already know your set of values, you can initialize arrays like this:
        String[] daysOfTheWeek = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };
        
        // Remember, we are referencing the 5th element with index 4 (index + 1 = element number)
        System.out.println("Thank goodness it's " + daysOfTheWeek[4]);
        
        double[] important_constants = new double[4];
        important_constants[0] = 3.14159;
        important_constants[1] = 2.171828;
        important_constants[2] = important_constants[0] * 2;
        important_constants[3] = 299792458.0;
        System.out.println("Pi: " + important_constants[0] +
                           " Euler's Number: " + important_constants[1] +
                           " Tau: " + important_constants[2] +
                           " Speed of Light: " + important_constants[3]);
        
        String[] primitive_types = new String[7];
        primitive_types[0] = "int";
        primitive_types[1] = "long";
        primitive_types[2] = "float";
        primitive_types[3] = "double";
        primitive_types[4] = "String";
        primitive_types[5] = "boolean";
        primitive_types[6] = "char";
        
        // What do you think is going on here?
        for (String primitive_type : primitive_types) {
            System.out.println(primitive_type);
        }
        
        // Arrays can store other arrays as well.
        // These are called multidimensional array
        
        // 2D array
        int[][] screen = new int[3][5];
        screen[0][4] = 7;
        screen[2][0] = 8;
        screen[2][2] = -1;
        
        for (int width=0; width < screen.length; width++) {
            for (int height=0; height < screen[width].length; height++) {
                System.out.print("[" + screen[width][height] + "] ");
            }
            System.out.println();
        }
    }
}