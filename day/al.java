package com.eomcs.lang.ex06;

public class al {
  public static void main(String[] args){
    
    System.out.println("점수를 입력해주세요.");
    java.util.Scanner keyboardInput = new java.util.Scanner(System.in);

    int score = keyboardInput.nextInt();
      keyboardInput.nextLine();
      
      if (score > 100 ) 
        System.out.println("점수가 잘못 됬습니다 확인해주세요");
        if ( score <= 100  && score >= 90 ){
        System.out.println("A");
        } else if ( score <= 89  && score >= 80 ){
          System.out.println("B");
          } else if ( score <= 79  && score >= 70 ){
            System.out.println("C");
           } else if ( score <= 69  && score >= 60 ){
              System.out.println("D");  
           } else if ( score <= 59  && score >= 0 ){
               System.out.println("F");
            
              }
          }

        }
      

        

        
        
      
    
  
  

  
  