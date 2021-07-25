# kafka-tutorial
Kafka Tutorial Index
------------------------------------
Kafka Producer - Basic string producer, Entity producer with custom serializer

Kafka Consumer - Basic string consumer, Entity consumer with custom deserializer

Kafka Commands
------------------------------------

bin/zookeeper-server-start etc/kafka/zookeeper.properties

bin/kafka-server-start etc/kafka/server.properties

bin/kafka-topics.sh --create --topic test --bootstrap-server localhost:9092

bin/kafka-topics --list --zookeeper localhost:2181

bin/kafka-console-producer --topic test --bootstrap-server localhost:9092

bin/kafka-console-consumer --topic test --from-beginning --bootstrap-server localhost:9092

Kafka Connect Commands
------------------------------------

connect-standalone worker.properties connector-file-name.properties


Kafka Docker Images
------------------------------------
https://github.com/keerthanvp/docker/blob/12d260d1b366b1b964ef1293c7db08dd72fb56c9/apache-kafka-docker-compose.yaml

https://github.com/keerthanvp/docker/blob/12d260d1b366b1b964ef1293c7db08dd72fb56c9/kafka-docker-compose.yml
