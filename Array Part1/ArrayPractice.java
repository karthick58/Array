package Arrays.practice;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayPractice ap = new ArrayPractice();
		// ap.Array_Declaration();
		// ap.copy_all_element_one_array_to_another_array();
		//ap.frequency_of_each_element_in_array();	
	}


	private void frequency_of_each_element_in_array() {
		// TODO Auto-generated method stub
		int ar[] = { 10, 20, 10, 20, 30, 50, 40, 50 };
		int[] freq = new int[ar.length];
		for (int j = 0; j < ar.length; j++) {
			int no = ar[j];
			int count = 1;
			for (int i = j + 1; i < ar.length; i++) {

				if (no == ar[i]) {
					count++;
					freq[i] = -1;
				}
			}
			if(freq[j]!=-1) {
				freq[j]=count;
			}
		}
		for(int i=0;i<ar.length;i++) {
			if(freq[i]>0)
			System.out.println(ar[i]+" occurs "+freq[i]+" times");
		}
	}

	private void copy_all_element_one_array_to_another_array() {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = new int[a.length];
		System.out.println("original array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			b[i] = a[i];
		}
		System.out.println();
		System.out.println("new array");

		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + " ");
		}
	}

	private void Array_Declaration() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length:");
		int a = sc.nextInt();
		int ar[] = new int[a];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		for (int j = ar.length - 1; j >= 0; j--) {
			System.out.print(ar[j]);
		}

	}

}
