# Momnect - 중고 육아용품 거래 플랫폼

> **Momnect**는 엄마들을 위한 중고 육아용품 거래 플랫폼입니다. 안전하고 신뢰할 수 있는 거래 환경을 제공하여 육아용품을 효율적으로 거래할 수 있도록 도와줍니다.

## 🚀 프로젝트 개요

### 주제 선정 이유 - 육아맘 중고거래 플랫폼

#### 1. 한정된 육아용품 사용기간과 중고 수요 증가

- 아기용품은 성장 속도에 따라 수개월만 사용하고 금세 필요 없어짐
- 대부분의 육아용품은 단기간 사용 후 방치되거나 폐기
- 실제 육아맘들 사이에서 중고거래 수요가 매우 높음 (카페, SNS, 번개장터 등에서 활발히 거래 중)

#### 2. 기존 중고거래 플랫폼의 '육아 특화 기능' 부족

- 번개장터, 당근마켓 등 기존 플랫폼은 연령별 검색, 안전필터, 육아 카테고리 최적화 부족
- 육아맘들은 "월령별 필터", "추천 월령" 기능을 원함
- 육아에 특화된 UX/UI 제공의 필요성

#### 3. 경제적 부담 완화 + 친환경 가치 실현

- 육아는 비용 부담이 크고, 특히 첫 출산 가정은 초기 비용이 높음
- 중고 거래는 가계 부담을 줄일 수 있는 현실적인 대안
- 재사용(중고 거래)을 통해 자원 낭비를 줄일 수 있음

#### 4. 커뮤니티 기반 신뢰 거래 가능성

- 같은 육아 환경을 공유하는 부모들끼리는 정보 교환 + 정서적 교감 가능
- 리뷰, 월령 인증, 사용 후기 공유 등을 통해 신뢰 기반의 거래 문화 형성 가능

#### 5. 시장성과 성장 가능성

- 국내 출산율 감소에도 불구하고 육아 관련 1인당 지출은 꾸준히 증가
- 특히 2030 육아맘 중심의 모바일 기반 육아 커머스/중고거래 시장은 지속 성장 중

#### 기대 효과

- 육아맘들 사이의 신뢰 기반 거래 활성화
- 육아 비용 절감 + 육아 스트레스 해소
- 공감 중심의 따뜻한 커뮤니티 형성
- 친환경적 소비문화 정착 (자원 재사용)

### 주요 기능

- **사용자 관리**: 회원가입, 로그인, 프로필 관리, 자녀 정보 관리
- **상품 관리**: 상품 등록, 수정, 삭제, 검색, 카테고리별 분류
- **거래 관리**: 거래 요청, 거래 상태 관리, 거래 완료 처리
- **리뷰 시스템**: 거래 후기 작성 및 조회
- **실시간 채팅**: 구매자와 판매자 간 실시간 소통
- **게시판**: 커뮤니티 게시글 작성 및 관리
- **파일 관리**: 이미지 업로드 및 관리

### 기술 스택

#### Frontend

- **Framework**: Next.js 15.4.5 (App Router)
- **UI Library**: React 19.1.0
- **Styling**: Tailwind CSS 4.0
- **State Management**: Zustand 5.0.7
- **UI Components**: Radix UI
- **HTTP Client**: Axios 1.11.0
- **Real-time Communication**: Socket.io Client, STOMP + SockJS
- **Rich Text Editor**: CKEditor 5
- **Icons**: Lucide React

#### Backend

- **Framework**: Spring Boot 3.4.8
- **Language**: Java 17
- **Build Tool**: Gradle 8.x
- **Spring Cloud**: 2024.0.2
- **Service Discovery**: Netflix Eureka
- **API Gateway**: Spring Cloud Gateway
- **Security**: Spring Security 6.x, JWT
- **Database**: MySQL 8.0, Elasticsearch 8.15.0
- **ORM**: Spring Data JPA / Hibernate
- **Real-time**: Spring WebSocket, STOMP
- **Documentation**: Swagger/OpenAPI 3

