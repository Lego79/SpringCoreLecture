package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (
        basePackages = "hello.core.member", //탐색할 위치 시작, 이게 없음녀 모든 자바, 라이브러리 까지 다뒤짐 엄청 오래걸린다
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class))
//정보를 쫙 끌어와야함, @Componet 가 붙은 모든 것들을 스프링 빈으로 지정해줌 // 필터를 써서 컨피규 레이션은 수동등록한거라 빼야함+


public class AutoAppConfig {
    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
