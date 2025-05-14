docker build -t jenkins-java21-dev .

docker run -d -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home
 --name jenkins-dev jenkins-java21-dev

