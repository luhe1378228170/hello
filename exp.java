package hw1;

public class exp {

	 public int trian(int a,int b,int c){

	       if((a==b)&&(a==c)&&(b==c)){  //等边三角形

	           return 0;

	       }

	       else if((a != b)&&(a!=c)&&(b!=c)){  //不等边三角形

	           return 1;

	       }

	       else{

	           return 2;      //等腰三角形

	       }

	    }
}
