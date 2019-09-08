package com.ddb.javacore.helloword;

import java.util.Scanner;

//导入Scanner类
public class TestName {

	public static void main(String[] args) {
		System.out.println("请输入您的名字");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("您的名字是：" + name);

	}

}
