package secao06TiposDados;


public class Programa11 {
	public static void main(String[] args) {
		// Tipos primitivos inteiros
		byte  num1 = 1;
		char  num2 = 2;  // Character unicode que pode se tratado como inteiro de 16 bits
		short num3 = 3;
		int   num4 = 4;
		long  num5 = 5L; // L identifica um valor literal como long
		
		// Tipos não primitivos/primários
		Byte      num6 = 6;
		Character num7 = 7;
		Short     num8 = 8;
		Integer   num9 = 9;
		Long      num10 = 10L;
		
		System.out.println("byte -> num1 = " + num1);
		System.out.println("char -> num2 = " + num2);
		System.out.println("short -> num3 = " + num3);
		System.out.println("int -> num4 = " + num4);
		System.out.println("long -> num5 = " + num5);
		System.out.println("Byte -> num6 = " + num6);
		System.out.println("Character -> num7 = " + num7);
		System.out.println("Short -> num8 = " + num8);
		System.out.println("Integer -> num9 = " + num9);
		System.out.println("Long -> num10 = " + num10);
		System.out.println("");
		
		System.out.println("byte/Byte " + Byte.SIZE + " bits");
		System.out.println("char/Character " + Character.SIZE + " bits");
		System.out.println("short/Short " + Short.SIZE + " bits");
		System.out.println("int/Integer " + Integer.SIZE + " bits");
		System.out.println("long/Long " + Long.SIZE + " bits");
		System.out.println("");
		
		// Os tipos primitivos possuem sinal, dessa forma o >> mantém o bit de sinal ligado.
		// Por isso deve-se usar o >>> quando for trabalhar com bitmask
		num1 = (byte) 0x80; // 0b10...0
		System.out.println("num1 (byte) = " + byte2bitstring(num1));
		System.out.println("num1 >>  1  = " + byte2bitstring((byte) (num1 >>  1)));
		System.out.println("num1 >>> 1  = " + byte2bitstring((byte) (num1 >>> 1)));
		System.out.println("");
		
		num3 = (short) 0x80_00; // 0b10...0
		System.out.println("num3 (short) = " + short2bitstring(num3));
		System.out.println("num3 >>  1   = " + short2bitstring((short) (num3 >>  1)));
		System.out.println("num3 >>> 1   = " + short2bitstring((short) (num3 >>> 1)));
		System.out.println("");

		num4 = 0x80_00_00_00; // 0b10...0
		System.out.println("num4 (int) = " + int2bitstring(num4));
		System.out.println("num4 >>  1 = " + int2bitstring(num4 >>  1));
		System.out.println("num4 >>> 1 = " + int2bitstring(num4 >>> 1));
		System.out.println("");
		
	}
	
	private static String byte2bitstring(byte b) {
		String s = "";
		
		for (byte i=0; i<8; i++) {
			s = ((b >>> i) & 0x01) + s;
		}
		
		s = "0b" + s;
		
		return s;
	}
	
	private static String short2bitstring(short sh) {
		String s = "";
		
		for (short i=0; i<16; i++) {
			s = ((sh >>> i) & 0x0001) + s;
		}
		
		s = "0b" + s;
		
		return s;
	}

	private static String int2bitstring(int it) {
		String s = "";
		
		for (int i=0; i<32; i++) {
			s = ((it >>> i) & 0x00000001) + s;
		}
		
		s = "0b" + s;
		
		return s;
	}
}
