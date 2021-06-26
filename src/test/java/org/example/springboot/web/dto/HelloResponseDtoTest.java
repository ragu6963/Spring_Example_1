package org.example.springboot.web.dto;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class HelloResponseDtoTest {
    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        // when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        // then
        // assertThat : 검증 대상을 메소드 인자로 받는다.
        // 메소드 체이닝이 지원되는 isEqualTo와 같이 연결해서 사용할 수 있다.
        // isEqualTo : 비교 메서드
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
