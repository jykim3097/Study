# Unity chapter3 필기

* Project 뷰에서 create > C# Script 생성 > 생성된 script를 두번 클릭하면 script editer(mono develop)가 가동됨

  * 한국어가 제대로 입력되지 않을 수 있음

  * MonoBehaviour를 상속한 클래스가 정의됨

    * MonoBehaviour는 유니티의 근본을 담당하는 클래스, 씬 안에서 사용하는 클래스는 기본적으로 이걸 상속함.

    * Start, Update 함수는 MonoBehaviour가 제공하는 특수 함수

      * Start 함수는 스크립트가 시작한 후 첫 프레임에서 한 번만(객체의 초기화 처리 등에 사용)
      
      * Update는 매 프레임에서 지속적으로 호출됨

    * 코드 내용

      * 중력의 스케일 파라미터 : 어느 정도의 세기로 중력을 반영시킬지에 대한 비율

      * 중력 방향의 결정을 위한 벡터 초기화

        -> Vector3는 x, y, z의 세 방향의 축을 가진 3D 공간에서 자주 사용하는 기본적인 벡터 구조

      * GetAxis -> 세로 또는 가로에 속하는 입력을 그 강도에 따라 -1 ~ 1 범위에서 취득 가능

        -> Horizontal : 좌우의 값 : x의 벡터, Vertical : 위아래의 값 : z의 벡터

      * GetKey -> z키를 누를 때 높이 방향을 입력 받는다.

      ### 프레임이란?

        * 오브젝트를 제어하는 처리에서부터 화면 묘사까지의 일련의 흐름 단위

        * 초당 여러 프레임을 리플래시하여 조금씩 오브젝트의 위치를 바꾼 새로운 이미지를 계속 표시 -> 게임

        * Frame Rate : 1초당 호출되는 프레임의 비율, FPS(Frame Per Seconds)

          -> 30fps 정도면 나름 부드럽게 움직이는 게임을 재혀할 수 있음

* 만든 script 파일과 게임 오브젝트를 연결해야함

  * 빈 게임 오브젝트를 만들고 script를 이 object에 drag&drop한다.

  * script 안에서 public으로 정의된 변수는 Inspector 뷰에서 설정할 수 있다.

  * gravity scale 숫자를 키울수록 더 빨리 떨어짐

* 스크립트 프로그래밍 언어 

  -> unity는 여러 언어로 프로그래밍할 수 있지만, 주로 c#, js를 사용한다. 

  -> 순수한 js가 아니어서 js보다는 c#을 사용하는 게 좋음

* 디바이스의 기울기는 Input.acceleration 속성을 이용하여 얻음

  -> 그런데 unity의 높이는 y축인데, 기기에서의 높이는 z축이다.

* 공기계로 test 해보기!

* Rigidbody 파라미터 

  * Mass : 물체의 무게, 값이 클수록 힘을 가했을 때와 물체끼리 충돌했을 때 움직이기 어렵다.

  * Drag : 공기 저항, 값을 크게 하면 깃털처럼 나가하가 느린 물체를 표현 가능

  * Angular Drag : 회전에 대한 공기 저항, 값을 크게 하면 회전을 멈추기 쉬워짐

  * Use Gravity : 중력에 따를지에 대한 여부 

  * Collision Detection : 충돌 판정의 방법 지정 

  * Constraints : 물리적 제약 설정, Position에 체크하면 그 방향으로는 움직이지 못하게 할 수 있음

*  Physic Material : 물리적 재질 표현, 탄력 등

  * Bounciness : 반발 계수

### 홀(구멍) 만들기

  * 충돌(Collisiton)을 사용하여 처리, 유니티의 충돌에는 두 종류의 사용법이 있다.

    1. 물리적 특성을 가진 오브젝트들이 부딪혀 튕겨 나오거나 서로 맞붙은 상태가 되는 물리 시뮬레이션을 위한 충돌

    2. 오브젝트들이 그 위치에 있는지, 도달했는지의 여부를 판정하여 이벤트를 발생시키는, 트리거를 위한 충돌

      -> 콜라이더를 트리거로 설정하면 오브젝트끼리 닿아도 서로 맞붙는 것이 아니라 이벤트의 검출만 처리함

  * 태그 설정

    * edit > project settings > tags and layers > tags에 추가

    * 각 볼의 inspector 뷰에서 tag 설정

  * FallInChecker.cs

    * OnGUI -> 유니티의 GUI를 처리하는 함수, 매 프레임마다 호출됨