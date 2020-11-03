package com.wuzu.Test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] studentScoreArr;
        int max;
        System.out.print("请输入学生的人数: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        studentScoreArr = new int[num];
        System.out.println("请输入" + num + "个成绩");
        for (int i = 0; i < num; i++) {
            studentScoreArr[i] = scanner.nextInt();
        }
        max = studentScoreArr[0];
        for (int i = 1; i < num; i++) {
            if (max < studentScoreArr[i]) {
                max = studentScoreArr[i];
            }
        }
        System.out.println("最高分是:" + max);
    }
}
