
## Comando para instalar as dependencias o maven
mvn clean install

## Para rodar a aplicação em modo debug
mvn spring-boot:run -Dspring-boot.run.jvmArguments="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005"


## Gerando chave git
ssh-keygen -t rsa -b 4096 -m PEM -C "yurialvesbrasil@gmail.com"
eval "$(ssh-agent -s)"
ssh-add -D
ssh-add ~/.ssh/id_rsa
ssh-add -l

nano ~/.ssh/config

Host github.com
    HostName github.com
    User git
    IdentityFile ~/.ssh/id_rsa
    IdentitiesOnly yes

## Cria variável de ambiente para a chave
export CONFIG_KEY="$(cat /Users/yuribrasil/.ssh/id_rsa)"

## Testando configurações remotas
http://localhost:8888/service-one/default