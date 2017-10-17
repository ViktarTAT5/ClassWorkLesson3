/*package by.pvt.lesson3;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] mas = new int[]{327,381,891,918,212,848,770,363,416,736};
		
		int a = mas[0];
		
		for(int x : mas){
			if(x >= a){
				a = x;
			}
		}
		
		System.out.println(a);
		
		float[] res = new float[mas.length];
		
		for(int i = 0; i < mas.length; i++){
			res[i] = (float) mas[i] / (float) a;
			System.out.printf("%.2f ", res[i]);
		}
		
		
	}

}
*/