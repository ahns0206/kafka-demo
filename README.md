# kafka-demo
아파치 카프카를 이용한 Pub/Sub 구조의 심플한 테스트입니다.

kafka-pub의 KafkaPubApplication을 실행 시키고
kafka-sub의 KafkaSubApplication을 실행 시키도록 합니다.

KafkaPubApplcation의 api테스트 페이지인 http://localhost:8081/swagger-ui.html으로 로그인해 API를 테스트 하면
입력된 값이 KafkaSubApplication의 콘솔에 전달되는 것을 확인 할 수 있습니다.