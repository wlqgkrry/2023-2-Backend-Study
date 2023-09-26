

# [HTTP]
***

## 1. HTTP에 대해 정리하라
<br>

[HTTP-Protocol에 대해 알아보자_1](https://velog.io/@wlqgkrry/HTTP-Protocol1)<br>
[HTTP-Protocol에 대해 알아보자_2](https://velog.io/@wlqgkrry/HTTP-Protocol2)<br>
[HTTP-Protocol에 대해 알아보자_3](https://velog.io/@wlqgkrry/HTTP-Protocol3)<br>
[HTTP-Protocol에 대해 알아보자_4](https://velog.io/@wlqgkrry/HTTP-Protocol4)


<br>

***


## 2. HTTPS가 무엇인지 정리하고, HTTP와 비교하라
https의 s는 secure의 약자로, URL이 https로 시작한다면 https 또는 SSL을 이용하고 있다고 볼 수 있습니다.
<br>
http로 통신하면 누군가 정보를 보고 있다고 생각해도 무방한 반면,
<br>
https로 통신하면 통신중 정보가 유출되어도 암호화된 정보로 인해 보안상의 문제 발생 가능성이 줄어들게 됩니다.


<br>

***


## 3. 아래 API에 대한 RESTful한 URI를 설계하라.
<br>

- 이벤트 목록 조회 : GET /api/events
- 이벤트 조회 : GET /api/events/{id}
- 이벤트 등록(생성) : POST /api/events
- 이벤트 수정 : PUT /api/events/{id}
- 이벤트 삭제 : DELETE /api/events/{id}
- 이벤트 상태 변경 : PATCH /api/events
- 특정 이벤트의 주문 목록 조회 : GET /api/events/{id}/orderlist
- 멤버 목록 조회 : GET /api/members
- 특정 멤버 권한 변경 : PUT /api/members/{id}/member
- 특정 멤버 정보 조회 : GET /api/members/{id}/member
- 특정 멤버 정보 변경 : PATCH /api/members/{id}/member
- 멤버 등록 : POST /api/members