### Initializing Java Tooling Error

```
'Initializing Java Tooling' has encountered a problem.
An internal eror occurred during: "Initializing Java Tooling".
An internal error occurred during: "Initializing Java Tooling".
java.lang.NullPointerException
```

- STS 실행시키자마자 뜬 에러..ㅎㅎ.. 저에게 왜 이런 시련을..ㅠ 그래도 많은 사람들이 나는 에러인 것 같다.

#### 해결 방법1

> 프로젝트가 저장되어 있는 폴더에 가서 .project 하단의 프로젝트 리스트를 모두 삭제해 준다.

  C:\STS_workspace\.metadata\.plugins\org.eclipse.core.resources\.projects

> 삭제하고 eclipse(sts)를 재시작한다.

  - Problems occurred while trying to save the state of the workbench. 라는 에러가 뜨지만 무시하고 재시작한다.

- 해결 안됨ㅠ

- 삭제할 때 RemoteSystemTempFiles를 빼고 삭제하거나, 삭제하고 새로 만들어주면 해결된다! 

#### 해결 방법2

> .metadata 폴더를 아예 삭제하고 재시작

  - 이러면 아예 프로젝트가 사라지는데..?

- 해결 안됨22