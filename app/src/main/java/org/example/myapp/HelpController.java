package org.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // request handler의 리턴값은 Thymeleaf가 실행할 View(탬플릿 파일) 이름이다.
public class HelpController {

  @GetMapping("/help")
  public String help() {
    return "help"; // 리턴값은 클라이언트에게 보내는 content가 아닌 Thymeleaf엔진에게 알려줄 탬플릿 파일 이름이다.
  }
}
