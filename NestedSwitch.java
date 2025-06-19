package com.maurya;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();
        switch (empID) {
            case 1:
                System.out.println("Khushi Rawat");
                break;
            case 2:
                System.out.println("Nitin Shrivastava");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":

                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("Department not found");

                }
                default:
                    System.out.println("Enter Valid ID");
                }
        }
    }

