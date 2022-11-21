pipeline{
    agent any
    
    tools {
        jdk 'java17'
    }

    stages{
        stage('build'){
            steps {
              sh 'java --version'
              sh './gradlew clean build'
            }
        }
       
    }
}