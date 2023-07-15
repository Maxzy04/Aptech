/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectconverter;
import java.util.Scanner;

/**
 *
 * 
 */
public class ProjectConverter {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 

    /**
     * @param args the command line arguments
     */
    
    public static void numToBinary(int num){
        
        int r;
        String binary="";
        while(num > 0){
        
        r = num%2;
        binary = binary+""+r; 
        
        num = num/2;
        
        }
    
       System.out.println("Binary is :"+binary);  
    }
    
    public static void binaryToNum(String num){
       int size = num.length();
       double number= 0;
       
        for(int i = 0;i < size;i++ ){ 
            number = number +Integer.parseInt(String.valueOf(num.charAt(i))) * Math.pow(2,(size-1)-i);
            
        }
        
       System.out.println("Number is : "+number); 
    }
    
    public static void numToHexa(int num){
        
        int r;
        String hexa="";
       while(num > 0){
        
        r = num%16;
        if(r == 10){
          hexa = "A" +hexa;
        }else if(r == 11){
          hexa = "B"+hexa;
        }else if(r == 12){
          hexa = "C" +hexa;
        }else if(r == 13){
          hexa = "D" +hexa;
        }else if(r == 14){
          hexa = "E" +hexa;
        }else if(r == 15){
          hexa = "F" +hexa;  
        }else{
          hexa = r+""+hexa;
        }
         
        
        num = num/16;
        
      }
    
       System.out.println("Hexadecimal is : "+hexa);  
    }
    
        public static void hexaToNum(String num){
       int size = num.length();
       double number= 0;
       
        for(int i = 0;i < size;i++ ){ 
            if(num.charAt(i) == 'a' || num.charAt(i) == 'A'){
               number = number + 10 * Math.pow(16,(size-1)-i);
            }else if(num.charAt(i) == 'b' || num.charAt(i) == 'B'){
               number = number + 11 * Math.pow(16,(size-1)-i);
            }else if(num.charAt(i) == 'c' || num.charAt(i) == 'C'){
               number = number + 12 * Math.pow(16,(size-1)-i);
            }else if(num.charAt(i) == 'd' || num.charAt(i) == 'D'){
               number = number + 13 * Math.pow(16,(size-1)-i);
            }else if(num.charAt(i) == 'e' || num.charAt(i) == 'E'){
               number = number + 14 * Math.pow(16,(size-1)-i);
            }else if(num.charAt(i) == 'f' || num.charAt(i) == 'F'){
               number = number + 15 * Math.pow(16,(size-1)-i);
            }else{
            number = number +Integer.parseInt(String.valueOf(num.charAt(i))) * Math.pow(16,(size-1)-i);
            }
        }
        
       System.out.println("Number is : "+number); 
    }
    
     public static void binaryToHexa(String num){
         String tmp="";
         String hexa="";
         int size= num.length();
         if(size%4!= 0){
           size = size%4; 
          for(int i = 0; i < size;i++){
           
           num= "0"+num;
          }
         }
         
         
         for(int i = 0;i < num.length();i+=4){
           tmp = num.substring(i, i+4);
           
           double sum = 0;
           for(int j = 0;j<tmp.length();j++){
             sum= sum+ Integer.parseInt(String.valueOf(tmp.charAt(j )))* Math.pow(2,(tmp.length()-1)-j);
           
           }
              if(sum == 10){
                hexa = hexa +"A";
              }else if(sum == 11){
                hexa = hexa+"B";
              }else if(sum == 12){
                hexa = hexa+"C";
              }else if(sum == 13){
                hexa = hexa+"D" ;
              }else if(sum == 14){
                hexa = hexa+"E";
              }else if(sum == 15){
                hexa = hexa+"F";  
              }else{
                hexa = hexa+""+ (int)sum;
              } 
         
              
         }
         
         
         System.out.println("hexadecimal is : "+hexa);
         
     }   
     
     public static void hexaToBinary(String hexa){
       String tmp="";
      String binary="";
       for(int i = 0;i < hexa.length();i++){
           tmp = String.valueOf(hexa.charAt(i));
           
           if(tmp.equals("0")){
            binary = binary+ "0000";
           }else if(tmp.equals("1")){
            binary = binary+ "0001";
           }else if(tmp.equals("2")){
           binary = binary+ "0010";
           }else if(tmp.equals("3")){
           binary = binary+ "0011";
           }else if(tmp.equals("4")){
           binary = binary+ "0100";
           }else if(tmp.equals("5")){
           binary = binary+ "0101";
           }else if(tmp.equals("6")){
           binary = binary+ "0110";
           }else if(tmp.equals("7")){
           binary = binary+ "0111";
           }else if(tmp.equals("8")){
           binary = binary+ "1000";
           }else if(tmp.equals("9")){
           binary = binary+ "1001";
           }else if(tmp.equals("A")|| tmp.equals("a")){
           binary = binary+ "1010";
           }else if(tmp.equals("B")|| tmp.equals("b")){
           binary = binary+ "1011";
           }else if(tmp.equals("C")|| tmp.equals("c")){
           binary = binary+ "1100";
           }else if(tmp.equals("D")|| tmp.equals("d")){
           binary = binary+ "1101";
           }else if(tmp.equals("E")|| tmp.equals("e")){
           binary = binary+ "1110";
           }else if(tmp.equals("F")|| tmp.equals("f")){
           binary = binary+ "1111";
           }
          
           
           
       }
     System.out.println("binary is : "+binary);
     
     }
     
