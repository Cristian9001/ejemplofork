package poooo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array=new int[102];

for (int i=100;i>0;i--) {
	
	array[i-1]=i;	
	System.out.println(i);
	
}

incrementanotas(array.clone());

	}

	private static void incrementanotas(int[] clone) {
		// TODO Auto-generated method stub
		for (int i=100;i>0;i--) {
			
			clone[i-1]=i;	
			System.out.println(i);
	}

	}
}
