### 210316

## 라이브러리 만들기
1. Export > Java > jar file(java의 압축파일)
	* java 파일에 메인메소드가 없어야함
2. 사용하고자하는 프로젝트에 lib 폴더를 만들고 build path > jar 파일을 추가한다
3. 그러면 referenced libraries라는 게 생기고 그 프로젝트 내에서 함수처럼 사용할 수 있다.

## String의 단점을 보완한 StringBuilder
* 메모리를 과소비하는 String의 단점을 보완하는 클래스
* 객체를 한 번 만들고 그걸 계속 변경해서 쓰는 방법
	* 1000번 바꿔도 1개를 유지
	* String은 1000번 바꾸면 1000개가 생김
* builder와 buffer는 똑같은데, buffer가 조금 더 안정적
	* 안정적? 쓰레드(프로그램 실행 흐름)가 여러개일 때 
* String과 StringBuffer는 다른 타입!
	* StringBuffer 클래스타입을 문자열 타입으로 변경하고 싶으면 String으로 변경해서 사용!

* 코테나 알고리즘 공부할 때 메서드 쓰는 게 더 깔끔하다, 쓰지 말라는 건 조건이 붙어있으면 쓰지 말 것

## Wrapper 클래스
* 기본 타입의 값을 갖는 객체
* 기본 타입의 값을 객체 내부에 두고 포장하기 때문
* 기본 타입의 값은 외부에서 변경할 수 없다.
* 변경하고 싶으면 새로운 wrapper 객체를 생성하야 한다
* Byte, Short, Integer, Double, Float 등등
* 박싱(Boxing) : 기본 타입의 값을 포장 객체로 만드는 과정
* 언박싱(Unboxing) : wrapper 객체에서 기본 타입의 값을 얻어내는 과정
* java 1.8 버전부터 AutoBoxing을 지원함
	```java
	byte b = 1;
	Byte bb = 1;
	String s = " ";
	```
* **문자열을 숫자로 변환할 때 제일 많이 사용한다!**

## java.util
* 사용하기에 유용한 기능들을 모아놓은 것

### 주요 메서드
* binarySearch(배열, 찾는 값) : 이진탐색 : 찾는 값의 인덱스를 리턴
* copy(원본 배열, 복사할길이)
* copyOfRange(원본 배열, 시작인덱스, 끝인덱스)
* sort(배열)
* toSortin(배열)