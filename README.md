# 🤜 Spring Boot 활용기술 🤛 <br>
# JPA + querydsl + 게시판기능( CRUD )
<br>

## 주요기능
- 게시글 생성
- 게시글 삭제
- 게시글 수정
- 게시글 페이징
- 게시글 검색
##
![image](https://github.com/realCCC/guestbook/assets/101503824/fb08f1b9-45f6-4f77-8c98-c18bf5fd3a39)
##
## JAVA 폴더 / back-end 처리
<br>



![image](https://github.com/realCCC/guestbook/assets/101503824/7a5c53d1-6661-407f-ad21-0eb4c16c0159)

### Controller
Controller는 요청을 받고 해당 페이지에 응답을 처리하는 역할 <br>
Brower를 통해 mapping 된 Url에 대해 실행

### Entity 
Entity는 객체를 의미
Entity는 DB와 연동되는 곳 // JPA와 querydsl을 통해서 DB와 연동 <br>
데이터베이스 테이블과 매핑되는 객체

### Repository 
repository 는 JPA기술, querydsl을 활용해 손쉽게 처리가 가능(복잡한 쿼리를 쉽게 처리가 가능) <br>
GuestbookRepository > JpaRepository, QuerydslPredicateExecutor 상속받음

### DTO
DTO는 데이터 전송 객체로 정보를 임시로 저장공간 <br>
Entity의 페이징처리, 방명록, 검색기능에 관련된 기능들에 관련된 값들을 임시저장 <br>


### Service 
service계층 에서는 실제로 사용하는 기능들을 처리 <br>
![image](https://github.com/realCCC/guestbook/assets/101503824/3fd6652a-81f3-4a4a-b7ed-6aaaba97615d) <br>
Impl로 실제로 서비스 계층에서 만든 것을 구현

## resources 폴더 / front-end 처리

![image](https://github.com/realCCC/guestbook/assets/101503824/59f0096e-7f97-47ad-924b-a0079242db19)

template 
- list.html 목록
- register.html 등록 // Get방식 , Post방식
- read.html 조회
- modify.html 수정 // Get방식 , Post방식
- remove.html 삭제 // Post방식

### Thmeleaf 활용

서버사이드 렌더링 템플릿 엔진으로 HTML문서와 동적으로 바인딩 <br>
동적인 웹 페이지를 생성하여 클라이언트에게 제공

### JavaScript 활용
클라리언트 측에서 실행되는 언어로 웹 페이지에 동적인 기능 구현 <br>
알람창 기능에 활용


## TEST

![image](https://github.com/realCCC/guestbook/assets/101503824/c9104392-6d45-4f35-9d0d-8f30e524ca06)

백엔드 코드의 테스트를 작성하는 곳

## 느낀점 

1. spring boot 에서 프로젝트 초기설정 및 다양한 의존성들을 추가하면서 개발에 쉽게 집중할 수 있었습니다.
2. jpa와 querydsl 을 활용하여 데이터베이스와 연동을 간편하게 처리 할 수 있었습니다.
3. 타임리프를 활용해 동적인 웹페이지를 생성하며 html을 동적으로 생성하는 경험을 하였습니다.
4. 테스트 코드를 작성하며 버그를 발견하고 수정하며 품질을 향상시킬 수 있었습니다.