#### Infrastructure

- **Containerization**: Docker
- **Orchestration**: Kubernetes
- **CI/CD**: Jenkins (Backend), GitHub Actions (Frontend)
- **Cloud**: AWS (Elastic Beanstalk, ECR)
- **Communication**: REST API, WebSocket, STOMP

## 📁 프로젝트 구조

```
BE09-Final-2team/
├── BE09-Final-2team-FE/          # 프론트엔드 (Next.js)
│   ├── src/
│   │   ├── app/                  # Next.js App Router
│   │   │   ├── (user)/           # 사용자 관련 페이지 그룹
│   │   │   ├── chat/             # 채팅 기능
│   │   │   ├── product/          # 상품 관련
│   │   │   ├── post/             # 게시글 관련
│   │   │   ├── review/           # 리뷰 관련
│   │   │   └── main/             # 메인 페이지
│   │   ├── components/           # React 컴포넌트
│   │   │   ├── common/           # 공통 컴포넌트
│   │   │   └── ui/               # UI 컴포넌트 (Radix UI)
│   │   ├── lib/                  # API 클라이언트, 유틸리티
│   │   │   ├── api.js            # Axios 설정
│   │   │   └── websocketManager.js # WebSocket 관리
│   │   ├── store/                # 상태 관리 (Zustand)
│   │   ├── utils/                # 유틸리티 함수
│   │   └── enums/                # 열거형 상수
│   ├── public/                   # 정적 파일
│   ├── .github/workflows/        # GitHub Actions
│   ├── Dockerfile                # Docker 설정
│   ├── Dockerrun.aws.json        # AWS EB 설정
│   └── package.json
│
└── BE09-Final-2team-BE/          # 백엔드 (Spring Boot)
    ├── discovery-service/        # 서비스 디스커버리 (Eureka)
    ├── gateway-service/          # API 게이트웨이
    ├── user-service/             # 사용자 관리 서비스
    ├── product-service/          # 상품 관리 서비스
    ├── post-service/             # 게시판 서비스
    ├── review-service/           # 리뷰 서비스
    ├── chat-service/             # 채팅 서비스
    ├── websocket-service/        # WebSocket 서비스
    ├── file-service/             # 파일 관리 서비스
    ├── open-ai-service/          # AI 서비스
    ├── _k8s/                     # Kubernetes 배포 설정
    └── Jenkinsfile               # CI/CD 파이프라인
```

## 🛠️ 설치 및 실행

### 사전 요구사항

- **Java**: 17 이상
- **Node.js**: 18 이상
- **Docker**: 20.10 이상
- **Kubernetes**: 1.20 이상 (배포 시)
- **MySQL**: 8.0 이상
- **Elasticsearch**: 8.0 이상

### 1. 저장소 클론

```bash
git clone <repository-url>
cd BE09-Final-2team
```

### 2. 백엔드 실행

#### 개별 서비스 실행

```bash
cd BE09-Final-2team-BE

# Discovery Service (Eureka) - 먼저 실행
cd discovery-service
./gradlew bootRun

# Gateway Service
cd ../gateway-service
./gradlew bootRun

# User Service
cd ../user-service
./gradlew bootRun

# Product Service
cd ../product-service
./gradlew bootRun

# 기타 서비스들도 동일한 방식으로 실행
```

#### Docker Compose로 실행 (권장)

```bash
cd BE09-Final-2team-BE
docker-compose up -d
```

### 3. 프론트엔드 실행

```bash
cd BE09-Final-2team-FE

# 의존성 설치
npm install

# 개발 서버 실행
npm run dev
```

### 4. 접속 정보

