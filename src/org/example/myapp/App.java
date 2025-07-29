package org.example.myapp;

import com.google.common.base.Joiner;
import org.example.util.Utils;

/**
 * 이 클래스는 한밭대학교 특강 실습 예제를 위한 첫 번째 클래스 입니다. <br>
 * <code>App</code> 클래스!
 */
public class App {

  /**
   * 이 메서드는 entry point 이다. 콘솔에 "Hello!"를 출력한다.
   *
   * @param args 명령행 인자
   */
  public static void main(String[] args) {
    Utils.printMessage("hello, world");
    String message = Joiner.on(", ").join("hello", "world");
  }
}
