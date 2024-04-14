package Patterns;

public class Pattern04 {
    
    public static void main(String[] args) {

        int num = 1, n = 4;
        
        for(int i = 1; i <= n; i++){
        	
            for(int j = 1; j <= n; j++){
                if (j<=i){                	
                		System.out.print(num+ " "); 
                        num++;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }    
}