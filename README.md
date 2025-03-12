
## 테이블 설계

![단축 URL 서비스 테이블 설계](https://velog.velcdn.com/images/kgh2120/post/6760aadf-71a3-4fce-a64c-cbfefbffaf81/image.png)


| 테이블 명 | 내용 | 
|---------|-------|
| 회원 | 이 서비스를 이용하는 회원 정보가 담긴 테이블 | 
| 링크 | 단축 URL에 대한 정보를 다룬 테이블, 본래 URL과 단축된 URL, 구분을 위한 제목이 담긴다. |
 | 접근 기록 | 링크에 대해서 접근한 기록을 담는다. 프로젝트 기능 구체화 및 통계 내용에 따라서 필드 추가할 예정 | 



## RestAPI 설계

**이메일 중복 검사**
`GET /users?email=~~~`

**회원가입**
`Post /users/sign-up`

Body
```json
{
   "email":"string",
   "password":"string"
}
```

**로그인**
`Post /users/login`

Body
```json
{
   "email":"string",
   "password":"string"
}
```

**단축 URL 등록하기**
`Post /links`

Body
```json
{
   "originalUrl":"string",
   "title":"string"
}
```

**링크 목록 조회**
`Get /links`

Header : 인증 정보

**링크 오리지널로 리다이렉트하기**
`Get /{단축URL}`

**링크에 접근 로그 확인하기**
`GET /access-logs/{Link ID}`