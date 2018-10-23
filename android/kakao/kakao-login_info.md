## [안드로이드/android] 카카오톡 로그인 연동

1. kakao developer에서 앱 생성

    * 네이티브 앱 키 사용 (SDK 사용에 필요한 정보)

    * 플랫폼 추가, 패키지명 입력하면 마켓 URL 자동 생성

    * 키 해시 등록 -> 소스코드로 구하기

    * 사용자 관리 사용

2. 프로젝트에서 SDK를 사용하기 위한 환경으로 설정

    * 프로젝트 gradle에 아래 코드 추가

      - mavenCentral()

      - maven { url 'http://devrepo.kakao.com:8088/nexus/content/groups/public/' }

    * gradle.properties 수정

      - KAKAO_SDK_GROUP=com.kakao.sdk

      - KAKAO_SDK_VERSION=1.14.0

    * app gradle dependencies에 아래 코드 추가

      - compile group: project.KAKAO_SDK_GROUP, name: 'usermgmt', version: project.KAKAO_SDK_VERSION

        -> 1.1.7 버전의 카카오 sdk를 사용하기 위함

    * string에 네이티브 앱 키 추가

      - <resources> <string name="kakao_app_key">native app key</string> </resources>

    * 통신을 위해 /AndroidManifest.xml 에 코드 추가

      - <uses-permission android:name="android.permission.INTERNET" />

      - 네이티브 앱키를 메타데이터로 설정

        - 어플리케이션 안에 <meta-data android:name="com.kakao.sdk.AppKey" android:value="@string/kakao_app_key" /> 추가

3. 로그인을 위한 필수 클래스 추가

    * GlobalApplication.java  --> 클래스 추가 후 manifest에도 코드 추가

    * KakaoSDKAdapter.java

    * SessionCallback 추가 -> 실제 로그인 기능을 구현할 액티비티에 추가

4. requestMe는 자동로그인을 위한 기능

    * 캐시가 남아있으면 자동로그인하게 만듦
