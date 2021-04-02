### 210326

## 멀티 Thread

* 멀티 태스킹 : 두가지 작업을 동시에 처리하는 것
* 메신저같은 app은 한 프로그램 안에서 멀티태스킹을 동시에 하기도 함
* Thread : 프로그램의 실행흐름
	* 프로그램 내에 thread가 2개라면 **두 개의 코드 흐름이 생긴다**는 뜻
* lang 패키지에 들어있다

### Thread 사용 방법 2가지
* 비슷한데 조금 다르다
1) Runnable 인터페이스를 상속받아 사용하는 방법
	* 쓸 수 있는 게 한정적이다
	* run() 추상메서드만 오버라이딩(재정의)
2) Thread 클래스를 상속받아 사용하는 방법

* 두 개의 차이는?
	* Runnable은 인터페이스니까 thread 실행의 기능만 정의되어 있어 클래스 내부에서 사용할 수 있는 메서드가 한정적 ( thread의 static 메서드는 전부 사용 가능)
	* thread 클래스를 상속받으면 갖고 있는 기능을 전부 받아서 사용할 수 있다.

### Thread 기본 메서드
* start() : Thread 클래스 실행
* **(static)**currentThread() : 현재 Thread 반환
* getName() : Thread 이름 반환
* **(static)**sleep() : Thread 잠시 멈춤
* yield() : Thread 실행을 다른 Thread에게 양보
* join() : 해당 Thread를 우선 실행

### Thread 실행
* 1개의 객체를 두개의 Thread한테 전달해 실행하는 방법
* Thread마다 있는 하나의 객체를 실행하는 방법

### 멀티Thread는 순서 보장을 하지 않는다

### 동기화 메서드 synchronized
* Thread가 사용중인 객체를 다른 Thread가 변경할 수 없도록 객체에 lock을 걸어 다른 Thread가 사용하지 못하도록 한다.
* 비동기 : 여러가지 일을 동시에 처리한다.
* 동기 : 여러가지 일을 순서대로 처리한다.

## 자바 과정에서 안배운것
### swing
* 윈도우 응용프로그램에 ui를 만드는 것
### java.net 패키지
