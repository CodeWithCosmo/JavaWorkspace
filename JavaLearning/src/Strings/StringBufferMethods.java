package Strings;
public class StringBufferMethods {
    public static void main(String[] args) {

        StringBuffer sb1 = new StringBuffer("Java");  //~ By creating string in this way we are giving StringBuffer object capacity 16 + length of string i.e. 20
        StringBuffer sb2 = new StringBuffer("Java");
        System.out.println(sb1.capacity()); 
        StringBuffer sb3 = new StringBuffer(100); //& We can set the capacity of StringBuffer object at its initialization time.
        System.out.println(sb3.capacity());

        
        System.out.println(sb1.append(" is very easy programming language.")); //& This will append the given string to sb1, not create a new object
        //~ If the capacity exceeds than the new capacity is calculated as '(oldCapacity * 2) + 2'. In this case new capacity if 20 is exceeds is (20 * 2) + 2 = 42
        System.out.println(sb1.capacity());
        
        System.out.println(sb2.insert(0, "Core ")); //& This will insert the given charSequence at given index      
        System.out.println(sb2.delete(0, 5)); //& This will delete the characters from index range [0,5).
        System.out.println(sb2.deleteCharAt(0)); //& This will delete a character from given index.
        
        sb2.setCharAt(0, 'L');
        System.out.println(sb2); //& This will replace character at index 0 with given character.
        
        sb2.setLength(2);
        System.out.println(sb2);
        
        System.out.println(sb1.equals(sb2)); //& This will return false as they refer different object even having same values.
        sb3 = sb2.append(" Language"); //& Since we store sb2 appended string in sb3. Therefore the capacity of sb3 also changed to capacity of sb2.
        System.out.println(sb2.equals(sb3)); //& This will return true as they refer same object because sb3 is appended string of sb2
        
        System.out.println(sb3);
        System.out.println(sb3.replace(0,3, "Python ")); //& This will replace the ranged [0,3) charSequence with given string.
        System.out.println(sb3.reverse()); //& This will return the reversed string
        
        sb3.ensureCapacity(100);
        System.out.println(sb3.capacity()); //& We can set the custom capacity of StringBuffer object by using ensureCapacity() method.
        sb3.trimToSize();
        System.out.println(sb3.capacity()); //& We can trim all unwanted capacity using trimToSize() method.
    }
}
