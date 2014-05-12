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
		    	return "four";
		    }
		    static String trans2(int n){
		    	return "";
		    }
		    static String trans3(int n){
		    	return "";
		    }
		}

