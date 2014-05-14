package junit.transEng;
	
import java.util.Scanner;
	
public class TransEng {
	
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int input = sc.nextInt();
		        
		        System.out.println(translateEng(input));
		        
		        
		    }
		    
		    // 数値を英訳する変換するメソッド
		    static String translateEng(int n) {
		    	if(0<=n && n<10){
		    		return trans1(n);
		    	}
		    	else if(10<=n && n<20){
		    		return trans2(n);
		    	}
		    	else if(20<=n && n<100){
		    		return trans3(n);
		    	}
		        return "";
		    }
		    
		    static String trans1(int n){
		    	if(n==1) return"one";
		    	else if(n==2) return"two";
		    	else if(n==3) return"three";
		    	else if(n==4) return"four";
		    	else if(n==5) return"five";
		    	else if(n==6) return"six";
		    	else if(n==7) return"seven";
		    	else if(n==8) return"eight";
		    	else return"nine";
		    }
		    static String trans2(int n){
		    	if(n==10) return"ten";
		    	else if(n==11) return "eleven";
		    	else if(n==12) return"twelve";
		    	else if(n==13) return"thirteen";
		    	else if(n==14) return"fourteen";
		    	else if(n==15) return"fifteen";
		    	else if(n==16) return"sixteen";
		    	else if(n==17) return"seventeen";
		    	else if(n==18) return"eightteen";
		    	else  return"nineteen";
		    }
		    static String trans3(int n){
		    	return "";
		    }
		}

