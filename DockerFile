FROM openjdk:8
EXPOSE 8080
ADD target/devops_automation.jar devops_automation.jar
ENTRYPOINT ["java","-jar","/devops_automation.jar"]