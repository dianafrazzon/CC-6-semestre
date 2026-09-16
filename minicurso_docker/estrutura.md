no dockerhub há disponivel varias imagens que podem ser instanciadas em novas aplicações

``` dockerfile
# geralmente todo dockerfile começa com 'FROM'
FROM mavem:3.9.16-eclipse-temurin-25-alpine AS build
# pus um apelido na tag


# copia o conteudo do primeiro para o segundo
COPY /src /app/src
COPY pom.xml /app

# qual caminho o dockerfile deve ir? precisamos definir qual pasta ele deve entrar
WORKDIR /app

# preciso expor a porta da minha aplicação
EXPOSE 8080

# comando maven 'mvn'
# vai gerar um jar
RUN mvn clean install

#
FROM eclipse-temurin:25-alpine

# copio 
# --from=build 
COPY --from=build /app/target/docker/0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

CMD ["java","-jar","app.jar"]
```
