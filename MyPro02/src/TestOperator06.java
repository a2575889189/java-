

/**
 * �������������Ԫ�������
 * @author  ���
 *
 */
public class TestOperator06 {
	public static void main(String[] args) {
//		int  score = 80;
		int  x = -100;
//		String   type = score<60?"������":"����";
//		System.out.println(type);
//		
//		if(score<60){
//			System.out.println("������");
//		}else{
//			System.out.println("����");
//		}
//		
//		System.out.println(x > 0 ? 1 : (x == 0 ? 0 : -1)); 
		int score = 80;
		String type = score<60?"����":"������";
		System.out.println(type);
		if (score<60) {
			System.out.println("no");
			
		}else {
			System.err.println("yes");
		}
		System.out.println(x>0?1:(x == 0?0:-1 ));
	}
}
