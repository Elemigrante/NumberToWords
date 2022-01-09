package com.dmitriyneladnov;

public class Main {

  public static void main(String[] args) {
    numberToWords(235);
  }

  public static void numberToWords(int number) {
    if (number < 0) System.out.println("Invalid Value");

    int count = getDigitCount(number);
    number = reverse(number);

    for (int i = 0; i < count; i++) {
      int lastDigit = number % 10;

      switch (lastDigit) {
        case 0:
          System.out.print("Zero");
          break;
        case 1:
          System.out.print("One");
          break;
        case 2:
          System.out.print("Two");
          break;
        case 3:
          System.out.print("Three");
          break;
        case 4:
          System.out.print("Four");
          break;
        case 5:
          System.out.print("Five");
          break;
        case 6:
          System.out.print("Six");
          break;
        case 7:
          System.out.print("Seven");
          break;
        case 8:
          System.out.print("Eight");
          break;
        case 9:
          System.out.print("Nine");
          break;
        default: break;
      }
      number /= 10;
    }
  }

  public static int reverse(int number) {
    int reverse = 0;
    int lastDigit = 0;

    while (number != 0) {
      lastDigit = number % 10;
      reverse = (reverse * 10) + lastDigit;
      number /= 10;
    }
    return reverse;
  }

  public static int getDigitCount(int number) {
    if (number < 0) return -1;
    int count = 0;

    while (number > 0) {
      count++;
      number /= 10; // exclude digit from number
    }
    return count;
  }
}
