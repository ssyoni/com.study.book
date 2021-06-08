# 수정 API 테스트 (HttpEntity, RequestEntity, ResponseEntity)


수정 API 테스트 순

1. Repository 에 데이터를 저장
2. Dto를 통해 값을 변경 
3. HttpEntity 에 데이터를 담고 해당 메서드를 실행시킴 (PUT)
4. Response 검서

<br/>


HttpEntity란?
Spring에서는 HttpEntity 클래스를 제공 

- Http 프로토콜을 이용하는 통신의 header와 body 관련 정보를 저장할 수 있다. 
- RequestEntity 와 ResponseEntity 는 HttpEntity 를 상속받은 클래스이다. 
- 통신 메세지 관련 header 와 body 의 값들을 하나의 객체로 저장하는 것이 HttpEntity
- Request 일 경우 RequestEntity 가, Response 일 경우 ResponseEntity 가 처리한다 



