package test;

import java.util.Arrays;

import java.util.Collection;

import org.junit.*;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

import hw1.exp;

import static org.junit.Assert.*;

 

@RunWith(Parameterized.class) //����һ���������Ĳ�����

public class expTest {

private exp tr;

private int a,b,c,expected;

 

public expTest(int a,int b,int c,int expected){

    this.a=a;

    this.b=b;

    this.c=c;

    this.expected=expected;

}

 @Before   //������֮ǰ�������������

public void setUp(){

    tr=new exp();

}

 

 @Parameters  //�����캯��������ʼ��

 public static Collection<Object[]> getData(){

     return Arrays.asList(new Object[][]{

            {1,2,3,1},

            {2,2,2,0},

            {2,2,3,2},

            {2,3,4,1}

     });

 }

@Test     //����Train����

public void testTrian(){

    assertEquals(this.expected,tr.trian(a,b,c));

}

 

}