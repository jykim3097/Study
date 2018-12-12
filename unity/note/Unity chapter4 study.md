### 1. Unity chapter4 study

#### 1.1 다양한 개념

- Tiling : 한 장의 텍스처를 그 수만큼 나열한 머티리얼로 할 수 있음

- Quad object : 두께가 없는 사각형을 3D 모델의 최소 단위(정점이 4개인)로 표현할 수 있는 오브젝트

  - 3D에서 이미지와 같은 얇은 판을 표현하고 싶을 때 사용

  - Plane 오브젝트로도 동일한 판을 배치할 수 있음 (Quad 오브젝트가 더 간단)

- Cutout : 텍스처의 일정한 값 이하의 알파 값 부분을 표시하지 않는다 -> 마치 png 파일처럼

- 

#### 1.2 Update 이벤트

#### 1.2.1 Update()

- 게임 프로그래밍에서 중요한 개념은, 게임 중 위치, 상태, 개체의 동작의 각 프레임을 렌더링 되기 전에 변경할 수 있다는 것이다. 이런 종류의 코드를 써야하는 위치가 주로 Update(MonoBehaviour.Update.html) 함수 안이다. Update는 프레임이 렌더링 되기 전, 또한 애니메이션이 계산되기 전에 호출된다. 

- 스크립트가 활성화 되어 있을 때 매 **프레임마다** 호출되고, 주기가 일정하지 않다.


#### 1.2.2 LateUpdate()

- 스크립트가 활성화 되어 있을 때 매 프레임마다 호출된다.

- Update() 함수가 호출된 뒤에 호출된다.

- object를 따라다니는 카메라를 생각하면 되는데, Update에서 오브젝트가 움직인 뒤 LateUpdate에서 카메라가 오브젝트를 따라간다.


#### 1.2.3 FixedUpdate()

- 일정한 주기를 갖고 호출된다 -> Fixed Timestep에 따라

- 리지드바디로 스크립트를 짤 때 보통 이 함수를 통해 움직임


#### 1.3 Time 함수

- 유니티의 시간이나 프레임에 관한 기능을 사용할 수 있는 함수

- Time.time은 게임이 시작되고 나서부터의 초를 float 값으로 얻을 수 있다.


#### 1.4 Transform의 position 멤버의 변경

- Transform의 position과 localPosition의 값은 Vector3의 형식. -> 구조체의 프로퍼티로 정의되어 있어서 멤버 변수를 직접 변경할 수 없다.

  ```
  transform.position.x = 100;
  ```

- Transform의 position의 x, y 값을 변경하려면 **(1)임시 변수에 값을 복사**하거나 **(2)새로운 Vector3를 작성**해야한다.

  > 임시 변수에 복사하기

    ```
    Vector3 pos = transform.position;
    pos.y = 100;
    transform.positon = pos;
    ```

  > 새로운 Vector3 구조체 만들기

    ```
    transform.position = new Vector3(100, transform.position.y, transform.posititon.x);
    ````

- 이 외에도 Translate 함수를 사용할 수 있다. Translate 함수는 position의 값을 덮어쓰는 것이 아니라, 현재의 값에 더하거나 빼는 함수이다.

  ```
  transform.Translate(100, 0, 0);
  ```

- 이런 함수는 position뿐만 아니라 rotation이나 scale에 관해서도 마찬가지


#### 2. TIP

- position을 지정할 때, 붙일 오브젝트의 표면과 딱 맞추면 불안정해질 가능성이 있으므로 0.01 이라도 띄워준다.

- 카메라도 position, rotation 설정이 된다.

- scripts에서 public으로 설정하면 inspector 뷰에서 값을 정할 수 있다.