## Spring 데이터 조회하기

### 1. root-context.xml 수정

#### 1.1 MySQL dataSource 부분 수정

> 로그를 확인하기 위해 property를 변경한다. 
```
<property name="driverClassName" **value="net.sf.log4jdbc.sql.jdbcapi.DriverSpy"**></property>	
<property name="url" value="jdbc:**log4jdbc**:mysql://127.0.0.1:3306/test_db01useSSL=false&amp;serverTimezone=UTC"></property>
```
- 로그를 보기 위해서는 pom.xml에서 log4jdbc-log4j2 라이브러리를 추가해야한다.
```
<dependency>
	<groupId>org.bgee.log4jdbc-log4j2</groupId>
            <artifactId>log4jdbc-log4j2-jdbc4</artifactId>
            <version>1.16</version>
</dependency>
```

#### 1.2 Mybatis SqlSessionFactoryBean 부분 수정

> Mybatis 설정 기능을 활용할 수 있도록 설정 파일을 읽어오는 부분과 SQL문을 작성해둘 mapper.xml 파일을 읽어오는 부분을 추가한다.
```
<property name="configLocation" value="classpath:/mybatis-config.xml"></property>
<property name="mapperLocations" value="classpath:mappers/**/*Mapper.xml"></property>
```

#### 1.3 mybatis SqlSessionTemplate 추가
> SqlSessionTemplate는 기본적인 트랜잭션 관리나 thread 처리의 안정성 등을 보장하고, DB의 연결과 종료를 관리하는 부분이다. 이것을 등록해두면 개발자가 직접 트랜잭션 관리나 DB 연결, 종료를 해야하는 작업을 줄일 수 있다.
```
<!-- mybatis SqlSessionTemplate -->
<bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate" destroy-method="clearCache">
	<constructor-arg name="sqlSessionFactory" ref="sqlSessionFactory"></constructor-arg>	
</bean>
```


### 2. log4jdbc.log4j2.properties, logback.xml 파일 생성

#### 2.1 log4jdbc.log4j2.properties
```
log4jdbc.spylogdelegator.name=net.sf.log4jdbc.log.slf4j.Slf4jSpyLogDelegator
```

#### 2.2 logback.xml
```
<configuration>
	<include resource="org/springframework/boot/logging/logback/base.xml" />
	
	<!-- log4jdbc-log4j2 -->
	<logger name="jdbc.sqlonly"	level="DEBUG" />
	<logger name="jdbc.sqltiming"     level="INFO" />
	<logger name="jdbc.audit"         level="WARN" />
	<logger name="jdbc.resultset"     level="ERROR" />
	<logger name="jdbc.resultsettable" level="ERROR" />
	<logger name="jdbc.connection"     level="INFO" />
</configuration>

### 3. log4j.xml 파일 수정

- Root Logger 부분에서 priority의 value를 warn에서 info로 변경한다.

=> 여기까지하고 실행시켜봤더니 illegal access라는 에러가 뜬다.. 더 하면 없어지는 건가.. 일단 더 해본다..

=> **아직 VO, DAO를 만들지 않아서 생기는 에러였다!**

### 3. Mybatis 설정 파일 및 mapper.xml 파일 추가

> src/main/resources 아래 mybatis-config.xml 추가
```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE configuration 
    PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
    "http://mybatis.org/dtd/mybatis-3-config.dtd">
    <configuration>
 
        
    </configuration>
```
- 현재 아무것도 없는 상태

- 여기에 <typeAliases> 태그를 통해 VO 클래스를 등록한다. 이렇게 하면 mapper.xml에서 VO 클래스를 mybatis-config.xml에서 등록한 이름으로 사용할 수 있다. 

> src/main/resources 아래 mappers/memberMapper.xml 추가
```
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE mapper
  PUBLIC "-//mybatis.org//DTD Config 3.0//EN"
  "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
 
<mapper namespace="com.example.mapper.memberMapper">
(비워 둔 것)
</mapper>
```

- mapper.xml에는 쿼리문을 입력한다. 보통 테이블 당 하나의 mapper.xml을 작성한다. 

- <mapper> 태그 안에 쓰고, 지금은 namespace만 쓰고 비워둔 상태이다.

### 4. VO, DAO 클래스 만들기

> com.example.dao 패키지를 만들고 MemberDAO.java를 생성한다.

- MemberDAO는 인터페이스로 작성

> 동일한 패키지 안에 MemberDAOImpl.java를 만든다. 

- 이 클래스는 SqlSession을 받아 memberMapper.xml에 등록한 쿼리문을 실행한다.

- 쿼리 결과가 여러개의 데이터를 가져오니까 list로 받아서 리턴한다.