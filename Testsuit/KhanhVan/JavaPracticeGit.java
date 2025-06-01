package JavaPracticeGit;

import java.util.Scanner;

public class JavaPracticeGit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số lượng phần tử");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập lần lượt các phần tử mảng:");
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.println("Tổng các phần tử trong mảng là: " + sum);
	}

}
