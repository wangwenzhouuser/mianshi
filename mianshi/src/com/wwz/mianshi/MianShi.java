package com.wwz.mianshi;

import java.util.Scanner;

public class MianShi {

    public static void main(String[] args) {
        //demo1();
        //demo2();
        //demo3();
        demo4();
    }

    //题目1
    private static void demo1(){

        Scanner sc = new Scanner(System.in);


        int apple = 0;
        int berries = 0;
        while (true){
            System.out.println("请输入苹果的斤数：");
            apple = sc.nextInt();
            if (apple >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }
        while (true){
            System.out.println("请输入草莓的斤数：");
            berries = sc.nextInt();
            if (berries >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        System.out.println("您购买的苹果的斤数为："+apple);
        System.out.println("您购买的草莓的斤数为："+berries);
        System.out.println("您一共花费"+((apple * 8) + (berries * 13))+"元");

    }

    //题目2
    private static void demo2(){

        Scanner sc = new Scanner(System.in);


        int apple = 0;
        int berries = 0;
        int mango = 0;
        while (true){
            System.out.println("请输入苹果的斤数：");
            apple = sc.nextInt();
            if (apple >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }
        while (true){
            System.out.println("请输入草莓的斤数：");
            berries = sc.nextInt();
            if (berries >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        while (true){
            System.out.println("请输入芒果的斤数：");
            mango = sc.nextInt();
            if (mango >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        System.out.println("您购买的苹果的斤数为："+apple);
        System.out.println("您购买的草莓的斤数为："+berries);
        System.out.println("您购买的芒果的斤数为："+mango);
        System.out.println("您一共花费"+((apple * 8) + (berries * 13)+(mango * 20))+"元");

    }

    //题目3
    private static void demo3(){

        Scanner sc = new Scanner(System.in);


        int apple = 0;
        int berries = 0;
        int mango = 0;
        while (true){
            System.out.println("请输入苹果的斤数：");
            apple = sc.nextInt();
            if (apple >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }
        while (true){
            System.out.println("请输入草莓的斤数：");
            berries = sc.nextInt();
            if (berries >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        while (true){
            System.out.println("请输入芒果的斤数：");
            mango = sc.nextInt();
            if (mango >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        System.out.println("您购买的苹果的斤数为："+apple);
        System.out.println("您购买的草莓的斤数为："+berries);
        System.out.println("您购买的芒果的斤数为："+mango);
        double sum = ((apple * 8) + (berries * 13)+(mango * 20)) * 0.8;
        System.out.println("您一共花费"+String.format("%.2f",sum)+"元");

    }

    /**
     * 题目4
     * 保留了题目3的8折
     * 每满100减10 ，也就是说200减20 300减30...
     */
    private static void demo4(){

        Scanner sc = new Scanner(System.in);


        int apple = 0;
        int berries = 0;
        int mango = 0;
        while (true){
            System.out.println("请输入苹果的斤数：");
            apple = sc.nextInt();
            if (apple >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }
        while (true){
            System.out.println("请输入草莓的斤数：");
            berries = sc.nextInt();
            if (berries >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        while (true){
            System.out.println("请输入芒果的斤数：");
            mango = sc.nextInt();
            if (mango >= 0){
                break;
            }
            System.out.println("输入有误，请重新输入");
        }

        System.out.println("您购买的苹果的斤数为："+apple);
        System.out.println("您购买的草莓的斤数为："+berries);
        System.out.println("您购买的芒果的斤数为："+mango);
        double sum = ((apple * 8) + (berries * 13)+(mango * 20)) * 0.8;
        int a = 0;
        while (a * 100<sum){
            a++;
        }
        a--;
        double descount = sum - (a * 10);
        System.out.println("您一共花费"+String.format("%.2f",descount)+"元");

    }
}
