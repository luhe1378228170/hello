package test;

import java.util.Arrays;

import java.util.Collection;

import org.junit.*;

import org.junit.runner.RunWith;

import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameters;

import hw1.exp;

import static org.junit.Assert.*;

 

@RunWith(Parameterized.class) //这是一个参数化的测试类

public class expTest {

private exp tr;

private int a,b,c,expected;

 

public expTest(int a,int b,int c,int expected){

    this.a=a;

    this.b=b;

    this.c=c;

    this.expected=expected;

}

 @Before   //在运行之前先运行这个函数

public void setUp(){

    tr=new exp();

}

 

 @Parameters  //给构造函数参数初始化

 public static Collection<Object[]> getData(){

     return Arrays.asList(new Object[][]{

            {1,2,3,1},

            {2,2,2,0},

            {2,2,3,2},

            {2,3,4,1}

     });

 }

@Test     //测试Train函数

public void testTrian(){

    assertEquals(this.expected,tr.trian(a,b,c));

}

 

}