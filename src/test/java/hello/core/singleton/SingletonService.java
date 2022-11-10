package hello.core.singleton;

public class SingletonService {
    private static final SingletonService instance = new SingletonService(); // 생성후 instance 에 바로 저장해놓음
    // 딱 하나만 존재하게됨 // 자바 기본 스태틱 영역 공부

   public static SingletonService getInstance() {// 조회 할때는 이 친구를 씀
       return instance;
   }

   private SingletonService() {

   }

   public void logic() {
       System.out.println("싱글톤 객체 로직 호출"); // getInstance() - 단 한개만 생성하기때문에 얘로밖에 못받음
   }

}
