# My First Spring

* php를 해보려다가 spring을 써보는 게 더 좋을 것 같아서 바꾸기로 함

# Spring 설치하면서..

  * https://www.popit.kr/%EC%8B%A0%EC%9E%85-%EA%B0%9C%EB%B0%9C%EC%9E%90-%ED%95%99%EC%83%9D%EC%9D%84-%EC%9C%84%ED%95%9C-spring-mvc-setting-1%ED%8E%B8

    -> 이 블로그를 참고해서 설치.

  * eclipse는 설치해뒀었다 -> 환경변수도 지정해뒀었음

  * eclipse에서 sts plugin 설치

  * Spring MVC Project 생성, package 경로 com.codef.readywoman으로 설정

  * 1.5편에서 jre를 없앴는데, maven problems가 생겼다.... 그래 한 번에 될리가 없지..

  ## maven problems 해결하기..

  * Description Resource Path Location Type Cannot read lifecycle mapping metadata for artifact org.apache.maven.plugins:maven-site-plugin:maven-plugin:3.3:runtime Cause: invalid END header (bad central directory offset) pom.xml /MyFisrtSpring line 1 Maven Project Build Lifecycle Mapping Problem

  -> 이런 에러가 뜸

  * pom.xml에 뜨는 에러 -> maven plugin을 다운받을 때 잘못 받아진 것

  * maven > repository 폴더를 전부 삭제한 후 프로젝트를 maven update project를 하래..

  * maven > repository 폴더가 어딨어..?

  * C:\Users\(내노트북)\.m2\repository\org\apache\maven 여기에 있었다!!

  * 이 아래에 있는 폴더를 전부 삭제한다. (달달달)

  * maven update project가 안보여서 debug 했더니 없어졌다 >3<

  * 다시보니 해당 프로젝트에서 우클릭을 하면 maven > update project가 있다 

  ## views > home.jsp 로 테스트 하기

  * Port 8080 required by Tomcat v8.5 Server at localhost is already in use. The server may already be running in another process, or a system process may be using the port. To start this server you will need to stop the other process or change the port number(s).

    -> 이런 error가 떴다.. 하...^^....

  * 포트 번호를 바꿔주라는데 바꿔주면 없는 번호라고 404 error가 뜬다..

  * The origin server did not find a current representation for the target resource or is not willing to disclose that one exists. 

  * 몇 시간 동안 삽질 하다가..

  * tomcat 있는 directory에서 cmd를 열어서 service remove를 하고 완전 삭제한 뒤 다시 깔고 프로젝트도 새로 열었다..ㅎ

  * 그랬더니 잘 됐음!..ㅎ 많은 생략......... 한글 인코딩까지 성공했다.

  * Pom.xml -> 자신에게 필요한 dependency를 추가할 수 있음

  * 