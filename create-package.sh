./mvnw clean install
docker rmi -f mhbappy18/eureka &>/dev/null && echo 'Removed old container'
docker build -t mhbappy18/eureka .
docker push mhbappy18/eureka
