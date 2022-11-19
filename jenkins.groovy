pipeline{
    agent any
    
    tools {
        jdk 'java17'
    }

    stages{
        stage('build'){
            steps {
              sh './gradlew clean build'
            }
        }
       
    }
}