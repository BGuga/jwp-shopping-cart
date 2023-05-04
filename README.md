# 기능목록

- [x] database 세팅
    - [x] data.sql(product table) 생성

- [x] 상품 관리 CRUD API 작성
    - [x] Create
        - [x] repository 구현
        - [x] service 구현
        - [x] controller 구현
    - [x] Read
        - [x] repository 구현
        - [x] service 구현
        - [x] controller 구현
    - [x] Update
        - [x] repository 구현
        - [x] service 구현
        - [x] controller 구현
    - [x] Delete
        - [x] repository 구현
        - [x] service 구현
        - [x] controller 구현
- [x] 상품 목록 페이지 연동
    - [x] "/" : index.html 를 보낸다
- [x] 관리자 도구 페이지 연동
    - [x] "/admin" : admin.html 를 보낸다
- [x] 사용자 기능 구현
    - [x] "Authentication" header 에 유저 정보를 포함해서 보내야한다.
        - [x] 토큰 타입은 Basic 을 사용하며 "Basic email:password" 형태의 데이터다.
        - [x] "email:password" 는 Base64 방식으로 인코딩해서 보낸다
    - [x] header 의 로그인 정보가 유효한지 확인한다.
        - [x] header 인증 토큰이 타입이 Basic 인지 확인한다.
        - [x] 토큰이 아이디, 비밀번호를 포함하는지 확인한다.
        - [x] 아이디, 비밀번호가 있다면 실제 존재하는 데이터인지 확인한다.
- [x] 사용자 설정 페이지 연동
    - [x] "/settings" 로 요청을 보낸다면 현재 존재하는 유저들의 정보를 가진 페이지를 반환한다.
- [ ] 장바구니에 상품 추가
- [ ] 장바구니에 담긴 상품 제거
- [ ] 장바구니 목록 조회

