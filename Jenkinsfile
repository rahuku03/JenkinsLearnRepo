node{
     stage('SCM Checkout'){
     git 'https://github.com/rahuku03/JenkinsLearnRepo'
     }
     stage('Compile-Package'){
     bat 'mvn clean package'
     }
     stage('Junit test cases'){
     bat "./mvnw test"
     }
}
