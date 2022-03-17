package excelprogram;


public class ExcelMain {
	public static void main(String[] args) throws Exception
	{
		Excel ob = new Excel();
		String a = ob.readData(0,0);
		System.out.println("values of a is :"+a);
		String b = ob.readData(0,1);
		System.out.println("values of b is :"+b);
	}
}
