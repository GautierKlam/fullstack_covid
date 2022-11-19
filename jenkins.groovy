pipeline{
    agent any
    
    tools {
        jdk 'Java17'
    }

    stages{
        stage('build'){
            steps {
              sh './gradlew build'
            }
        }
       
    }
}