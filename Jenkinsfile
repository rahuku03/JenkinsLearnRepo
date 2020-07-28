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
     deploy adapters: [tomcat8(credentialsId: 'e05c6045-157d-4cac-b518-8ee1f2528a48', path: '', url: 'http://localhost:8081/manager/html')], contextPath: 'RestServices', war: '**/*.war'
     }
}
