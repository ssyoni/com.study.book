# Server Template Engine 

템플릿 엔진이란 ?

지정된 템플릿 양식과 데이터가 합쳐져서 HTML문서를 출력하는 소프트웨어. 
JSP, Freemarker나  React, View 등 모두 지정된 템플릿과 데이터를 이용하여 HTML을 생성하는 템플릿 엔진이다. 

<br/>

서버 템플릿 엔진 vs 클라이언트 템플릿 엔진 

클라이언트 템플릿 엔진 ? 브라우저에서 화면을 생성. 서버에서는 Json 혹은 XML형식의 데이터만 전달하고 클라이언트에서 조립한다. (React, View)

서버 템플릿 엔진이란 ? 서버에서 java코드로 문자열을 만든 뒤 이 문자열을 HTML로 변환하여 브라우저로 전달.
 즉, 자바스크립트 프레임워크와 화면생성 방식을 서버에서 실행하는 것. (Spring+Jsp, Freemarker)
 
 <br/>
 
 
> 머스테치 Mustache 

머스테치란? JSP 와 같이 HTML 을 만들어주는 템플릿 엔진. 수많은 언어를 지원함. 

자바에서 사용될 때는 서버 템플릿 엔진으로, 자바스크립트에서 사용될 떄는 클라이언트 템플릿 엔진으로 사용. 

- 문법이 다른 템플릿 엔진보다 심플하다. 
- 로직코드를 사요할 수 없어 View 의 역할과 서버의 역할이 명확하게 분리된다.
- 하나의 문법으로 클라이언트/서버 템플릿 모두 사용 사능하다. 


