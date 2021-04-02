### 210317

## Date 클래스 - 날짜, SimpleDateFormat클래스 (날짜 포맷)

* s에는 날짜 형식이 들어간다
* Date date = new Date(); 를 하면 우리나라시 기준으로 date에 날짜가 들어간다

## Random 클래스

## StringTokenizer
* new Tokenizer(문자열, 구분자)
	* 구분자에 여러 값을 한 번에 입력할 수 있다.
* new Tokenizer(문자열, 구분자, 구분자포함여부)
	* 구분자 포함 여부는 boolean 타입으로 true를 입력하면 구분자도 토큰에 포함된다.
	* 구분자 기준으로 자르고, 구분자도 포함해서 출력한다.

## 제네릭

* 클래스나 인터페이스 선언에 유형 매개변수가 들어있는 클래스
* <> 부호가 붙고, 그 사이에 파라미터가 있다.

### 제내릭이 없는 코드가 갖는 문제
* 제네릭이 없는 코드
```java
public class ABC {

	private Object obj;
	
	public void setObj(Object obj){
		this.obj = obj;
	}

	public Object getObj(){
		return obj;
	}
}
```
	* ABC 클래스는 무엇이든 다 담을 수 있다
	* 담을 때는 무엇이든 담을 수 있지만, 사용할 때는 형변환을 해줘야하기 때문에 형변환을 잘못하면 오류가 발생할 수 있다.
* 제네릭이 있는 코드
```java
public class ABC<T> {

	private T t;
	
	public void set(T t){
		this.t = t;
	}

	public T get(){
		return t;
	}
}
```
	* T에 타입을 미리 지정해줄 수 있다.

## Collection Framework
### Collection
* 배열과 유사한데 배열보다 저장/조회/수정/삭제(자료구조)하는 작업을 더 쉽게 처리할 수 있다.
* 데이터 적재 클래스 자료구조
* 배열의 한계점 : 크기가 고정값이다
* Collection의 배열 3가지 : Set, List, Queue : 크기가 동적이다. (모두 인터페이스)
	* 추가하면 자동으로 배열 크기가 늘어나고, 삭제하면 자동으로 줄어든다.
	* 배열 크기를 고려하지 않아도 된다.
	* **List** : 순서(인덱스가 있다.), 값이 중복될 수 있다 = 배열 + 크기 조절 능력
		* List를 ArrayList와 Vector가 상속받는데
		* 그래서 List list = new ArrayList(); 로 사용할 수 있다.
			* 다형성!
		* ArrayList를 사용하는 게 안정적이다.
	* Set ↔ List : 순서 없고, 중복도 안된다
		* 로또 바구니라고 생각하면 된다.
	* Queue : 컴퓨터 프로세스와 똑같다. 먼저 들어간 건 먼저 나온다(FIFO) ↔ Stack(FILO) : 스택은 List
	* LinkedList는 List와 Queue를 다 상속받는다
		```java
		LinkedList list = new List();
		LinkedList list = new Queue();
		``` 
* **Map** : Collection과는 동떨어져있다.
	* 키, 값이 통째로 저장된다
* Collection의 상속표는 다 외워라

### 특징
* 객체를 저장할 수 있는 자료구조 제공
* 컬렉션에 저장된 객체나 변수를 엘리먼트라고 한다
	* 객체 = 엘리먼트 or 변수 = 엘리먼트
* 지금까지 배운 배열을 다 List로 대체할 수 있다.

### List 컬렉션
* 주요 메서드
	* 추가할 때 add, 얻을 때 get, 크기 확인 size(), 저장된 값 확인 toString()
* 배열처럼 인덱스에 접근해서 쓰는 것이 아니고 메서드를 이용해서 사용한다.