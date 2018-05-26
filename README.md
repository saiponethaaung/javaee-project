# Build
mvn clean package && docker build -t com.mycompany/java-ee-student-project .

# RUN

docker rm -f java-ee-student-project || true && docker run -d -p 8080:8080 -p 4848:4848 --name java-ee-student-project com.mycompany/java-ee-student-project 