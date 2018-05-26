FROM airhacks/glassfish
COPY ./target/java-ee-student-project.war ${DEPLOYMENT_DIR}
