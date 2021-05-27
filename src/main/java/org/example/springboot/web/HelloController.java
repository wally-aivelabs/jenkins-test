package org.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "안녕안녕녕ddd하세요 웹훅 테스트 중dd...dfadsfdfadsf디벨롭., 포트는 8090 끙... 이제는 원격 배포 테스트 중..,,df 젠킨스 젠킨스dd~~ 아우아아ㅇㅇㄹㅁㄴㅇㄹㅇaadfasdfaㄹㅁ";
    }
}