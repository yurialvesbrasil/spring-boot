
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

export CONFIG_KEY="$(cat C:\Users\yuriH\.ssh\id_rsa)"

## Gera chave git no windows
Ativar o serviço ssh-agent (uma vez só)

sc config ssh-agent start=auto
net start ssh-agent

ssh-add C:\Users\yuriH\.ssh\id_rsa

Host github.com
  HostName github.com
  Port 22
  PreferredAuthentications publickey
  IdentityFile C:\Users\yuriH\.ssh\id_rsa
  IdentitiesOnly yes  

# 2. Obtém o conteúdo completo do arquivo
$FileContent = Get-Content -Raw $KeyPath

# 3. Substitui as quebras de linha (CRLF ou LF) pelo caractere de escape literal '\n'
$FormattedKey = $FileContent -replace "`r?`n", '\n'

# 4. Define a variável de ambiente CONFIG_KEY no escopo de USUÁRIO (persistente)
[Environment]::SetEnvironmentVariable("CONFIG_KEY", $FormattedKey, "User")

# 5. Verifica
$env:CONFIG_KEY


## Cria variável de ambiente para a chave
export CONFIG_KEY="$(cat /Users/yuribrasil/.ssh/id_rsa)"

## Testando configurações remotas
http://localhost:8888/service-one/default