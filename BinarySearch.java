
public class BinarySearch {
 
public static void main(String[] args) {
 
//using the second test from code step by step
 
int[] a = {-4, 2, 7, 10, 15, 20, 22, 25, 30, 36, 42, 50, 56, 68, 85, 92, 103};
 
System.out.println(binarySearch(a,66,0, a.length-1));
 
}
 
public static int binarySearch(int[] a, int target, int min, int max) {
 
if (min > max) {
 
return -1;
 
}
 
else {
 
int mid = (min + max) / 2;
 
 
if(a[mid] < target) { 
 
return binarySearch(a,target, mid + 1, max);
 
}
 
else if (a[mid] > target) {
 
return binarySearch(a,target,min,mid -1);
 
}
 
else {
 
return mid;
 
}
 
}
 
}
