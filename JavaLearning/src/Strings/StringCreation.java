package Strings;
//* 1. String: There are two ways to create a string object using String Class*/
//~ String created by String class are Immutable.
//* 2. StringBuffer  */
//~ String created by StringBuffer class are mutable.
//* 3. StringBuilder */


public class StringCreation {
    
    public static void main(String[] args) {
        //! String Class

        //* 1. In this case the string object stored in String Constant Pool (SCP) Or String Literal Pool (SLP) only.
        //* In SCP, there is unique reference for every new object creation whether it is same or not. 
        
        String s1 = "Java";
        String s2 =  "Java";


        System.out.println(s1==s2);  //& '==' operator is used to compare object reference  */
        
        //& Since, In SCP, object reference created once i.e. s1==s2 --> true */

        //* We can verify the above using hasCode() method */
        
        System.out.println(s1.hashCode()); 
        System.out.println(s2.hashCode());

        //& We can see that the hasCode of s1 and s2 are same. Which verifies that the reference of s1 and s2 is same.
        
        
        String string1 = "Java";
        String string2 = "Python";
        
        System.out.println(string1.equals(string2)); //& 'equals()' method is used to compare the values of the object in String class objects
        
        //* 2. In this case the string object stored in Heap Area as well as in SCP, But the object is referencing the Heap Area.
        //* In Heap Area, there is a new reference for every new object creation whether it is same or not. 
        
        String s3 = new String("Lalit");
        String s4 =  new String("Lalit");
        
        System.out.println(s3==s4);
        
        //& Since, In Heap Area, object reference created by JVM every time i.e. s3 == s4 --> false */    

        //? Since, Using String obj = new String("string") there are two objects created, one in Heap Area and second one in SCP. But the memory allocation takes place in SCP always.
        //? This results in hashCode(s3) is same os hashCode(s4).        
       
        //^ Other than String data type '==' and 'equal()' are same.

        //! StringBuffer Class
        //? Memory allocation in StringBuffer Class takes place in Heap Area
        
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = new StringBuffer("Java");
        
        System.out.println(sb1==sb2); //& Since StringBuffer stings are mutable therefore, the reference of 'sb1' and 'sb2' are different even both having same values.
        
        //* We can verify the above using hasCode() method */
        
        System.out.println(sb1.hashCode()); 
        System.out.println(sb2.hashCode());
        
        //& We can see that the hasCode of sb1 and sb2 are different. Which verifies that the StringBuffer objects created each time even having same values.
        
        
        //! StringBuilder Class
        //? Memory allocation in StringBuilder Class takes place in Heap Area
        //^ StringBuffer and StringBuilder Class are Identical only difference is that the methods in StringBuilder class are not synchronized.
        
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb); 
    }
}