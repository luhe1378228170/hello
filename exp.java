package hw1;

public class exp {

	 public int trian(int a,int b,int c){

	       if((a==b)&&(a==c)&&(b==c)){  //�ȱ�������

	           return 0;

	       }

	       else if((a != b)&&(a!=c)&&(b!=c)){  //���ȱ�������

	           return 1;

	       }

	       else{

	           return 2;      //����������

	       }

	    }
}
