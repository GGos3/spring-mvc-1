package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        // {}를 사용해 문자열의 + 연산을 피할 수 있다
        log.trace(" trace log={}", name); // 로컬
        log.trace(" debug log={}", name); // 개발
        log.info(" info log={}", name); // 운영
        log.warn(" warn log={}", name);
        log.error(" error log={}", name);

        return "ok";
    }
}
