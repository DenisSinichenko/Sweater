#!/usr/bin/env bash

mvn clean package

echo 'Копирование файлов...'

scp -i ~/.ssh/id_rsa.pub \
    target/sweater-1.0-SNAPSHOT.jar \
    denis@10.0.2.15:/home/denis/

echo 'Перезапускаем сервер...'

ssh -i ~/.ssh/id_rsa.pub denis@10.0.2.15 << EOF

pgrep java | xargs kill -9
nohup java -jar sweater-1.0-SNAPSHOT.jar > log.txt &

EOF

echo 'Пока'