- **Frontend**: [바로가기](http://momnect-frontend-env.eba-kf25bmmw.ap-northeast-2.elasticbeanstalk.com/)
- **Gateway**: [바로가기](http://54.180.214.196:30080/)
- **Discovery Service**: [바로가기](http://54.180.214.196:30061/)

## 🚀 배포

### 프론트엔드 배포 (GitHub Actions)

프론트엔드는 GitHub Actions를 통해 자동 배포됩니다:

1. **코드 푸시**: `main` 브랜치에 코드가 푸시되면 자동으로 배포 시작
2. **Docker 이미지 빌드**: Next.js 애플리케이션을 Docker 이미지로 빌드
3. **ECR 푸시**: AWS ECR(Elastic Container Registry)에 이미지 업로드
4. **Elastic Beanstalk 배포**: ECR의 이미지를 사용하여 EB에 배포

### 백엔드 배포 (Jenkins)

백엔드는 Jenkins를 통한 자동 배포를 지원합니다:

- **Trigger**: GitHub Push
- **Build**: Docker 이미지 빌드 및 푸시
- **Deploy**: Kubernetes Rolling Update

### Kubernetes 배포

```bash
# 네임스페이스 생성
kubectl create namespace momnect

# 시크릿 생성 (환경 변수)
kubectl create secret generic app-secret --from-env-file=.env -n momnect

# 서비스 배포
kubectl apply -f _k8s/ -n momnect
```

## 📊 서비스별 상세 정보

### 백엔드 서비스

| 서비스                | 포트 | 주요 기능                    | 데이터베이스         |
| --------------------- | ---- | ---------------------------- | -------------------- |
| **Discovery Service** | 8761 | 서비스 디스커버리, 헬스체크  | -                    |
| **Gateway Service**   | 8000 | API 라우팅, 인증, 로드밸런싱 | -                    |
| **User Service**      | 0    | 사용자 관리, 인증, 프로필    | MySQL                |
| **Product Service**   | 0    | 상품 CRUD, 검색, 카테고리    | MySQL, Elasticsearch |
| **Post Service**      | 0    | 게시판, 댓글, 좋아요         | MySQL                |
| **Review Service**    | 0    | 리뷰 작성, 평점 관리         | MySQL                |
| **Chat Service**      | 0    | 채팅 메시지 저장, 히스토리   | MySQL, MongoDB       |
| **WebSocket Service** | 0    | 실시간 메시징, STOMP         | -                    |
| **File Service**      | 0    | 파일 업로드, 이미지 처리     | -                    |

### 프론트엔드 페이지

| 페이지         | 경로            | 주요 기능        |
| -------------- | --------------- | ---------------- |
| **메인**       | `/`             | 상품 목록, 검색  |
| **로그인**     | `/login`        | 사용자 인증      |
| **회원가입**   | `/signup`       | 사용자 등록      |
| **마이페이지** | `/mypage`       | 사용자 정보 관리 |
| **상품 등록**  | `/product/form` | 상품 등록/수정   |
| **상품 상세**  | `/product/[id]` | 상품 상세 정보   |
| **채팅**       | `/chat`         | 실시간 채팅      |
| **게시판**     | `/post`         | 커뮤니티 게시판  |
| **리뷰**       | `/review`       | 거래 후기        |

## 🔧 개발 가이드

### API 문서

링크를 통해 API 문서를 확인할 수 있습니다:

- **API 명세서** : https://www.notion.so/coffit23/API-268a02b1ffb180b5adbdcd124d89d524

### ERD
- https://www.notion.so/coffit23/ERD-268a02b1ffb18068a406dc429f7c45fa

### 코드 스타일

- **Backend**: Java 17, Spring Boot 3.4.8
- **Frontend**: Next.js 15, React 19, JavaScript
- **Database**: JPA/Hibernate, MySQL
- **Testing**: JUnit 5, Spring Boot Test

---

## 📄 라이선스

이 프로젝트는 비공개 프로젝트입니다.

## 👥 팀 정보

- **프로젝트명**: Momnect
- **팀**: BE09-Final-2team
- **기간**: 2025.07 ~ 2025.09
- **목표**: 안전하고 신뢰할 수 있는 중고 육아용품 거래 플랫폼 구축

---

**Momnect** - 엄마들을 위한 안전한 거래 플랫폼 🍼👶
