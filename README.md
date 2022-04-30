# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 자동자 경주 

* scanner api로 입력을 받는다.
    * Scanner 값 validation
        * Blank 값을 입력했을 때 Return 0;
        * 입력값이 10 이상일 경우, 숫자 타입이 아닐 경우 (int 타입) 
            * illegalArgumentException
        * 입력값이 잘 들어왔는지 확인
            * 자동차 대수, 시도할 회수 입력 받아 해당 자동차 배열 수, 시도할 횟수 변수에 잘 할당 되었는지 확인

* 랜덤값에 따라 전진 또는 멈춘다.
    * 랜덤값은 0~9 사이로 출력된다.
    * 랜덤값이 4 이상일 경우 전진, 그 미만이면 전진하지 않는다.
        * 즉, 4 이상일 경우 0, 그 미만인 경우 1
    * 첫번째 자동차를 기준으로 값이 잘 더해져서 n번 움직였을 때, 0~n 값이 정상적으로 출력 됨을 확인한다.

* 테스트 값은 아니지만 화면로직을 추가한다.
    * inputView, ResultView 클래스를 추가해 분리
    
## 개발 순서

* Main : scan으로 값을 받고 전달 받은 값으로 배열을 만들던 map을 만들어 key값 car의 수만큼 생성하고, value값으로 이동하는 값 저장
* Scan : input : string (스캔으로 사용자가 입력한 값), output : int (움직이는 값) -> nextInt 고려
    * 레이싱 참여 자동차 수와 이동 회수 각각 받아서 진행
* Racing : input : map, output : map
    * 랜덤값을 만드는 메서드 하나 만든다.
    * 이중 포문?
    * 랜더링을 포문 돌면서 한번씩 할 수도 있고 아니면 main에서 한번씩 할 수 있는데 for문에서 분리해서 해도 될 것 같다 -> 해당내용 질문 -> 가독성 및 성능
        * for문 key값만 한번 돌고 main으로 전달
* View : 메인에서 racing 메서드르 한번씩 돌면서 뷰쪽 렌더링

## 수정 개발 순서 (실제 개발 기능 요구 사항)
1. String으로 입력한 값이 숫자 타입인지 확인
2. 변환한 값이 0을 넣거나 음수가 들어가면 예외 발생
3. 자동차 수로 넣은 값으로 map size가 생성된다.
4. 자동차 move 값으로 넣은 값으로 value 값이 나온다.
5. random 값으로 만들어져서 마지막의 결과가 0이상 moveCount 이하가 되도록 한다.
6. 화면을 생성한다.