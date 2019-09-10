package com.ddb.javacore.helloword;

/**
 * 作者：薛志成
 * 时间：2019.09.08
 * 说明：这是我第一个自己设计的程序
 */
//导入Scanner类
import java.util.Scanner;

public class lianxi {
//程序运行的入口
	public static void main(String[] args) {
		//输出信息控制台
    System.out.println("姓刘的的名字");
    //需要手动输入信息
    Scanner sc = new Scanner(System.in);
   //从控制台接受字串符
    String name = sc.nextLine();
    //输出信息
    System.out.println("姓刘的名字是" + name);
    //手动输入的信息
    System.out.println("他的年龄是");
    //从控制台接受字串符
    String old = sc.nextLine();
    //输出信息
    System.out.println("他的年龄是" + old );
    
    System.out.println("姓郭的名字");
    
    Scanner sc1 = new Scanner(System.in);
    
    String name1 = sc1.nextLine();
    
    System.out.println("姓郭的名字是" + name1);
    
    System.out.println("他的年龄是" );
    
    String old1 = sc1.nextLine();
    
    System.out.println("他的年龄是" + old );
    
    System.out.println("姓彭的名字");
    
    Scanner sc2 = new Scanner(System.in);
    
    String name2 = sc2.nextLine();
    
    System.out.println("姓彭的名字是" + name2 );
    
    System.out.println("他的年龄是" );
    
    String old2 = sc2.nextLine();
    
    System.out.println("他的年龄是" +old2 );
    
	}

}
