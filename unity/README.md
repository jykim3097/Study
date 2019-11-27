# log

### 191127
-  Vector 값은 처음에 상수로 선언하려면
   Vector3 v = new Vector3(x.xf, x.xf, x.xf) 로 선언해야한다!
- Game name 이미지를 SetActive(false) 하면 arrivedFlag 값에 error가 뜨는 문제가 있었다.
- 이미지를 set active false하거나 destroy하면 에러가 뜨니까 그냥 화면에 안보이는 곳에 이미지를 옮겼다. 쥬륵
- Game controller update 함수에서 가장 밖에 arrivedFlag가 false일 때를 넣어주니 실행도 적게 되고 에러도 안떴다.
- 버튼을 누르면 게임 캐릭터가 등장하는 코드도 추가했다.
- 카메라를 이동할지.. 백그라운드 이미지를 이동할 지 고민 중