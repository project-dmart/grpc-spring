# grpc-spring

이 프로젝트의 목표는 서버 대 서버로 gRPC로 스프링 서버가 통신하는 것을 구현하기 위함입니다.

해당 스프링 서버는 일반적으로 띄워서 통신하는 것과 도커 컨테이너로 만들어서 통신하는 것의 두 가지 방식으로 소통할 예정입니다.

전자의 경우 `normal-case`, 후자의 경우`docker-case` 라는 디렉토리에서 작업을 할 계획입니다.

위의 계획을 세웠는데, 생각보다 너무 복잡했습니다. starter를 쓰면 좀 나아질지..

이 프로젝트의 의의는 gradle 멀티 모듈을 이용해서 gRPC 의존성을 효과적으로 관리했다는 것 말고는 큰 의미가 없을 것 같네요.

참고자료: https://coding-start.tistory.com/352