     public static void binaryAdd(String a ,String b){
       char c ='0';
       String sum="";
       int pos1 = a.length() - 1;
       int pos2 = b.length() -1;
        
        while(pos1 >= 0|| pos2 >= 0){
         if(a.charAt(pos1) == '0' && b.charAt(pos2) == '0' && c == '0'){
             sum= "0"+sum;
             c ='0';
         }else if(a.charAt(pos1) == '1' && b.charAt(pos2) == '0' && c=='0'){
            sum = "1"+sum;
            c ='0';
         }else if(a.charAt(pos1) == '0' && b.charAt(pos2) == '1' && c=='0'){
            sum = "1"+sum;
            c ='0';
         }else if(a.charAt(pos1) == '1' && b.charAt(pos2) == '1' && c=='0'){
            sum = "0"+sum;
            c = '1';
         }else if(a.charAt(pos1) == '0' && b.charAt(pos2) == '0' && c=='1'){
            sum = "1"+sum;
            c = '0';
         }else if(a.charAt(pos1) == '1' && b.charAt(pos2) == '0' && c=='1'){
            sum = "0"+sum;
            c = '1';
         }else if(a.charAt(pos1) == '0' && b.charAt(pos2) == '1' && c=='1'){
            sum = "0"+sum;
            c = '1';
         }else if(a.charAt(pos1) == '1' && b.charAt(pos2) == '1' && c=='1'){
            sum = "1"+sum;
            c= '1';
            
         }
         pos1 = pos1 - 1;
         pos2 = pos2 - 1;
         
      }  
        while(pos1 >= 0){
            if(a.charAt(pos1) == '0' && c == '1'){
             sum= "1"+sum;
            c = '0';
         }else if(a.charAt(pos1) == '1' && c=='1'){
            sum = "0"+sum;
            c = '1';
            
         }else if(a.charAt(pos1) == '1' && c=='0'){
            sum = "1"+sum;
            c ='0';
         }else if(a.charAt(pos1) == '0'&& c=='0'){
            sum = "0"+sum;
            c = '0';
         }
         pos1 = pos1 - 1;
        }
        
         while(pos2 >= 0){
            if(a.charAt(pos2) == '0' && c == '1'){
             sum= "1"+sum;
            c = '0';
         }else if(a.charAt(pos2) == '1' && c=='1'){
            sum = "0"+sum;
            c = '1';
            
         }else if(a.charAt(pos2) == '1' && c=='0'){
            sum = "1"+sum;
            c ='0';
         }else if(a.charAt(pos2) == '0'&& c=='0'){
            sum = "0"+sum;
            c = '0';
         }
         pos2 = pos2 - 1;
        }
        
         if(c == '1'){
          sum = "1"+sum;
         }
         
         System.out.println(sum);
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner in = new Scanner(System.in);
        String input="";
        while(true){
        System.out.println("Options : (a) binary to decimal (b) decimal to binary (c) decimal to Hexadecimal \n(d) hexadecimal to decimal "
                + "(e) Binary to hexadecimal (f) hexadecimal to binary (g) add binary ");
        System.out.println("enter an option");
           input = in.nextLine();
        
        if(input.equals("a")){
           System.out.println("enter binary");
           input = in.nextLine();
           binaryToNum(input);
        }else if(input.equals("b")){
           System.out.println("enter number");
           input = in.nextLine();
           numToBinary(Integer.parseInt(input));
        }else if(input.equals("c")){
            System.out.println("enter number");
            input = in.nextLine();
            numToHexa(Integer.parseInt(input));
        }else if(input.equals("d")){
            System.out.println("enter hexadecimal");
            input = in.nextLine();
            hexaToNum(input);
        }else if(input.equals("e")){
            System.out.println("enter binary :");
            input = in.nextLine();
            binaryToHexa(input);
        }else if(input.equals("f")){
            System.out.println("enter hexadecimal");
            input = in.nextLine();
            hexaToBinary(input);
        }else if(input.equals("g")){
            String str1,str2;
            System.out.println("1st binary : ");
            str1 = in.nextLine();
            System.out.println("2nd binary : ");
            str2 = in.nextLine();
            binaryAdd(str1,str2);
        }else if(input.equals("quit")){
          break;
        
        }else{
         System.out.println("Error : wrong option");
        }
        
        
        
        
        
    
    }
        
    
    System.out.println("*******program terminated********");
   }  
}
