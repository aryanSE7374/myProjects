package myProjects;

/**
 * tryGit
 */
public class tryGit {
    static void reveseNum(int num1 , int num2){
        int temp;
        temp = num1;
        num1 = num2;
        num2 = num1;
        System.out.println(num1 + num2);
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        reveseNum(num1 , num2);
    }
}