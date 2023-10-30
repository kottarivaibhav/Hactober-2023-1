package floyd_program;


import java.util.Scanner;
public class Floyds {
 static int[][] dist;
 static int n;
 static void compute_floyds() {
 int i, j, k;
 for (k = 1; k <= n; k++) // record the lengths of shortest path
 {
 for (i = 1; i <= n; i++) {
 for (j = 1; j <= n; j++) {
 dist[i][j] = min(dist[i][j], dist[i][k] + 
dist[k][j]);
 }
 }
 System.out.println("distance matrix iteration after"+k);
 for (i = 1; i <= n; i++) {
 for (j = 1; j <= n; j++) {
 System.out.print(dist[i][j] + "\t");
 }
 System.out.println();
 }
 System.out.println();
 }
 }
 static int min(int i, int j) {
 if (i < j) 
 return i;
 else 
 return j;
 
 }
 public static void main(String[] args) {
 int i, j;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of vertices");
 n = sc.nextInt();
 dist = new int[n + 1][n + 1];
 System.out.println("Enter the weighted matrix (99 for no edge)");
 for (i = 1; i <= n; i++) {
 for (j = 1; j <= n; j++) {
 dist[i][j] = sc.nextInt();
 }
 }
 compute_floyds();
 System.out.println("All pairs shortest path distance matrix is");
 for (i = 1; i <= n; i++) {
 for (j = 1; j <= n; j++) {
 System.out.print(dist[i][j] + "\t");
 }
 System.out.println();
 }
 }
}
