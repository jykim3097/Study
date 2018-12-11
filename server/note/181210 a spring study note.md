# 181210

### Unknown system variable 'query_cache_size' 에러 해결 

-> server/errorCollection/Unknown system variable 'query_cache_size' 참고

->  server/errorCollection/visual studio 2015 x86 redistributable installation error 참고

-> 에러를 몇 일간 해결하다보니 뭘하던 건지를 까먹음 ㅇㅅㅇ///..

## 스프링, MySQL, MyBatis 연동 전체적인 정리

* maven : 자바용 프로젝트 관리 도구 -> 라이브러리 추가가 쉬워짐

1. 프로젝트 생성 후, pom.xml에 연동에 필요한 라이브러리를 설정한다.
  -> 아래 tab에서 Dependencies 선택 후 dependencies 태그 사이에 MySQL과 MyBatis 관련 라이브러리를 추가해준다.

  - MySQL : 사용하는 DB에 따라 달라짐 -> 오라클이면 ojdbc -> 설치가 좀 더 복잡함

  - MyBatis : sql, 저장프로시저, 고급 매핑을 지원하는 퍼시스턴스 프레임워크 ( 지속 틀? )

  - MyBatis-Spring : Spring과 Mybatis를 연결하는 라이브러리

  - Spring-jdbc : jdbc 라이브러리

  - Spring-test : Spring과 MyBatis가 정상적으로 연동되었는지 확인하기 위해 필요한 라이브러리

2. junit 버전을 4.7 -> 4.12로 바꿔줌 (in pom.xml)

  -> junit은 MySQL, MyBatis가 정상적으로 연동되었는지 테스트하기 위해 필요

  -> 버전이 낮으면 에러가 뜨는 듯

3. root-context.xml 설정

: 웹과 관련되지 않은 자원들에 대한 설정 입력

- MySQL, MyBatis에 대한 설정

- namespaces 에서 aop, context, jdbc, mybatis-spring 체크

  -> 사용 가능한 XML 태그의 폭을 넓혀주기 위한 설정

- Source tab에서 DataSource와 SqlSessionFactoryBean을 설정

  * DataSource는 MySQL과 연결을 담당, JDBC 커넥션을 처리하는 기증을 가지고 있어서 DB와 연동하는 작업에 반드시 필요하다

  * DataSource의 property 안에 연결할 DB 주소, 계정, 비밀번호를 설정한다.

  * SqlSessionFactoryBean
는 DB와의 연결과 SQL 실행에 대한 모든 것을 가진 객체

    -> DB에 연결해 데이터 저장, 수정, 삭제, 조회할 경우 별도의 추가 설정이 필요하다

4. MySQL, MyBatis 연결을 테스트하기 위한 클래스 생성

- src/test/java 밑에 MyBatisTest 와 MySQLConnectionTest 클래스를 생성

  * MySQLConnectionTest.java

    : MySQL과의 connection test

    - testConnection() 메소드

      - Connection: connection하는 객체의 database는 그것의 table들, 지원되는 SQL 문법, 저장된 절차들, 그 connection에 대한 기능 등을 설명하는 정보를 제공할 수 있다.

      - Connection con = ds.getConnection() 

        : ds(Data Source)가 나타내는 data source와의 connection을 설정하려는 시도

        -> 이게 true면 con(Connection) 출력. true라는 건 연결에 성공했다!라는 것

  * MyBatisTest.java

    : MyBatis와의 connection test

    - testFactory() 메소드

      - SqlSessionFactory : connection이나 datasource에서 SqlSession 생성

        -> SqlSession? MyBatis와의 작업을 위한 기본 JAVA 인터페이스, 이 인터페이스를 통해 명령(commands)을 실행하고, mapper를 가져오고, 트랜잭션을 관리할 수 있음

      - SqlSession session = sqlFactory.openSession()

        -> 이게 true 면 = session을 열었으면 

    => 정리하자면, SqlSessionFactory에서 SqlSession을 생성하고, openSession 메소드를 통해 session을 오픈한다.

    => SqlSessionFactory와 SqlSession의 주소 출력

