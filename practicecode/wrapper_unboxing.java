package practicecode;

public class wrapper_unboxing 
{
	public static void main(String[] args) 
	{
		byte x = 2;
		Byte byteobj = x;
		System.out.println("Byte object byteobj: " + byteobj);
		int y = 20;
		Integer intobj = y;
		System.out.println("Integer object intobj: " + intobj);
		float z = 28.6f;
		Float floatobj = z;
		System.out.println("Float object floatobj: " + floatobj);
		double d = 258.5;
		Double doubleobj = d;
		System.out.println("Double object doubleobj: " + doubleobj);
		char e = 'a';
		Character charobj = e;
		System.out.println("Character object charobj: " + charobj);
		byte bytev = byteobj;
		System.out.println("byte value: " + bytev);
		int intv = intobj;
		System.out.println("int value: " + intv);
		float floatv = floatobj;
		System.out.println("float value: " + floatv);
		double doublev = doubleobj;
		System.out.println("double value: " + doublev);
		char charv = charobj;
		System.out.println("char value: " +charv);
		
	}

}
