class Operators {
    // Main Function
    public static void main(String[] args) {

        // Arithmetic operators
        int a = 10;
        int b = 3;
        int c = 10;
        int d = 10;
        

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Using unary operators
        printSeparator();
        System.out.println(" Postincrement : " + (c++));      
        System.out.println(" Preincrement : " + (++c));
        System.out.println(" Postdecrement : " + (d--));
        System.out.println(" Predecrement : " + (--d));

        // Assignment operators
        printSeparator();
        int e = 7;
        
        System.out.println(" f += 3: " + (e += 3));   
        System.out.println(" f -= 2: " + (e -= 2));       
        System.out.println(" f *= 4: " + (e *= 4));
        System.out.println(" f /= 3: " + (e /= 3));        
        System.out.println(" f %= 2: " + (e %= 2));        
        System.out.println(" f &= 0b1010: " + (e &= 0b1010));        
        System.out.println(" f |= 0b1100: " + (e |= 0b1100));        
        System.out.println(" f ^= 0b1010: " + (e ^= 0b1010));       
        System.out.println(" f <<= 2: " + (e <<= 2));        
        System.out.println(" f >>= 1: " + (e >>= 1));       
        System.out.println(" f >>>= 1: " + (e >>>= 1));
        
     // Comparison operators
        printSeparator();
        int f = 10;
        int g = 3;
        int h = 5;

        System.out.println("a > b: " + (f > g));
        System.out.println("a < b: " + (f < g));
        System.out.println("a >= b: " + (f >= g));
        System.out.println("a <= b: " + (f <= g));
        System.out.println("a == c: " + (f == h));
        System.out.println("a != c: " + (f != h));
        
     // Logical operators
        printSeparator();
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        printSeparator();
     // ternary operator.
        //The above statement means that if the condition evaluates to true, 
        //then execute the statements after the ‘?’ 
        //else execute the statements after the ‘:’.  
        
        
        int i = 20, j = 10, k = 30, result;

        // result holds max of three
        // numbers
        result
            = ((i > j) ? (i > k) ? i : k : (j > k) ? j : k);
        System.out.println("Max of three numbers = "+ result);
        
        printSeparator();
        Person obj1 = new Person();
        Person obj2 = new Boy();

        // As obj is of type person, it is not an
        // instance of Boy or interface
        System.out.println("obj1 instanceof Person: "
                           + (obj1 instanceof Person));
        System.out.println("obj1 instanceof Boy: "
                           + (obj1 instanceof Boy));
        System.out.println("obj1 instanceof MyInterface: "
                           + (obj1 instanceof MyInterface));

        // Since obj2 is of type boy,
        // whose parent class is person
        // and it implements the interface myinterface
        // it is instance of all of these classes
        System.out.println("obj2 instanceof Person: "
                           + (obj2 instanceof Person));
        System.out.println("obj2 instanceof Boy: "
                           + (obj2 instanceof Boy));
        System.out.println("obj2 instanceof MyInterface: "
                           + (obj2 instanceof MyInterface));
    }
    
    
    private static void printSeparator() {
        String space = "===============================================";
        System.out.println(space);
    	}
    }

class Person {
}

class Boy extends Person implements MyInterface {
}

interface MyInterface {
}

