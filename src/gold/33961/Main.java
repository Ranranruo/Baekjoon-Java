import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        
        int[][] arr = new int[2][c];
        
        
        int x = 0;
        int y = 0;
        
        if(c < 3) {
            System.out.println("NO");
            return;
        }
        
        System.out.println("YES");
        for (int i = 0; i < 2 * c; i++)  { 
            arr[y][x] = 1;
            System.out.println((y + 1) + " " + (x + 1));
            y = y == 0 ? 1 : 0;
            if(x + 2 < c && arr[y][x + 2] == 0) {
                x += 2;
            } else if (x - 2 >= 0 && arr[y][x - 2] == 0) {
                x -= 2;
            } else if (x + 1 < c && arr[y][x + 1] == 0) {
                x += 1;
            } else if (x - 1 >= 0 && arr[y][x - 1] == 0) {
                x -= 1;
            } 
        }
        
    }
}
