# kafka-tutorial
Kafka Tutorial 
Kafka Producer - Basic string producer, Entity producer with custom serializer

Kafka Consumer - Basic string consumer, Entity consumer with custom deserializer

Commands

bin/zookeeper-server-start etc/kafka/zookeeper.properties

bin/kafka-server-start etc/kafka/server.properties

bin/kafka-topics.sh --create --topic test --bootstrap-server localhost:9092

bin/kafka-topics --list --zookeeper localhost:2181

bin/kafka-console-producer --topic test --bootstrap-server localhost:9092

bin/kafka-console-consumer --topic test --from-beginning --bootstrap-server localhost:9092
