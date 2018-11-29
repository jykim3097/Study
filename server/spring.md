###181126

#mysql에서 db 생성하기

- create database testDB;

- show databases;

- use testDB;

- create user 'username'@localhost identified by 'password';

- grant all privileges on testDB.* to 'jiyoung'@localhost;

#heidiSQL caching_sha2_password 에러 해결 방법

- ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY '초기설정 비밀번호';

#junit initializationError

- 구글링 중인데 뭐가 안나온다....ㅠ


###181127

#junit initializationError

- 해결 도중 Server Tomcat v8.5 Server at localhost failed to start. 이런 에러가...

- Servers 더블 클릭 후 server options 에서 publish module contexts ~~ 체크해주기!

  * 해결방법(1 안되면 2 ->...)

    1) @WebServlet() 이 존재하는지 확인 -> Servers > Tomcat v8.5...> web.xml -> 없었음

    2)  Window > Preferences > server > Runtime Environments 에서 서버 지우고 다시 설치 -> 안됨

    3) STS Maven 프로젝트 생성시 자동으로 .m2/repository 폴더에 jar 파일이 생성되는데 이 파일을 지우고

       maven updates를 통해 다시 받아줌 -> 해결!

- 이렇게 하고 다시 껐다 켰더니 junit 에러도 해결됨;;;;;

# Unknown system variable 'query_cache_size'

- 산넘어 산~~

- pom.xml에서 mysql-connector-java 버전을 8.0.11로 바꿔서 해결!

# DB 조회하기 

- 아깝지만 코드를 수정한다..!

- root-context.xml 수정

  -> bean 밑에 <property name="driverClassName" value="net.sf.log4jdbc.sql.jdbcapi.DriverSpy"></property> 추가

  -> 쿼리 로그를 조금 더 보기 편하고 상세하게 출력하기 위해 log4jdbc 사용한다.

- Mybatis 설정 기능을 활용할 수 있도록 설정 파일 경로 추가

  -> <property name="configLocation" value="classpath:/mybatis-config.xml"></property>

- mapper란? mapper에 사용할 sql 구문들을 등록해놓으면 나중에 편리하게 sqlSession을 통해 불러 쓸 수 있음

  -> 이 mapper에 접근하는 경로 추가

  -> <property name="mapperLocation" value="classpath:mappers/**/*Mapper.xml"></property>

- SqlSessionTemplate 추가

  - 기본적인 트랜잭션 관리나 쓰레드 처리의 안정성 보장, DB의 연결과 종료 관리

  - 이걸 등록하면 개발자가 직접 트랜잭션 관리나 DB 연결, 종료해야하는 작업을 줄일 수 있음

- 로그를 포기위해 pom.xml에 mybtis log 관련 코드 추가

- src/main/resources 아래에 log4jdbc.log4j2.properties 와 logback.xml 파일을 생성한다. 

- error 500.. ㅎㅎㅎ 오늘은 여기까지..