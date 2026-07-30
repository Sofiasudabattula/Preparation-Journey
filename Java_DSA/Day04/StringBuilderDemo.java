public class StringBuilderDemo {
    public static void main(String[] args) {
        // 1. Create a StringBuilder instance
        StringBuilder sb = new StringBuilder("Hello");

        // 2. append(): Adds text to the end of the sequence
        sb.append(" World"); 
        System.out.println(sb); 

        // 3. insert(): Inserts text at a specific index
        sb.insert(5, ","); 
        System.out.println(sb); 

        // 4. replace(): Replaces characters in a specified range (start index, end index exclusive)
        sb.replace(7, 12, "Java"); 
        System.out.println(sb); 
        // 5. delete(): Deletes characters in a specified range
        sb.delete(5, 7); 
        System.out.println(sb); 

        // 6. reverse(): Reverses the entire character sequence
        sb.reverse();
        System.out.println(sb); 

        // 7. toString(): Converts the builder back into a standard immutable String
        sb.reverse(); 
        String finalResult = sb.toString();
        System.out.println("Final String: " + finalResult);
    }
}
