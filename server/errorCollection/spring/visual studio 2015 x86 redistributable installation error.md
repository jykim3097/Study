#visual studio 2015 x86 redistributable 설치 에러

* visual studio 2015 재배포 버전을 설치하라고 했는데.. 그냥 2017 버전 설치했고.. 안되고.. 후

  -> c++만 있는데 다운해도 되는 것인지..?

* visual studio 2015 x86 redistributable 버전을 다운받으라는데.. 

  -> 검색하면 Visual C++ Redistributable for Visual Studio 2015 이 버전만 나옴...ㅠ

  ->이 버전은 'Visual Studio 2015를 사용하여 빌드된 C++ 응용 프로그램을 실행하는 데 필요한 런타임 구성 요소를 설치' 한다는데.. 

  -> 난 c++ 아니고 java 쓰는데 ㅇㅅㅇ... 일단 다운 받아본다//..

  -> Visual C++ Redistributable for Visual Studio 2015 자꾸 같은 버전이 있다고 설치가 안된대..

  -> 찾아봤더니 다른 버전이 컴퓨터에 깔려있어서.. -> 2017버전만 삭제해도 설치가 된다!

  -> 2017 버전이 하위호환이 돼서 2015 버전 설치를 차단하는 거였음..

** 참고가 된 사이트

https://social.msdn.microsoft.com/Forums/sqlserver/en-US/72da6400-7a22-4bcc-b8d3-6423086289f0/visual-c-2015-redistributable-setup-failed-0x80070666-x64-amp-x86?forum=vssetup
