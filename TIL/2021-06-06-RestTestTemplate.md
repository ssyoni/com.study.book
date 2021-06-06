# RestTestTemplate

@WebMvcTest의 경우 JPA기능이 작동하지 않기 때문에 JPA 기능까지 한번에 테스트 할 경우에는 @SpringBootTest 와
TestRestTemplate 을 사용하면 된다. 

```
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT) 
```

호스트가 사용하지 않는 랜텀 포트를 사용한다는 의미 




|메서드|HTTP|설명 
|-----------|-----|-------|
|getForObject| GET |주어진 URL 주소로 HTTP GET 메서드로 객체로 결과를 반환받는다|
|getForEntity | GET |주어진 URL 주소로 HTTP GET 메서드로 결과는 ResponseEntity로 반환받는다|
|postForLocation| POST |POST 요청을 보내고 결과로 헤더에 저장된 URI를 결과로 반환받는다 |
|postForObject |POST |POST 요청을 보내고 객체로 결과를 반환받는다|
|postForEntity |POST |POST 요청을 보내고 결과로 ResponseEntity로 반환받는다|
|delete |DELETE |주어진 URL 주소로 HTTP DELETE 메서드를 실행한다|
|headForHeaders |HEADER| 헤더의 모든 정보를 얻을 수 있으면 HTTP HEAD 메서드를 사용한다|
|put |PUT| 주어진 URL 주소로 HTTP PUT 메서드를 실행한다|
|patchForObject |PATCH |주어진 URL 주소로 HTTP PATCH 메서드를 실행한다|
|optionsForAllow |OPTIONS |주어진 URL 주소에서 지원하는 HTTP 메서드를 조회한다|
|exchange |any |HTTP 헤더를 새로 만들 수 있고 어떤 HTTP 메서드도 사용가능하다|
|execute |any |Request/Response 콜백을 수정할 수 있다|
 
 
 https://advenoh.tistory.com/46