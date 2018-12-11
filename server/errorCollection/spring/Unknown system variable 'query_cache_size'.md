# query_cache_size error

  Unknown system variable 'query_cache_size'

  -> 알 수 없는 시스템 변수 'query_cache_size'


### query_cache_size에 대해 알아보자

0. clean을 해봤지만 no 의미..

1. have_quary_cache

  * 서버 시스템 변수는 쿼리 캐시를 사용할 수 있는지 없는지를 나타낸다.

  * 표준 MySQL 바이너리를 사용하면 이 값은 쿼리 캐시를 비활성화 시키더라도 항상 yes

2. query_cache_size

  * 쿼리 캐시 크기는 query_cache_size 시스템 변수를 사용해서 지정.

    이 변수를 0으로 설정하면 쿼리 캐시를 사용하지 않는 것이다. 디폴트 값은 0.

    0이 아닌 값으로 설정하는 경우, 쿼리 캐시에 최소 40kb를 할당해야 함

    -> 나는 건들지도 않았는데... 왜 에러가 뜨는 것인가..

    -> 쿼리 캐시를 너무 작게 설정했을 때 뜨는 에러는 아닌 듯

  * 모든 쿼리 결과를 저장하기 위해서는 쿼리 캐시가 충분히 커야 함

  * 0 또는 off : 캐시 금지 or 캐시된 결과 사용 x

  * 1 또는 on : SELECT SQL_NO_CACHE로 시작되는 명령문을 제외한 모든 명령문 캐싱

  * 2 또는 DEMand : SELECT SQL_CACHE로 시작되는 명령문 캐싱

### 다른 해결 방법(by 구글링)

0. 뭔가 정의에 대해서 공부하다보면 알 수 있을 거 같았는데 아니었음;

1. pom.xml에서 mysql-connector-java 버전을 6.0.x -> 8.0.11로 바꾸기

  -> 이전 프로젝트에서 이렇게 했더니 이거에 대한 다른 에러가 또 뜸.. 일단 이건 최후의 방법으로..

  -> 에러 자체가 '알 수 없는 시스템 변수'인데, 이 시스템 변수 자체가 MySQL8에서 삭제됐단다..ㅎ

      그래서 java connector 버전을 8.0.x로 바꾸라는 말이었나보다.

  * https://dev.mysql.com/doc/refman/5.7/en/query-cache.html

    -> The query cache is deprecated as of MySQL 5.7.20, and is removed in MySQL 8.0.

    -> 들어가자마자 보이는 ㅎㅎ

2. 또는 다른 해결 방법으로 JDBC의 버전을 5.1.44로 업데이트하라는 글을 보았다.

### 해결 1

* MySQL 설치 할 때 Connector/ODBC가 설치되지 않았다. 

  -> visual studio 2015 Redistributable 버전을 다운 받아야 됨

  -> [Visual C++ Redistributable for Visual Studio 2015 installation error]

  -> visual studio 2015 Redistributable 버전을 깔면 ODBC가 정상적으로 설치됨

  -> 다시 MySQLConnectionTest.java > junit test 하기 > 여전히 같은 에러..

### 해결 2

* MySQL 다운 받을 때 Connector/J 8.0.13을 다운 받았었음

  -> java connector version을 이걸로 바꿔봐야겠다.

  -> 해결!