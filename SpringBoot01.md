# Srping Boot Project
- TODO App 만들기
- Spring Boot, Spring Data JPA, 템플릿 엔진, MySql
- Docker를 이용해서 Mysql 설치
---

### # 프로젝트 생성
1) https://start.spring.io/ 
   - 프로젝트 생성
2) IntelliJ에서 프로잭트 열기
3) SpringBootApplication 실행
   - TodoappApplication 실행
   - DataSource 객체를 생성하려면 url 속성 필요


### # Mysql 설치(docker)

1) https://www.docker.com/products/docker-desktop/
   - Docker-Desktop 설치
   - Docker-Desktop 설치하면 docker-compose가 자동으로 설치된다.

### # Mysql 설치 및 실행
   - 3306 port 이미 사용중이라서 다른(13306) Port로 대체
   - 실행 : docker-compose up -d
```
version: '2'

services:
   vacation-db :
    image: mysql
    restart : always
    environment:
      MYSQL_ROOT_PASSWORD: "qweasd" 
      MYSQL_DATABASE: "examplesdb"
      MYSQL_USER : "sun"
      MYSQL_PASSWORD : "qweasd"   
    command:
      - --character-set-server=utf8mb4
      - --collation-server=utf8mb4_unicode_ci  
    volumes:
      - D:/docker/mysql/datadir:/var/lib/mysql      
    ports:
      - 13306:3306  
```

### # 간단하게 작성한 todo list 보여주기 & todo 저장하기

