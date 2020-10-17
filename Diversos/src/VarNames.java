import java.lang.reflect.Field;

class vars{
	public int i = 4;
	double d = 2.5242424;
	float f = 3.45897f;
	char c = 'a';
	String s = "tis - 2ano";
	boolean b = true;

	long li = 823764825;
	
	final int constante = 55;
}

public class VarNames {
	

	public static void main(String[] args) {
	
		Field fld[] = vars.class.getDeclaredFields();
		
		System.out.println(fld.length);
		
		for (int k = 0; k < fld.length; k++)
        {
            System.out.println("Variable Name is : " + fld[k].getName());
        }                       

	}
}