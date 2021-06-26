package org.example.springboot.web;
import org.example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController // JSON을 반환하는 컨트롤러
public class HelloController {
    
    @GetMapping("/hello") // URL 매핑
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto hellodDto(@RequestParam("name") String name,
                                      @RequestParam("amount") int amount){
        // @RequestParam : API로 넘긴 파라미터를 가져오는 어노테이션
        // @RequestParam("name") String name : 쿼리스트링의 변수 name의 값을 문자열 변수 name에 저장한다.
        return new HelloResponseDto(name, amount);
    }


}

