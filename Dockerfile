# Use a imagem oficial do Maven para construir o projeto Java
FROM maven:3.8.6-jdk-11 as builder

# Copiar o código fonte do projeto para o diretório /app
WORKDIR /app
COPY . .

# Construir o aplicativo usando Maven
RUN mvn clean package -DskipTests

# Usar a imagem base do OpenJDK para executar o aplicativo
FROM openjdk:11-jre-slim

# Copiar o jar do estágio de construção para o diretório /app do contêiner
COPY --from=builder /app/target/*.jar /app/app.jar

# Expor a porta 8080 para acesso ao serviço web
EXPOSE 8080

# Executar o aplicativo Spring Boot quando o contêiner iniciar
CMD ["java", "-jar", "/app/app.jar"]
