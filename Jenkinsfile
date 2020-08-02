node{
     stage('SCM Checkout'){
     git 'https://github.com/rahuku03/JenkinsLearnRepo'
     }
   
       stage('Perl script'){
     bat "perl script.pl"
     }
     
     
     
     stage('Compile-Package'){
     bat 'mvn clean install -DskipTests=true'
     }
     
     stage('Code Analysis SonarQube') {
          withSonarQubeEnv('SonarQube'){
     bat 'mvn sonar:sonar'
          }
    }
     stage('Junit test cases'){
     bat "./mvnw test"
     }
    
     
     stage('Deploying artifacts'){
     deploy adapters: [tomcat8(credentialsId: 'c1366040-9762-4579-80ad-cd6831759dc0', path: '', url: 'http://localhost:8081/RestService-0.0.1-SNAPSHOT/Users/1')], contextPath: 'restServices', war: '**/*.war'
     }
}
