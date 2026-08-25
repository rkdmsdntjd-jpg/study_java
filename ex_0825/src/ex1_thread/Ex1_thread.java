package ex1_thread;

public class Ex1_thread {
    /*
    thread : 프로세스 안에서 실제로 작업을 실행하는 작업의 단위(cpu가 작업을 수행하는 실행의 단위)
    process : 실행 중인 프로그램, 자원/실행 환경

    ex) game program - process
    -thread1 : 게임 로직 처리
    -thread2 : 화면 렌더링
    -thread3 : 네트워크 처리
    -thread4 : 사운드 처리

    Multi-thread : 하나의 프로세스 안에서 여러 개의 스레드가 동시에 작업하는 방식
    Multitasking : 컴퓨터가 여러 작업을 동시에 수행하는 것처럼 보이게 하는 것(웹 브라우저 사용 + 음악 재생 + 카톡 + 문서 작성)

    스레드 생성 방법
    1. thread class 상속
    2.Runnable 인터페이스 구현 <-권장(자바는 다중 상속을 지원하지 않기 때문)

    스레드 스케줄링(우선 순위에 따라 cpu할당 시간 분배)
    PRIORITY
    -MAX-PRIORITY
    -NORM-PRIORITY
    -MIN-PRIORITY
    (단, 우선순위가 높다고 반드시 먼저 실행되거나 CPU를 더 많이 받는 것은 아님)

    스레드 라이프 사이클(thread life cycle)
    -new : 쓰레드가 new 키워드를 통해 인스턴스화 된 상태
    -runnable : start()메소드 호출로 실행 준비를 마치고 할당받은 시간에 cpu를 사용
    -bloched : 다른 스레드가 가진 모니터 락(lock)을 기다리는 상태
    -waiting : 다른 스레드의 작업 등을 기다리는 상태 (join(), wait() 등)
    -timed_waiting : 일정 시간 동안 기다리는 상태 (sleep(), join(시간) 등)
    -dead : run()메소드를 탈출시 관련 데이터가 사라진다

    스레드는 메소드, 힙 메모리 영역을 모두 공유(각 스레드는 자신의 스택을 가진다)
    ex) A스레드에서 만든 객체 주소값을 알면, B스레드가 A스레드의 객체에 접근이 가능하다.

    start()	새로운 스레드 시작
    run()	스레드가 실행할 작업
    sleep()	일정 시간 동안 일시 정지
    join()	다른 스레드의 종료를 기다림
    interrupt()	스레드의 인터럽트를 요청
    isAlive()	스레드가 실행 중인지 확인
    setPriority()	스레드 우선순위 설정
    getPriority()	스레드 우선순위 확인
    currentThread()	현재 실행 중인 스레드 반환

    동기화Synchronization : 여러 스레드가 공유 자원에 동시에 접근할 때 데이터가 꼬이는 것을 방지하기 위해 접근을 제어하는 것
    → 데이터의 일관성과 안전성을 확보
     */
}
