package org.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "안녕안녕녕하세요 웹훅 테스트 중dd...디벨롭., 포트는 8090 끙... 이제는 원격 배포 테스트 중..,,df";
    }
}