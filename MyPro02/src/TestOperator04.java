import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * λ�����
 * @author ���
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {
		 int  a = 3;
		 int  b =4;
		 System.out.println(a&b);
		 System.out.println(a|b);
		 System.out.println(a^b);
		 System.out.println(~a);
		 
		 //��λ
		 int  c = 3<<2;
		 System.out.println(c);
		 System.out.println(12>>1); 
		 System.out.println(30>>1);
		 System.out.println("0"+'a'+'b');
	}
}

