package maerge_sort_lab;


import java.util.Random;
import java.util.Scanner;
public class MergeSort {
 private int[] a;
 void input() {
 Scanner sc = new Scanner(System.in);
 Random rm = new Random();
 System.out.print("Enter the total numbers: ");
 int n = sc.nextInt();
 a = new int[n];
 for (int i = 0; i < n; i++) {
 a[i] = rm.nextInt(1000); // Generates random numbers 0-999
 } //rm.nextInt() can also be used
 }
 void display() {
 for (int x : a) {
 System.out.print(x + " ");
 }
 }
 void sort() {
 mergesort(0, a.length - 1);
 }
 void mergesort(int left, int right) {
 int mid;
 if (left>=right)
 {
 return;
 }
 else 
 {
 
 mid = (left + right) / 2;
 mergesort(left, mid);
 mergesort(mid + 1, right);
 merge(left, mid, right);
 }
 
 }
 void merge(int left, int mid, int right) {
 int temp[] = new int[a.length];

 int i = left;
 int j = mid + 1;
 int k = 0;
 while (i <= mid && j <= right) {
 if (a[i] <= a[j]) {
 temp[k++] = a[i++];
 } else {
	 temp[k++] = a[j++];
	 }
	 }
	 while (i <= mid) {
	 temp[k++] = a[i++];
	 }
	 while (j <= right) {
	 temp[k++] = a[j++];
	 }
	 for(i = left; i <= right; i++) {
	 a[i]=temp[i-left];
	 }
	 }
	 public static void main(String args[]) {
	 MergeSort sorter = new MergeSort();
	 sorter.input();
	 System.out.println("Array before sorting");
	 sorter.display();
	 long startTime = System.nanoTime();
	 sorter.sort();
	 long endTime = System.nanoTime();
	 double duration = (endTime - startTime) / 1000000; //divide by 1000000 to get milliseconds.
	 System.out.println("\nArray After sorting");
	 sorter.display();
	 System.out.println("\nTime for sorting is " + duration + " milli seconds");
	 }
}
