## JUNIT 어노테이션 (18.12.10)

(스프링 JUnit 테스트 시 클래스 상단 어노테이션에 대한 설명)

- @RunWith(SpringJUnit4ClassRunner.class)

  -> 이걸 사용하면 JUnit에 내장된 러너 대신 해당 클래스에서 테스트를 실행하기 위해 참조하는 클래스를 호출

  -> JUnit 프레임워크의 테스트 실행 방법을 확장할 때 사용

  -> SpringJUnit4ClassRunner라는 JUnit용 테스트 확장 클래스를 지정해주면 JUnit이 테스트를 진행하는 중에 테스트가 사용할 어플리케이션 컨텍스트를 만들고 관리하는 작업을 함

- @ContextConfiguration(locations = {~~})

  -> 자동으로 만들어 줄 어플리케이션 컨텍스트의 설정 파일 위치를 지정한 것

  -> locations 속성에는 xml 형태의 어플리케이션 컨텍스트만 로딩 가능

- @Inject

  : 자바 기존의 어노테이션(자바 지원), 프레임워크에 종속적이지 않음

  * 타입으로 연결, 안되면 이름으로 연결

  * 사용 위치: 필드, 생성자, 메소드

  1. javax.inject.Inject

  2. 의존 관계 주입을 표시하는 어노테이션

- @Test

  : 가장 기본적인 어노테이션, 특정 메소드에 선언하여 test하도록 한다.

