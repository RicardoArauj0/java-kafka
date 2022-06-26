# Kafka with Java and SprigBoot
This project was created following this tutorial: https://www.youtube.com/watch?v=SqVfCyfCJqw

# Kafka installation 
I used docker to install kafka locally: https://hub.docker.com/r/bitnami/kafka/
With docker desktop running I created the "docker-compose.yml" and "rundocker-compose up -d"

# Code
The project contains: 
* Configuration files for kafka - producer and consumer
* A controller "POST /kafka-message" to receive a string message and
post it to the kafka topic
* Two listeners with two different group ids that will listen from the 
'topic' topic and log the message.

