# spring-boot-kafka-cab-driver-user
This is a apring boot 3 application bulit using apache kafka 2 local server where driver publishes his location and user consumes those messages

#Some kafka commands

1. clear && bin/zookeeper-server-start.sh config/zookeeper.properties
2. clear && bin/kafka-server-start.sh config/server.properties
3. ./kafka-topics.sh --create --topic topic1 --bootstratp-server localhost:9092
4. ./kafka-topics.sh --describe --topic cab-location  --bootstrap-server localhost:9092
5. ./kafka-topics.sh --bootstrap-server localhost:9092 --list  
6. ./kafka-topics.sh --delete --topic quickstart-events --bootstrap-server localhost:9092
7. clear && ./kafka-console-producer.sh --topic topic1 --bootstrap-server localhost:9092
8. clear && ./kafka-console-consumer.sh --topic cab-location  --bootstrap-server localhost:9092
