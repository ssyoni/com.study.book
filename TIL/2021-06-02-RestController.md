# @Controller vs @RestController


### @Controller(Spring MVC Controller)
전통적인 Spring MVC의 컨트롤러.
주로 클라이언트의 요청에 따라 View를 반환한다.

@Controller 가 view를 반환하기 위해서는 ViewResolver가 사용되고, ViewResolver 설정에 맞게 View를 찾아서 랜더링 하는 방

그러나 @Controller 에서도 Data를 반환해야 하는 경우가 있음. @ResponseBody 를 사용하면 Json 형태로 데이터를 반환한다. 

이 때 ViewResolver 대신 HttpMessageConverter 가 동작한다. 

HttpMessageConverter 는 여러 종류가 있음. 객체의 타입에 따라서 맞는 converter가 작용한다. 

<br/>
<br/>

### @RestController(Spring Restful Controller)
Restful 웹서비스의 컨트롤러 

Spring MVC Controller 에 @ResponseBody 가 추가된 것. 주 용도는 JSON 형태로 객체를 반환하는 것이다. 

