## AA_D3_4_Refactoring

### 조원
 - 임태준
 - 임동균
 - 전형준
 - 전봉수
 - 정우훈

### 적용한 리팩토링 방향 및 간략 기술 포함
 ##### Change value to reference
 - Player name 을 Player 객체로 수정 하여 관리
 
 ##### Extract method
 - 

 ##### State design pattern
 -  Game score 를 state pattern 으로 관리
 -  가능한 모든 경우의 State 를 파악하여 모든 Control flow 를 제거

 ##### Singleton pattern
 - State 객체를 동적으로 생성하여 메모리를 관리
 - 각 State 객체를 Singleton 으로 관리

 ##### Testcases 작성
  - Refactoring 시 기존 Funtionality 는 그대로 유지하도록 test case 작성 후 refactoring
