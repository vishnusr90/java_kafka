# Java & Kafka

## Start Zookeeper
### Zookeeper is used for reliable distribution coordination
<KAFKA DIRECTORY>/bin/windows
```
    .\zookeeper-server-start.bat ..\..\config\zookeeper.properties
```

## Start Kafka
```
    .\kafka-server-start.bat ..\..\config\server.properties
```

## Check if message is received
```
    .\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic <TOPIC-NAME>
```