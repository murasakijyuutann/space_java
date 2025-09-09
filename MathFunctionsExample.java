public class MathFunctionsExample {
    public static void main(String[] args) {
        double x = 0.5;            // Example input (radians)
        double angle = 30;         // Example angle in degrees
        double a = 7, b = 3;

        // 🌐 Trigonometric functions
        System.out.println("sin(x)        = " + Math.sin(x));        // Sine of x (radians)
        System.out.println("cos(x)        = " + Math.cos(x));        // Cosine of x
        System.out.println("tan(x)        = " + Math.tan(x));        // Tangent of x

        // 🔁 Inverse trigonometric functions
        System.out.println("asin(x)       = " + Math.asin(x));       // Arcsin (returns angle in radians)
        System.out.println("acos(x)       = " + Math.acos(x));       // Arccos
        System.out.println("atan(x)       = " + Math.atan(x));       // Arctan

        // 🔄 Radian/Degree conversion
        System.out.println("toRadians(30) = " + Math.toRadians(angle)); // Degrees → Radians
        System.out.println("toDegrees(π/6)= " + Math.toDegrees(Math.PI / 6)); // Radians → Degrees

        // 📈 Exponential and logs
        System.out.println("exp(x)        = " + Math.exp(x));        // e^x
        System.out.println("log(x)        = " + Math.log(x));        // Natural log (ln)
        System.out.println("log10(x)      = " + Math.log10(x));      // Base-10 log

        // 🧮 Roots
        System.out.println("sqrt(16)      = " + Math.sqrt(16));      // Square root
        System.out.println("cbrt(27)      = " + Math.cbrt(27));      // Cube root

        // 📏 Remainder
        System.out.println("IEEEremainder(7, 3) = " + Math.IEEEremainder(a, b)); // IEEE-style remainder

        // 🔺 Rounding
        System.out.println("ceil(x)       = " + Math.ceil(x));       // Round up
        System.out.println("floor(x)      = " + Math.floor(x));      // Round down
        System.out.println("rint(x)       = " + Math.rint(x));       // Round to nearest integer (as double)

        // 🆕 🔢 More useful Math methods:
        System.out.println("abs(-5)       = " + Math.abs(-5));       // Absolute value
        System.out.println("max(10, 20)   = " + Math.max(10, 20));   // Max of two numbers
        System.out.println("min(10, 20)   = " + Math.min(10, 20));   // Min of two numbers
        System.out.println("pow(2, 3)     = " + Math.pow(2, 3));     // 2^3 = 8
        System.out.println("random()      = " + Math.random());      // Random number between 0.0 and 1.0
        System.out.println("signum(-5.5)  = " + Math.signum(-5.5));  // Sign: -1.0 for negative, +1.0 for positive, 0.0 for zero
        System.out.println("hypot(3, 4)   = " + Math.hypot(3, 4));   // √(3² + 4²) = 5.0

        // 🔁 Multiply and exact checks (introduced in newer versions)
        System.out.println("multiplyExact(5, 4) = " + Math.multiplyExact(5, 4)); // 20
        System.out.println("floorDiv(7, 3)      = " + Math.floorDiv(7, 3));      // 2 (floored integer division)
        System.out.println("floorMod(7, 3)      = " + Math.floorMod(7, 3));      // 1 (like 7 % 3, but handles negatives better)
    }
}
// Demonstrates various Math functions in Java with comments and emojis for clarity.