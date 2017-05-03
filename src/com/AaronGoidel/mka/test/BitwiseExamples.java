package com.AaronGoidel.mka.test;

public class BitwiseExamples {
	public static void main(String[] args) {
		
		System.out.println("Working with byte:");
		byte p = 0b0;
		byte q = 0b1;
		byte r = 0b11;
		byte s = 0b11;
		
		System.out.println(p & q);
		System.out.println(Integer.toBinaryString(r & s) + "\n");

		System.out.println("Working with byte:");
		byte x = 127;
		byte y = 0b00101010;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();
		
		System.out.println((byte) (x & y));
		System.out.println((byte) (x | y));
		System.out.println((byte) (x ^ y));
		System.out.println((byte) (~x));
		System.out.println((byte) (~y));
		System.out.println();
		
		System.out.println("Working with int:");
		int u = 0b01010101010101010101010101010101;
		int v = 0b00101010101010101010101010101010;
		int w = 2147483647;
		System.out.print(u);System.out.println(" , " + Integer.toBinaryString(u));
		System.out.print(v);System.out.println(" , " + Integer.toBinaryString(v));
		System.out.print(w);System.out.println(" , " + Integer.toBinaryString(w) + "\n");
		
		System.out.println(Integer.toBinaryString(u) + " &");
		System.out.println(" " + Integer.toBinaryString(v));
		System.out.println(Integer.toBinaryString(u & v) + "\n");
		
		System.out.println(Integer.toBinaryString(u) + " |");
		System.out.println(" " + Integer.toBinaryString(v));
		System.out.println(Integer.toBinaryString(u | v) + "\n");
		
		System.out.println(Integer.toBinaryString(w) + " ^");
		System.out.println(" " + Integer.toBinaryString(v));
		System.out.println(Integer.toBinaryString(w ^ v) + "\n");
		
		System.out.println(Integer.toBinaryString(u) + " ^");
		System.out.println(" " + Integer.toBinaryString(v));
		System.out.println(Integer.toBinaryString(u ^ v) + "\n");
		
		System.out.println("Working with int and shift operators:" + "\n");
		
		w = 0b10101010101010101010101010101010;
		
		System.out.println(Integer.toBinaryString(w) + " << 4");
		System.out.println(Integer.toBinaryString(w << 4));
		System.out.println(w << 4);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(u) + " << 4");
		System.out.println(Integer.toBinaryString(u << 4));
		System.out.println(w << 4);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(w) + " >> 8");
		System.out.println(Integer.toBinaryString(w >> 8));
		System.out.println(w >> 8);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(v) + " >> 8");
		System.out.println(Integer.toBinaryString(v >> 8));
		System.out.println(v >> 8);
		System.out.println();
		
		System.out.println(Integer.toBinaryString(w) + " >>> 3");
		System.out.println(Integer.toBinaryString(w >>> 3));
		System.out.println(w >>> 3);
		System.out.println();
		
	}  // close main method
}  // close public class
