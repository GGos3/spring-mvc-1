package hello.servlet.domain.member;

import java.util.HashMap;
import java.util.Map;

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서 ConcurrentHashMap, AtomicLong 사용 고려
 */

public class MemberRepository {
    // static이 꼭 필요하지 않지만 사용함
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    // 싱글톤 객체
    private static final MemberRepository instance = new MemberRepository();

    // 아무나 생성 할 수 없으며 무조건 이 메소드를 통해 접근할 수 있음
    public static MemberRepository getInstance() {
        return instance;
    }
    public MemberRepository() {
    }
}
