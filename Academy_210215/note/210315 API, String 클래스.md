### 210315

## API - java.lang 패키지
* 기능의 사용 방법을 중간에 연결해주는 매개체
* API 쓰세요 = 문서를 보고 적절하게 쓰세요

## String 클래스 - 문자열
* 두 줄은 같은 뜻이다.
```java
String str = "abc";
char data[] = {'a', 'b', 'c'};
```

* String 클래스의 static 메서드 사용 : String.(메서드이름) 
* 주요메서드
	* charAt() 
	* indexOf()
	* **length()**
	* **replace()**
	* **substring()**
	* toUpperCase()
	* trim() : 문자열 앞 뒤의 공백 제거
	* equals()
	* **valueOf()** : 숫자를 문자로 변경, static 메서드
	* **split()**
		* regex : 특정 패턴을 가진 문자열
		* 매개변수를 통해 배열의 길이를 정할 수 있다
	* contains()